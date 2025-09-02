package Exception;
class MyException extends Exception{
    public MyException(String message){
        super(message);
        //System.out.println(message);
    }
}
public class custom_exception {
    public static void main(String[] args) {
        try {
            try {
                int age = 2;
                if (age < 18) {
                    throw new MyException("Enter the age above the 18 !");
                }
                System.out.println("valid age is : " + age);
            } catch (MyException e) {
                System.out.println(e.getMessage());
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
