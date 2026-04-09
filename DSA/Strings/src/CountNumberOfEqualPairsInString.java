import java.util.HashMap;

public class CountNumberOfEqualPairsInString {
    public static void main(String[] args){
        String s = "kaartik";

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i = 0 ; i < s.length() ; i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }


        int pairs = 0;
        for(Character it:map.keySet()){
            pairs += (map.get(it) * map.get(it));
        }


        System.out.println(pairs);
    }
}
