public class ValidAnagram {
    public static void main(String[] args){
        String s = "cat";
        String t = "act";

        int[] freq = new int[26];

        for(int i = 0 ; i < s.length() ; i++){
            freq[s.charAt(i) - 'a']++;
        }


        for(int i = 0 ; i < t.length() ; i++){
            freq[t.charAt(i) - 'a']--;
            if(freq[t.charAt(i) - 'a'] < 0){
                System.out.println("False");
                return;
            }
        }

        System.out.println("True");
    }
}
