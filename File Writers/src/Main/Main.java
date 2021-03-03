package Main;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Zippy
 */
public class Main {
    
    public static void main(String[] args) throws IOException {
        
        try {
            
        FileWriter writer = new FileWriter("Poem.txt");
        writer.write("Roses are red \nViolets are blue \nBooty booty booty \nRockin everywhere");
        writer.append("\nA poem by Taylor");
        writer.close();
        
        }
        
        catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
}
