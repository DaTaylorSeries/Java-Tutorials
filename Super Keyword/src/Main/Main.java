package Main;

/**
 *
 * @author Zippy
 */
public class Main {
    
    public static void main(String[] args) {
        
        Hero hero1 = new Hero("Batman", 42, "$$$");
        Hero hero2 = new Hero("Superman", 43, "Everything");
        
        System.out.println(hero2.toString());
        
    }
    
}