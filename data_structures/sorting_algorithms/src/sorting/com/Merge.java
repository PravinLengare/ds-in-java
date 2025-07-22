package sorting.com;

import java.util.Scanner;

public class Merge {
    static void printArray(int arr[]){
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static int [] merge(int arr1[],int arr2[]){  // Should be sorted
        int index = 0; // used to fill the array
        int i = 0;
        int j = 0;
        int []combined = new int[arr1.length + arr2.length];

        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                combined[index] = arr1[i];
                i++;
                index++;
            }
            else {
                combined[index] = arr2[j];
                j++;
                index++;
            }
        }
        while (i < arr1.length){

            combined[index]  = arr1[i];
            i++;
            index++;
        }

        while (j < arr2.length){

            combined[index] = arr2[j];
            j++;
            index++;

        }
        return combined;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
//        int n = sc.nextInt();
//        int arr1[] = new int[n];
//        int arr2[] = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr1[i] = sc.nextInt();
//        }
//        for (int i = 0; i < n; i++) {
//            arr2[i] = sc.nextInt();
//        }
        int arr1[] = {1,3,7,8};
        int arr2[] = {2,4,5,6};
        int []ans = merge(arr1,arr2);
        System.out.println("The sorted array using Merge is :- ");
        printArray(ans);
    }
}
