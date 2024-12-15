package CollectionFrameworkPractise.Collections;

import java.util.LinkedList;
import java.util.List;

public class Collections3 {
    public static void main(String[] args) {
        List<String> s=new LinkedList<>();
        s.add("java");
        s.add("python");
        s.add("c++");
        s.add("c");
        int a =s.size();
        System.out.println(a);
        System.out.println(s);
    }
}
