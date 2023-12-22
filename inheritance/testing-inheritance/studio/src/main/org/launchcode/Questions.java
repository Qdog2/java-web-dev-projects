package org.launchcode;

public class Questions {
    private String Question;
    private String Answer;

    public Questions(String question, String answer) {
        Question = question;
        Answer = answer;
    }

    public String getQuestion() {
        return Question;
    }

    public String getAnswer() {
        return Answer;
    }

    public void setAnswer(String answer) {
        Answer = answer;
    }

}
