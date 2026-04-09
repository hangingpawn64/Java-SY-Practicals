// public class twoDimArray {
//     public static void main(String[] args) {
//         int[][] Matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
//         for(int i = 0; i<Matrix.length; i++){
//             for(int j = 0; j< Matrix[i].length; j++){
//                 System.out.print(Matrix[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

import java.util.Scanner;

public class twoDimArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[9];
        System.out.println("Enter 9 elements of Matrix 1");
        for (int i = 0; i < 9; i++) {
            arr1[i] = sc.nextInt();
        }

        int[] arr2 = new int[9];
        System.out.println("Enter 9 elements of Matrix 2");
        for (int i = 0; i < 9; i++) {
            arr2[i] = sc.nextInt();
        }
        sc.close();

        int[][] Matrix1 = new int[3][3];
        int index1 = 0;
        for (int j = 0; j < 3; j++) {
            for (int k = 0; k < 3; k++) {
                Matrix1[j][k] = arr1[index1];
                index1++;
            }
        }

        int[][] Matrix2 = new int[3][3];
        int index2 = 0;
        for (int j = 0; j < 3; j++) {
            for (int k = 0; k < 3; k++) {
                Matrix2[j][k] = arr2[index2];
                index2++;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(Matrix1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(Matrix2[i][j] + " ");
            }
            System.out.println();
        }
    }
}