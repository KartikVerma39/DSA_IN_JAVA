import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args){
        String[] strs = {"flower" , "flow" , "fly"};
        Arrays.sort(strs);

        String a = strs[0];
        String b = strs[strs.length - 1];

        StringBuilder ans = new StringBuilder();

        for(int i = 0 ; i < a.length() ; i++){
            if(a.charAt(i) == b.charAt(i)){
                ans.append(a.charAt(i));
            }
            else{
                break;
            }
        }

        System.out.println(ans.toString());
    }
}
