package Main;

/**
 *
 * @author Zippy
 */
public class Main {
    
    public static void main(String[] args) {
        
        Human human1 = new Human("Rick", 65, 70);
        Human human2 = new Human("Taylor", 25, 50);
        
        System.out.println(human1.age);
        System.out.println(human2.name);
        
        human2.eat();
        human1.drink();
        
    }
    
}
