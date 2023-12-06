package org.launchcode;

import java.util.Arrays;
import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        int[] integerArray = {1, 1, 2, 3, 5, 8 , 13, 21};

        for (int i = 0; i < integerArray.length ; i++) {
            if (integerArray[i] % 2 == 0) {
                System.out.println(integerArray[i]);
            }
        }

        String arrayPractice = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        String[] stringArray = arrayPractice.split(" ");

        System.out.println(Arrays.toString(stringArray));

        //Converting string into ArrayList
        ArrayList<String> strList = new ArrayList<>(
                Arrays.asList(stringArray)
        );

        //Now print the ArrayList
        for (String s : stringArray) {
            System.out.println(s);
        }
    }
}
