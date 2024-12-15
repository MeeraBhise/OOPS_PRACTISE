package CollectionFrameworkPractise.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collections1 {
    public static void main(String[] args) {

        //compare elements in collection
        List<Integer> l = new ArrayList<>();
        l.add(2);
        l.add(5);
        l.add(39);
        l.add(90);
        l.add(2);
        //
        int minimum= Collections.min(l);
        //
       int maximum=Collections.max(l);
        if(minimum==maximum)
        {
            System.out.println("the values are equels");
        }
     else{
            System.out.println("values are mimumum:"+minimum);
            System.out.println("values are maximum:"+maximum);
        }
    }
}*/
/*
public class Collections1
{
    public static void main(String[] args) {
        List<Integer> l=new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        int max= Collections.max(l);
        int min=Collections.min(l);
        if(max==min)
        {
            System.out.println("both values are equal");
        }
        else {
            System.out.println("maximum:"+max);
            System.out.println("minimum:"+min);
        }
    }
}
*/

public class Collections1 {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(10);
        l1.add(20);
        l1.add(20);
        l1.add(39);
        System.out.println(l1);
        int maxi = Collections.max(l1);
        int mini = Collections.min(l1);

        if (mini == maxi) {
            System.out.println("values are qual");
        } else {

            System.out.println(maxi);
            System.out.println(mini);
        }
    }
}


