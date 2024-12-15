package CollectionFrameworkPractise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    int id;
    String name;
    String address;

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

    public ComparatorExample(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "ComparatorExample{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
class AddressComparatorExample implements Comparator<ComparatorExample> {
  @Override
    public int compare(ComparatorExample o1, ComparatorExample o2) {
        return o1.getAddress().compareTo(o2.getAddress());
    }
}
class Namecomparator implements Comparator<ComparatorExample>{


    @Override
    public int compare(ComparatorExample o1, ComparatorExample o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
class Idcomparator implements Comparator<ComparatorExample>{


    @Override
    public int compare(ComparatorExample o1, ComparatorExample o2) {
        return o1.getId()- o2.getId();
    }
}
class Comparator123{
    public static void main(String[] args) {
        ComparatorExample e1=new ComparatorExample(1,"meera","latur");
        ComparatorExample e2=new ComparatorExample(2,"raani","ranjani");
        ComparatorExample e3=new ComparatorExample(4,"pooja","moha");
        ComparatorExample e4=new ComparatorExample(3,"ashu","takli");

        List<ComparatorExample> list=new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        System.out.println(list);
        AddressComparatorExample Addresscomparatorexample=new AddressComparatorExample();
        Collections.sort(list,Addresscomparatorexample);
        System.out.println(list);
        Namecomparator s1=new Namecomparator();
        Collections.sort(list,s1);
        System.out.println(list);
        Idcomparator s2=new Idcomparator();
        Collections.sort(list,s2);
        System.out.println(list);
    }
}
