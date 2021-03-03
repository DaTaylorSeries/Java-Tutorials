package Main;

/**
 *
 * @author Zippy
 */
public class Main {
    
    public static void main(String[] args) {
        
        /* Alternative way
        Food[] fridge = new Food[3];
        
        int[] numbers = new int[3];
        char[] characters = new char[4];
        String[] strings = new String[5];
        
        fridge[0] = food1;
        fridge[1] = food2;
        fridge[2] = food3;
        */
        
        Food food1 = new Food("Pizza");
        Food food2 = new Food("Hamburger");
        Food food3 = new Food("Hot Dog");
        
        Food[] fridge = {food1, food2, food3};
        
        System.out.println(fridge[0].name);
        System.out.println(fridge[1].name);
        System.out.println(fridge[2].name);
        
    }
    
}
