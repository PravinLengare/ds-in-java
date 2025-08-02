package string;

public class ToggleString {
    public static void main(String[] args) {
        System.out.println("Very Bad Performance Code !");
        String str = "AbcD";
        for (int i = 0; i < str.length(); i++) {

            boolean flag = true;
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if (ch == ' ')  continue;
            if (ch >= 97) flag = false;
            if (flag == true){
                ascii += 32;
                char dh = (char)ascii;
                str = str.substring(0,i) + dh + str.substring(i+1);
            }
            else {
                ascii-= 32;
                char dh = (char)ascii;
                str = str.substring(0,i) + dh + str.substring(i+1);
            }
        }
        System.out.println(str);
    }
}
