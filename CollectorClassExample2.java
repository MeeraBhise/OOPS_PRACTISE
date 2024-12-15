package CollectionFrameworkPractise.CollectorClass;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//The Collectors.toSet() method collects the stream elements into a Set, removing duplicate entries.

public class CollectorClassExample2 {
    public static void main(String[] args) {
        List<String> cities= Arrays.asList("latur","pune","latur","pune","nanded");
        Set<String> city= cities.stream().collect(Collectors.toSet());
        System.out.println(city);
    }
}
