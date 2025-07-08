package Arrays;

import java.util.Scanner;
import java.util.*;
class Sort{
    public void printArray(int arr[]){
        System.out.println("The array is : ");
        for(int i = 0; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public boolean isSorted(int arr[]){

        boolean check = true;

        for(int i = 1; i < arr.length ; i++){
             if(arr[i] < arr[i - 1]){
                 check = false;
                 break;
             }
        }
        if(check == true){
            System.out.println("The array is sorted");
        }
        else {
            System.out.println("The array is not sorted");
        }
        return check;

    }

}
public class sorted_or_not {

    static  int[] largestAndSmallestElement(int arr[]){    // we are storing smallest and largest in array then by this we are accessing them
        Arrays.sort(arr);
        int ans[] = {arr[0],arr[arr.length - 1]};

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

            Sort s = new Sort();
            s.printArray(arr);
            System.out.println(s.isSorted(arr));
            int ans[] = largestAndSmallestElement(arr);
            System.out.println("Smallest "+ans[0]);
            System.out.println("Largest "+ans[1]);

    }
}
