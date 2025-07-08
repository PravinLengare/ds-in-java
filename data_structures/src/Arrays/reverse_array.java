package Arrays;

import java.util.Scanner;

public class reverse_array {
    static void printArray(int arr[]){
        System.out.println("The array is : ");
        for(int i = 0; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void swap(int arr[],int i ,int j){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
    static int[] reverse(int arr[]){
        int n = arr.length;
        int ans[] = new int[n];
        int j = 0;
        System.out.println("The reverse array is : ");
        for (int i = n - 1; i >= 0 ; i--) {
             ans[j++] = arr[i];
        }
        return ans;
    }
    static void reverseArrayInplace(int arr[]){
        int n = arr.length;
        int i = 0;
        int j = n - 1;

        while(i < j){
            swap(arr,i,j);
            i++;
            j--;
        }
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
        int ans[] = reverse(arr);
        printArray(ans);
        reverseArrayInplace(arr);

    }
}
