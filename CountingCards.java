import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * This program reads a bridge game file, sorts it, and prints out the final evaluation which includes hands,
 * and it's value.
 *
 * @author Filip, Bill
 * @version 1 2019.04.01
 */
public class CountingCards {

    /**
     * Tis method is used to search for the correct suit, and returns the suit's index in the String.
     *
     * @param suit The suit to be searched
     * @return The index of the suit
     */
    public static int search(char suit) {
        String suits = "SHDC";
        for (int i = 0; i < suits.length(); i++) {
            if (suits.charAt(i) == suit) {
                return i;
            }
        }
        return -1;
    }

    /**
     * This method evaluates a card hand, and returns an ArrayList that contains all of the hand information.
     *
     * @param cards The card hand to be evaulated
     * @return The evaluated card hand.
     */
    public static ArrayList<String> evaluate(String cards) {
        cards += "";
        ArrayList<String> al = new ArrayList<String>();
        if (cards.length() != 26) {
            al.add("The length of this hand is not allowed");
            return al;
        }
        int value = 0;
        String suit = "JQKA";
        char[][] cardsSeperated = new char[2][13];
        for (int i = 0; i < cards.length(); i++) {
            cardsSeperated[i % 2][i / 2] = cards.charAt(i);
        }
        for (int i = 0; i < cardsSeperated[0].length; i++) {
            for (int j = 0; j < suit.length(); j++) {
                if (cardsSeperated[0][i] == suit.charAt(j)) {
                    value += (j + 1);
                    break;
                }
            }
        }
        String[] suits = {"", "", "", ""};
        for (int i = 0; i < cardsSeperated[0].length; i++) {
            if (cardsSeperated[1][i] != -1) {
                suits[search(cardsSeperated[1][i])] += cardsSeperated[0][i];
            } else {
                al.add("One of the hands contains non-existant cards");
                return al;
            }
        }
        for (int i = 0; i < suits.length; i++) {
            al.add(suits[i]);
        }
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i).length() < 3)
                value += (3 - al.get(i).length());
        }
        al.add("The overall value of this hand is : " + value);
        return al;
    }


    /**
     * This method finds the value of a card, and returns the index at which it's at in the String.
     *
     * @param card The card that's value is to be found
     * @return The value of the card
     */
    public static int findValue(char card) {
        String cards = "123456789TJQKA";
        int n = 0;
        while (card != cards.charAt(n)) {
            n++;
        }
        return n + 1;
    }

    /**
     * This method mergeSorts a String alphabetically and returns the sorted String. It works by splitting the String
     * into smaller sub arrays and appending the smaller subarrays together to form a sorted array.
     *
     * @param cards The String to be sorted
     * @return The sorted String
     */
    public static String mergeSort(String cards) {
        if (cards.length() > 1) {
            int split = cards.length() / 2;
            String first = cards.substring(0, split);
            String second = cards.substring(split);
            first = mergeSort(first);
            second = mergeSort(second);
            String sorted = "";
            while (first.length() != 0 && second.length() != 0) {
                if (findValue(first.charAt(0)) > findValue(second.charAt(0))) {
                    sorted += first.charAt(0);
                    first = first.substring(1);
                } else {
                    sorted += second.charAt(0);
                    second = second.substring(1);
                }
            }
            if (first.length() != 0)
                sorted += first;
            else
                sorted += second;
            return sorted;
        }
        return cards;
    }

    /**
     * This is the main method.
     */
    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\User\\IdeaProjects\\Array Stuff 2019-03-25\\src\\cards.txt"));
            ArrayList<String> output = new ArrayList<>();
            for (int i = 0; i < 4; i++) {
                output = evaluate(in.readLine());
                System.out.println("Hand " + (i + 1));
                for (int j = 0; j < output.size(); j++) {
                    if (j < output.size() - 1)
                        output.set(j, mergeSort(output.get(j)));
                    System.out.println(output.get(j));
                }
            }
        } catch (IOException e) {
            System.out.println("File not found!");
        }
    }

} // CountingCards class
