package org.launchcode;

public class Notes {
    public static void main (String [] args) {
        int nums[] = {1, 1, 2, 3, 5, 8, 13, 21};

        //A for each loop uses a colon symbol to loop through the array
        for (int i : nums) {
            System.out.println(i);
        }

        String msg = "Hello World";

        for (char c : msg.toCharArray()) {
            System.out.println(c);
        }
        //toCharArray() will convert the string to an array of characters

        //while loop
        int i = 0;
        while(i < 3) {
            i++;
        }

        //do while loops condition is evaluated at the end of the loop rather than the beginning
        do {
            System.out.println("Hello, World");
        } while (false);

        //break statements in loops
        int[] someInts = {1, 10, 2, 3, 5, 8, 10};
        int searchTerm = 10;
        for (int oneInt : someInts) {
            if (oneInt == searchTerm) {
                System.out.println("Found it");
                break;
            }
        }
    }
}
