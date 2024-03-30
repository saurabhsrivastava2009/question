package org.example;

/**
 * Given we have a string
 * String s1 = "abcdefghi"
 * We need to remove all the vowels from the string s1 and
 * print the next character to the vowel in the string based on vowel position number of times.
 * Here the output will be
 * o/p - bcdffgh
 * Explanation -
 * In vowels a is at the first position, so a is removed from s1 and next character b is printed 1 time
 * e is at the second position, so e is removed and f is printed twice
 */
public class Vowels {
    public static void main(String[] args) {
        String input = "abcdefghi";
        String vowels ="aeiou";
        String result="";
        for(int i=0;i<input.length();i++){
            char ch = input.charAt(i);
            if(vowels.contains(String.valueOf(ch))){
                int index = vowels.indexOf(ch);
                if(i+1!=input.length()) {
                    char nextChar = input.charAt(i + 1);
                    while (index > 0) {
                        result = result + nextChar;
                        index--;
                    }
                }
            }
            else {
                result = result+ch;
            }
        }

        System.out.println(result);
    }
}

