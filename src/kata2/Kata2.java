package kata2;

import java.util.HashMap;

public class Kata2 {
    
    public static void main(String[] args) {
        int[] data = {1,1,1,100,2,4,5,6,8,8,4,5,6,2,-4};
        
        Histogram histo=new Histogram(data);
        HashMap<Integer,Integer> histogram = histo.getHistogram();
        
        for (int key : histogram.keySet()) {
            System.out.println(key + "-->" + histogram.get(key));
        }
    }
}
