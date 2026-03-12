public class PowOfX {
    public static void main(String[] args){
        int x = 5;
        int n = 2;
        System.out.println(power(x,n));
    }

    public static int power(int x , int n){
        int m = n;
        int ans = 1;
        long N = Math.abs(n);
        while(N > 0){
            if(N%2 == 1){
                ans = ans*x;
                N = N - 1;
            }
            else{
                ans = x * x;
                N = N/2;
            }
        }
        if(m < 0){
            return 1/ans;
        }
        return ans;
    }
}
