b) Check whether the string is palindrome without using string methods.
import java.util.Scanner;
public class lab_eg_12_B
{
   public static void main(String[] args)
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Please enter string to check palindrome: ");
       String strInput = sc.nextLine();
       char[] chString = strInput.toCharArray();
       // storing reverse string
       String strReverse = "";
       // reading char by char
       for(int a = chString.length - 1; a >= 0; a--)
       {
           strReverse = strReverse + chString[a];
       }
       System.out.println("Given string: " + strInput);
       System.out.println("Reverse String: " + strReverse);
       if(strInput.equals(strReverse))
       {
           System.out.println("string is palindrome.");
       }
       else
       {
           System.out.println("string is not palindrome.");
       }
   }
}
