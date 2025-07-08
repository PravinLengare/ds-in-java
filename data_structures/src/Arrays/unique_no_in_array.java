package Arrays;

import java.util.Scanner;

public class unique_no_in_array {
    static void printArray(int arr[]){
        System.out.println("The array is : ");
        for(int i = 0; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int unique_number(int arr[],int n){
        n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int ans = -1;
        for (int i = 0; i < n; i++) {
            if(arr[i] > 0){
                ans = arr[i];
            }
        }
        return ans;
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
        System.out.println("The unique number is : "+unique_number(arr,n));
    }
}
