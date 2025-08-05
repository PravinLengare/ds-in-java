package search;

public class RotatedArrayMinElement {
    static int findMin(int []arr,int n){
        int st = 0;
        int end = n - 1;
        int ans = -1;
        while(st <= end){
            int mid = st + (end - st) / 2;

            if (arr[mid] > arr[n - 1]){
                st = mid + 1;
            }
            else if (arr[mid] <= arr[n - 1]) {
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int []arr= {10,11,12,1,2,3,4,5,6,7,8,9};
                //  0  1  2  3 4 5 6 7 8 9 10 11
        int n = arr.length;
        System.out.println("The min element of the array is : " + findMin(arr,n));
    }
}
