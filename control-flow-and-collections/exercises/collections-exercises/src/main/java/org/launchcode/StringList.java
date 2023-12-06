package org.launchcode;

import java.util.ArrayList;
public class StringList {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("radar");
        words.add("bumblebee");
        words.add("bumble");
        words.add("yamam");
        words.add("bogus");
        words.add("boogeyman");

        int fiveChars = 5;
        for (String word: words) {
            if (word.length() == fiveChars) {
                System.out.println(word);
            }
        }

    }
}
