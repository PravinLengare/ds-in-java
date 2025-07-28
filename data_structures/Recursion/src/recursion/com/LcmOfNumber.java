package recursion.com;

public class LcmOfNumber {
    static int gcdAlgorithm(int x,int y){
        if (y == 0){
            return x;
        }
        return gcdAlgorithm(y,x % y);
    }
    public static void main(String[] args) {
        int x = 16,y = 12;
        int lcm = (x * y) / (gcdAlgorithm(x,y));

        System.out.println("The lcm of "+x+ " and "+y+" is : "+lcm);

    }
}
