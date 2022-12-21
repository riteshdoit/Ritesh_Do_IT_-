class lab_eg_15{
    String name;
    int age;
    Person(int age, String name) {
       this.name = name;
       this.age = age;
    }
}
class Employee extends Person{
    String designation;
    int salary;
    Employee(String designation, String name, int age, int salary) {
        super(age, name);
        this.designation = designation;
        this.salary = salary;
        if (salary>5000){
           System.out.println(name);
            }
      } 
    }
public class employeeSalary{
    public static void main (String [] args){
        Employee emp = new Employee("Developer","Naman",19,45000);
        Employee emp1 = new Employee("Manager","Karan",25,4000);
        Employee emp2 = new Employee("Accountant","Akash",26,5000);
        Employee emp3 = new Employee("Developer","Yash",22,6000);
        Employee emp4 = new Employee("Data Scientist","Sahil",23,2000);     
    }
}
