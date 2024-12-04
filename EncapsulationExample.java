package StramApisExamples;

public class EncapsulationExample {
    private int id;
    private String name;

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

    public static void main(String[] args) {

        EncapsulationExample t=new EncapsulationExample();
        t.setId(01);
        t.setName("merra");
        System.out.println(t.getId());
        System.out.println(t.getName());
    }
}
