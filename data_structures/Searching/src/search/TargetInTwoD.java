package search;

public class TargetInTwoD {
    static boolean search(int [][]a,int target){
        int n = a.length;
        int m = a[0].length;
        int st = 0,end = n * m - 1;
        while (st <= end){
            int mid = st + (end - st) /2;
            int midEl = a[mid/m][mid%m];

            if (midEl == target){
                return true;
            }
            else if (midEl < target) {
                st = mid + 1;
            }
            else {
                end = mid - 1;
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
