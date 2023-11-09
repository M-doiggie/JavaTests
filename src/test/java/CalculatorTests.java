import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.*;

public class CalculatorTests{

    private Calculator calculator;

    private final Integer[] values = {1,2,3,4,5};

    private final int anEvenNumber = 140;
    private int[] aMessyList = {7,3,12,-6,3};

    private String theExpectedSentence = "This is a sentence";



    private ArrayList<ArrayList<String>> aListOfLists = new ArrayList<>();
    private ArrayList<String> arrayListOfNames = new ArrayList<>();

    @Before
    public void setUp(){
        calculator = new Calculator();
    }

    @Test
    public void runTestOne(){
        int result = calculator.sumAllValues(values);
        assertThat(result).isEqualTo(15);
    }

    @Test
    public void runTestTwo(){
        boolean result = calculator.isEven(anEvenNumber);
        assertThat(result).isTrue();
    }

    @Test
    public void runTestThree(){
        aMessyList = calculator.sortTheArray(aMessyList);
        assertThat(aMessyList).isSorted();
    }

    @Test
    public void runTestFour(){
        setUpAListOfLists();

        String returnedLetter = calculator.getTheLetterG(aListOfLists);

        assertThat(returnedLetter).isEqualTo("G");
    }

    @Test
    public void runTestFive(){
        setUpArrayListOfNames();
        // When the value of 2 is entered, I would like to get the value Steve back.
        ArrayList<String> names = calculator.getTheNameFromTheNumbers(values);

        assertThat(names).containsAll(arrayListOfNames);
    }

    @Test
    public void runTestSix(){
        String firstPart = "This is ";
        String secondPart = "a ";
        String thirdPart = "sentence";

        //Concatenate these 3 Strings into one String without typing them out.
        String result = "";
        assertThat(result).isEqualTo(theExpectedSentence);
    }

    @Test
    public void runTestSeven() {
        try {
            File file = new File("src/test/resources/aText.txt");
            Scanner fileReader = new Scanner(file);
            while(true) { // Change this condition so the exception doesnt happen.
                System.out.println(fileReader.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private void setUpAListOfLists() {
        ArrayList<String> firstFiveLetters = new ArrayList<>();
        firstFiveLetters.add("A");
        firstFiveLetters.add("B");
        firstFiveLetters.add("C");
        firstFiveLetters.add("D");
        firstFiveLetters.add("E");

        ArrayList<String> secondFiveLetters = new ArrayList<>();
        secondFiveLetters.add("F");
        secondFiveLetters.add("G");
        secondFiveLetters.add("H");
        secondFiveLetters.add("I");
        secondFiveLetters.add("J");

        aListOfLists.add(firstFiveLetters);
        aListOfLists.add(secondFiveLetters);
    }
    private void setUpArrayListOfNames() {
        arrayListOfNames.add("Craig");
        arrayListOfNames.add("Steve");
        arrayListOfNames.add("Jim");
        arrayListOfNames.add("Bob");
    }


}
