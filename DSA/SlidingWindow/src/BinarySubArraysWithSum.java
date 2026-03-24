public class BinarySubArraysWithSum {
    public static void main(String[] args){
        int[] nums = {1,0,1,0,1};
        int goal = 2;
        System.out.println(atMost(nums,goal) - atMost(nums,goal-1));
    }

    public static int atMost(int[] nums , int goal){
        int i = 0;
        int j = 0;
        int total = 0;
        int sum = 0;
        int n = nums.length;
        while(i < n){
            sum += nums[i];
            while(sum > goal){
                sum -= nums[j];
                j++;
            }

            total += i - j + 1;
            i++;
        }

        return total;
    }
}
