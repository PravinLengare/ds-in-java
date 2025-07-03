package Loops;

import java.util.Scanner;

public class reverse_number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a no to return digit count : ");
        int n = s.nextInt();
        int last_digit;
        int reverse = 0;
        while (n!=0){

            last_digit = n % 10;
            reverse+= reverse * 10;
            reverse += last_digit;
            n /= 10;

        }

        System.out.println("The reverse of "+ n +"is "+reverse);
    }
}
