public class NumberOfSubstringsContainingAllThreeCharacters {
    public static void main(String[] args){
        String s = "abcabc";
        int total = 0;
        int[] freq = {-1,-1,-1};
        int n = s.length();
        for(int i = 0 ; i < n ; i++){
            char ch = s.charAt(i);
            freq[ch - 'a'] = i;
            if(freq[0] != -1 && freq[1] != -1 && freq[2] != -1) {
                total += 1 + Math.min(Math.min(freq[0], freq[1]), freq[2]);
            }
        }

        System.out.println(total);
    }
}
