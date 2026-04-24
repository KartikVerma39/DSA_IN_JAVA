public class FurthestPointFromOrigin {
    public static void main(String[] args){
        String s = "L__R__R";

        int countL = 0;
        int countR = 0;

        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == 'L'){
                countL++;
            }
            else if(s.charAt(i) == 'R'){
                countR++;
            }
        }

        if(countR == 0 && countL == 0){
            System.out.println(s.length());
        }

        int point = 0;

        for(int i = 0  ; i < s.length() ; i++){
            if(countL >= countR) {
                if (s.charAt(i) == 'L' || s.charAt(i) == '_') {
                    point--;
                }
                else if(s.charAt(i) == 'R'){
                    point++;
                }
            }
            if(countR > countL) {
                if (s.charAt(i) == 'R' || s.charAt(i) == '_') {
                    point++;
                }
                else if(s.charAt(i) == 'L'){
                    point--;
                }
            }
        }

        System.out.println(point);
    }
}
