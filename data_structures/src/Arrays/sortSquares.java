package Arrays;

import java.util.Scanner;

public class sortSquares {
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
    static void reverseArrayInplace(int ans[]){
        int n = ans.length;
        int left = 0;
        int right = n - 1;

        while(left < right){
            swap(ans,left,right);
            left++;
            right--;
        }
    }
    static int [] sort_Squares(int arr[]){
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        int []ans = new int[n];
        int k = n - 1;
        while (left <= right){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k--] = arr[left] * arr[left];
                left++;
            }
            else {
                ans[k--] = arr[right] * arr[right];
                right--;
            }
        }
//        reverseArrayInplace(ans); if we don't want use reverse function then do ans[k--]
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
        int ans[] = sort_Squares(arr);
        System.out.println("sorted array : ");
        printArray(ans);

    }
}
