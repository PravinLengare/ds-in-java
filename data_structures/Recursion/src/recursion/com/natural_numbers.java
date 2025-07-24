package recursion.com;

public class natural_numbers {
    static void printIncreasing(int n){
        if (n == 1){
            System.out.println(1);
            return;
        }

        printIncreasing(n - 1);
        System.out.println(n);
    }
    static void printDecreasing(int n){
        if (n == 1){
            System.out.println(1);
            return;
        }

        System.out.println(n);
        printDecreasing(n - 1);

    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println("The output for increasing : ");
        printIncreasing(n);
        System.out.println("The output for decreasing : ");
        printDecreasing(n);
    }
}
