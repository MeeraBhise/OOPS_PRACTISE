package Exceptionhandling;

/*
public class YoungerAgeException extends RuntimeException{

    YoungerAgeException()
    {
        super("your age is not applicable");
    }
}
 class Test{
     public static void main(String[] args) throws YoungerAgeException {
       int age=20;
       if(age<18)
       {
           throw new YoungerAgeException();
       }
         else{
           System.out.println("age is applicable");
       }
         System.out.println("invalid age");
     }
 }*/
/*
class YoungerAgeException  extends RuntimeException{
    public YoungerAgeException()
    {
        super("your age is not applicable");
    }
}
class test1{
    public static void main(String[] args)  throws YoungerAgeException{
            int age=19;
            if(age<18)
            {
                throw new YoungerAgeException();
            }
        else {
                System.out.println("you are applicable");
            }
        //System.out.println("invalid age");
    }
}*/
class YoungerAgeException extends RuntimeException{
    public YoungerAgeException()
    {
        super("your age is not aaplicable");
    }
}
class test1 {
    public static void main(String[] args) {
        int age=101;
        if(age<18)
        {
            throw new YoungerAgeException();
        }
        else{
            System.out.println("you are applicable");
        }
    }
}