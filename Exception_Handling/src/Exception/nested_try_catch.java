package Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class nested_try_catch {
    public static void main(String[] args){
        String str = "pravin";
        try {

            try {
                int num = Integer.parseInt(str);
                System.out.println("The number is : " + num);

            }

            catch(NumberFormatException e){
                System.out.println("Invalid number format!");
            }
            try {
                FileReader fr = new FileReader("a.txt");
                System.out.println("File opened successfully!");
                fr.close();
            } catch (FileNotFoundException e) {
                System.out.println("The file not found !!");
            }

        }

        catch (Exception e){
            System.out.println("The general exception!!");
        }
    }
}
