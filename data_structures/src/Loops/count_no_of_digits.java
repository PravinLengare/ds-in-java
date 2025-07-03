package Loops;

import java.util.Scanner;

public class count_no_of_digits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a no to return digit count : ");
        int n = s.nextInt();

//
//        int count = 0;
//        if (n == 0) count++;
//        while (n!=0){
//            n/=10;
//            count++;
//        }
//        System.out.println(count);




        // And doing the addition of digits of number
        int last_digit;
        int sum_of_digits = 0;
        while (n!=0){

            last_digit = n % 10;
            sum_of_digits+= last_digit;
            //last_digit+= n * 10;
            n = n / 10;
        }

        System.out.println("The sum of digit is "+sum_of_digits);
    }
}
