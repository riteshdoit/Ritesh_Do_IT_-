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

