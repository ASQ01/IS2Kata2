package com.mycompany.is2kata2;

import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        int[] data = new int[]{23, 45, 8, 24, 30, 6, 35, 7, 0, 10, 11, 2, 77, 34, 32};
        HashMap<Integer, Integer> histogram = new HashMap<Integer, Integer>();
        
        for (int number : data) {
            histogram.put(number, histogram.containsKey(number) ? histogram.get(number) + 1 : 1);
        }
        
        for (Integer key : histogram.keySet()){
            System.out.println(key + " ==> " + histogram.get(key));
        }
    }
    
}
