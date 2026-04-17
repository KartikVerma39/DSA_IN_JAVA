public class CapitalizeEachWordOfTheString {
    public static void main(String[] args){
        String s = "code quotient";
        int n = s.length();
        StringBuilder ans = new StringBuilder();

        for(int i = 0 ; i < s.length() ; i++){
            StringBuilder temp = new StringBuilder();
            while(i < n && s.charAt(i) != ' '){
                temp.append(s.charAt(i));
                i++;
            }

            if(temp.length() > 0){
                temp.setCharAt(0,Character.toUpperCase(temp.charAt(0)));
                ans.append(temp);
                ans.append(" ");
            }
        }

        System.out.println(ans.toString().trim());
    }
}
