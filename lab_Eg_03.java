
import java.util.*;
public class lab_Eg_03 {
    public static double[] lab(){
        int s1 = 23500;
        int s2 = 25080;
        int s3 = 28760;
        int s4 = 22340;
        int s5 = 19890;
        int [] salaries = {s1,s2,s3,s4,s5};
        int sum = 0;
        for(int i=0; i< salaries.length;i++){
            sum = sum +salaries[i];
        }
        double average = sum/ (salaries.length);
        //first value

        int lower_than_avg = 0;
        int higher_than_avg = 0;
        for(int i=0; i< salaries.length;i++){
            if (salaries[i]<average){
                lower_than_avg = lower_than_avg + 1;
            } else if (salaries[i]>average) {
                higher_than_avg = higher_than_avg + 1;
            }
        }
        double [] return_arr = {average,lower_than_avg,higher_than_avg};
        return return_arr;
    }


    public static void main(String[] args) { 
        double [] return_values = lab();

        System.out.println("Average Salary : "+return_values[0]);
        System.out.println("Number of salaries greater than the average salary : "+return_values[1]);
        System.out.println("Number of salaries smaller than the average salary: "+return_values[2]);

    }
}
