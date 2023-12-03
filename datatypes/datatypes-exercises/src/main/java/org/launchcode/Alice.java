package org.launchcode;
import java.util.Scanner;
public class Alice {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String aliceInWonderland = ("Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do:" +
                "once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, " +
                "'and what is the use of the book,' thought Alice 'without pictures or conversation?'");
        System.out.println("Please enter a term to search for: ");
        String search = input.nextLine();
        boolean term = aliceInWonderland.contains(search);
        System.out.println(aliceInWonderland.contains(search));

        if (term) {
            System.out.println("The term was found!");
            System.out.println("The index of the string is " + aliceInWonderland.indexOf(search));
            System.out.println("The length of the string is " + search.length());
            String modifiedSentence = aliceInWonderland.replace(search, "");
            System.out.println(modifiedSentence);
        } else {
            System.out.println("Sorry, that term is not in the sentence.");
        }
    }
}
