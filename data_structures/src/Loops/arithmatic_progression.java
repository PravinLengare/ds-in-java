package Loops;

import java.util.Scanner;

public class arithmatic_progression {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a no to print AP : ");
        int n = s.nextInt();
        // method 1
//        for (int i = 1; i <= (2*n)-1 ; i+=2){
//
//            System.out.println(i);
//        }

        // method 2
        int a = 4, d = 3;
        for (int i = 1; i <= n ; i++){

            System.out.println(a+" ");
            a+=d;
        }
    }
}
