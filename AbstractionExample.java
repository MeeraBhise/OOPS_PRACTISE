package StramApisExamples;

public abstract  class AbstractionExample {
    abstract void run();
   abstract   void display();

   public static  void m1(){
       System.out.println("method1");
   }
}


class test extends AbstractionExample{
    public static void main(String[] args) {
        test t=new test();
        AbstractionExample.m1();
        t.run();
        t.display();
    }

    @Override
    void run() {
        System.out.println("run method");
    }

    @Override
    void display() {
        System.out.println("display method");
    }
}
