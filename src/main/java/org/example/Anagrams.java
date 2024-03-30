package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Given two strings, we need find if they are anagram
 */
public class Anagrams {

    public static void main(String[] args) {
        String s1="silent";
        String s2="listet";
        boolean isAnagram = false;

        if(s1.length()!=s2.length()){
            isAnagram = false;
        }
        else {
            char[] s1Arr = s1.toCharArray();
            char[] s2Arr = s2.toCharArray();

            Arrays.sort(s1Arr);
            Arrays.sort(s2Arr);

            for(int i=0;i<s1Arr.length;i++){
                if(s1Arr[i]==s2Arr[i]){
                    isAnagram = true;
                }
                else {
                    isAnagram = false;
                    break;
                }
            }
        }
        System.out.println("Anagram?:"+isAnagram);
    }
}
