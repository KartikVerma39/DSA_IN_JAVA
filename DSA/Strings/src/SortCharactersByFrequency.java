import java.util.HashMap;
import java.util.PriorityQueue;

public class SortCharactersByFrequency {
    public static void main(String[] args){
        String s = "tree";

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i = 0 ; i < s.length() ; i++){
            map.put(s.charAt(i) , map.getOrDefault(s.charAt(i),0) + 1);
        }

        PriorityQueue<Character> pq = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));

        pq.addAll(map.keySet());

        StringBuilder ans = new StringBuilder();

        while(!pq.isEmpty()){
            char ch = pq.poll();
            int freq = map.get(ch);

            for(int i = 0 ; i < freq ; i++){
                ans.append(ch);
            }
        }

        System.out.println(ans.toString());

    }
}
