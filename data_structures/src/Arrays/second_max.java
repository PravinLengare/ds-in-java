package Arrays;

import java.util.Scanner;

public class second_max {
    static void printArray(int arr[]){
        System.out.println("The array is : ");
        for(int i = 0; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int max_number(int arr[],int n){
        n = arr.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    static int second_max_number(int arr[],int n) {
        int max = max_number(arr,n);
        for (int i = 0; i < n; i++) {
            if(arr[i] == max){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int second_max = max_number(arr,n);

        return second_max;
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
        System.out.println("The max of array is : "+max_number(arr,n));
        System.out.println("The second largest element is : "+second_max_number(arr,n));
    }
}
