package Main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Zippy
 */
public class Main {
    
    public static void main(String[] args) throws IOException {
        
        try {
            
            FileReader reader = new FileReader("art.txt");
            int data = reader.read();
            while (data != -1) {
                
                System.out.print((char)data);
                data = reader.read();
                
            }
            
            reader.close();
            
        } catch (FileNotFoundException ex) {
            
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            
        } catch (IOException e) {
            
            e.printStackTrace();
            
        }
        
    }
    
}
