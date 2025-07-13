package Arrays;

import java.util.Scanner;

public class equal_partition {
    static void printArray(int []arr){
        System.out.println("The array is : ");
        for(int i = 1; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int [] prefSumInPlace(int arr[]){
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
        return arr;
    }
    static int find_sum(int arr[]){
        int totalsum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalsum+= arr[i];
        }
        return totalsum;
    }
    static boolean equal_partition_method(int arr[]){
        int totalSum = find_sum(arr);
        int prefixSum = 0;

        for (int i = 0; i < arr.length; i++) {
            prefixSum+=arr[i];
            int suffixSum = totalSum - prefixSum;
            if(suffixSum == prefixSum)
                return true;
        }
        return false;
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
        System.out.println("Equal Partition Possible : "+equal_partition_method(arr));
    }
}
