package Arrays.MultiDimentional;

import java.util.Scanner;

public class Transpose_Of_Matrix {
    static void printMatrix(int [][] arr){
        System.out.println("The Matrix is : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }
    static int [][] findTranspose(int matrix[][],int r,int c){
            int ans[][] = new int[c][r];

        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;

    }
    static void findTransposeInPlace(int matrix[][],int r,int c){

        for (int i = 0; i < c; i++) {
            for (int j = i; j < r; j++) {

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;

            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row 1: ");
        int r = sc.nextInt();
        System.out.println("enter the col 1: ");
        int c = sc.nextInt();

        int [][] matrix = new int[r][c];

        System.out.println("Enter the elements to print for arr1 : ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }


        printMatrix(matrix);
        System.out.println("Transpose Of Matrix :- ");
//        int ans[][] = findTranspose(matrix,r,c);
//        printMatrix(ans);

        findTransposeInPlace(matrix,r,c);
        printMatrix(matrix);
    }

}
