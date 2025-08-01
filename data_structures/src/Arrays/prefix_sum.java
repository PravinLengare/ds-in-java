package Arrays;

import java.util.Scanner;

public class prefix_sum {
    static void printArray(int []arr){
        System.out.println("The array is : ");
        for(int i = 0; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
//    static int [] prefixSumArray(int arr[]) {
//        int n = arr.length;
//        int pref[] = new int[n];
//        pref[0] = arr[0];
//
//        for (int i = 1; i < n; i++) {
//            pref[i] = pref[i -1 ] + arr[i];
//        }
//        return pref;
//    }
    static int [] prefSumInPlace(int arr[]){
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to print the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the element of array : ");
        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        printArray(arr);
        int pref[] = prefSumInPlace(arr);
        System.out.println("The prefix sum is : ");
        printArray(pref);
    }
}
