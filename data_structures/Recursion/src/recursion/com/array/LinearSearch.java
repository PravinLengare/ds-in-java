package recursion.com.array;
import java.util.ArrayList;

public class LinearSearch {
    static boolean linearSearch(int arr[],int target,int idx){
        if (idx == arr.length){
            return false;
        }
        if (arr[idx] == target){
            return true;
        }
        else {
            return linearSearch(arr,target,idx+1);
        }
    }
    static int linearSearchForIndex(int arr[],int target,int idx){
        if (idx >= arr.length){
            return -1;
        }
        if (arr[idx] == target){
            return idx;
        }

        return linearSearchForIndex(arr,target,idx+1);
    }
    static void linearSearchForAllIndex(int arr[],int target,int idx){
        if (idx >= arr.length){
            return;
        }
        if (arr[idx] == target){
            System.out.println(idx);
        }

        linearSearchForAllIndex(arr,target,idx+1);
    }
    static ArrayList<Integer> linearSearch1(int arr[],int target,int idx){
            ArrayList<Integer> ans = new ArrayList<>();
            if (idx >= arr.length){
                return ans;
            }
            if (arr[idx] == target){
                ans.add(idx);
            }
            ArrayList<Integer> smallWork = linearSearch1(arr,target,idx+1);

            // for adding the indexes of smallWork into ans
             ans.addAll(smallWork);

        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {2,8,5,9,8,8};
        int idx = 0, target = 8;
        // System.out.println("The searched element is : "+linearSearch(arr,target,idx));

        // System.out.println("The searched element's index is : "+linearSearchForIndex(arr,target,idx));

        // linearSearchForAllIndex(arr,target,idx);

        ArrayList<Integer> ans = linearSearch1(arr,target,idx);
        // For printing the values in the arraylist
        System.out.println("The arraylist with the indexes is :-");
        for(Integer i : ans){
            System.out.println(i);
        }


    }
}
