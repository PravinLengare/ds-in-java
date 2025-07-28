package Arrays.MultiDimentional;

public class ReverseATwoArray {
    static void printArray(int [][]arr){
        System.out.println("The reverse of 2-D array is : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }
    static void reverse(int []arr){
        int n = arr.length;
        int i = 0;
        int j = n -1;
        while(i < j){
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int [][]arr = {
                {1,3,4},
                {3 ,4, 5},
                {5,2,3,}
        };
        for (int i = 0; i < arr.length; i++) {
            reverse(arr[i]);
        }
        printArray(arr);
    }

}
