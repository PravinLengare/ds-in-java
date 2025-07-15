package Arrays.MultiDimentional;

import java.util.Scanner;

public class generate_spiral_matrix {
    static void printMatrix(int [][] arr){
        System.out.println("The Matrix is : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }
    static int [][] generateSpiral(int n){
        int matrix [][] = new int[n][n];
        int topRow = 0,bottomRow = n - 1,leftCol = 0,rightCol = n - 1;
        int curr = 1;
        while(curr <= n * n){

            for (int j = leftCol;  j <= rightCol &&  curr <= n * n; j++) {
                 matrix[topRow][j] = curr++;
            }

            topRow++;
            for (int i = topRow; i <= bottomRow  && curr <= n * n ; i++) {
                matrix[i][rightCol] = curr++;

            }

            rightCol--;
            for (int j = rightCol; j >= leftCol && curr <= n * n; j--) {
                matrix[bottomRow][j] = curr++;

            }

            bottomRow--;

            for (int i = bottomRow; i >= topRow && curr <= n * n; i--) {
                 matrix[i][leftCol] = curr++;

            }
            leftCol++;
        }
        return matrix;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row 1: ");
        int n = sc.nextInt();
        int [][] matrix = generateSpiral(n);
        printMatrix(matrix);
    }

}
