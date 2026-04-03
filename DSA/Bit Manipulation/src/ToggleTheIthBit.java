public class ToggleTheIthBit {
    public static void main(String[] args){
        int n = 9;
        int i = 2;

        int toggle = (n ^ (1 << i));
        System.out.println(toggle);
    }
}
