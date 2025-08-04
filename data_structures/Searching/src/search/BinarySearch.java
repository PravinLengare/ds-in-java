package search;

public class BinarySearch {
    static int recBinarySearch(int []arr,int st,int en,int target){

        if(st > en){
            return 0;
        }
        int mid = st + (  en - st )/2;
        if (target == arr[mid]){
            return mid;
        }
        else if(target < arr[mid]){
            return recBinarySearch(arr,st,mid - 1,target);
        }else if(target > arr[mid]){
            return recBinarySearch(arr,mid+1,en,target);
        }
        return -1;
    }
    static boolean binarySearch(int []arr,int n ,int target){
            int st = 0;
            int en = n - 1;

            while (st <= en){
                int mid = st + ( en - st )/2;
                if (target == arr[mid]){
                    return true;
                }
                else if(target < arr[mid]){
                    en = mid - 1;

                }
                else if(target > arr[mid]){
                    st = mid + 1;

                }
            }
            return false;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,5,7,20,24,45,50,77};
        int target = 24;
        int n = arr.length;
        System.out.println("The index at which the target is : "+recBinarySearch(arr,0,n-1,target));
//            System.out.print(binarySearch(arr,n,target));
//            target++;
//        }
    }
}
