package string;

public class StringIntChar {

    public static void main(String[] args) {
        String str = "abc";
        int a = 10;
        int b = 20;
        System.out.println(str + (a + b));
        System.out.println(str + a + b);
        // we can add a char in string
        str += 'r';
        System.out.println(str);  // string concatenation
    }
}
