package recursion.com.String;

import java.util.Scanner;

public class Palindrome {
    static String reverseString(String s ,int idx){
        if (s.length() == idx){
            return "";
        }
        String small = reverseString(s,idx+1);

        return small + s.charAt(idx);
    }
    static boolean IsPalindrome(String s,int l ,int r){
        if ( l >= r){
            return true;
        }

        if(s.charAt(l) == s.charAt(r) && IsPalindrome(s,l+1,r-1)){
            // System.out.println("Not Palindrome");
            return true;
        }
        else {
            return false;

        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to operate : ");
        String s = sc.nextLine();
        int idx = 0;
//        System.out.println("The reverse of string "+s+" is : "+reverseString(s,idx));
//        String rev = reverseString(s,idx);
//        if (rev.equals(s)){
//            System.out.println("This string "+s+" is palindrome! ");
//        }
//        else {
//            System.out.println("This string "+s+" is NOT palindrome! ");
//
//        }
        // Method - 2


        System.out.println(IsPalindrome(s,0,s.length()-1));
    }
}
