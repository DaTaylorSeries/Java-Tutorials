package Main;

import java.util.Random;

/**
 *
 * @author Zippy
 */
public class DiceRoller {
    
    Random random;
    int number;
    
    DiceRoller() {
        random = new Random();
        roll();
    }
    
    void roll() {
        number = random.nextInt(6)+1;
        System.out.println(number);
    }
    
}
