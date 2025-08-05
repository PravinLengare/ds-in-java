package search;

public class DuplicateElements {
    static boolean search_(int []arr,int n,int target){
        int st = 0;
        int end = n - 1;

        while(st <= end){
            int mid = st + (end - st) / 2;
            if (arr[mid] == target){
                return true;
            }
            else if (arr[st] == arr[mid] && arr[mid] == arr[end]) {
                st++;
                end--;

            }
            else if (arr[mid] <= arr[n -1]) {   // mid to end is sorted
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
        return false;
    }
    public static void main(String[] args) {
        int []arr = {1,1,1,2,3,2,1};
        int n = arr.length;
        int target = 20;
        System.out.println("The target is present : "+search_(arr,n,target));
    }
}
