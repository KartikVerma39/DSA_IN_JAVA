public class CountGoodNumbers {
    public static void main(String[] args) {
        int num = 4;
        System.out.println(CountGoodNumber(num));
    }

    public static int CountGoodNumber(int num){
        return powerOf(5 , (num + 1)/2) * powerOf(4 , num/2);
    }

    public static int powerOf(int a , int b){
        if(b == 0){
            return 1;
        }
        int res = powerOf(a , b/2);
        if(b%2 == 1){
            return a * res * res;
        }
        else{
            return res*res;
        }
    }
}
