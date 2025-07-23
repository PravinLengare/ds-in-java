package sorting.com;

import java.util.Arrays;

public class QuickSort {
    static void swap(int arr[],int firstInd,int secondInd){
        int t = arr[firstInd];
        arr[firstInd] = arr[secondInd];
        arr[secondInd] = t;
    }
    private static int pivotIndex(int arr[],int pivot,int endInd){
         int swapInd = pivot;

        for (int i = pivot + 1 ; i <= endInd; i++) {
            if (arr[i] < arr[pivot]){
                swapInd++;
                swap(arr,swapInd,i);
            }
        }
        swap(arr,pivot,swapInd);
        return swapInd;
    }
    private static void quickSort(int arr[],int left,int right){
        if(left < right) {
            int pivotElement = pivotIndex(arr, left, right);
            quickSort(arr, left, pivotElement - 1);
            quickSort(arr, pivotElement + 1, right);
        }
    }
    public static void main(String[] args) {
        int myArray[] = {4,6,1,7,3,2,5};
        System.out.println("The sorted list using quick sort is :");
        quickSort(myArray,0,6);
        System.out.println(Arrays.toString(myArray));



    }
}
