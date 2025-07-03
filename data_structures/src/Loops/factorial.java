package Loops;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a no to return factorial of given number : ");
        int n = s.nextInt();

        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("The factorial is :" +fact);
    }
}
