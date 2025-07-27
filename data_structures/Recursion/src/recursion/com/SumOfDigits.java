package recursion.com;

import java.util.Scanner;

public class SumOfDigits {
    public static int  digits(int n){
        if (n >=0 && n <=  9){
            return n;
        }
        int smallAns = digits(n/10); // in this line the recursive calls are done to traverse the digit.
        int selfWork = digits(n%10); // in this line the recursive calls are done to traverse the only last digit.
        return smallAns + selfWork;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number to calculate the sum : ");
        int n = s.nextInt();
        System.out.println("The sum of digits using recursion of number " +n+" is : "+digits(n));

    }
}
