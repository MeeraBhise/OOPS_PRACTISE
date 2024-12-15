package CollectionFrameworkPractise.CollectorClass;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//We use Collectors.toList() to collect the stream elements into a List.
public class CollectorClassExample1 {
    public static void main(String[] args) {
        List<String>cities= Arrays.asList("latur","pune","udgir","nanded","parbhani");
        System.out.println(cities);

        List<String>cityList=cities.stream().collect(Collectors.toList());
       System.out.println(cityList);
    }
}
