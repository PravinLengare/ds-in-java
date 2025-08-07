package search;

public class ChocolatesDistribution {
    static boolean isDivisionPossible(int []a,int m,int maxChocoAllowed){
            int noOfStudents = 1;
            int choco = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > maxChocoAllowed){
                return false;
            }
            if (choco + a[i] <= maxChocoAllowed){
                choco += 1;
            }
            else {
                noOfStudents++;
                choco = a[i];
            }
        }
        if(noOfStudents > m){
            return false;
        }
        else {
            return true;
        }
    }
    static int chocoDistribution(int []a,int m){
        int st = 1,end = (int)1e9;
        int ans = 0;

        while(st <= end){
            int mid = st + (end - st) / 2;

            if (isDivisionPossible(a,m,mid)){
                ans = mid;
                end = mid - 1;
            }
            else {
                st = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int []a = {5,3,1,4,2};
        int m = 3;

        System.out.println(chocoDistribution(a,m));
    }
}
