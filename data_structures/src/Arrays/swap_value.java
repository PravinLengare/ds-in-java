package Arrays;

public class swap_value {
    static void swap(int a,int b){
        // using temporary variable
        System.out.println("Original values before swap : ");
        System.out.println("a is : "+a);
        System.out.println("b is : "+b);
//        int temp = a;
//        a = b;
//        b = temp;

        // Using difference method

        a = a + b;
        b = a - b;
        a = a - b;


        System.out.println("Original values after swap : ");
        System.out.println("a is : "+a);
        System.out.println("b is : "+b);

    }

    public static void main(String[] args) {
        int a = 9;
        int b = 3;
        swap(a,b);
    }
}
