package Loops;

import java.util.Scanner;

public class Highest_Factor_Of_Number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a no to print highest factors : ");
        int n = s.nextInt();

        int highest_factor = 1;
        // Method 1

//        for (int i = 1; i < n ; i++){
//
//            if(n % i == 0){
//               highest_factor = i;
//            }
//        }
//        System.out.println(highest_factor);
        // Method 2

        for (int i = n-1; i >= 1 ; i--){

            if(n % i == 0){

                highest_factor = i;
                break;
            }
        }
        System.out.println(highest_factor);

    }
}
