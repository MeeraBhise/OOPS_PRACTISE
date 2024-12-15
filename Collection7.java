package CollectionFrameworkPractise.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection7 {
    public static void main(String[] args) {
     List<String> s=new ArrayList<>();
     s.add("java12");
     s.add("jdcjf");
     s.add("xncnc");
     s.add("cnxw");
     s.add("ieugf");
        System.out.println("arrays before rotating:"+s.toString());
        for (int i = 0; i < 4; i++) {
            int temp = Integer.parseInt(s.get(1));
            for (int j = 0; j < 6; j++) {
                s.set(j, s.get(j + 1));
            }
            s.set(6, String.valueOf(temp));
             }
            }
        }


