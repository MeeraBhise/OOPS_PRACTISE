package CollectionFrameworkPractise.CollectorClass;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


//You can use Collectors.joining() to concatenate the elements of a stream into a single String.
public class CollectorClassExample4 {
    public static void main(String[] args) {
        List<String>city= Arrays.asList("mumbai","pune","latur","dhaarashiv","udgir");
        String joinedcity=city.stream().collect(Collectors.joining(" : "));
        System.out.println(joinedcity);
    }
}
