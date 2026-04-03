public class GetTheIthBit {
    public static void main(String[] args){
        int n = 70;
        int i = 2;

        int get = (n >> i) & 1;
        System.out.println(get);
    }
}
