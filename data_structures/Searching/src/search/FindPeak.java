package search;

public class FindPeak {
    static int peakSecond(int []a){
        int n = a.length;
        int st = 0 , end = n - 1;

        while (st <= end){
            int mid = st + (end - st) / 2;
            if ((mid == 0 || a[mid] > a[mid - 1]) && (mid == n - 1 || a[mid] > a[mid + 1])){
                return mid;
            }
            if (a[mid] < a[mid + 1]){
                st = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
    static int peak(int []a){
        int st = 0, end = a.length - 1;
        int ans = -1;


        while(st <= end){
            int mid = st + (end - st) / 2;
            if(a[mid] < a[mid + 1]){
                ans = mid + 1;
                st = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int []a = {5,7,9,10,3,2,1};
        // System.out.println("The peak of this array is : "+peak(a));
        System.out.println("The peak of this array is : "+peakSecond(a));

    }
}
