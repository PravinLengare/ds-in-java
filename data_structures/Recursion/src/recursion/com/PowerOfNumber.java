package recursion.com;

import java.util.Scanner;

public class PowerOfNumber {
    public static int powerOfNumber(int p,int q){  // TC - O(q)
        if (q == 0){
            return 1;
        }


        return powerOfNumber(p,q-1) * p;
    }
    public static int power(int p,int q){  // TC - O(log q)
        if (q == 0){
            return 1;
        }
        int smallWork = power(p,q/2);
        if (q % 2 ==  0){
            return smallWork * smallWork;
        }
        else {
            return smallWork * smallWork * p;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the two number to calculate the power : ");
        int p = s.nextInt();
        int q = s.nextInt();
        System.out.println("The answer of "+p +" ^ "+q+" is : " +powerOfNumber(p,q));
        System.out.println("The answer of "+p +" ^ "+q+" is : " +power(p,q));
    }
}
