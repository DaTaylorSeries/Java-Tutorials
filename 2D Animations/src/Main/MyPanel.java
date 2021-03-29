package Main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MyPanel extends JPanel implements ActionListener {
    
    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 500;
    Image enemy;
    Image backgroundImage;
    Timer timer;
    int xVelocity = 3;
    int yVelocity = 2;
    int x = 0;
    int y = 0;
    
    MyPanel() {
        
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(Color.black);
        enemy = new ImageIcon("enemy.png").getImage();
        backgroundImage = new ImageIcon("space.png").getImage();
        timer = new Timer(10, this);
        timer.start();
        
    }
    
    public void paint(Graphics g) {
        
        super.paint(g);
        
        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(backgroundImage, 0, 0, null);
        g2D.drawImage(enemy, x, y, null);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (x >= PANEL_WIDTH-enemy.getWidth(null) || x < 0) {
            
            xVelocity *= -1;
            
        }
        
        if (y >= PANEL_HEIGHT-enemy.getHeight(null) || y < 0) {
            
            yVelocity *= -1;
            
        }
        
        y += yVelocity;
        x += xVelocity;
        repaint();
        
    }
    
}
