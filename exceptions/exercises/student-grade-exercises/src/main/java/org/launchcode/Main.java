package org.launchcode;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
    }

    public static void Divide(int x, int y)
    {
        // Write code here!
        int result = x / y;
        System.out.println(result);
        if (y == 0) {
            try {
                throw new ArithmeticException("That value is invalid!");
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        }
    }

    public static int CheckFileExtension(String fileName)
    {
        // Write code here!
        int points = 0;
        if (fileName.contains(".java")) {
            points += 1;
        } else if (fileName.equals("null")) {
            points -= 1;
            try {
                throw new ArithmeticException("Invalid file type. Must be a .java file type.");
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        }
    }
}