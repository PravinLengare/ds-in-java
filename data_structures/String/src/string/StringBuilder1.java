package string;
import java.util.*;
public class StringBuilder1 {

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Pravin");
        // to append the string at last
        str.append("Lengare");

        // to set the char at any index
        str.setCharAt(0,'R');

        // to insert the char at index
        str.insert(0,'p');

        // to delete the char at index
        str.deleteCharAt(0);
        System.out.println(str);

        StringBuilder s = new StringBuilder("Pravin");
        // to reverse the string
        s.reverse();
        s.reverse();  // reverse of reverse

        //  to delete a string of range(i,j) here i is inclusive and j is exclusive
        s.delete(0,3);

        // to get a index of a char
        System.out.println(s.indexOf("v"));
        System.out.println(s);


    }
}
