public class Quiz {

    public static void main(String[] args) {

        MultipleChoiceQuestion question = new MultipleChoiceQuestion (
        "Who is the strongest avenger?",
        "Hulk",
        "Hawkeye",
        "Captain America",
        "Iron Man",
        "Flash",
        "a");
        question.check();
        MultipleChoiceQuestion question1 = new MultipleChoiceQuestion ( 
        "What is the most common colour of toilet paper in France?",
        "Red",
        "White",
        "Green",
        "Pink",
        "Yellow",
        "b");
        question1.check();
        MultipleChoiceQuestion question2 = new MultipleChoiceQuestion ( 
        "If you dug a hole through the centre of the earth starting from Wellington in New Zealand, which European country would you end up in?",
        "Italy",
        "Britain",
        "Spain",
        "Norway",
        "Uganda",
        "c");
        question2.check();

        
            //out of message display
        /* JOptionPane.showMessageDialog(null, nCorrect + " " + "out of" + " " + nQuestions); */
        // answer = answer.toUpperCase();
       extracted(question);

    }

    private static void extracted(MultipleChoiceQuestion question) {
        question.showResult();
    }

}