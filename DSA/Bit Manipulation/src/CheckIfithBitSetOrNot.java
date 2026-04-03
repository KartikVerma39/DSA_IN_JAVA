public class CheckIfithBitSetOrNot {
    public static void main(String[] args){
        int n = 500;
        int i = 3;

        if((n & (1 << i)) == 0){
            System.out.println("False");
        }
        else{
            System.out.println("True");
        }

    }
}
