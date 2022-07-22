package org.launchcode.studio2;

import java.util.HashMap;
import java.util.Map;

public class CountChar {
 void countCharacters(String inputString){
         HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
         char[] strArray = inputString.toCharArray();
     for (char c : strArray) {
         if (charCountMap.containsKey(c)) {

             // If char is present in charCountMap,
             // incrementing it's count by 1
             charCountMap.put(c, charCountMap.get(c) + 1);
         }
         else {

             // If char is not present in charCountMap,
             // putting this char to charCountMap with 1 as it's value
             charCountMap.put(c, 1);
         }
     }

     // Printing the charCountMap
     for (Map.Entry entry : charCountMap.entrySet()) {
         System.out.println(entry.getKey() + " : " + entry.getValue());
     }
 }

}
