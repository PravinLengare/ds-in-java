package Arrays;

import java.util.Scanner;
class Last_Occurance{
    public void printArray(int arr[]){
        System.out.println("The array is : ");
        for(int i = 0; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public void last_occur(int arr[],int x){
        int index = -1;
        for(int i = 0; i < arr.length ; i++){
            if(x == arr[i]){
                 index = i;
            }
        }
        System.out.println("The last occur of "+x+" is : "+index);
    }
}
public class last_occurance_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to print the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the element of array : ");
        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number to count last occurance :-");
        int x = sc.nextInt();

        Last_Occurance lo = new Last_Occurance();
        lo.printArray(arr);
        lo.last_occur(arr,x);
    }
}
