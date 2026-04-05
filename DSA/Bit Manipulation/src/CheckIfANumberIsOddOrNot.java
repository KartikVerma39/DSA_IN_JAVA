public class CheckIfANumberIsOddOrNot {
    public static void main(String[] args){
        int n = 13;

        if((n&1) == 1){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
