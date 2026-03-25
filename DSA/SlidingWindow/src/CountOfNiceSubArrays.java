public class CountOfNiceSubArrays {
    public static void main(String[] args){
        int[] nums = {1,1,2,1,1};
        int k = 3;
        System.out.println(atMost(nums , k) - atMost(nums , k - 1));
    }

    public static int atMost(int[] nums , int k){
        int i = 0;
        int j = 0;
        int totall = 0;
        int odds = 0;
        int n = nums.length;

        while(i < n){
            if(nums[i]%2 != 0){
                odds++;
            }

            while(odds > k){
                if(nums[j]%2 != 0){
                    odds--;
                }
                j++;
            }

            totall += i - j + 1;
            i++;
        }

        return totall;
    }
}
