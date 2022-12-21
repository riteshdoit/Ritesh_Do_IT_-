26. 3) Take 10 integer inputs from user and store them in an array. Now, copy all the elements in another array but in reverse order.

import java.util.Scanner;

public class lab_eg_26_C {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int arr[] =new int[10];
       System.out.println("Enter 10 numbers");
       for(int i=0;i<10;i++){
           arr[i]=sc.nextInt();
       }

       int arr1[]=new int[10];
       for (int j=0;j<10;j++){
           arr1[j]=arr[10-j-1];
       }

       for(int k=0;k<10;k++){
           System.out.print(arr1[k]);
       }
   }
}

