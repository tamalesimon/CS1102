import javax.swing.JOptionPane;

public class MultipleChoiceQuestion {
    
    static int nQuestions = 0; // class variables
    static int nCorrect = 0;

    String question; // instance variables
    String correctAnswer;

    MultipleChoiceQuestion (String query, String a, String b, String c, String d, String e, String answer) { // constructor
        question = query+"\n";
        question += "A."+a+"\n";
        question += "B."+b+"\n";
        question += "C."+c+"\n";
        question += "D."+d+"\n";
        question += "E."+e+"\n";
        correctAnswer = answer.toUpperCase();
    }
    
    String ask() { //Question asking Method

        String answer;
        while (true) {

            answer = JOptionPane.showInputDialog(question);
            answer = answer.toUpperCase();

            if (!(answer.equals("A") || answer.equals("B") || answer.equals("C") || answer.equals("D")
                    || answer.equals("E"))) {
                JOptionPane.showMessageDialog(null, "invalid answer, please enter A, B, C, D.");
            } else {
                return answer;
            }
        }
    }

    void check() { //Answer Checking method

        nQuestions = nQuestions + 1;
        String answer = ask();
        if (answer.equals(correctAnswer)) {
            JOptionPane.showMessageDialog(null, "Correct!");
            nCorrect = nCorrect + 1;
        } else
            JOptionPane.showMessageDialog(null, "Incorrect, the correct answer is" + " " + correctAnswer);

    }

    void showResult() {
        JOptionPane.showMessageDialog(null, nCorrect + " " + "out of" + " " + nQuestions);
    }
}
