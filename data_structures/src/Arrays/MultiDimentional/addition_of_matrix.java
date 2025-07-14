package Arrays.MultiDimentional;

import java.util.Scanner;

public class addition_of_matrix {
    static void printArray(int [][] arr){
        System.out.println("The array is : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void add(int [][]arr1,int [][] arr2,int r1,int r2,int c1,int c2){
        if(r1 == r2 && c1 == c2){
            int arr3 [][] = new int[r1][c1];
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr1[i].length; j++) {

                    arr3[i][j] = arr1[i][j] + arr2[i][j];
                }
            }
            System.out.println("The addition of array is : ");
            printArray(arr3);
        }
        System.out.println("Not going to add !");
        return;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row 1: ");
        int r1 = sc.nextInt();
        System.out.println("enter the col 1: ");
        int c1 = sc.nextInt();
        System.out.println("enter the row 2: ");
        int r2 = sc.nextInt();
        System.out.println("enter the col 2: ");
        int c2 = sc.nextInt();

        int [][] arr1 = new int[r1][c1];
        int [][] arr2 = new int[r2][c2];
        System.out.println("Enter the elements to print for arr1 : ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements to print for arr2 : ");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        printArray(arr1);
        printArray(arr2);
        add(arr1,arr2,r1,r2,c1,c2);


    }
}
