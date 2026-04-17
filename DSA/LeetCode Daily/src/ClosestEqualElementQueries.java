import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collections;

public class ClosestEqualElementQueries {
    public static void main(String[] args){
        int[] nums = {1,3,1,4,1,3,2};
        int[] queries = {0,3,5};

        int n = nums.length;

        Map<Integer,List<Integer>> map = new HashMap<>();

        for(int i = 0 ; i < n ; i++){
            if(map.containsKey(nums[i])){
                map.get(nums[i]).add(i);
            }
            else{
                map.put(nums[i],new ArrayList<>());
                map.get(nums[i]).add(i);
            }
        }

        List<Integer> list = new ArrayList<>();

        for(int i = 0 ; i < queries.length ; i++){
            int idx = queries[i];
            int ele = nums[idx];

            List<Integer> temp = map.get(ele);

            if(temp.size() == 1){
                list.add(-1);
                continue;
            }

            int pos = Collections.binarySearch(temp,idx);

            int right = temp.get((pos - 1 + temp.size())%temp.size());
            int left = temp.get((pos + 1)%temp.size());

            int dist1 = Math.abs(idx - left);
            int dist2 = Math.abs(idx - right);

            dist1 = Math.min(dist1 , n - dist1);
            dist2 = Math.min(dist2 , n - dist2);

            list.add(Math.min(dist1,dist2));
        }


        System.out.println(list);
    }
}
