/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author Zippy
 */
public class Main {
    
    static int add(int a, int b) {
        System.out.println("This is overloaded method #1");
        return (a + b);
    }
    
    static double add(double a, double b) {
        System.out.println("This is overloaded method #4");
        return (a + b);
    }
    
    static int add(int a, int b, int c) {
        System.out.println("This is overloaded method #2");
        return (a + b + c);
    }
    
    static double add(double a, double b, double c) {
        System.out.println("This is overloaded method #5");
        return (a + b + c);
    }
    
    static int add(int a, int b, int c, int d) {
        System.out.println("This is overloaded method #3");
        return (a + b + c + d);
    }
    
    static double add(double a, double b, double c, double d) {
        System.out.println("This is overloaded method #6");
        return (a + b + c + d);
    }
    
    public static void main(String[] args) {
        int x = add(1,2);
        System.out.println(x);
        int y = add(1,2,3);
        System.out.println(y);
        int z = add(1,2,3,4);
        System.out.println(z);
        
        double a = add(0.5,1.5);
        System.out.println(a);
        double b = add(2.5,3.5,4.5);
        System.out.println(b);
        double c = add(5.5,6.5,7.5,8.5);
        System.out.println(c);
    }
    
}
