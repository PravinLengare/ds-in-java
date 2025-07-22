package sorting.com;

import java.util.Arrays;

public class MergeSort {
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
    static int[] mergeSort(int []arr){
        if(arr.length <= 1){
            return arr;
        }
        int midIndex = arr.length / 2;
        int left[] = mergeSort(Arrays.copyOfRange(arr,0,midIndex));
        int right[] = mergeSort(Arrays.copyOfRange(arr,midIndex,arr.length));

        return merge(left,right);

    }
    public static void main(String[] args) {
        int arr[] = {3,1,4,2};
        int ans[] = mergeSort(arr);
        System.out.print("Original array is : ");
        printArray(arr);
        System.out.println();
        System.out.print("The sorted array using Merge Sort is :- ");
        printArray(ans);
    }
}
