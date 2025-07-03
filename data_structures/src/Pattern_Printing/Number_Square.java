package Pattern_Printing;

import java.util.Scanner;

public class Number_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no :");
        int n = sc.nextInt();
        //Pattern 1 ->
//        for (int i = 1; i <= n ; i++) {
//            for (int j = 1; j <= n ; j++) {
//                System.out.print(j+" ");
//            }
//            System.out.println(" ");
//        }
        // Pattern 2 ->

        for (int i = 1; i <= n ; i++) {
                for (int j = 1; j <= n ; j++) {
                     System.out.print(i+" ");
                }
            System.out.println(" ");
        }

    }
}
