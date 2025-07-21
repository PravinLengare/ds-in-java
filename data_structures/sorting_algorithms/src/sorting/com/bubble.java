package sorting.com;

import java.util.Scanner;

public class bubble {
    static void printArray(int arr[]){
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i] + " ");
        }
    }
    static void bubbleSort(int arr[]){
        for (int i = arr.length - 1; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if(arr[j] > arr[j+1]){
                   int t = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = t;
                }
            }
        }
    }
    public  static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr);
        printArray(arr);
    }
}
