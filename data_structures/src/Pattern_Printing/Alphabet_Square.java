package Pattern_Printing;

import java.util.Scanner;

public class Alphabet_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no :");
        int n = sc.nextInt();

        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n ; j++) {
                System.out.print((char)(j+64)+" ");
            }
            System.out.println(" ");
        }

    }
}
