/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;

/**
 *
 * @author DC
 */
import java.util.Scanner;
public class Task3 {
    
    static String ridMultipleBlanks(String string)
    {
        string = string.replaceAll("\\s+", " ");
        return string;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter a string:");
        Scanner obj = new Scanner(System.in);
        String string = obj.nextLine();
        
        String str;
        str = ridMultipleBlanks(string);
        System.out.print(str);
        
    }
    
}
