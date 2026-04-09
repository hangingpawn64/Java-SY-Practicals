public class Operators {
    public static void main(String[] args){
        int a = 10, b = 5;
        // Arithmatic Operators
        System.out.println("Addition " + (a+b));
        System.out.println("Substraction " + (a-b));
        System.out.println("Multiplication " + (a*b));
        System.out.println("Division " + (a/b));

        // Relational and logical Operators
        if(a>b && b != 0){
            System.out.println("a is greater than b & b is not zero");
        }

        // Assignment Operators
        int x = 10;
        x += 5;
        x -= 3;
        x *= 3;
        x /= 3;
        x %= 3;
        x &= 3;
        x |= 3;
        x ^= 3;
        x >>=3;
        x <<=3;
        System.err.println("After all assignment operators x = " + x);

        // Bitwise Operators
        int p = 5, q = 3;

        System.out.println("AND  : " + (p & q));
        System.out.println("OR   : " + (p | q));
        System.out.println("XOR  : " + (p ^ q));
        System.out.println("NOT  : " + (~p));
        System.out.println("LEFT : " + (p << 1));
        System.out.println("RIGHT: " + (p >> 1));
        System.out.println("URIGHT: " + (p >>> 1));
    }
}
