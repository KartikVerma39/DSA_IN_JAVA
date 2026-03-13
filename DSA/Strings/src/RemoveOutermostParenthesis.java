public class RemoveOutermostParenthesis {
    public static void main(String[] args){
        String s = "(()())(())";
        String ans = "";
        int level = 0;

        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == '('){
                if(level > 0){
                    ans += '(';
                }
                level++;
            }
            else if(s.charAt(i) == ')'){
                level--;
                if(level > 0){
                    ans += ')';
                }
            }
        }

        System.out.println(ans);
    }
}
