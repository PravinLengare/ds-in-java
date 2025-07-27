package recursion.com;

import java.util.Scanner;

public class Kth_Multiple {
    public static void multiple(int k,int n){

        if (k == 0){
            return;
        }
        if (k == 1){
            System.out.println(n);
            return;
        }
        multiple(k-1,n);
        System.out.println(n * k);

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the two number to calculate the multiple : ");
        int k = s.nextInt();
        int n = s.nextInt();
        //System.out.println("The "+k+"th multiple of "+n+"is : "+multiple(k,n));
        System.out.println("The "+k+"th multiple of "+n+" is :");
        multiple(k,n);
    }
}
