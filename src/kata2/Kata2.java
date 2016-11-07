package kata2;

public class Kata2 {
    
    public static void main(String[] args) {
        Integer[] data = {1,1,1,100,2,4,5,6,8,8,4,5,6,2,-4};
        
        Histogram<Integer> histogram = CalculateHistogram.computeHistogram(data);
        
        for (Integer key : histogram.keySet()){
            System.out.println(key + "-->" + histogram.get(key));
        }
    }
}
