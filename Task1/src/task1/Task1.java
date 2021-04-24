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
    
    static int  wordCounter (String string)
    {
        int count = 0;
        for (int i= 0; i < string.length(); i++)
        {
            if (string.charAt(i) == ' ')
            {
                count++;
            }
        }
        return count;
    }
      static int vowelCounter (String string)
      {
          int count = 0;
          for (int i = 0; i < string.length(); i++)
        {
            char ch = string.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                    || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            {
                count++;
            }
        }
          
          return count;
      }
      static int puncCount (String string)
      {
          int count = 0;
          for (int i = 0; i < string.length(); i++)
          {
              char ch = string.charAt(i);
              if (ch == '.' || ch == ',' || ch == ':' || ch == ';' || ch == '/'
                      || ch == '/' || ch == '!' || ch == '"' )
              {
                  count++;
              }
          }
          return count;
      }
      static boolean findSubString(String string,String sub)
      {
          boolean flag = true;
          sub = "the";
          for (int i = 0; i < string.length(); i++)
          {
             if(string.equals(sub))
                 flag = false;
          }
          return flag;
      }
    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Enter a sentence:");
        Scanner obj = new Scanner(System.in);
        String string = obj.nextLine();
        
        
        int totalWord;
        totalWord = wordCounter(string);
        System.out.println("No of words in the given sentence are: " + totalWord);
        

        int totalVowels;
        totalVowels = vowelCounter (string);
        System.out.println("No of vowels in the given sentence are: " + totalVowels);
        
        
        int totalPuncMark;
        totalPuncMark = puncCount (string);
        System.out.println("No of punctuation marks in tne string are: " + totalPuncMark);
        
        boolean ans;
        String sub = null;
        ans = findSubString(string,sub);
        if (ans == true)
        {
            System.out.println("the is the part of the string ");
        }
        else
        {
            System.out.println("the is not a part of the string");
        }
        
    }
    
}
