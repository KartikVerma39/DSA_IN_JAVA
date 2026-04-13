import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args){
        int[] nums = {1,2,3};

        int n = nums.length;

        int subsets = 1 << n;

        List<List<Integer>> list = new ArrayList<>();

        for(int i = 0 ; i < subsets ; i++){
            List<Integer> subset = new ArrayList<>();
            for(int j = 0 ; j < n ; j++){
                if((i & (1 << j)) != 0){
                    subset.add(nums[j]);
                }
            }
            list.add(subset);
        }


        for(List<Integer> subset : list){
            System.out.println(subset);
        }
    }
}
