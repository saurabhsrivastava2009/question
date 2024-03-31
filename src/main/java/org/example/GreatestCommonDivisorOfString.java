package org.example;

/**
 * For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).
 *
 * Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
 *
 *
 *
 * Example 1:
 *
 * Input: str1 = "ABCABC", str2 = "ABC"
 * Output: "ABC"
 * Example 2:
 *
 * Input: str1 = "ABABAB", str2 = "ABAB"
 * Output: "AB"
 * Example 3:
 *
 * Input: str1 = "LEET", str2 = "CODE"
 * Output: ""
 *
 *
 * Constraints:
 *
 * 1 <= str1.length, str2.length <= 1000
 * str1 and str2 consist of English uppercase letters.
 */
public class GreatestCommonDivisorOfString {
    public static void main(String[] args) {
        System.out.println(gcdOfStrings("TAUXXTAUXXTAUXXTAUXXTAUXX","TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX",true));
    }

    //passes 28 cases
    public static String gcdOfStrings(String str1, String str2) {
        String biggerString = str2;
        String smallerString = str1;
        if(str1.length()>str2.length()){
            biggerString = str1;
            smallerString = str2;
        }
        if(biggerString.contains(smallerString)){
            biggerString = biggerString.replaceFirst(smallerString,"");
            if(biggerString.equals(smallerString)){
                return biggerString;
            }
            else {
                return "";
            }
        }
        else {
            return "";
        }
    }

    //passes all cases
    public static String gcdOfStrings(String str1, String str2,boolean usingSubstring) {
        if((str1+str2).equals(str2+str1)){
            int gcd = gcd(str1.length(), str2.length());
            return str1.substring(0, gcd);
        }
        else {
            return "";
        }
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
