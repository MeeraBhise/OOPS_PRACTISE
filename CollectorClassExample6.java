package CollectionFrameworkPractise.CollectorClass;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


//The Collectors.averagingInt() method calculates the average of the elements in the stream.
public class CollectorClassExample6 {
    public static void main(String[] args) {
        List<Integer> num= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        double average=num.stream().collect(Collectors.averagingInt(Integer::intValue));
        System.out.println(average);
    }
}
