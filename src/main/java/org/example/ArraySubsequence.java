package org.example;

import java.util.*;

/**
 * Given we have two arrays as below
 * int[] arr1 = {5,4,8,6,9,2,1,6,9,4}
 * int[] arr2 = {6,4,5,9}
 * We need to print the output in a way, such that
 * 1 - the element from arr2 must be printed based on the count of the same element in arr1.
 * 2 - if not present then print the rest of elements from arr1 maintaining the ascending order
 *
 * Output - 6644599128
 */
public class ArraySubsequence {
    public static void main(String[] args) {
        int[] arr1 = {5,4,8,6,9,2,1,6,9,4};
        int[] arr2 = {6,4,5,9};


        Arrays.sort(arr1); //for maintaining the ascending order of non-matching elements

        List<Integer> list = new ArrayList<>();
        Map<Integer,Integer> map = new LinkedHashMap<>();
        for(int i=0;i<arr1.length;i++){
            if(Arrays.toString(arr2).contains(String.valueOf(arr1[i]))){
                map.put(arr1[i],map.getOrDefault(arr1[i],0)+1);
            }
            else {
                list.add(arr1[i]);
            }
        }
        int index=0;
        for(int i=0;i<arr2.length;i++){
            if(map.containsKey(arr2[i])){
                int count = map.get(arr2[i]);
                while (count>0){
                    list.add(index,arr2[i]);
                    count--;
                    index++;
                }
            }
        }
        list.forEach(e->System.out.print(e));
       // map.forEach((k,v) -> System.out.println(k+","+v));
    }
}
