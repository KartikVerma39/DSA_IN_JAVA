public class SwapFirstAndLastCharacterOfString {
    public static void main(String[] args){
        String s = "Code Quotient";
        StringBuilder ans = new StringBuilder();
        int n = s.length();

        for(int i = 0 ; i < s.length() ; i++) {
            StringBuilder temp = new StringBuilder();
            while (i < n && s.charAt(i) != ' ') {
                temp.append(s.charAt(i));
                i++;
            }

            if (temp.length() > 0) {
                char t = temp.charAt(0);
                temp.setCharAt(0, temp.charAt(temp.length() - 1));
                temp.setCharAt(temp.length() - 1, t);
                ans.append(temp.toString());
                ans.append(" ");
            }
        }

        System.out.println(ans.toString().trim());
    }
}
