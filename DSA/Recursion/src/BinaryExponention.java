public class BinaryExponention {
    public static void main(String[] args){
        int a = 5;
        int b = 10;
        System.out.println(calculatePower(a,b));
    }

    public static int calculatePower(int a , int b){
        if(b == 0){
            return 1;
        }
        int res = calculatePower(a,b/2);
        if(b%2 == 1){
            return a * res * res;
        }
        else{
            return res * res;
        }
    }
}
