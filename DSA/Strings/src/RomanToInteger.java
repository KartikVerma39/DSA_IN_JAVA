import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args){
        HashMap<Character,Integer> map = new HashMap<>();
        String roman = "MCMXCIV";

        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int answer = 0;

        for(int i = 0 ; i < roman.length() ; i++){
            int value = map.get(roman.charAt(i));
            if(i < roman.length() - 1 && value < map.get(roman.charAt(i + 1))){
                answer -= value;
            }
            else{
                answer += value;
            }
        }

        System.out.println(answer);

    }
}
