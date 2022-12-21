b) Write a java program that takes two positive integers as command-line arguments and prints true if either evenly divides the other.

import java.util.*;
public class lab_eg_09_B {
    Scanner sc = new Scanner(System.in);
    int a,b;
    public void divide(){
        System.out.println("Enter two numbers ");
        a = sc.nextInt();
        b = sc.nextInt();
        if(a%b==0 || b%a==0){
            System.out.println("TRUE");
        }
        else{
            System.out.println("FALSE");
        }
    }
    public static void main(String[] args) {
        EquallyDivide ob = new EquallyDivide();
        ob.divide();
    }
}
