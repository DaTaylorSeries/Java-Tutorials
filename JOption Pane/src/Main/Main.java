package Main;

import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args) {
        
        //JOptionPane.showMessageDialog(null, "This is some useless info", "Title", JOptionPane.PLAIN_MESSAGE);
        //JOptionPane.showMessageDialog(null, "This is some useless info", "Title", JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "This is some useless info", "Title", JOptionPane.QUESTION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "This is some useless info", "Title", JOptionPane.WARNING_MESSAGE);
        //JOptionPane.showMessageDialog(null, "This is some useless info", "Title", JOptionPane.ERROR_MESSAGE);
        
        //int answer = JOptionPane.showConfirmDialog(null, "Bro, do you even code?", "Title", JOptionPane.YES_NO_CANCEL_OPTION);
        //String name = JOptionPane.showInputDialog("What is your name?: ");
        //System.out.println("Hello " + name);
        
        String[] responses = {"No, you're awesome!", "Thank you!", "Blush"};
        
        JOptionPane.showOptionDialog(null, "You are awesome", "Secret Message", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, responses, 0);
        
        }
    
}
