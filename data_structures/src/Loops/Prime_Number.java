package Loops;

import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a no to print prime number : ");
        int n = s.nextInt();

//        boolean flag = false;   // If i is a factor of n then n % i will also be factor
//        for (int i = 2; i < n ; i++) {
//            if (n % i == 0){
//                flag = true;
//                break;
//            }
//        }
//        if(n == 1){
//            System.out.println("Neither Prime Nor Composite");
//        }
//        else if(flag == false){
//            System.out.println("Prime Number");
//        }
//        else{
//            System.out.println("Composite Number");
//        }


        // Method 2    **In continue statement if write code below it will skip but its above part will print
        boolean flag = false;
        for (int i = 2; i < Math.sqrt(n) ; i++) {
            if (n % i == 0){
                flag = true;
                break;
            }
        }
        if(n == 1){
            System.out.println("Neither Prime Nor Composite");
        }
        else if(flag == false){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Composite Number");
        }

    }
}
