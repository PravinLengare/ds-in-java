package recursion.com.array;

public class FrogJump {
    static int best(int []arr,int n,int idx){
        if(idx == n - 1){
            return 0;
        }
        int opt1 = Math.abs(arr[idx] - arr[idx+1]) + best(arr,n,idx+1);
        if (idx == n - 2){
            return opt1;
        }
        int opt2 = Math.abs(arr[idx] - arr[idx+2]) + best(arr,n,idx+2);
        return Math.min(opt1,opt2);
    }
    public static void main(String[] args) {
        int []arr = {10,30,40,20};
        System.out.println("The min cost to reach the Frog at end is : "+best(arr,arr.length,0));
    }
}
