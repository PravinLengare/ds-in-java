package Pattern_Printing;

import java.util.Scanner;

public class StarRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no of rows :");
        int m = sc.nextInt();
        System.out.println("Enter a no of col :");
        int n = sc.nextInt();
        for (int i = 1; i <= m ; i++) {
            for (int j = 1; j <= n ; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
