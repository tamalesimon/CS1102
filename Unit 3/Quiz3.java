import javax.swing.JOptionPane;

public class Quiz3 {

    public static void main(String[] args) {
        
        String question = "Who is the strongest avenger?\n";
        question += "A. Hulk\n";
        question += "B. Hawkeye\n";
        question += "C. Captain America\n";
        question += "D. Iron Man\n";
        
        ask(question);
        
               //answer = answer.toUpperCase();

    }

    static String ask(String question) {

        String answer;

        while (true) {
            answer = JOptionPane.showInputDialog(question);
            answer = answer.toUpperCase();

            if (!(answer.equals("A") || answer.equals("B") || answer.equals("C") || answer.equals("D") || answer.equals("E"))) {
                JOptionPane.showMessageDialog(null, "invalid answer, please enter A, B, C, D.");
            } else {
                return answer;
            }

        }
    }

}