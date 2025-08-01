package recursion.com.String;

public class KeyPadCombinations {
    static void keyPadCombinations(String dig,String []kp,String res){
        if(dig.length() == 0){
            System.out.print(res+" ");
            return;
        }
        int currNum = dig.charAt(0) - '0';  // converting string to integer
        String currChoices = kp[currNum];   // for curr choices to access what kind of options we have

        for (int i = 0; i < currChoices.length(); i++) {
            keyPadCombinations(dig.substring(1), kp, res + currChoices.charAt(i));
        }
    }

    public static void main(String[] args) {
        String dig = "23";
        String kp[]= {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        keyPadCombinations(dig,kp,"");
    }
}
