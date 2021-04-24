/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

/**
 *
 * @author DC
 */
import java.util.Scanner;
public class Task1 {
      
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int count;
        count = 0;
        System.out.println("Enter a sentence:");
        Scanner obj = new Scanner(System.in);
        String string = obj.nextLine();
        for (int i= 0; i < string.length(); i++)
        {
            if (string.charAt(i) == ' ')
            {
                count++;
            }
        }
        System.out.println("No of words in the given sentence are: " + count);
        
        
    }
    
}
