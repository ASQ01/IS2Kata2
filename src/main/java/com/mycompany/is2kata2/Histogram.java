package com.mycompany.is2kata2;

import java.util.HashMap;
import java.util.Map;

public class Histogram {
    private final int[] data;
    
    public Histogram(int[] data){
        this.data = data;
    }
    
    public Map<Integer, Integer> getHistogram(){
        HashMap<Integer, Integer> histogram = new HashMap<Integer, Integer>();
        
        for (int number : data) {
            histogram.put(number, histogram.containsKey(number) ? histogram.get(number) + 1 : 1);
        }
        
        return histogram;
    }
}
