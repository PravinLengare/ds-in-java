package Loops;

import java.util.Scanner;

public class even_no {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a no to print even numbers: ");
        int n = s.nextInt();

        // method 1
//        for(int i = 1; i <= n; i++){
//            if(i % 2 == 0){
//                System.out.println(i);
//            }
//
//        }

        // method 2 It is very efficient as compared to above one

        for(int i = 2; i <= n; i+=2){

                System.out.println(i);
        }
    }
}
