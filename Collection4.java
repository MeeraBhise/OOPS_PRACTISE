package CollectionFrameworkPractise.Collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Collection4 {
    public static void main(String[] args) {
        Set<Integer>s=new HashSet<>();
        s.add(28);
        s.add(15);
        s.add(22);
        s.add(52);
        s.add(27);
        s.add(45);
        s.add(32);
        s.add(75);

        //System.out.println(s);
        try{
            s= Collections.unmodifiableSet(s);
            s.remove(4);
        }
        catch(Exception e){
            System.out.println("exception is :"+e);
        }
        finally{
            s.contains(8);
            System.out.println("file is read only");
            System.out.println("meera1");
        }
    }
}
