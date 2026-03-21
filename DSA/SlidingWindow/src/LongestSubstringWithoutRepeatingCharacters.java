import java.util.Arrays;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args){
        String s = "pwwkew";
        int[] hashArray = new int[256];
        Arrays.fill(hashArray , -1);

        int i = 0;
        int j = 0;
        int maxLen = 0;

        while(i < s.length()){
            if(hashArray[s.charAt(i)] != -1){
                if(hashArray[s.charAt(i)] >= j){
                    j = hashArray[s.charAt(i)] + 1;
                }
            }

            maxLen = Math.max(i-j+1,maxLen);
            hashArray[s.charAt(i)] = i;
            i++;
        }

        System.out.println(maxLen);
    }
}
