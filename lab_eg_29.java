29.Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and $200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', each having a method named 'getBalance'. Call this method by creating an object of each of the three classes.

abstract class Bank{
    abstract void getBalance();
 }
 
 class BankA extends Bank{
    public void getBalance(){
        System.out.println("The balance in bank A is 100");
    }
 }
 
 class BankB extends Bank{
    public void getBalance(){
        System.out.println("The balance in bank B is 150");
    }
 }
 
 class BankC extends Bank{
    public void getBalance(){
        System.out.println("The balance in bank C is 200");
    }
 }
 
 public class lab_eg_29 {
    public static void main(String[] args) {
        BankA bankA = new BankA();
        bankA.getBalance();
 
        BankB bankB=new BankB();
        bankB.getBalance();
 
        BankC bankC = new BankC();
        bankC.getBalance();
    }
 }
 
