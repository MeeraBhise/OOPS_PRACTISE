package CollectionFrameworkPractise.FailFastAndFailSafeIterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
public class FailSafeIterator {
    public static void main(String[] args) {
     List<String> l1= new ArrayList<>();
     l1.add("meera");
     l1.add("mehar");
     l1.add("bhosale");



        Iterator <String > iterator= l1.listIterator();
        while(iterator.hasNext())
        {
            String temp = iterator.next();
            System.out.println(temp);
            iterator.remove();
        }
    }

}*/


public class FailSafeIterator{
    public static void main(String[] args) {
        List<String> l=new ArrayList<>();
        l.add("java121");
        l.add("java312");
        System.out.println(l);
        Iterator<String> iterator=l.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
            iterator.remove();
            System.out.println(l);
         //   l.add("mehhharrr");
        }
    }
}
