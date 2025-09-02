package Exception;

public class try_catch_finally {
    public static void main(String[] args) {
        int n = 0,m = 10;
        try {

            System.out.println(m/n);

        }
        catch (ArithmeticException e){
            System.out.println("The division by zero not allowed in the math !!");
        }
        finally {
            System.out.println("I am done with my work and I am in finally now !");
        }
    }
}
