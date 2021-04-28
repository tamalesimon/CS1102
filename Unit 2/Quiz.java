import javax.swing.JOptionPane;

public class Quiz {

    static int nQuestions = 0;
    static int nCorrect = 0; 

    public static void main(String[] args) {
        
        String question = "Who is the strongest avenger?\n";
        question += "A. Hulk\n";
        question += "B. Hawkeye\n";
        question += "C. Captain America\n";
        question += "D. Iron Man\n";
        
        check(question, "A");

       String question1 = "What is the most common colour of toilet paper in France?\n";
        question1 += "A. Red\n";
        question1 += "B. White\n";
        question1 += "C. Green\n";
        question1 += "D. Pink\n";

        check(question1, "B");

        String question2 = "If you dug a hole through the centre of the earth starting from Wellington in New Zealand, which European country would you end up in?\n";
        question2 += "A. Italy\n";
        question2 += "B. Britain\n";
        question2 += "C. Spain\n";
        question2 += "D. Norway\n";
        question2 += "E. Uganda\n";

        check(question2, "C"); 


        JOptionPane.showMessageDialog(null, nCorrect+" "+ "out of"+" " +nQuestions);
               //answer = answer.toUpperCase();

    }

    static String ask(String question) {

        String answer;
        while (true) {

            answer = JOptionPane.showInputDialog(question);
            answer = answer.toUpperCase();

            if (!(answer.equals("A") || answer.equals("B") ||
            answer.equals("C") || answer.equals("D") ||answer.equals("E"))) {
                JOptionPane.showMessageDialog(null, "invalid answer, please enter A, B, C, D.");
            } else {
                return answer;
            }   
        }
    }

    static void check(String question, String correctAnswer) {
        
        nQuestions = nQuestions+1;
        String answer = ask(question);
        if (answer.equals(correctAnswer)) {
            JOptionPane.showMessageDialog(null, "Correct!");
            nCorrect = nCorrect+1;
        } else 
            JOptionPane.showMessageDialog(null, "Incorrect, the correct answer is" +" "+correctAnswer);
            
    }

}