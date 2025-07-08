package Arrays;

import java.util.Scanner;

public class sum_of_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to print the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }
//        System.out.println("The array is :");
//        for(int i = 0; i < n ; i++){
//            System.out.println(arr[i]);
//        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("The sum of array is : "+sum);
    }
}
