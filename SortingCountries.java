import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This program
 */
@SuppressWarnings("Duplicates")
public class SortingCountries {
    ArrayList<String> countries = new ArrayList<String>();
    ArrayList<String> capitals = new ArrayList<String>();
    ArrayList<String> areaInputs = new ArrayList<String>();
    ArrayList<String> populationInputs = new ArrayList<String>();

    /**
     * This method reads Countries-Population.txt using the scanner class, and stores it into it's corresponding list
     * and variables these variables and lists are needed so that it can be sorted. It then uses if-statements
     * to hardcode the different exceptions that are present during sorting. This is done so there are no errors that
     * would cause the sorting to not work.
     */
    public void input() {
        try {
            Scanner sc = new Scanner(new File("Countries-Population.txt"));
            String firstWord;
            while (sc.hasNext()) {
                firstWord = sc.next();
                if (firstWord.equals("Andorra") || firstWord.equals("Brunei")) {
                    String capital1, capital2, capital3, area, population;
                    countries.add(firstWord);
                    capital1 = sc.next();
                    capital2 = sc.next();
                    capital3 = sc.next();
                    area = sc.next();
                    population = sc.next();
                    areaInputs.add(area);
                    populationInputs.add(population);
                    capitals.add(capital1 + " " + capital2 + " " + capital3);
                } else if (firstWord.equals("Papua") || firstWord.equals("Antigua")) {
                    String country2, country3, capital1, capital2, area, population;
                    country2 = sc.next();
                    country3 = sc.next();
                    capital1 = sc.next();
                    capital2 = sc.next();
                    area = sc.next();
                    population = sc.next();
                    areaInputs.add(area);
                    populationInputs.add(population);
                    countries.add(firstWord + " " + country2 + " " + country3);
                    capitals.add(capital1 + " " + capital2);
                } else if (firstWord.equals("S�o")) {
                    String country2, country3, country4, capital1, capital2, area, population;
                    country2 = sc.next();
                    country3 = sc.next();
                    country4 = sc.next();
                    capital1 = sc.next();
                    capital2 = sc.next();
                    area = sc.next();
                    population = sc.next();
                    areaInputs.add(area);
                    populationInputs.add(population);
                    countries.add(firstWord + " " + country2 + " " + country3 + " " + country4);
                    capitals.add(capital1 + " " + capital2);
                } else if (firstWord.equals("Argentina") || firstWord.equals("Belarus") || firstWord.equals("Bolivia") || firstWord.equals("Cambodia") || firstWord.equals("Ethiopia") || firstWord.equals("Grenada") || firstWord.equals("Kuwait") || firstWord.equals("Guatemala") || firstWord.equals("India") || firstWord.equals("Malaysia") || firstWord.equals("Mauritius") || firstWord.equals("Mexico") || firstWord.equals("Mongolia") || firstWord.equals("Panama") || firstWord.equals("Ukraine")) {
                    String capital1, capital2, area, population;
                    capital1 = sc.next();
                    capital2 = sc.next();
                    area = sc.next();
                    population = sc.next();
                    areaInputs.add(area);
                    populationInputs.add(population);
                    countries.add(firstWord);
                    capitals.add(capital1 + " " + capital2);
                } else if (firstWord.equals("Bosnia") || firstWord.equals("Central") || firstWord.equals("Trinidad")) {
                    String country2, country3, capital, area, population;
                    country2 = sc.next();
                    country3 = sc.next();
                    capital = sc.next();
                    area = sc.next();
                    population = sc.next();
                    areaInputs.add(area);
                    populationInputs.add(population);
                    countries.add(firstWord + " " + country2 + " " + country3);
                    capitals.add(capital);
                } else if (firstWord.equals("Burkina") || firstWord.equals("Cape") || firstWord.equals("C�te") || firstWord.equals("Czech") || firstWord.equals("East") || firstWord.equals("Equatorial") || firstWord.equals("Marshall") || firstWord.equals("Myanmar") || firstWord.equals("New") || firstWord.equals("Saudi") || firstWord.equals("Sierra") || firstWord.equals("Solomon") || firstWord.equals("South") || firstWord.equals("Sri")) {
                    String country2, capital, area, population;
                    country2 = sc.next();
                    capital = sc.next();
                    area = sc.next();
                    population = sc.next();
                    areaInputs.add(area);
                    populationInputs.add(population);
                    countries.add(firstWord + " " + country2);
                    capitals.add(capital);
                } else if (firstWord.equals("Costa") || firstWord.equals("Dominican") || firstWord.equals("El") || firstWord.equals("San")) {
                    String country2, capital1, capital2, area, population;
                    country2 = sc.next();
                    capital1 = sc.next();
                    capital2 = sc.next();
                    area = sc.next();
                    population = sc.next();
                    areaInputs.add(area);
                    populationInputs.add(population);
                    countries.add(firstWord + " " + country2);
                    capitals.add(capital1 + " " + capital2);
                } else if (firstWord.equals("United")) {
                    String secondWord, area, population;
                    secondWord = sc.next();
                    if (secondWord.equals("Arab")) {
                        String country3, capital1, capital2;
                        country3 = sc.next();
                        capital1 = sc.next();
                        capital2 = sc.next();
                        countries.add(firstWord + " " + secondWord + " " + country3);
                        capitals.add(capital1 + " " + capital2);
                    } else if (secondWord.equals("Kingdom")) {
                        String capital = sc.next();
                        countries.add(firstWord + " " + secondWord);
                        capitals.add(capital);
                    } else {
                        String capital1, capital2;
                        capital1 = sc.next();
                        capital2 = sc.next();
                        countries.add(firstWord + " " + secondWord);
                        capitals.add(capital1 + " " + capital2);
                    }
                    area = sc.next();
                    population = sc.next();
                    areaInputs.add(area);
                    populationInputs.add(population);
                } else if (firstWord.equals("St.")) {
                    String secondWord, area, population;
                    secondWord = sc.next();
                    if (secondWord.equals("Kitts")) {
                        String country3, country4, capital;
                        country3 = sc.next();
                        country4 = sc.next();
                        capital = sc.next();
                        countries.add(firstWord + " " + secondWord + " " + country3 + " " + country4);
                        capitals.add(capital);
                    } else if (secondWord.equals("Lucia")) {
                        String capital = sc.next();
                        countries.add(firstWord + " " + secondWord);
                        capitals.add(capital);
                    } else {
                        String country3, country4, country5, capital;
                        country3 = sc.next();
                        country4 = sc.next();
                        country5 = sc.next();
                        capital = sc.next();
                        countries.add(firstWord + " " + secondWord + " " + country3 + " " + country4 + " " + country5);
                        capitals.add(capital);
                    }
                    area = sc.next();
                    population = sc.next();
                    areaInputs.add(area);
                    populationInputs.add(population);
                } else if (firstWord.equals("Korea,")) {
                    String secondWord = sc.next(), area, population;
                    String capital = sc.next();
                    area = sc.next();
                    population = sc.next();
                    countries.add(firstWord + " " + secondWord);
                    capitals.add(capital);
                    areaInputs.add(area);
                    populationInputs.add(population);
                } else if (firstWord.equals("Congo,")) {
                    String secondWord, area, population;
                    secondWord = sc.next();
                    if (secondWord.equals("Republic")) {
                        String country3, capital;
                        country3 = sc.next();
                        capital = sc.next();
                        countries.add(firstWord + " " + secondWord + " " + country3);
                        capitals.add(capital);
                    } else {
                        String country3, country4, country5, capital;
                        country3 = sc.next();
                        country4 = sc.next();
                        country5 = sc.next();
                        capital = sc.next();
                        countries.add(firstWord + " " + secondWord + " " + country3 + " " + country4 + " " + country5);
                        capitals.add(capital);
                    }
                    area = sc.next();
                    population = sc.next();
                    areaInputs.add(area);
                    populationInputs.add(population);
                } else {
                    String capital, area, population;
                    capital = sc.next();
                    area = sc.next();
                    population = sc.next();
                    countries.add(firstWord);
                    capitals.add(capital);
                    areaInputs.add(area);
                    populationInputs.add(population);
                }
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found!");
        }
    }

    /**
     * This method is used with the mergeSort method. It takes two subarrays and merges them together in order. It will
     * check for the lowest number of each array, then put them into the new array one element at a time.
     *
     * @param arr1 The first array to be merged
     * @param arr2 The second array to be merged
     * @param typeOfSort The type of sort.
     * @return A sorted StringArray.
     */
    public String[] mergeArrays(String[] arr1, String[] arr2, String typeOfSort) {
        String[] mergedArr = new String[arr1.length + arr2.length];
        int arr1First = 0, arr2First = 0;

        for (int i = 0; i < mergedArr.length; i++) {
            if (typeOfSort.equals("Country")) {
                mergedArr[i] = (arr1[arr1First].compareToIgnoreCase(arr2[arr2First]) < 0) ? arr1[arr1First] : arr2[arr2First];
            } else {
                int populationArr1 = 0, populationArr2 = 0;
                String popArr1Str = "", popArr2Str = "";
                for (int j = 0; j < arr1[arr1First].length(); j++) {
                    if (arr1[arr1First].charAt(j) == '1' || arr1[arr1First].charAt(j) == '2' || arr1[arr1First].charAt(j) == '3' || arr1[arr1First].charAt(j) == '4' || arr1[arr1First].charAt(j) == '5' || arr1[arr1First].charAt(j) == '6' || arr1[arr1First].charAt(j) == '7' || arr1[arr1First].charAt(j) == '8' || arr1[arr1First].charAt(j) == '9') {
                        popArr1Str = arr1[arr1First].substring(j);
                        break;
                    }
                }
                for (int j = 0; j < popArr1Str.length(); j++) {
                    if (popArr1Str.charAt(j) == ',') {
                        popArr1Str = popArr1Str.substring(0, j) + popArr1Str.substring(j + 1);
                    }
                }
                populationArr1 = Integer.parseInt(popArr1Str);
                for (int j = 0; j < arr2[arr2First].length(); j++) {
                    if (arr2[arr2First].charAt(j) == '1' || arr2[arr2First].charAt(j) == '2' || arr2[arr2First].charAt(j) == '3' || arr2[arr2First].charAt(j) == '4' || arr2[arr2First].charAt(j) == '5' || arr2[arr2First].charAt(j) == '6' || arr2[arr2First].charAt(j) == '7' || arr2[arr2First].charAt(j) == '8' || arr2[arr2First].charAt(j) == '9') {
                        popArr2Str = arr2[arr2First].substring(j);
                        break;
                    }
                }
                for (int j = 0; j < popArr2Str.length(); j++) {
                    if (popArr2Str.charAt(j) == ',') {
                        popArr2Str = popArr2Str.substring(0, j) + popArr2Str.substring(j + 1);
                    }
                }
                populationArr2 = Integer.parseInt(popArr2Str);
                mergedArr[i] = (populationArr1 < populationArr2) ? arr1[arr1First] : arr2[arr2First];
            }

            if (mergedArr[i].equals(arr1[arr1First])) {
                if (arr1First == arr1.length - 1) {
                    if (typeOfSort.equals("Country")) {
                        arr1[arr1.length - 1] = "zz";
                    } else {
                        arr1[arr1.length - 1] = "a 2000000000";
                    }
                } else {
                    arr1First++;
                }
            } else if (mergedArr[i].equals(arr2[arr2First])) {
                if (arr2First == arr2.length - 1) {
                    if (typeOfSort.equals("Country")) {
                        arr2[arr2.length - 1] = "zz";
                    } else {
                        arr2[arr2.length - 1] = "a 2000000000";
                    }
                } else {
                    arr2First++;
                }
            }
        }
        return mergedArr;
    }

    /**
     * This method is called to perform a mergesort. It works in tandem with the mergeArray method, to perform a complete
     * merge sort. It creates multiple subarrays of size 1 and then merges the subarrays to create a bigger sorted array
     * and so on until it is fully sorted
     * @param inputArr The ArrayList to be sorted.
     * @param typeOfSort The type of sort
     * @return the sorted array's first element
     */
    public String[] mergeSort(ArrayList<String> inputArr, String typeOfSort) {
        ArrayList<String[]> sortedArr = new ArrayList<String[]>(inputArr.size());
        int tempLength = inputArr.size();
        int prevTempLength = 0;

        for (String inputArrElement : inputArr) {
            String[] singleElement = {inputArrElement};
            sortedArr.add(singleElement);
        }
        while (tempLength >= 1 && (tempLength != prevTempLength)) {
            for (int i = 0; i < tempLength; i += 2) {
                if (i == tempLength - 1) {
                    sortedArr.set(i / 2, sortedArr.get(i));
                } else {
                    sortedArr.set(i / 2, mergeArrays(sortedArr.get(i), sortedArr.get(i + 1), typeOfSort));
                }
            }
            prevTempLength = tempLength;
            tempLength = (int) Math.ceil(1.0 * tempLength / 2);
        }

        return sortedArr.get(0);
    }

    /**
     * This method uses the mergeSort to sort the file by country and stores it in a file.
     */
    public void sortByCountry() {
        ArrayList<String> countryAndPopulation = new ArrayList<String>();
        String[] sortedCountryAndPop;
        PrintWriter pw;
        try {
            pw = new PrintWriter(new FileWriter("sortedByCountry.txt"));
            for (int i = 0; i < populationInputs.size(); i++) {
                countryAndPopulation.add(countries.get(i) + "\t\t\t" + populationInputs.get(i));
            }
            sortedCountryAndPop = mergeSort(countryAndPopulation, "Country");
            for (String countryAndPop : sortedCountryAndPop) {
                pw.println(countryAndPop);
            }
            pw.close();
        } catch (IOException e) {
            System.out.println("Error while writing to file!");
        }
    }

    /**
     * This method uses the mergeSort to sort the file by population and stores it in a file
     */
    public void sortByPopulation() {
        ArrayList<String> countryAndPopulation = new ArrayList<String>();
        String[] sortedCountryAndPop;
        PrintWriter pw;
        try {
            pw = new PrintWriter(new FileWriter("sortedByPopulation.txt"));
            for (int i = 0; i < populationInputs.size(); i++) {
                countryAndPopulation.add(countries.get(i) + "\t\t\t" + populationInputs.get(i));
            }
            sortedCountryAndPop = mergeSort(countryAndPopulation, "Population");
            for (int i = sortedCountryAndPop.length - 1; i >= 0; i--) {
                pw.println(sortedCountryAndPop[i]);
            }
            pw.close();
        } catch (IOException e) {
            System.out.println("Error while writing to file!");
        }
    }

    /**
     * This is the main method.
     */
    public static void main(String[] args) {
        SortingCountries s = new SortingCountries();
        s.input();
        s.sortByCountry();
        s.sortByPopulation();
        System.out.println("Successfully sorted and saved country data!");
    }
}