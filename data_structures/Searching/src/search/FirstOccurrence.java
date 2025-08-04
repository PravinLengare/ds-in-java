package search;

public class FirstOccurrence {
    static int firstOccurrence(int arr[],int x){
        int n = arr.length;
        int st = 0;
        int end = n - 1;
        int fo = -1;
        while(st <= end){
            int mid = st + (end - st) / 2;
            if(arr[mid] == x){
                fo = mid;
                end = mid - 1;  // for the first Occurrence
                st = mid + 1;  //  for the last Occurrence
            }
            else if (arr[mid] < x){
                st = mid + 1;
            }
            else if (arr[mid] > x) {
                end = mid - 1;
            }
        }
        return fo;
    }
    public static void main(String[] args) {
        int arr[] = {1,5,5,5,6,2,4};
        int x = 5;
        System.out.println("The first Occurrence of the "+x+" is : "+firstOccurrence(arr,x));
    }
}
