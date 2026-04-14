public class SingleNumberIII {
    public static void main(String[] args){
        int[] nums = {1,1,2,3,3,4};

        int xorr = 0;

        for(int i = 0 ; i < nums.length ; i++){
            xorr ^= nums[i];
        }

        int lastBit = (xorr & (xorr - 1)) ^ xorr;

        int bucket1 = 0;
        int bucket2 = 0;

        for(int i = 0 ; i < nums.length ; i++){
            if((nums[i] & lastBit) != 0){
                bucket1 ^= nums[i];
            }
            else{
                bucket2 ^= nums[i];
            }
        }


        System.out.println(bucket1);
        System.out.println(bucket2);
    }
}
