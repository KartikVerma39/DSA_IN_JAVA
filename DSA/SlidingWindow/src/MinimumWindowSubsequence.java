public class MinimumWindowSubsequence {
    public static void main(String[] args){
        String s = "geeksforgeeks";
        String t = "eksrg";


        int i = 0;
        int j = 0;

        int minLen = Integer.MAX_VALUE;
        String minSubsequence = "";

        int n = s.length();
        int m = t.length();

        while(i < n){

            while(i < n){
                if(s.charAt(i) == t.charAt(j)){
                    j++;
                    if(j == m) {
                        break;
                    }
                }
                i++;
            }

            if(j < m){
                break;
            }

            int end = i;
            j = m - 1;

            while(i >= 0) {
                if (s.charAt(i) == t.charAt(j)) {
                    j--;

                    if (j < 0) {
                        break;
                    }
                }
                i--;
            }

            int start = i;

            if(minLen > end - start + 1){
                minLen = end - start + 1;
                minSubsequence = s.substring(start,end + 1);
            }

            i = start + 1;
            j = 0;
        }

        System.out.println(minSubsequence);
    }
}
