package string;

public class SubString {

    public static void main(String[] args) {
        String s = "abcd";
        System.out.println(s.substring(0,4));
        System.out.println(s.substring(0));  // from index 0 string will be print
        System.out.println(s.substring(1)); // from index 1 string will be print

        for (int i = 0; i <= 3; i++) {
            for (int j = i+1; j <= 4; j++) {
                System.out.print(s.substring(i,j) + " ");
            }
        }
    }
}
