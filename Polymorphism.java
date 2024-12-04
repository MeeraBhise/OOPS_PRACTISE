package StramApisExamples;

public class Polymorphism {
  void run()
  {
      System.out.println("run01");
  }
  void run(String a)
  {
      System.out.println("run1");
  }
    public static void main(String[] args) {
        Polymorphism s=new Polymorphism();
        s.run();
        s.run("meera");

    }
}
