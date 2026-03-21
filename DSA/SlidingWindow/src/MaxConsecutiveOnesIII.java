public class MaxConsecutiveOnesIII {
    public static void main(String[] args){
        int[] arr = {1,1,1,0,0,0,1,1,1,1,0};
        int i = 0;
        int j = 0;
        int k = 2;
        int n = arr.length;
        int maxLen = 0;
        int zeros = 0;

        while(i<n){
            if(arr[i] == 0){
                zeros++;
            }
            if(zeros > k){
                if(arr[j] == 0){
                    zeros--;
                }
                j++;
            }
            if(zeros <= k){
                maxLen = Math.max(maxLen,i-j+1);
            }
            i++;
        }

        System.out.println(maxLen);
    }
}
