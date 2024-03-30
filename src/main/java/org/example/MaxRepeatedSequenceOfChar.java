package org.example;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Count the maximum continuously repeated subsequence of all characters in a string
 * with conditions
 * 1- minimum count being greater than 2
 * 2- Order is maintained
 * E.g.
 * String input = "IINNIIIDANNNIIIIAAAATTIII"
 * Output - I4,N3,A4
 */
public class MaxRepeatedSequenceOfChar {
    public static void main(String[] args) {
        String input = "IINNIIIDANNNIIIIAAAATTIIIII";
        int count = 1;
        int maxCount = 0;
        Map<Character,Integer> map = new HashMap<>();
        for(int i=1;i<input.length();i++){
            if(input.charAt(i) == input.charAt(i-1)){
                count++;
                if(count>maxCount){
                    maxCount = count;
                    if(maxCount>2){
                        map.put(input.charAt(i),maxCount);
                    }
                }
            }
            else {
                count =1;
                maxCount =0;
            }
        }

        map.forEach((k,v)->System.out.println(k+""+v));
    }
}
