package Arrays;

import java.util.Scanner;

public class sort_zeros_and_ones {
    static void printArray(int []arr){
        System.out.println("The array is : ");
        for(int i = 0; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void swap(int arr[],int left ,int right){

        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

    }
    static void sort(int arr[]){
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] == 0){
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            arr[i] = 0;
        }
        for (int i = count; i < n; i++) {
            arr[i] = 1;
        }
    }
    static void sortInplace(int arr[]){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        while(left < right){
            if(arr[left] == 1 && arr[right] == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }
            if(arr[left] == 0){
                left++;
            }
            if (arr[right] == 1){
                right--;
            }

        }
        printArray(arr);
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
        System.out.println("Array after sorting : ");
//        sort(arr);
//        printArray(arr);
        sortInplace(arr);

    }
}
