public class MaximumPointsYouCanObtainFromCards {
    public static void main(String[] args){
        int[] cardPoints = {1,2,3,4,5,6,1};
        int k = 3;
        int n = cardPoints.length;

        int lSum = 0;
        int rSum = 0;

        for(int i = 0 ; i < k ; i++){
            lSum += cardPoints[i];
        }

        int total = lSum;
        int rPointer = n - 1;

        for(int i = k - 1 ; i >= 0 ; i--){
            lSum -= cardPoints[i];
            rSum += cardPoints[rPointer];
            total = Math.max(lSum + rSum , total);
            rPointer--;
        }

        System.out.println(total);
    }
}
