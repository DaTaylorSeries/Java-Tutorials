package Main;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class MyFrame extends JFrame implements ActionListener {
    
    JRadioButton pizzaButton;
    JRadioButton hamburgerButton;
    JRadioButton hotdogButton;
    
    
    MyFrame() {
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        
        pizzaButton = new JRadioButton();
        hamburgerButton = new JRadioButton();
        hotdogButton = new JRadioButton();
        
        ButtonGroup group = new ButtonGroup();
        group.add(pizzaButton);
        group.add(hamburgerButton);
        group.add(hotdogButton);
        
        this.add(pizzaButton);
        this.add(hamburgerButton);
        this.add(hotdogButton);
        this.pack();
        this.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == pizzaButton) {
            
            System.out.println("You ordered Pizza!");
            
        }
        
        else if (e.getSource() == hamburgerButton) {
            
            System.out.println("You ordered a hamburger!");
            
        }
        
        else if (e.getSource() == hotdogButton) {
            
            System.out.println("You ordered a hot dog!");
            
        }
        
    }
    
}