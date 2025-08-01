package recursion.com.String;

import java.util.ArrayList;

public class Subsequence {
    static ArrayList<String> subSeq(String s){
        ArrayList<String> ans = new ArrayList<>();
        // Base case
        if(s.length() == 0){
            ans.add(" ");
            return ans;
        }
        char curr = s.charAt(0);  // for getting the current character
        // Recursive Work
        ArrayList<String> small = subSeq(s.substring(1));
        // Self Work
        for (String ss:small) {
            ans.add(ss);
            ans.add(curr + ss);
        }
        return ans;
    }
    static void printSubSeq(String s,String currAns){

        if (s.length() == 0){
            System.out.println(currAns);
            return;
        }
        char curr = s.charAt(0);
        String remString =  s.substring(1);
        printSubSeq(remString,currAns+curr);
        printSubSeq(remString,currAns);
    }
    public static void main(String[] args) {
        ArrayList<String> ans = subSeq("abc");
        for (String ss: ans){
            System.out.println(ss);
        }
        System.out.println("Using without extra space");
        printSubSeq("abc","");
    }
}
