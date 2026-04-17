public class ReplaceThisWithThatInString {
    public static void main(String[] args){
        String t = "that";
        String s = "Kartik this is the best and this";
        int n = s.length();
        StringBuilder ans = new StringBuilder();

        for(int i = 0 ; i < n ; i++){
            StringBuilder temp = new StringBuilder();
            while(i < n && s.charAt(i) != ' '){
                temp.append(s.charAt(i));
                i++;
            }

            if(temp.length() > 0){
                String k = temp.toString();
                if(k.equals("this")){
                    k = "that";
                }

                ans.append(k);
                ans.append(" ");
            }
        }

        System.out.println(ans.toString().trim());
    }
}
