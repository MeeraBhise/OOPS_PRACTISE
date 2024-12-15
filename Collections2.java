package CollectionFrameworkPractise.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collections2 {
    public static void main(String[] args) {
       /* List<Integer> l=new ArrayList<>();
        l.add(20);
        l.add(10);
        l.add(30);
        l.add(20);
        l.add(50);
        l.remove(0);
        System.out.println(l);*/
    List<String>s=new ArrayList<>();
    s.add("mehar");
    s.add("java");
    s.add("meha");
    s.add("jav");
    s.add("ranjit");
    s.add("apple");
    s.add("mdnvu");
    s.add("jdccb");
//    s.remove("mehar");
   s.remove(new Integer(2));
  //  s.remove(0);
        System.out.println(s);
    }
}
