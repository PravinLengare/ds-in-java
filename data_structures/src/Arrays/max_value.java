package Arrays;

import java.util.Scanner;

public class max_value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to print the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int max = 0;

        for (int i = 0; i < arr.length; i++) {

            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("The max value is : "+max);
    }
}
