package Arrays;

import java.util.Scanner;

public class even_and_odd_arrange {
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
    static void sortEvenOdd(int arr[]){
        int n = arr.length;
        int left = 0;
        int right = n - 1;

        while(left < right){
            if(arr[left] % 2 != 0  && arr[right] % 2 == 0 ){
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left] % 2 == 0){
                left++;
            }
            if(arr[right] % 2 == 1){
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
        System.out.println("Array after Parity sorting : ");
        sortEvenOdd(arr);

    }
}
