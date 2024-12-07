package Stringclasspractise;

/*
public class StringOccurrence {
    public static void main(String args[])
    {
      String s1="javajavajava";
      int count=0;
      for(int i=0;i<s1.length();i++){
         if(s1.charAt(i)=='a'){
             count++;
         }

      }

    }
}
*/
public class  Stringoccurence{
      public static void main(String args[]) {
          int count = 0;
          String s1 = "mehar";
          for (int i = 0; i < s1.length(); i++) {
              if (s1.charAt(i) == 'h'){
                  count++;
              }
          }
          System.out.println("count of h is:" + count);
      }
}
