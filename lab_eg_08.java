8.      Write a Java Program to count the number of words in a string using HashMap.
Input: Enter String: " This this is is done by Saket Saket ";
         	{Saket=2, by=1, this=1, This=1, is=2, done=1}

import java.util.HashMap;
import java.util.Map;

public class lab_eg_08 {
   public static void main(String[] args) {
       String str = "This this is is done by Saket Saket";
       Map<String, Integer> hashMap = new HashMap<>();
       String[] words = str.split(" ");

       for (String word : words) {
           Integer integer = hashMap.get(word);

           if (integer == null)
               hashMap.put(word, 1);

           else {
               hashMap.put(word, integer + 1);
           }
       }
       System.out.println(hashMap);
   }
}
