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
    
    static int add(int x, int y) {
        return x + y;
    }
    
    static void hello(String name, int age) {
        System.out.println("Hello " + name + ". You are " + age + " years old.");
    }
    
    public static void main(String[] args) {
        String name = "Taylor";
        int age = 25;
        hello(name, age);
        int x = 3;
        int y = 4;
        System.out.println(add(x,y));
    }
    
}
