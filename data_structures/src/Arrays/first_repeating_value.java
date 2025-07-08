package Arrays;

import java.util.Scanner;

public class first_repeating_value {
    static void printArray(int arr[]){
        System.out.println("The array is : ");
        for(int i = 0; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int repeat_value(int arr[],int n){
        n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]){
                   return arr[i];                  // after return statement we directly out of method with carry return value
                }                                  // As soon as the return statement is reached, the method stops running immediately.

            }
        }
        return -1;
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
        System.out.println("The repeating first value is : "+repeat_value(arr,n));
    }
}
