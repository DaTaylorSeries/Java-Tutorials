package Main;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements KeyListener{
    
    JLabel label;
    ImageIcon icon;
    
    MyFrame() {
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        
        icon = new ImageIcon("rocket.png");
        
        label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        //label.setBackground(Color.red);
        //label.setOpaque(true);
        label.setIcon(icon);
        
        this.getContentPane().setBackground(Color.black);
        this.add(label);
        this.addKeyListener(this);
        this.setLayout(null);
        this.setVisible(true);
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
        switch (e.getKeyChar()) {
            
            case 'a': label.setLocation(label.getX() - 10, label.getY());
            break;
            
            case 'w': label.setLocation(label.getX(), label.getY() - 10);
            break;
            
            case 's': label.setLocation(label.getX(), label.getY() + 10);
            break;
            
            case 'd': label.setLocation(label.getX() + 10, label.getY());
            
        }
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
        switch (e.getKeyCode()) {
            
            case 37: label.setLocation(label.getX() - 10, label.getY());
            break;
            
            case 38: label.setLocation(label.getX(), label.getY() - 10);
            break;
            
            case 40: label.setLocation(label.getX(), label.getY() + 10);
            break;
            
            case 39: label.setLocation(label.getX() + 10, label.getY());
            
        }        
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
        System.out.println("You released key character: " + e.getKeyChar());
        System.out.println("You released key code: " + e.getKeyCode());
        
    }
    
}