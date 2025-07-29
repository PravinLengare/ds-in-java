package recursion.com.array;

public class MaxOfArray {
    static int max(int arr[],int idx){
        if (idx == arr.length - 1){
            return arr[idx];
        }
        int smallWork = max(arr,idx+1);
        return Math.max(smallWork,arr[idx]);
    }
    public static void main(String[] args) {
        int arr[] = {1, 5, 7, 9, 4};
        int idx = 0;
        System.out.println(max(arr, idx));
    }
}
