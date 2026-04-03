public class SetTheIthBit {
    public static void main(String[] args){
        int n = 10;
        int k = 2;
        n = (n | (1 << k));

        System.out.println(n);
    }
}
