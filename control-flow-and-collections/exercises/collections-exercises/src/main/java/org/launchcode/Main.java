package org.launchcode;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(2);
        list.add(40);
        list.add(24);
        list.add(15);
        list.add(18);
        list.add(72);
        list.add(80);
        list.add(12);
        int evenNumbers = ArrayListExercise.sumEven(list);
        System.out.println(evenNumbers);
    }
}
