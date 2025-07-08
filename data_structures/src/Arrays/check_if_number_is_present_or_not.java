package Arrays;

import java.util.Scanner;

public class check_if_number_is_present_or_not {
    static void printArray(int []arr){
        System.out.println("The array is : ");
        for(int i = 0; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int[] makeFrequencyArray(int arr[]){
        int freq [] = new int[100005];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
         }
        return freq;
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
        int freq [] = makeFrequencyArray(arr);
        printArray(arr);
        System.out.print("Enter number of queries : ");
        int q = sc.nextInt();
        while(q > 0){
            System.out.println("Enter query to be searched : ");
            int x = sc.nextInt();

            if(freq[x] > 0){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
            q--;
        }

    }
}
