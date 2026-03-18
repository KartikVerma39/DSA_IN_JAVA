public class LongestPallindromicSubstring {

    public static boolean checkPall(String s , int i , int j , Boolean[][] dp){
        if(i >= j){
            return true;
        }

        if(dp[i][j] != null){
            return dp[i][j];
        }

        if(s.charAt(i) == s.charAt(j)){
            dp[i][j] = checkPall(s,i+1,j-1,dp);
            return dp[i][j];
        }
        else{
            dp[i][j] = false;
        }

        return dp[i][j];

    }

    public static void main(String[] args){
        String s = "abaab";
        int n = s.length();
        Boolean[][] dp = new Boolean[n][n];
        int maxLen = 0;
        int startPoint = 0;

        for(int i = 0 ; i < n ; i++){
            for(int j = i ; j < n ; j++){
                if(checkPall(s , i , j , dp)){
                    if(maxLen < j - i + 1){
                        maxLen = j - i + 1;
                        startPoint = i;
                    }
                }
            }
        }

        System.out.println(s.substring(startPoint , startPoint + maxLen));
    }
}
