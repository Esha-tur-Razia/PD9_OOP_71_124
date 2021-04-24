/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

/**
 *
 * @author DC
 */
 import java.util.Scanner;
public class Task2 {
    
    static void displayVertical(String string)
    {
        
        for (int i = 0; i < string.length(); i++)
        {
            System.out.println(string.charAt(i));
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter a string:");
        Scanner obj = new Scanner(System.in);
        String string = obj.nextLine();
        
        displayVertical(string);
    }
    
}
