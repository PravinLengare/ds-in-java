package Arrays.MultiDimentional;

import java.util.Scanner;

public class reverse_array {
    static void printArray(int [][] arr){
        System.out.println("The array is : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void swap(int arr[],int i ,int j){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
    static int [][] reverseInPlace(int arr[][],int r1,int c1){
        int ans[][] = new int[r1][c1];
        int k = r1;
        int n = c1;
        for (int i = arr.length - 1; i >= 0; i++) {
            for (int j = arr[i].length - 1; j >= 0; j++) {
                ans[k--][n--] = arr[i][j];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row 1: ");
        int r1 = sc.nextInt();
        System.out.println("enter the col 1: ");
        int c1 = sc.nextInt();

        int [][] mt1 = new int[r1][c1];

        System.out.println("Enter the elements to print for arr1 : ");
        for (int i = 0; i < mt1.length; i++) {
            for (int j = 0; j < mt1[i].length; j++) {
                mt1[i][j] = sc.nextInt();
            }
        }


        printArray(mt1);

    }
}
