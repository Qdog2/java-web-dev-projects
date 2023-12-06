package org.launchcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class HashMapExercise {
    public static void main(String[] args) {
        HashMap<Double, String> names = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newName;

        System.out.println("Enter your names (or ENTER to finish):");

        // Get names and ids

        do {

            System.out.print("Name: ");
            newName = input.nextLine();

            if(!newName.equals("")) {
                System.out.print("ID: ");
                Double newId = input.nextDouble();
                names.put(newId, newName);

                input.nextLine();
            }
        } while (!newName.equals(""));
        System.out.println("\nClass roster:");

        for (Map.Entry<Double, String> name : names.entrySet()) {
            System.out.println(name.getKey() + " : (" + name.getValue() + ")");
        }
    }
}
