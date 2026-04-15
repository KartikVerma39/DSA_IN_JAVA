public class ShortestDistanceToTargetInString {
    public static void main(String[] args){
        String[] s = {"hello","i","am","leetcode","hello"};
        String target = "hello";
        int startIndex = 1;
        int n = s.length;

        for(int i = 0 ; i < n ; i++){
            int forward = (i + startIndex) % n;
            int backward = (startIndex - i + n) % n;
            if(s[forward].equals(target) || s[backward].equals(target)){
                System.out.println(i);
                return;
            }
        }

        System.out.println(-1);
    }
}
