package recursion.com.String;

import java.util.Scanner;

import static sun.text.normalizer.UTF16.charAt;

public class RemoveAllOccurences {
    static String removeA2(String s){
        if(s.length() == 0){
            return "";
        }
        String small = removeA2(s.substring(1));
        char curr = s.charAt(0);
        if (curr != 'a'){
            return curr + small;
        }
        else {

            return small;
        }
    }
    static String  removeOccurences(String s,int idx){
            if (idx == s.length()){
                return "";
            }
           char curr = s.charAt(idx);

            if (idx == s.length()){
                return "";
            }
            String small = removeOccurences(s,idx+1);
            if (curr != 'a'){
                return curr + small;
            }
            else {

                return small;
            }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to operate : ");
        String  s = sc.nextLine();
        int idx = 0;
        System.out.println("The returned string is : "+removeOccurences(s,idx));
        System.out.println("The returned string (Using only string) is : "+removeA2(s));


    }
}
