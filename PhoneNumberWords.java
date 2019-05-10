import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 * This class reads and stores DICT.txt in a HashSet. It then prompts the user for a number String from 1-4 digits. It
 * converts the number into different combinations of letters based of cellphone pads. It searches the HashSet for the
 * possible words from the combinations, and outputs it on the screen. It also prints the time taken to search.
 *
 * @author Om, Bill, Filip
 * @version 1 2019.04.01
 */
public class PhoneNumberWords {
    HashSet<String> words = new HashSet<>(); //HashSet used to store the dictionary of words
    String[] number1 = {"1"};
    String[] number2 = {"2", "A", "B", "C", "a", "b", "c"};
    String[] number3 = {"3", "D", "E", "F", "d", "e", "f"};
    String[] number4 = {"4", "G", "H", "I", "g", "h", "i"};
    String[] number5 = {"5", "J", "K", "L", "j", "k", "l"};
    String[] number6 = {"6", "M", "N", "O", "m", "n", "o"};
    String[] number7 = {"7", "P", "Q", "R", "S", "p", "q", "r", "s"};
    String[] number8 = {"8", "T", "U", "V", "t", "u", "v"};
    String[] number9 = {"9", "W", "X", "Y", "Z", "w", "x", "y", "z"};
    String[] number0 = {"0", "&"};

    String number = ""; //The number to be converted to random String combinations

    /**
     * This method reads DICT.txt and stores it in the HashSet, words.
     */
    public void fileInput() {
        try {
            Scanner sc = new Scanner(new File("C:\\Users\\User\\IdeaProjects\\Array Stuff 2019-03-25\\src\\DICT.TXT"));
            while (sc.hasNext()) {
                words.add(sc.next());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File was not found!");
        }
    }

    /**
     * This method reads uses Scanner class to get user input for a number String from length 1-4. It then stores it in
     * number.
     */
    public void userInput() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a phone number: ");
            number = sc.nextLine();
            if (number.length() < 5 && number.length() > 0)
                break;
            System.out.println("Please enter a valid number! (1-4 digits)");
        }
    }

    /**
     * This method returns the String number.
     *
     * @return The String number.
     */
    public String getNumber() {
        return number;
    }


    /**
     * This is the main method. It runs the methods in order.
     *
     * @param args
     */
    public static void main(String[] args) {
        PhoneNumberWords p = new PhoneNumberWords();
        p.fileInput();
        while (true) {
            p.userInput();
            long start = System.currentTimeMillis();
            p.findWordsInsideDictionary(p.getNumber());
            long end = System.currentTimeMillis();
            System.out.println("That took " + (end - start) + " milliseconds to execute.\n");
        }
    }

    /**
     * This method receives a String in it's parameter, and converts the number to different letters based off of cell
     * pads. It then creates all permutations of the String and stores it in a ArrayList of String arrays. It then
     * compares each permutation, and checks if it exists in the HashSet dictionary. It will output the word if found.
     *
     * @param inputString The String to be permuted and searched for words.
     */
    public void findWordsInsideDictionary(String inputString) {
        ArrayList<String[]> inputStringNumberForm = new ArrayList<String[]>();
        int lengthOfPhoneNumber = inputString.length();
        System.out.print("The words found are: ");
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == '0') {
                inputStringNumberForm.add(number0);
            } else if (inputString.charAt(i) == '1') {
                inputStringNumberForm.add(number1);
            } else if (inputString.charAt(i) == '2') {
                inputStringNumberForm.add(number2);
            } else if (inputString.charAt(i) == '3') {
                inputStringNumberForm.add(number3);
            } else if (inputString.charAt(i) == '4') {
                inputStringNumberForm.add(number4);
            } else if (inputString.charAt(i) == '5') {
                inputStringNumberForm.add(number5);
            } else if (inputString.charAt(i) == '6') {
                inputStringNumberForm.add(number6);
            } else if (inputString.charAt(i) == '7') {
                inputStringNumberForm.add(number7);
            } else if (inputString.charAt(i) == '8') {
                inputStringNumberForm.add(number8);
            } else if (inputString.charAt(i) == '9') {
                inputStringNumberForm.add(number9);
            }
        }

        if (lengthOfPhoneNumber == 1) {
            boolean firstWordFound = false;
            for (int i = 0; i < inputStringNumberForm.get(0).length; i++) {
                if (words.contains((inputStringNumberForm.get(0))[i])) {
                    if (firstWordFound == true) {
                        System.out.print(", " + (inputStringNumberForm.get(0))[i]);
                    } else {
                        System.out.print((inputStringNumberForm.get(0))[i]);
                        firstWordFound = true;
                    }
                }
            }
        } else if (lengthOfPhoneNumber == 2) {
            boolean firstWordFound = false;
            for (int i = 0; i < inputStringNumberForm.get(0).length; i++) {
                for (int j = 0; j < inputStringNumberForm.get(1).length; j++) {
                    if (words.contains((inputStringNumberForm.get(0))[i] + (inputStringNumberForm.get(1))[j])) {
                        if (firstWordFound == true) {
                            System.out.print(", " + (inputStringNumberForm.get(0))[i] + (inputStringNumberForm.get(1))[j]);
                        } else {
                            System.out.print((inputStringNumberForm.get(0))[i] + (inputStringNumberForm.get(1))[j]);
                            firstWordFound = true;
                        }
                    }
                }
            }
        } else if (lengthOfPhoneNumber == 3) {
            boolean firstWordFound = false;
            for (int i = 0; i < inputStringNumberForm.get(0).length; i++) {
                for (int j = 0; j < inputStringNumberForm.get(1).length; j++) {
                    for (int k = 0; k < inputStringNumberForm.get(2).length; k++) {
                        if (words.contains((inputStringNumberForm.get(0))[i] + (inputStringNumberForm.get(1))[j] + (inputStringNumberForm.get(2))[k])) {
                            if (firstWordFound == true) {
                                System.out.print(", " + (inputStringNumberForm.get(0))[i] + (inputStringNumberForm.get(1))[j] + (inputStringNumberForm.get(2))[k]);
                            } else {
                                System.out.print((inputStringNumberForm.get(0))[i] + (inputStringNumberForm.get(1))[j] + (inputStringNumberForm.get(2))[k]);
                                firstWordFound = true;
                            }
                        }
                    }
                }
            }
        } else {
            boolean firstWordFound = false;
            for (int i = 0; i < inputStringNumberForm.get(0).length; i++) {
                for (int j = 0; j < inputStringNumberForm.get(1).length; j++) {
                    for (int k = 0; k < inputStringNumberForm.get(2).length; k++) {
                        for (int w = 0; w < inputStringNumberForm.get(3).length; w++) {
                            if (words.contains((inputStringNumberForm.get(0))[i] + (inputStringNumberForm.get(1))[j] + (inputStringNumberForm.get(2))[k] + (inputStringNumberForm.get(3))[w])) {
                                if (firstWordFound == true) {
                                    System.out.print(", " + (inputStringNumberForm.get(0))[i] + (inputStringNumberForm.get(1))[j] + (inputStringNumberForm.get(2))[k] + (inputStringNumberForm.get(3))[w]);
                                } else {
                                    System.out.print((inputStringNumberForm.get(0))[i] + (inputStringNumberForm.get(1))[j] + (inputStringNumberForm.get(2))[k] + (inputStringNumberForm.get(3))[w]);
                                    firstWordFound = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(".");
    }
}