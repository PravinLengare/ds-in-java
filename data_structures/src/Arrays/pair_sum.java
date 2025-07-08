package Arrays;

import java.util.Scanner;

public class pair_sum {
    static void printArray(int arr[]){
        System.out.println("The array is : ");
        for(int i = 0; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int pairSum(int arr[],int target){
        int n = arr.length;
        int ans = 0;
        for (int i = 0; i < n ; i++) {
            for (int j = i + 1; j < n ; j++) {
                if(arr[i] + arr[j] == target){
                    ans++;
                }
            }
        }
        return ans;
    }
    static int triplet(int arr[],int target){
        int n = arr.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if(arr[i] + arr[j] + arr[k] == target){
                        ans++;
                    }
                }
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
        System.out.println("Enter target to find pair count : ");
        int target = sc.nextInt();
        printArray(arr);
        System.out.println("The count of pair is : "+pairSum(arr,target));
        System.out.println("The count of pair of triplet is : "+triplet(arr,target));
    }
}
