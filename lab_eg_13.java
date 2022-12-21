13.Write a Java program to calculate the Factorial of an integer number using both iterative and recursive solutions.

class lab_eg_13{
    public static void main(String args[]){
        int i,fact=1;
        int number=5;
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
 }
 
 class lab_exam13{
    static int factorial(int n){
        if (n == 0)
            return 1;
        else
            return(n * factorial(n-1));
    }
    public static void main(String args[]){
        int i,fact=1;
        int number=4;
        fact = factorial(number);
        System.out.println("Factorial of "+number+" is: "+fact);
    }
 }
 
