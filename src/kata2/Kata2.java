package kata2;

import java.util.HashMap;

public class Kata2 {
    
    public static void main(String[] args) {
        int[] data = {1,1,1,100,2,4,5,6,8,8,4,5,6,2,-4};
        HashMap<Integer, Integer> histogram  = new HashMap<>();
        
        for (int key : data) {
            if (histogram.containsKey(key)) {
                histogram.put(key, histogram.get(key)+1);
            } else {
                histogram.put(key, 1);
            }
        }
        
        for (int key : histogram.keySet()) {
            System.out.println(key + "-->" + histogram.get(key));
        }
    }
}