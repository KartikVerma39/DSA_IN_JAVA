public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args){
        String s = "AABABBA";
        int[] freq = new int[26];
        int i = 0;
        int j = 0;
        int k = 1;
        int maxFreq = 0;
        int maxLen = 0;
        int n = s.length();
        while(i<n){
            char ch = s.charAt(i);
            freq[ch - 'A']++;
            maxFreq = Math.max(maxFreq,freq[ch - 'A']);
            if(i - j + 1 - maxFreq > k){
                freq[s.charAt(j) - 'A']--;
                j++;
            }
            if(i- j + 1 - maxFreq <= k){
                maxLen = Math.max(maxLen , i - j + 1);
            }
            i++;
        }

        System.out.println(maxLen);
    }
}
