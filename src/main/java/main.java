// inputs output dataTypes selection ar
//inputs outputers understand datatypes
//selection loops and use comments

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

public class main {

    int number1 = 10000000;
    float aFloat = 1.050f;
    String name = "";
    private static Car bmw;

    public static void main(String[] args) {
        Car audi = null;
        System.out.println(audi.getColour().length());
//        Processor calculator = new Processor();
//        System.out.println(calculator.sum(7, 5));
//        System.out.println(calculator.sum(10, 20));

    }


    //Arrays
    private String[] waffles = {"a","b","d","e"};
    private Car[] arrayOfCar;

    // List
    private ArrayList animals = new ArrayList();

    //Map
    HashMap hashMap = new HashMap();


    private void funOfArray(){
        String aLetter = waffles[0];
        waffles[4] = "f";
        animals.add("f");

    }

}



