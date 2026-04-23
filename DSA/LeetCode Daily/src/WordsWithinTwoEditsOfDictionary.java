import java.util.ArrayList;
import java.util.List;

public class WordsWithinTwoEditsOfDictionary {
    public static void main(String[] args){
        String[] queries = {"word","note","ants","wood"};
        String[] dictionary = {"wood","joke","moat"};

        List<String> ans = new ArrayList<>();

        int n = queries.length;
        int m = dictionary.length;


        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                String q = queries[i];
                String d = dictionary[j];

                int count = 0;

                if(q.length() != d.length()) {
                    continue;
                }

                for(int k = 0 ; k < q.length() ; k++){
                    if(q.charAt(k) != d.charAt(k)){
                        if(count > 2){
                            break;
                        }
                        count++;
                    }
                }

                if(count <= 2){
                    ans.add(q);
                }
            }
        }

        System.out.println(ans);
    }
}
