package com.mycompany.is2kata2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        int[] data = new int[]{23, 45, 8, 24, 30, 6, 35, 7, 0, 10, 11, 2, 77, 34, 32};
        
        Histogram histo = new Histogram(data);
        Map<Integer, Integer> histogr = histo.getHistogram();
        
        for (Integer key : histogr.keySet()){
            System.out.println(key + " ==> " + histogr.get(key));
        }
    }
    
}
