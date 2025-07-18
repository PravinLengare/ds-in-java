package Arrays.MultiDimentional;

import java.util.Scanner;

public class PrefixSum_Of_Coordinate {
    static void printMatrix(int [][] arr){
        System.out.println("The Matrix is : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }
    static int findSum(int matrix[][],int l1,int r1,int l2,int r2){
        int sum = 0;
        for (int i = l1; i <= l2; i++) {
            for (int j = r1; j <= r2; j++){
                sum += matrix[i][j];
            }
        }
        return sum;
    }
    static void findPrefixSum(int matrix[][]){
        int r = matrix.length;
        int c = matrix[0].length;

        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                matrix[i][j]+= matrix[i][j - 1];
            }
        }
        for (int j = 0; j < c; j++) {
            for (int i = 1; i < r; i++) {
                matrix[i][j]+= matrix[i - 1][j];
            }
        }

    }
    static int findSum2(int matrix[][],int l1,int r1,int l2,int r2){
        int sum = 0;
        findPrefixSum(matrix);

        for (int i = l1; i <= l2; i++) {
            if (r1 >= 1)
                 sum+= matrix[i][r2] + matrix[i][r1 - 1];
            else
                sum+= matrix[i][r2];
        }

        return sum;
    }
    static int findSum3(int matrix[][],int l1,int r1,int l2,int r2){
        int ans = 0;
        int sum = 0,up = 0,left = 0,leftUp = 0;
        findPrefixSum(matrix);

        sum = matrix[l2][r2];
        if(r1 >= 1)
            left = matrix[l2][r1 -1];
        if(l1 >= 1)
            up = matrix[l1 - 1][r2];
        if(r1 >= 1 && l1 >= 1)
            leftUp = matrix[l1 -1][r1 - 1];

        ans = sum - up - left + leftUp;

        return sum;
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
        System.out.println("enter the boundaries of rectangle : ");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();


        System.out.println("The sum is : "+findSum(matrix,l1,r1,l2,r2));
        //System.out.println("The sum is : "+findSum2(matrix,l1,r1,l2,r2));
        System.out.println("The sum is : "+findSum3(matrix,l1,r1,l2,r2));
    }

}
