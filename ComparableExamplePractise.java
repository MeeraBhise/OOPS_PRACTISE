package CollectionFrameworkPractise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExamplePractise implements Comparable<ComparableExamplePractise> {
    int id;
    String name;
    String address;

    public ComparableExamplePractise() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ComparableExamplePractise(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "ComparableExamplePractise{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
    @Override
    public int compareTo(ComparableExamplePractise o) {
       // return this.getId()-o.getId();
        // return this.getAddress().compareTo(o.getAddress());
        return this.getName().compareTo(o.getName());
    }
}
 class ExampleComparable {
    public static void main(String[] args) {
        ComparableExamplePractise ex1=new  ComparableExamplePractise(102,"meera","pune");
        ComparableExamplePractise  ex2=new  ComparableExamplePractise (201,"mehar","latur");
        ComparableExamplePractise  ex3=new  ComparableExamplePractise (103,"pari","osmanbad");
        ComparableExamplePractise ex4=new  ComparableExamplePractise (101,"ranjeet","udgir");

        List<ComparableExamplePractise> list =new ArrayList<>();
        list.add(ex1);
        list.add(ex2);
        list.add(ex3);
        list.add(ex4);
        System.out.println("before Sorting :"+list);
        Collections.sort(list);
        System.out.println("after sorting:"+list);
    }
}