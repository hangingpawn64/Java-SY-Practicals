    public class Main {
    public static void main(String[] args){
        StackArray s = new StackArray(5);
        
        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Top element: " + s.peek());

        System.out.println("Popped: " + s.pop());
        System.out.println("Popped: " + s.pop());

        System.out.println("Is Stack empty? " + s.isEmpty());
    }
}