package Arrays.MultiDimentional;

import java.util.Scanner;

public class two_array {
    static void printArray(int [][] arr){
        System.out.println("The array is : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    // If we don't initialize the array in java then by default it will be 0.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row : ");
        int r = sc.nextInt();
        System.out.println("enter the col : ");
        int c = sc.nextInt();

        int [][] arr = new int[r][c];
        System.out.println("Enter the elements to print : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        printArray(arr);

    }
}
