import java.util.HashMap;

public class MinimumWindowSubstring {
    public static void main(String[] args){
        String s = "ADOBECODEBANC";
        String t = "ABC";

        HashMap<Character,Integer> map = new HashMap<>();
        int n = s.length();
        int m = t.length();

        for(int i = 0 ; i < m ; i++){
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);
        }

        int minLen = Integer.MAX_VALUE;
        int startIndex = -1;
        int i = 0;
        int j = 0;
        int count = 0;

        while(i < n){
            char ch = s.charAt(i);

            if(map.getOrDefault(ch, 0 ) > 0){
                count++;
            }

            map.put(ch,map.getOrDefault(ch,0) - 1);

            while(j <= i && count == m){
                if(minLen > i-j+1){
                    minLen = i-j+1;
                    startIndex = j;
                }

                map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
                if(map.get(s.charAt(j)) > 0){
                    count--;
                }
                j++;
            }

            i++;
        }

        if(startIndex == -1){
            System.out.println(" ");
        }
        else{
            System.out.println(s.substring(startIndex,startIndex + minLen));
        }

    }
}
