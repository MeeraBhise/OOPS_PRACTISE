package CollectionFrameworkPractise.CollectorClass;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//The Collectors.toMap() method creates a Map where the city names are the keys and their lengths are the values.
public class CollectorClassExample3 {
    public static void main(String[] args) {
        List<String>cities= Arrays.asList("java","python","c++","c#","c");
        Map<String,Integer>citymap=cities.stream().collect(Collectors.toMap(list1->list1,list1->list1.length()));
        System.out.println(citymap);
    }
}
