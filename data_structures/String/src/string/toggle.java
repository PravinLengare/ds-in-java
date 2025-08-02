package string;

import java.util.Scanner;

public class toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder s  = new StringBuilder(sc.nextLine());

        //  toggle
        for (int i = 0; i < s.length(); i++) {
            boolean flag = true; // --> capital letter
            char ch = s.charAt(i); // --> getting the char at position
            if (ch == ' ') continue;
            int ascii = (int)ch;   // --> converting char to int
                if (ascii >= 97) flag = false;
                if (flag == true){
                    ascii+= 32;
                    char dh = (char)ascii;
                    s.setCharAt(i,dh);
                }
                else {
                    ascii-=32;
                    char dh = (char)ascii;
                    s.setCharAt(i,dh);
                }
        }
        System.out.println("The string after the toggle is : " +s);
    }
}
