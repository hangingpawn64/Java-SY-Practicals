public class finally_java {
    public static void main(String[] args) {
        int[] numbers = {10,20,30};
        try{
            System.out.println("Array Index Out Of Bound Exception");
            System.out.println(numbers[5]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception caught ");
        }
        finally{
            System.out.println("This block always executes");
        }
        System.out.println("Program Continues");
    }
}

