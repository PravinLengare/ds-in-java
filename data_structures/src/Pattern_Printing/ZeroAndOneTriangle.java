package Pattern_Printing;

import java.util.Scanner;

public class ZeroAndOneTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no of rows :");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                //method 1
//                if ((i%2==1 && j%2==1) || (i%2==0 && j%2==0)){
//                    System.out.print(1+" ");
//                }
//                else {
//                    System.out.print(0+" ");
//                }

                // method 2
                if((i+j)%2==0) System.out.print(1+" ");
                else System.out.print(0+" ");

            }
            System.out.println();
        }
    }
}


