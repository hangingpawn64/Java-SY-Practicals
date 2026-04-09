// by changing the return type

// class calculate{
//     int multiply(int a, int b){
//         return a*b;
//     }
//     double multiply(double a, double b){
//         return a*b;
//     }
// }

// public class methodOverloading {
//     public static void main(String[] args){
//         calculate obj = new calculate();
//         int c = obj.multiply(5, 4);
//         double d = obj.multiply(5.1, 4.2);
//         System.out.println("multiply method: return interger: " + c);
//         System.out.println("multiply method: return double: " + d);
//     }
// }

// by changing the number of arguments passed

class calculate{
    int multiply(int a, int b, int c){
        return a*b*c;
    }
    int multiply(int a, int b){
        return a*b;
    }
}

public class methodOverloading {
    public static void main(String[] args){
        calculate obj = new calculate();
        int d = obj.multiply(3, 4, 5);
        int e = obj.multiply(6, 7);
        System.out.println(d);
        System.out.println(e);
    }
}