import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * This class stores the contents in A7-1.txt in two Lists for marks and corresponding names. It then merge sorts the
 * name List, while keeping the corresponding mark in order. It then outputs the sorted list.
 *
 * @author Bill Bai
 * @version 1 2019.03.28
 */
@SuppressWarnings("Duplicates")
public class StudentMarksB {

    /**
     * This method is a mergeSort function used to sort the names in alphabetical order, while preserving the
     * relationship with it's corresponding mark. It's parameters are two lists. The first parameter is an String list
     * that will be sorted, and it's second parameter is the Integer list that will be moved when the String list is
     * moved, to preserve the pairs. It's basecase is that if the sortList's size is 1 or less, then it won't need to be
     * sorted. It then creates an int, mid, which is the size of the list divided by two. It creates two ArrayLists to
     * store the left half and right half of sortList, and two ArrayLists to store the left and right half of the
     * pairList. It then stores the left halves of the sort and pair lists in the left and pLeft array lists. It does
     * the same with the right half to right and pRight array list. It then repeats this step 34 times and merges the
     * lists independently. At line 55, it starts sorting by comparing the heads of the individual lists, and looking
     * for the alphabetically ahead String. It will add the alphabetically ahead Strings in order, until the list is
     * fully sorted. It then adds the remaining elements in the sublists to the lists.
     *
     * @param sortList This is the Integer list that will be sorted in ascending order.
     * @param pairList This is the String list, that is a pair to sortList. It will
     */
    private static void mergeSort(List<String> sortList, List<Integer> pairList) {
        //This is the base case, returns if the size is 1 or 0.
        if (sortList.size() <= 1)
            return;

        int mid = sortList.size() / 2; //int storing the middle index of the sortList.

        ArrayList<String> left = new ArrayList<>(); //Sublist for the left hand side of sortList
        ArrayList<String> right = new ArrayList<>(); //Sublist for the right hand side of sortList
        ArrayList<Integer> pLeft = new ArrayList<>(); //Sublist for the left hand side of pairList
        ArrayList<Integer> pRight = new ArrayList<>(); //Sublist for the right hand side of pairLst

        //Puts left side of the list into the sublists
        for (int i = 0; i < mid; i++) {
            left.add(sortList.remove(0));
            pLeft.add(pairList.remove(0));
        }
        //Puts right side of the list into the sublists
        while (sortList.size() != 0) {
            right.add(sortList.remove(0));
            pRight.add(pairList.remove(0));
        }

        //Recurs, splitting the sublists into more sublists
        mergeSort(left, pLeft);
        mergeSort(right, pRight);

        //Adds the sublists in order to the sorted list
        while (left.size() != 0 && right.size() != 0) {
            if (left.get(0).compareTo(right.get(0)) < 0) {
                sortList.add(left.remove(0));
                pairList.add(pLeft.remove(0));
            } else {
                sortList.add(right.remove(0));
                pairList.add(pRight.remove(0));
            }
        }

        //Adds the remaining of the sublists to the sorted list
        while (left.size() != 0) {
            sortList.add(left.remove(0));
            pairList.add(pLeft.remove(0));
        }
        while (right.size() != 0) {
            sortList.add(right.remove(0));
            pairList.add(pRight.remove(0));
        }
    }

    /**
     * This is the main method. It first creates two Lists to store String names, and Integer marks. It then uses the
     * Scanner class to read A7-1.txt, and loads names into the String list, and marks into the Integer list. It then
     * calls the mergeSort method to sort the names in alphabetical order, and prints the sorted results out.
     */
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(35);
        List<Integer> marks = new ArrayList<>(35);

        try {
            BufferedReader s = new BufferedReader(new FileReader("C:\\Users\\User\\IdeaProjects\\Array Stuff 2019-03-25\\src\\A7-1.txt"));
            for (int x = 0; x < 35; x++) {
                names.add(s.readLine());
                marks.add(Integer.parseInt(s.readLine()));
            }
            s.close();
        } catch (IOException e) {
        } catch (NumberFormatException e) {
        }

        mergeSort(names, marks);
        System.out.printf("%-10s %s\n%s\n", "Name", "Mark", "---------------");
        for (int x = 0; x < marks.size(); x++) {
            System.out.printf("%-12s%s\n", names.get(x), marks.get(x));
        }
    }
}
