package recursion.com.String;

public class SubSetSum {
    static void subsetSum(int arr[],int n,int idx,int ans){
        if (idx >= n){
            System.out.println(ans);
            return;
        }
        subsetSum(arr,n,idx+1,ans + arr[idx]); // add

        subsetSum(arr,n,idx+1,ans); // don't add

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        subsetSum(arr,3,0,0);
    }
}
