public class MirrorDistanceOfAnInteger {
    public static void main(String[] args){
        int num = 25;

        int temp = num;
        int rev = 0;
        while(temp!=0){
            int rem = temp%10;
            rev = (rev * 10) + rem;
            temp /= 10;
        }

        System.out.println(Math.abs(num -  rev));
    }
}
