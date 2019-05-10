import java.io.BufferedReader;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
/**
 * This class contains only a main method. The main method stores and prints marks and names stored in a .txt file.
 *
 * @author Bill Bai
 * @version 1 2019.03.28
 */
@SuppressWarnings("Duplicates")
public class StudentMarksA {
    /**
     * This is the main method. It first creates two Lists to store String names, and Integer marks. It then uses the
     * Scanner class to read A7-1.txt, and loads names into the String list, and marks into the Integer list. It then
     * prints all the results out.
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

        System.out.printf("%-10s %s\n%s\n", "Name", "Mark", "---------------");
        for (int x = 0; x < marks.size(); x++) {
            System.out.printf("%-12s%s\n", names.get(x), marks.get(x));
        }

    }
}
