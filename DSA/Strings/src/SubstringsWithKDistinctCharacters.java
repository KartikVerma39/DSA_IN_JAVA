import java.util.HashMap;

public class SubstringsWithKDistinctCharacters {
    public static int atleast(String s , int k){
        HashMap<Character,Integer> map = new HashMap<>();
        int j = 0;
        int i = 0;
        int distinctCount = 0;
        int total = 0;
        while(i<s.length()){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0) + 1);
            if(map.get(s.charAt(i)) == 1){
                distinctCount++;
            }
            while(distinctCount == k){
                total += s.length() - i;
                map.put(s.charAt(j),map.get(s.charAt(j)) - 1);
                if(map.get(s.charAt(j)) == 0){
                    distinctCount--;
                }
                j++;
            }
            i++;
        }

        return total;
    }
    public static void main(String[] args){
        String s = "aba";
        int k = 2;
        System.out.println(atleast(s,k) - atleast(s,k + 1));
    }
}
