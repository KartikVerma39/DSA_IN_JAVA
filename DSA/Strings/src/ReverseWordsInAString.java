//public class ReverseWordsInAString {
//    public static void main(String[] args){
//        String s = "  This is a good   person   ";
//        String reverse = new StringBuilder(s).reverse().toString();
//        String answer = "";
//
//        for(int i = 0 ; i < reverse.length() ; i++){
//            String words = "";
//            while(i < reverse.length() && reverse.charAt(i) != ' '){
//                words += reverse.charAt(i);
//                i++;
//            }
//            if(words.length() > 0) {
//                String revWords = new StringBuilder(words).reverse().toString();
//                answer += revWords;
//                answer += " ";
//            }
//        }
//
//
//        System.out.println(answer);
//
//    }
//}



public class ReverseWordsInAString{
    public static void main(String[] args){
        String s = "  This is a good   person   ";
        s = s.trim();
        String word = new StringBuilder(s).reverse().toString();
        StringBuilder ans = new StringBuilder();

        for(int i = 0 ; i < word.length() ; i++){
            StringBuilder temp = new StringBuilder();
            while(i < word.length() && word.charAt(i) != ' '){
                temp.append(word.charAt(i));
                i++;
            }

            if(temp.length() > 0){
                ans.append(temp.reverse());
                ans.append(" ");
            }
        }

        System.out.println(ans.toString().trim());
    }
}