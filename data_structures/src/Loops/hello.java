package Loops;

import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a no to print it ");
        int n = s.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println("Hello World");
        }
    }
}

