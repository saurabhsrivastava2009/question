package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Given we have two arrays of fruit basket and its price, we need to buy max fruits with minimum price.
 * int[] fruitBasket = {8, 6, 4, 7, 6, 5};
 * int[] priceOfEachBasket = {8, 5, 5, 9, 2, 4};
 * int maxFruits = 15;
 */
public class FruitBasket {
    public static void main(String[] args) {
        int[] fruitBasket = {8, 6, 4, 7, 6, 5};
        int[] priceOfEachBasket = {8, 5, 5, 9, 2, 4};
        int maxFruits = 6;

        int totalFruit = 0;
        int totalCost = 0;

        Integer[] basketIndex = new Integer[fruitBasket.length];
        for(int i=0;i<fruitBasket.length;i++){
            basketIndex[i] =i;
        }

        List<Integer> bag = new ArrayList<>();

        Arrays.sort(basketIndex,(a,b)->Integer.compare(priceOfEachBasket[a],priceOfEachBasket[b]));

        for(int index:basketIndex){
            if(totalFruit+fruitBasket[index]<=maxFruits){
                totalFruit = totalFruit + fruitBasket[index];
                totalCost = totalCost +priceOfEachBasket[index];
                bag.add(fruitBasket[index]);
            }
            else {
                break;
            }
        }

        bag.forEach(b->System.out.println("Contains of bag:"+b));
        System.out.println("Total Fruits:"+totalFruit);
        System.out.println("Total Money Spent:"+totalCost);
    }
}
