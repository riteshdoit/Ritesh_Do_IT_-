19.Create two arrayLists ,add the String elements in arrayList using add(). 
Add one arraylist into the other from index 1 using appropriate method. 
Print the two added list. 
Print the index of "Are".
Remove the 4th element from arraylist1
Replace 4 element of arraylist2 as "U"
             Test the functionalities using the main() method of the Tester class.
Sample Input:    str1 - ("Hello", "How", "Are", "You")     str2 - ("Hi" , "How", "Are" ,You")                                                                                                                                                                                                          Sample Output:   [Hello, Hi, How, Are, You, How, Are, You]

import java.util.*;
public class lab_eg_19 {
   public static void main(String[] args) {
       ArrayList<String> str1=new ArrayList<>();
       str1.add("Hello");
       str1.add("How");
       str1.add("Are");
       str1.add("You");

       ArrayList<String> str2=new ArrayList<>();
       str2.add("Hi");
       str2.add("How");
       str2.add("Are");
       str2.add("You");

       ArrayList<String> str3=new ArrayList<>();
       str3.addAll(str1);
       str3.addAll(1,str2);
       System.out.println(str3);

       System.out.println("The index of Are:"+str3.indexOf("Are"));

       str1.remove(3);
       System.out.println(str1);

       str2.set(3,"U");
       System.out.println(str2);
   }
}
