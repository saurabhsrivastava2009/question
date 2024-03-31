package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
 *
 * Return the merged string.
 *
 * Example 1:
 *
 * Input: word1 = "abc", word2 = "pqr"
 * Output: "apbqcr"
 * Explanation: The merged string will be merged as so:
 * word1:  a   b   c
 * word2:    p   q   r
 * merged: a p b q c r
 * Example 2:
 *
 * Input: word1 = "ab", word2 = "pqrs"
 * Output: "apbqrs"
 * Explanation: Notice that as word2 is longer, "rs" is appended to the end.
 * word1:  a   b
 * word2:    p   q   r   s
 * merged: a p b q   r   s
 * Example 3:
 *
 * Input: word1 = "abcd", word2 = "pq"
 * Output: "apbqcd"
 * Explanation: Notice that as word1 is longer, "cd" is appended to the end.
 * word1:  a   b   c   d
 * word2:    p   q
 * merged: a p b q c   d
 *
 * NOTE : word1 and word2 will always be consisting of small-case alphabets
 */
public class MergeTwoStringAlternatively {
    public static void main(String[] args) {
        System.out.println("Result String: "+mergeAlternately("abcd","pqrs"));
        System.out.println("Result String: "+mergeAlternately("ab","pqrs"));
        System.out.println("Result String: "+mergeAlternately("abcd","pq"));
    }

    public static String mergeAlternately(String word1, String word2) {
        int startingIndexWord1=0;
        int startingIndexWord2=0;
        String resultString = "";
        List<Character> resultList = new ArrayList<>();
        int length = Math.max(word1.length(),word2.length());
        int i=0;
        while(length>0){
            if(i<word1.length()){
                resultList.add(startingIndexWord1,word1.charAt(i));
                startingIndexWord2 = startingIndexWord1+1;
            }
            else {
                startingIndexWord2++;
            }
            if(i<word2.length()) {
                resultList.add(startingIndexWord2, word2.charAt(i));
                startingIndexWord1=startingIndexWord2+1;
            }
            else {
                startingIndexWord1++;
            }
            i++;
            length--;
        }
        resultString = resultList.toString().replaceAll("[^a-z]","");
        //if any word contains upper case or digit, we need to use RE [^a-zA-Z0-9]
        //Also if the word contains any special character, then we need to use loop instead of replaceAll
        return resultString;
    }
}
