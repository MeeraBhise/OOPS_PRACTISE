package CollectionFrameworkPractise.Collections;

import java.util.ArrayList;

public class Collections6 {
    public static void main(String[] args) {
        try {
            ArrayList<String> s = new ArrayList<>();
            s.add("yuyug");
            s.add("gv");
            s.add("gyugu");
            System.out.println(s);
            s.set(0, "dec");
            System.out.println(s);
            System.out.println("111");
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}