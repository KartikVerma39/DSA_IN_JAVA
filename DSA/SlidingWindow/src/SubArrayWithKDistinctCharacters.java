import java.util.HashMap;

public class SubArrayWithKDistinctCharacters {
    public static int atMost(int[] nums , int k){
        int i = 0;
        int j = 0;
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int total = 0;

        while(i < n){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

            if(map.size() > k){
                while(j<=i && map.size() > k){
                    map.put(nums[j],map.getOrDefault(nums[j],0) - 1);
                    if(map.get(nums[j]) == 0){
                        map.remove(nums[j]);
                    }
                    j++;
                }
            }

            if(map.size() <= k){
                total += i - j + 1;
            }
            i++;

        }
        return total;
    }
    public static void main(String[] args){
        int[] nums = {1,2,1,2,3};
        int k = 2;
        System.out.println(atMost(nums , k) - atMost(nums , k - 1));
    }
}
