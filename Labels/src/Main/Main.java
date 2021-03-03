package Main;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

/**
 *
 * @author Zippy
 */
public class Main {
    
    public static void main(String[] args) {
        
        ImageIcon image = new ImageIcon("Icon.png");
        Border border = BorderFactory.createLineBorder(Color.green,3);
        
        
        JLabel label = new JLabel();
        label.setText("Bro, do you even code?");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.blue);
        label.setFont(new Font("MV Boli", Font.PLAIN,20));
        label.setIconTextGap(10);
        label.setBackground(Color.black);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();
        
    }
    
}
