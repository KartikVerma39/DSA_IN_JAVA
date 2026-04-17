public class FindOccurencesOfPallindrome {
    public static void main(String[] args){
        String s = "Mom and Dad are my best friends";
        int count = 0;
        int n = s.length();

        for(int i = 0 ; i < n ; i++){
            StringBuilder temp = new StringBuilder();
            while(i < n && s.charAt(i) != ' '){
                temp.append(s.charAt(i));
                i++;
            }

            if(temp.length() > 0){
                String orig = temp.toString().toLowerCase();
                String rev = temp.reverse().toString().toLowerCase();
                if(orig.equals(rev)){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
