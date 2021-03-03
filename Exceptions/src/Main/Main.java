package Main;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Zippy
 */
public class Main {
    
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);
       
    try {    
        
        System.out.println("Enter a whole number: ");
        int x = scanner.nextInt();
        
        System.out.println("Enter a whole number to divide by: ");
        int y = scanner.nextInt();
        
        int z = x / y;
        
        System.out.println("restult: " + z);
        
        }
        catch(ArithmeticException e) {
            
            System.out.println("You can't divide by zero idiot!");
            
        }
    
        catch(InputMismatchException e) {
            
            System.out.println("ENTER A NUMBER IDIOT:");
            
        }
    
        catch(Exception e) {
            
            System.out.println("Something went wrong:");
            
        }
    
        finally {
        
            System.out.println("This will always print.");
            scanner.close();
          
         }
        
    }
    
}
