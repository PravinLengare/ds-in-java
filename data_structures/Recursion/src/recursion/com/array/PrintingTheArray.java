package recursion.com.array;

public class PrintingTheArray {
    static void print(int arr[],int idx){
        if (idx == arr.length){
            return;
        }
        System.out.println(arr[idx]);
        print(arr,idx+1);  // prints the value after 0th index
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int idx = 0;
        System.out.println("The array is : ");
        print(arr,idx);

    }
}
