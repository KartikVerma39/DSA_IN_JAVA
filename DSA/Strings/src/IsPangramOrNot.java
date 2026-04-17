public class IsPangramOrNot {
    public static void main(String[] args){
        String s = "The quick brown fox jumps over the lazy dog";
        s = s.toLowerCase();


        boolean[] check = new boolean[26];

        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);

            if(ch >= 'a' && ch <= 'z'){
            check[s.charAt(i) - 'a'] = true;
            }
        }


        for(int i = 0 ; i < 26 ; i++){
            if(!check[i]){
                System.out.println("False");
                return;
            }
        }

        System.out.println("True");
    }
}
