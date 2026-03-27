import java.util.HashMap;

public class LongestSubstringWithKUniques {
    public static void main(String[] args){
        String s = "aabacbebebe";
        int k = 3;

        int i = 0;
        int j = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        int n = s.length();
        int count = 0;
        int maxLen = 0;


        while(i<n){
            if(count > 3){
                map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0) - 1);
                if(map.get(s.charAt(j)) == 0){
                    map.remove(s.charAt(j));
                    count--;
                }
                j++;
            }

            if(!map.containsKey(s.charAt(i))){
                count++;
            }

            if(count == k){
                maxLen = Math.max(maxLen ,i - j + 1);
            }

            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0) + 1);
            i++;
        }

        System.out.println(maxLen);
    }
}
