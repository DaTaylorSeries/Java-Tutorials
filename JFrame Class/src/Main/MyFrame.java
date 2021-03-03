package Main;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Zippy
 */
public class MyFrame extends JFrame {
    
    MyFrame() {
        this.setTitle("JFrame title goes here");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setSize(600, 420);        
        this.setVisible(true);        
        ImageIcon image = new ImageIcon("DTS Logo.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(0x123456));
    }
    
}
