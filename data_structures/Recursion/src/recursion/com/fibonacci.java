package recursion.com;

import java.util.Scanner;

public class fibonacci {
    static int fibonacciSeries(int n){
        if(n == 0 || n == 1){
            return n;
        }

        return fibonacciSeries(n - 1) + fibonacciSeries(n - 2);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter no print fibonacci number : ");
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(fibonacciSeries(i));
        }

    }
}
