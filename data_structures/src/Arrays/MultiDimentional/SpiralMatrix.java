package Arrays.MultiDimentional;

import java.util.Scanner;

public class SpiralMatrix {
    static void printMatrix(int [][] arr){
        System.out.println("The Matrix is : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }
    static void spiralMatrix(int matrix[][],int r,int c){

        int topRow = 0,bottomRow = r - 1,leftCol = 0,rightCol = c - 1;
        int totalElement = 0;
        while(totalElement < r * c){

            for (int j = leftCol;  j <= rightCol && totalElement < r * c; j++) {
                System.out.print(matrix[topRow][j]+" ");
                totalElement++;
            }

            topRow++;
            for (int i = topRow; i <= bottomRow  && totalElement < r * c ; i++) {
                System.out.print(matrix[i][rightCol]+" ");
                totalElement++;
            }

            rightCol--;
            for (int j = rightCol; j >= leftCol && totalElement < r * c; j--) {
                System.out.print(matrix[bottomRow][j]+" ");
                totalElement++;
            }

            bottomRow--;

            for (int i = bottomRow; i >= topRow && totalElement < r * c; i--) {
                System.out.print(matrix[i][leftCol]+" ");
                totalElement++;
            }
            leftCol++;
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
        System.out.println("The spiral matrix is : -");
        spiralMatrix(matrix,r,c);



    }
}
