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
    static String removeInteger(String str)
    {
        str = str.replaceAll("[0,1,2,3,4,5,6,7,8,9]", "");
        return str;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter a string:");
        Scanner obj = new Scanner(System.in);
        String string = obj.nextLine();
        
        String ridSpace;
        ridSpace = ridMultipleBlanks(string);
        System.out.println(ridSpace);
        
        System.out.println("Enter a string:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();        
        String removeInt;
        removeInt = removeInteger(str);
        System.out.println(removeInt);
    }
    
}
