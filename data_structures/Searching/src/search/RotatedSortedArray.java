package search;

public class RotatedSortedArray {
    static int search(int []arr,int n,int target){
        int st = 0;
        int end = n - 1;

        while(st <= end){
            int mid = st + (end - st) / 2;
            if (arr[mid] == target){
                return mid;
            }
            else if (arr[mid] < arr[n -1]) {   // mid to end is sorted
                if (target > arr[mid] && target <= arr[end]){
                    st = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
            else {  // st to mid is sorted
                if(target < arr[mid] && target >= arr[st]){
                    end = mid - 1;
                }
                else {
                    st = mid + 1;
                }
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int []arr = {3,4,5,1,2};
        int n = arr.length;
        int target = 3;
        System.out.println("The target is at : "+search(arr,n,target));
    }
}
