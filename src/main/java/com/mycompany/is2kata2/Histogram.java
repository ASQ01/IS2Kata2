package com.mycompany.is2kata2;

import java.util.HashMap;
import java.util.Map;

public class Histogram<T> {
    private final T[] data;
    
    public Histogram(T[] data){
        this.data = data;
    }
    
    public Map<T, Integer> getHistogram(){
        HashMap<T, Integer> histogram = new HashMap<T, Integer>();
        
        for (T number : data) {
            histogram.put(number, histogram.containsKey(number) ? histogram.get(number) + 1 : 1);
        }
        
        return histogram;
    }
}
