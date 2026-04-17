public class ExpandAString {
    public static void main(String[] args){
        String s = "a2b4c5d9";
        StringBuilder ans = new StringBuilder();

        for(int i = 0 ; i < s.length() ; i+=2){
            char ch = s.charAt(i);
            int count = s.charAt(i + 1) - '0';
            for(int j = 0 ; j < count ; j++){
                ans.append(ch);
            }
        }

        System.out.println(ans.toString());
    }
}
