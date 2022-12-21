4.   Write a Java Program to-
a.      Check Armstrong                                                                       
b.      Check that given number is palindrome or not  	
c.      Check that given number is odd or even	
d.      Print reverse of a number

import java.util.Scanner;

public class lab_eg_04 {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int a = input.nextInt();
       Armstrong(a);
       Pallindrome(a);
       EvenorOdd(a);
       Reverse(a);
   }
    static int Armstrong(int number){
       int num = number , originalnumber , remainder , result=0;
       originalnumber = number;
        System.out.println(originalnumber);
       while(originalnumber !=0){
           remainder = originalnumber % 10;
           result += Math.pow(remainder,3);
           originalnumber /= 10;
       }
       if(result == number){
            System.out.println(number+ " is an Armstrong no.");
       }
       else {
           System.out.println(number + " is not an Armstrong no.");
       }
       return number;
    }
   static int Pallindrome (int number){
       int   remainder , originalnumber = number , reversednumber=0;
        while (originalnumber!=0){
            remainder = originalnumber% 10;
            reversednumber = reversednumber * 10 + remainder;
            originalnumber /=10;
        }
       if(reversednumber == number){
           System.out.println(number + " is a Pallindrome no.");
       }
       else {
           System.out.println(number + " is not a Pallindrome no.");
       }
       return number;
   }

   static int EvenorOdd(int number){
       int num = number;
       if(num %2==0){
           System.out.println(num +" is Even");
       }
       else {
           System.out.println(num + " is ODD");
       }
       return number;
   }
   static int Reverse(int number)
   {
       int num = number, reversednumber=0, remainder;

       while(num != 0 ){
           remainder = num % 10;
           reversednumber = reversednumber * 10 + remainder;
           num /=10;
       }
       System.out.println("Reverse number : "+reversednumber);
       return number;
   }
}
