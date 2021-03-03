package Main;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.*;

/**
 *
 * @author Zippy
 */
public class Main {
    
    public static void main(String[] args) throws LineUnavailableException {
        
        Scanner scanner = new Scanner(System.in);
        File file = new File("Tak.wav");
        try {
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            String response = "";
            
            while (!response.equals("Q")) {
                System.out.println("P = play, S = Stop, R = Reset, Q = Quiet");
                System.out.print("Enter your choice: ");
                
                response = scanner.next();
                response = response.toUpperCase();
                
                switch(response) {
                    case ("P") : clip.start();
                    break;                   
                    
                    case ("S") : clip.stop();
                    break;                    
                    
                    case ("R") : clip.setMicrosecondPosition(0);
                    break;
                    
                    case ("Q") : clip.close();
                    break;
                    default: System.out.println("Not a valid response");
                }
            }
            
            System.out.println("You have stopped audio playback.");
        } catch (UnsupportedAudioFileException | IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
