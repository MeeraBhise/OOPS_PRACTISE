package CollectionFrameworkPractise.FailFastAndFailSafeIterators;

import java.util.ArrayList;
import java.util.List;

public class FailFastIterator {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("java1");
        list.add("java2");
        list.add("java3");
        list.add("java4");
        list.add("java5");

        for(String s:list)
        {
            list.add("java9");
            System.out.println(s);
        }
    }
}
