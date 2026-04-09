import java.util.Arrays;
import java.util.Vector;

public class vectors {
    public static void main(String[] args){
        //arrays
        int[] arr = {10, 20, 30, 40};
        System.err.println("Array Lenght: "+arr.length);
        Arrays.sort(arr);
        System.out.println("Sorted Array: "+ Arrays.toString(arr));
        System.err.println("ELements: ");
        for(int x : arr){System.out.print(x+" ");}

        //vector
        Vector<String>v = new Vector<>();
        v.add("Apple");
        v.add("Banana");
        v.add("Mango");
        System.out.println("Vector ELements: " + v);
        System.out.println("Vector size: "+v.size());
        System.out.println("Element ar 1: "+v.get(1));
        v.remove("Banana");
        v.add(1,"Guava");
        System.out.println("first element: " + v.firstElement());
        System.out.println("final vector: "+ v);
        v.clear();
        System.out.println("vector cleared: vector = "+ v);
        v.set(1, "Strawberry");

        //String
        String str = "Java Programming";
        System.out.println("String length: " + str.length());
        System.out.println("Upper Case: "+ str.toUpperCase());
        System.out.println("Character at 2: "+str.charAt(2));
        System.out.println("Substring: "+ str.substring(0,4));
    }
}
