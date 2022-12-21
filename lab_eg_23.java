23.Calculate and return the sum of all the even numbers present in the numbers array passed to the method calculateSumOfEvenNumbers. Implement the logic inside calculateSumOfEvenNumbers() method. Test the functionalities using the main() method of the Tester class.

public class lab_eg_23 {
   static int calculateSumOfEvenNumbers(int array[]){
       int sum=0;
       for(int i=0;i<array.length;i++){
           if(array[i]%2==0){
               sum=sum+array[i];
           }	
       }
       return sum;


   }
   public static void main(String[] args) {
       int arr[]={1,2,3,4,5,6,7,8,9,10};
       System.out.println(calculateSumOfEvenNumbers(arr));

   }
}
