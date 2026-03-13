public class ReverseWordsInAString {
    public static void main(String[] args){
        String s = "  This is a good   person   ";
        String reverse = new StringBuilder(s).reverse().toString();
        String answer = "";

        for(int i = 0 ; i < reverse.length() ; i++){
            String words = "";
            while(i < reverse.length() && reverse.charAt(i) != ' '){
                words += reverse.charAt(i);
                i++;
            }
            if(words.length() > 0) {
                String revWords = new StringBuilder(words).reverse().toString();
                answer += revWords;
                answer += " ";
            }
        }


        System.out.println(answer);

    }
}
