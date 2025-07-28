package recursion.com;

public class GcdOfNumber {
    static int gcd(int x,int y){  // TC - O(n) if we have worst case of finding the gcd
        int i = x;
        for (i = x; i >=0; i--) {
            if (x % i == 0 && y % i == 0){
                return i;
            }
        }
        return i;
    }
    public static int gcdOptimal(int x,int y){
        while(x % y!= 0){
            int remainder = x % y;
            x = y;
            y = remainder;
        }
        return y;
    }
    static int gcdAlgorithm(int x,int y){
        if (y == 0){
            return x;
        }
        return gcdAlgorithm(y,x % y);
    }
    public static void main(String[] args) {
        int x = 24,y = 15;
        System.out.println("The gcd of number "+x+" & "+y+" is :"+gcd(x,y));
        System.out.println("The gcd of number "+x+" & "+y+" is (Using optimal solution) :"+gcdOptimal(x,y));
        System.out.println("The gcd of number "+x+" & "+y+" is (Using Algorithm solution) :"+gcdAlgorithm(x,y));


    }
}
