public class sumOfBeautyOfAllSubstrings {
    public static void main(String[] args){
        String s = "aabcb";

        int sum = 0;

        for(int i = 0 ; i < s.length() ; i++){
            int[] freq = new int[26];
            for(int j = i ; j < s.length() ; j++){
                freq[s.charAt(j) - 'a']++;
                int min = Integer.MAX_VALUE;
                int max = 0;
                for(int k = 0 ; k < 26 ; k++){
                    max = Math.max(freq[k],max);
                    if(freq[k] > 0){
                        min = Math.min(freq[k],min);
                    }
                }

                int beauty = max - min;
                sum += beauty;
            }
        }


        System.out.println(sum);
    }
}
