package ArrayclassPractise;

public class ArraysElementsInReverseOrder {
    public static void main(String[] args) {
        int [] arr={10,20,30,40,50,60,70,80,90};
        System.out.println("all elements are:");
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.println(arr[i]+" ");
        }

    }
}

