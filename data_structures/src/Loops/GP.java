package Loops;

import java.util.Scanner;

public class GP {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a no to print GP of nth terms : ");
        int n = s.nextInt();

        int a = 1, r = 2;
        for (int i = 1; i <= n ; i++){

            System.out.println(a+" ");
            a*=r;
        }
    }
}
