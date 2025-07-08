package Arrays;

import java.util.Scanner;
class Occurence{
    public void printArray(int arr[]){
        System.out.println("The array is : ");
        for(int i = 0; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public void count(int arr[],int x){
        int count = 0;
        for(int i = 0; i < arr.length ; i++){
             if(x == arr[i]){
                 count++;
             }
        }
        System.out.println("The count of "+x+" is : "+count);
    }
}
public class count_occurence_of_given_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to print the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number to count occurance :-");
        int x = sc.nextInt();


        Occurence o = new Occurence();
        o.printArray(arr);
        o.count(arr,x);
    }
}
