package Pattern_Printing;

import java.util.Scanner;

public class StarTriangleUlta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no of rows :");
        int n = sc.nextInt();
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n+1-i ; j++) {
                if (i%2!=0)
                    System.out.print((char)(i+64)+" ");
                else
                    System.out.print(i+" ");

            }
            System.out.println(" ");
        }
    }
}
