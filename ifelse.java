import java.util.Scanner;

public class ifelse {
    public static void main(String[] args){

        // SIMPLE IF-ELSE

            // int i=3;
            // if( i > 5){
            //     System.out.println(i + " is  > 5");
            // }
            // else{
            //     System.out.println(i + " is < 5");
            // }

        // IF-ELSE LADDER

            // int i = 5;
            // if(i > 5){
            //     System.out.println(i + " is > 5");
            // }
            // else if(i < 5){
            //     System.out.println(i + " is < 5");
            // }
            // else{
            //     System.out.println(i + " = 5");
            // }

        // NESTED IF-ELSE

            // int i = 5;
            // if(i > 5){
            //     System.out.println(i + " is > 5");
            //     if(i % 2 == 0){
            //         System.out.println((i + " is even"));
            //     }
            //     else{
            //         System.out.println((i + " is odd"));
            //     }
            // }
            // else if(i < 5){
            //     System.out.println(i + " is < 5");
            //     if(i % 2 == 0){
            //         System.out.println((i + " is even"));
            //     }
            //     else{
            //         System.out.println((i + " is odd"));
            //     }
            // }
            // else{
            //     System.out.println(i + " = 5");
            //     if(i % 2 == 0){
            //         System.out.println((i + " is even"));
            //     }
            //     else{
            //         System.out.println((i + " is odd"));
            //     }
            // }

            // TAKING USER INPUT

            // Scanner num = new Scanner(System.in);
            // int i;
            // System.out.println("Enter your number: ");
            // i = num.nextInt();

            // if(i > 5){
            //     System.out.println(i + " is > 5");
            //     if(i % 2 == 0){
            //         System.out.println((i + " is even"));
            //     }
            //     else{
            //         System.out.println((i + " is odd"));
            //     }
            // }
            // else if(i < 5){
            //     System.out.println(i + " is < 5");
            //     if(i % 2 == 0){
            //         System.out.println((i + " is even"));
            //     }
            //     else{
            //         System.out.println((i + " is odd"));
            //     }
            // }
            // else{
            //     System.out.println(i + " = 5");
            //     if(i % 2 == 0){
            //         System.out.println((i + " is even"));
            //     }
            //     else{
            //         System.out.println((i + " is odd"));
            //     }
            // }

            // USING TERNARY OPERATOR

            // System.out.println( ((i > 5) ? i + " is > 5 " : i + " is < 5") + " done by ternary op");
            // num.close();

            // SWITCH CASE

            Scanner num = new Scanner(System.in);
            int i;
            System.out.println("Enter your number corresponding to day: ");
            i = num.nextInt();

            switch(i){
                case 1:
                    System.out.println("MONDAY");
                    break;
                case 2:
                    System.out.println("TUESDAY");
                    break;
                case 3:
                    System.out.println("WEDNESDAY");
                    break;
                case 4:
                    System.out.println("THURSDAY");
                    break;       
                case 5:
                    System.out.println("FRIDAY");
                    break;
                case 6:
                    System.out.println("SATURDAY");
                    break;
                case 7:
                    System.out.println("SUNDAY");     
                    break;
                default :
                    System.out.println("Enter valid number between 1 - 7");                                                                    
            }
            num.close();
    }
}