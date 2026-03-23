import java.util.HashMap;

public class FruitIntoBaskets {
    public static void main(String[] args){
        int[] fruits = {1,2,3,2,2};
        int i = 0;
        int j = 0;
        int maxLen = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = fruits.length;

        while(i < n){
            map.put(fruits[i],map.getOrDefault(fruits[i] , 0) + 1);
            if(map.size() > 2){
                map.put(fruits[j],map.getOrDefault(fruits[j],0) - 1);
                if(map.get(fruits[j]) == 0){
                    map.remove(fruits[j]);
                }
                j++;
            }

            if(map.size() <= 2){
                maxLen = Math.max(maxLen,i - j + 1);
            }

            i++;
        }

        System.out.println(maxLen);
    }
}
