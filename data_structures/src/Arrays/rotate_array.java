package Arrays;

import java.util.Scanner;

public class rotate_array {
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
    static int[] rotate(int arr[],int k){
        int n = arr.length;
        int ans[] = new int[n];
        int j = 0;
        k = k % n;

        for (int i = n - k; i < n; i++) {
            ans[j++] = arr[i];
        }
        for (int i = 0; i < n -k; i++) {
            ans[j++] = arr[i];
        }
        return ans;
    }
    static void reverseArrayInplace(int arr[],int i,int j){
        int n = arr.length;
        i = 0;
        j = n - 1;

        while(i < j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    static void rotateInPlace(int arr[],int k){
            int n = arr.length;
            k = k % n;
            reverseArrayInplace(arr,0 ,n-k-1);
            reverseArrayInplace(arr,n-k,n-1);
            reverseArrayInplace(arr,0,n-1);

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
        System.out.println("Enter k : ");
        int k = sc.nextInt();
        printArray(arr);
//        int ans [] = rotate(arr,k);
//        System.out.println("Array after rotation is : ");
//        printArray(ans);
        rotateInPlace(arr,k);
        printArray(arr);
    }
}
