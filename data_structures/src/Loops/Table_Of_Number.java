package Loops;

import java.util.Scanner;

public class Table_Of_Number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a no to print it's table : ");
        int n = s.nextInt();
        System.out.println("The table of "+n+" is:");

        // method 1


//        for(int i = 1; i <= 10; i++){
//
//            System.out.println(i * n);
//        }

        // method 2
//
//        for(int i = n ; i <= n*10 ; i++){
//            if(i % n == 0){
//                System.out.println(i);
//            }
//        }

        // method 3

        for(int i = n ; i <= n*10 ; i+=n){

            System.out.println(i);
            }


        }




    }


