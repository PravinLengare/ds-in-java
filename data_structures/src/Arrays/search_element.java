package Arrays;
import java.util.Scanner;

class Search{
    public int search(int x,int arr[]){

        for (int i = 0; i < arr.length ; i++) {
            if(x == arr[i]){
                return i;
            }
            break;                                  // for break the condition after first element is found
        }
        return -1;
    }
}
public class search_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to print the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number to search :-");
        int x = sc.nextInt();

        Search s = new Search();
        System.out.println(s.search(x,arr));

    }
}
