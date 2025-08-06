package search;

public class TargetWithSorted {
    static boolean search(int [][]a,int target){
        int n = a.length;
        int m = a[0].length;
        int i = 0,j = m - 1;

        while(i < n && j >= 0){
            if (a[i][j]==target){
                return true;
            }
            if (a[i][j] > target) {
                j--;
            }
            else {
                i++;
            }

        }
        return false;
    }
    public static void main(String[] args) {
        int a[][] = {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };
        System.out.println(search(a,1));
    }
}
