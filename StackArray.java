public class StackArray {
    int[] stack;
    int top;
    int size;

    //constructor
    StackArray(int size){
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    void push(int value){
        if(top == size - 1){
            System.out.println("Stack Overflow! Cannot push " + value);
            return;
        }
        stack[++top] = value;
        System.out.println(value + " pushed into stack");
    }

    int pop(){
        if(top == -1){
            System.out.println("Stack underflow! Stack is empty");
            return -1;
        }
        return stack[top--];
    }

    int peek(){
        if (top == -1){
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }

    boolean isEmpty(){
        return top == -1;
    }

    boolean isFull(){
        return top == size -1;
    }
}
