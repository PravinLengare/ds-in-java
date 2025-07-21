package sorting.com;

import java.util.Scanner;

public class insertion_sort {
    static void printArray(int arr[]){
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static void insertionSort(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;

            while(j >= 0 && temp < arr[j]){
                arr[j+1] = arr[j];
                arr[j] = temp;
                j--;
             }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        insertionSort(arr);
        System.out.println("The sorted array is : ");
        printArray(arr);
    }
}
