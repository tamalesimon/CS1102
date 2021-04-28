import javax.swing.JOptionPane;

public class QuizUnit2 {

    static String ask (String Question) {
        
    }
    public static void main(String[] args) {

        String question = "Who is the strongest avenger?\n";
        question += "A. Hulk\n";
        question += "B. Hawkeye\n";
        question += "C. Captain America\n";
        question += "D. Iron Man\n";

        

        while (true) {

            String answer = JOptionPane.showInputDialog(question);
		    answer = answer.toUpperCase();
            
            if (answer.equals("A")) {
                JOptionPane.showMessageDialog(null, " Correct!");
                break;

            } else if (answer.equals("B") || answer.equals("C") || answer.equals("D")) {
                JOptionPane.showMessageDialog(null, "Incorrect!, Please try again");
            } else {
                JOptionPane.showMessageDialog(null, "Invalid answer, Please enter A, B, C, or D");
            }
        }	

    }
}