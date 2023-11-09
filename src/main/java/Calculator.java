import java.util.ArrayList;

public class Calculator {

    public Calculator() {

    }

    /**
     * This method will add up all of the values in an int array
     *
     * @param values - int[]
     * @return int - Sum of all the values
     */
    public int sumAllValues(Integer[] values) {
        // There is an easy fix for this one, but you might want
        // to rewrite this method to use a between loop.
        int result = 0;

        for (int i = 1; i < values.length; i++) {
            result = result + values[i];
        }

        return result;
    }

    /**
     * This method will check to see if the entered number is even
     *
     * @param number
     * @return true if even, false if odd
     */
    public boolean isEven(int number) {
        int remainder = number / 2;

        if (remainder == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * This method will sort a provided array into highest to lowest
     *
     * @param aMessyList
     * @return a sorted array
     */
    public int[] sortTheArray(int[] aMessyList) {

        //Find a way to sort the array into the correct order here.

        return aMessyList;
    }

    public String getTheLetterG(ArrayList<ArrayList<String>> letterList) {
        String letter = "";
        for (int i = 0; i < letterList.size(); i++){
            for (int j = 0; j < letterList.get(i).size(); i++){
                if (letterList.get(i).get(j).equals("B")){
                    return letterList.get(i).get(j);
                }
            }
        }
        return letter;
    }

    public ArrayList<String> getTheNameFromTheNumbers(Integer[] values) {
        ArrayList<String> namesArray = new ArrayList<>();
        for (Integer value: values) {
            switch (value) {
                case 0 -> namesArray.add("Barry");
                case 1 -> namesArray.add("Craig");
                case 3 -> namesArray.add("Jim");
                case 4 -> namesArray.add("Bob");
                case 6 -> namesArray.add("Stew");
                default -> {
                    return null;
                }
            }
        }
        return namesArray;
    }
}
