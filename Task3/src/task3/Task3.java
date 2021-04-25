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
    
    static String stringEncryption(String s)
    {   
        
        String encrypt = "";
        for (int i = 0; i < s.length(); i++)
        {
            
            String character = s.toLowerCase();
            char ch = character.charAt(i);
            switch(ch)
            {
                case 'a':
                    encrypt = encrypt + '/';
                case 'b':
                    encrypt = encrypt + '*';
                case 'c':
                    encrypt = encrypt + '&';
                case 'd':
                    encrypt = encrypt + '%';
                case 'e':
                    encrypt = encrypt + '$';
                case 'f':
                    encrypt = encrypt + '#';
                case 'g':
                    encrypt = encrypt + '@';
                case 'h':
                    encrypt = encrypt + '!';
                case 'i':
                    encrypt = encrypt + '`';
                case 'j':
                    encrypt = encrypt + '~';
                case 'k':
                    encrypt = encrypt + '?';
                case 'l':
                    encrypt = encrypt + "";
                case 'm':
                    encrypt = encrypt + "";
                case 'n':
                    encrypt = encrypt + "";
                case 'o':
                    encrypt = encrypt + "";                    
                case 'p':
                    encrypt = encrypt + "";
                case 'q':
                    encrypt = encrypt + "";
                case 'r':
                    encrypt = encrypt + "";
                case 's':
                    encrypt = encrypt + "";
                case 't':
                    encrypt = encrypt + "";
                case 'u':
                    encrypt = encrypt + "";
                case 'v':
                    encrypt = encrypt + "";
                case 'w':
                    encrypt = encrypt + "";
                case 'x':
                    encrypt = encrypt + '9';
                case 'y':
                    encrypt = encrypt + 'z';
                case 'z':
                    encrypt = encrypt + '^';
                case '1':
                    encrypt = encrypt + 'a';
                case '2':
                    encrypt = encrypt + 'B';
                case '3':
                    encrypt = encrypt + '{';                    
                case '4':
                    encrypt = encrypt + '}';
                case '5':
                    encrypt = encrypt + '<';
                case '6':
                    encrypt = encrypt + '>';
                case '7':
                    encrypt = encrypt + '.';
                case '8':
                    encrypt = encrypt + '?';                    
                case ' ':
                    encrypt = encrypt + '#';
                case '0':
                    encrypt = encrypt + 'J';
                case '.':
                    encrypt = encrypt + 'K';
                case '!':
                    encrypt = encrypt + 'L';
                case ',':
                    encrypt = encrypt + 'm'; 
                default:
                    encrypt = encrypt + '0';
            }
        }
        
        return encrypt;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter a string to reove multiple blanks:");
        Scanner obj = new Scanner(System.in);
        String string = obj.nextLine();
        
        String ridSpace;
        ridSpace = ridMultipleBlanks(string);
        System.out.println(ridSpace);
        
        System.out.println("Enter a string to remove integers:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();        
        String removeInt;
        removeInt = removeInteger(str);
        System.out.println(removeInt);
        
        System.out.println("Enter a string you want to encrypt:");
        Scanner sca = new Scanner(System.in);
        String s = sca.nextLine();
        String convertToEncrypt;
        convertToEncrypt = stringEncryption(s);
        System.out.println(convertToEncrypt);
        
    }
    
}
