package search;

public class FindSquareRoot {
    static int  sqrt(int x){
        int st = 0;
        int end = x;
        int ans = -1;

        while(st <= end){

            int mid = st + (end - st )/2;
            int val = mid * mid;
            if (mid == val){
                return mid;
            }
            else if (val < x) {
                ans = mid;
                st = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
            int x = 24;
        System.out.println(sqrt(x));
    }
}
