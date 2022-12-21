-11.a) Write a program that takes three double values X0, V0, and t from the user and prints the value, where g is the constant 9.78033. This value is the displacement in meters after t seconds when an object is thrown straight up from initial position x0 at velocity v0 meters per second.

import java.util.Scanner;

public class lab_eg_11_A {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       double x=sc.nextDouble();
       double v=sc.nextDouble();
       double t=sc.nextDouble();
       double k= (double) (((9.78033)*t*t)/2);
       System.out.println(x + v*t + k);
   }
}

