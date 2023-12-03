package org.launchcode;
import java.util.Scanner;
public class Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, what is the rectangle length?");
        int length = input.nextInt();
        System.out.println("What is the rectangle width?");
        int width = input.nextInt();
        int area = width*length;
        System.out.println("The area of the rectangle is " + area);
    }
}
