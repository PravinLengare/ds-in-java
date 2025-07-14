package Arrays.MultiDimentional;

import java.util.Scanner;

public class rotate_an_matrix {
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
    static void reverseArrayInplace(int arr[]){
        int n = arr.length;
        int i = 0;
        int j = n - 1;

        while(i < j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    static void swap(int arr[],int i ,int j){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    static void rotateMatrix(int [][]matrix,int n){
        findTransposeInPlace(matrix,n,n);

        for (int i = 0; i < n; i++) {
            reverseArrayInplace(matrix[i]);
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
            rotateMatrix(matrix,r);
            System.out.println("The rotated matrix is :-");
            printMatrix(matrix);

    }
}
