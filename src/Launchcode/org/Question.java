package Launchcode.org;

import java.util.ArrayList;

public class Question {
    private String question;
    private ArrayList<String> answers = new ArrayList<>();
    private Integer correctAnswer;

    public Question(ArrayList<String> answers, Integer correctAnswer, String question){
        this.answers = answers;
        this.question = question;
        this.correctAnswer = correctAnswer;
    }

    public void askQuestion(){
        // print the question
        System.out.println(this.question);
        // print pos answers
        for (int i = 0; i < answers.size(); i++){
            System.out.println(i + ", " + answers.get(i));
        }
        // get users answer


    }
}
