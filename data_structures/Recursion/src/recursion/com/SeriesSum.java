package recursion.com;

import java.util.Scanner;

public class SeriesSum {
    static int sumSeries(int n){
        if (n == 0){
            return 0;
        }
        //sumSeries(n - 1);
        return sumSeries(n - 1) + n;
    }
    static int sumSeriesAlternate(int n){
        if (n == 0){
            return 0;
        }
        if (n % 2 == 0){
            return sumSeriesAlternate(n-1) - n;
        }
        else {
            return sumSeriesAlternate(n-1) + n;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number to get sum : ");
        int n = s.nextInt();
        // This is for only positive numbers
        System.out.println("The sum of up to "+n +" is : "+sumSeries(n));
        // This is for alternate positive and negative numbers
        System.out.println("The sum of alternate numbers up to "+n +" is : "+sumSeriesAlternate(n));

    }
}
