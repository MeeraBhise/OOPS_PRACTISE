package Stringclasspractise;

public class SingleCharcount {

        public static void main(String[] args) {
            //String input = "abcdedabddac";
            //print number of times char 'a' is present in input String
            //3
            //
             String input = "abcdedabddac";
            //declare int variable count with initial value as 0
            //use for loop
            //use if condition to check each character
            //inside this if condition increase value of variable count by 1

            //a b c d e d a b d d a  c
            //0 1 2 3 4 5 6 7 8 9 10 11
            //length = 12   first pos = 0 last pos = 11
            int count = 0;
            for(int i = 0; i < input.length();i++){
                //i = 0  a
                //i = 1  b
                if(input.charAt(i) == 'a'){
                    count++;
                }
            }

            System.out.println("Character a is "+count +" times");
            //get count of each character in given input string
            //abcdedabddac
            //a = 3
            //b = 2
            //c = 2
            //d = 4
            //e = 1

            //two integer
            //int a = 100;
            //int b = 200;
            //swap values of variables a and b
            //a = 200;
            //b = 100;
            //first using third variable
            //without third variable
        }
    }
