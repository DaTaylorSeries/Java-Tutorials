package Main;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MyFrame extends JFrame implements ActionListener {
    
    JButton button;
    JMenuBar menuBar;
    JMenu fileMenu;
    JMenu editMenu;
    JMenu helpMenu;
    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;
    
    MyFrame() {
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420, 420);
        this.setLayout(new FlowLayout());
        
        button  = new JButton("Select File");
        button.addActionListener(this);
        
        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");
        
        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");
        
        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);
        
        fileMenu.setMnemonic(KeyEvent.VK_F);
        editMenu.setMnemonic(KeyEvent.VK_E);
        helpMenu.setMnemonic(KeyEvent.VK_H);
        fileMenu.setMnemonic(KeyEvent.VK_F);
        loadItem.setMnemonic(KeyEvent.VK_L);
        saveItem.setMnemonic(KeyEvent.VK_S);
        exitItem.setMnemonic(KeyEvent.VK_E);
        
        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);
        
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);
        this.setJMenuBar(menuBar);
        this.add(button);
        this.pack();
        this.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == button) {
            
            JFileChooser fileChooser = new JFileChooser();
            //fileChooser.showOpenDialog(null);
            fileChooser.setCurrentDirectory(new File("C:\\Users\\Zippy\\Desktop"));
            System.out.println(fileChooser.showOpenDialog(null));
            // int response = fileChooser.showOpenDialog(null);
            int response = fileChooser.showSaveDialog(null);
            
            if (response == JFileChooser.APPROVE_OPTION) {
                
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
                
            }
            
        }
        
        if (e.getSource() == loadItem) {
            
            System.out.println("Beep boop you loaded a file");
            
        }
        
        if (e.getSource() == saveItem) {
            
            System.out.println("Beep boop you saved a file");
            
        }

        if (e.getSource() == exitItem) {
            
            System.exit(0);
            
        }        
       
    }
    
}
