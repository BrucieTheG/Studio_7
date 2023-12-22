import Launchcode.org.Question;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        // TODO Run the quiz here!
        ArrayList<String> answersFavColor = new ArrayList<>();
        answersFavColor.add("Orange");
        answersFavColor.add("Blue");
        answersFavColor.add("Green");
        answersFavColor.add("Red");

        Question favColor = new Question(answersFavColor, 3, "What is your favirote color? There is only one right answer?");
        favColor.askQuestion();
    }

}
