package org.launchcode;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
public class CheckBox extends Questions {

    Scanner input = new Scanner(System.in);
    public CheckBox(String question, String answer) {
        super(question, answer);
        if (Objects.equals(userAnswer, breakfast)) {
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect");
        }
    }
    ArrayList<String> breakfast = new ArrayList<>();
    breakfast.add("eggs");
    breakfast.add("pancakes");
    breakfast.add("syrup");
    breakfast.add("cereal")


    private String answer;
    String answers = getAnswer();
    String userAnswer = input.nextLine();

}
