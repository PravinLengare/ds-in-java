package recursion.com.String;

import java.util.Scanner;

public class ReverseString {
    static String reverseString(String s ,int idx){
        if (s.length() == idx){
            return "";
        }
        String small = reverseString(s,idx+1);

        return small + s.charAt(idx);
    }
    static String reverseS(String s){
        if (s.length() == 0){
            return "";
        }
        String small = reverseS(s.substring(1));
        return small + s.charAt(0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to operate : ");
        String  s = sc.nextLine();
        int idx = 0;
        System.out.println("The reverse of string "+s+" is : "+reverseString(s,idx));
        System.out.println("The reverse of string "+s+" is : "+reverseS(s));
    }
}
