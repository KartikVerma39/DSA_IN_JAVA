public class ClearTheIthBit {
    public static void main(String[] args){
        int n = 70;
        int i = 3;

        int clear = (n & (~(1 << i)));

        System.out.println(clear);
    }
}
