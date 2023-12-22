package org.launchcode;
import java.util.Scanner;
import java.util.Objects;

public class MultipleChoice extends Questions {

    Scanner input = new Scanner(System.in);
    public MultipleChoice(String question, String answer) {
        super(question, answer);
        public MultipleChoiceCheck {
            if (Objects.equals(userAnswer, newAnswer)) {
                System.out.println("Correct");
            } else {
                System.out.println("Incorrect");
            }
        }
    }
String question = new Questions("Which coding language is the hardest?", "Java");
    String newAnswer = getAnswer();
    String userAnswer = input.nextLine();
}
