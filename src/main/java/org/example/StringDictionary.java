package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a string and a string dictionary, we need to break the string based on the dictionary
 * and if the original string is completely broken then return true else return false.
 * String s = "computerapple"
 * String[] dictionary = new String[]{"apple","computer"}
 */
public class StringDictionary {

    public static void main(String[] args) {
        String input = "computerapple";
        String[] dictionary = new String[]{"apple","computer"};

        boolean flag=false;
        List<String> list = new ArrayList<>();
        for (String string:dictionary){
            int startIndex = input.indexOf(string);
            int endIndex = startIndex+string.length();
            if(input.substring(startIndex,endIndex).equalsIgnoreCase(string)){
                flag = true;
                list.add(input.substring(startIndex,endIndex));
            }
        }
        for(String s:list){
            input = input.replace(s,"");
        }
        if(!input.isEmpty()){
            flag = false;
        }
        System.out.println("Is String completely broken?:"+flag);
    }
}
