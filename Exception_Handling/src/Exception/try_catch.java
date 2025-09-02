package Exception;

public class try_catch {

    public static void main(String[] args) {
        int []arr = {1,2,3,4,5};

        try {
            System.out.println("The element of array is : "+arr[5]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
