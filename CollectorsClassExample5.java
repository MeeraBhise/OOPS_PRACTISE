package CollectionFrameworkPractise.CollectorClass;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//The Collectors.summingInt() method is used to sum the integer values in the stream.

public class CollectorsClassExample5 {
    public static void main(String[] args) {
        List<Integer> number= Arrays.asList(1,2,3,4,5,6);
        int sum=number.stream().collect(Collectors.summingInt(Integer::intValue));
        System.out.println( "sum is:"+  sum);
    }
}
