package Main;

import java.util.Scanner;

/**
 *
 * @author Zippy
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        Animal animal;
        
        System.out.println("What animal do you want?");
        System.out.print("1 = dog, 2 = cat ");
        
        int choice = scanner.nextInt();
        
        if (choice == 1) {
            
            animal = new Dog();
            animal.speak();
            
        }
        
        else if (choice == 2) {
            
            animal = new Cat();
            animal.speak();
            
        }
        
        else {
            
            animal = new Animal();
            System.out.println("That choice was invalid");
            animal.speak();
            
        }
        
    }
    
}
