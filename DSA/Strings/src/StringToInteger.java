public class StringToInteger {
    public static void main(String[] args){
        String s = "  1337c0d3  ";
        int sign = 1;
        int i = 0;
        long num = 0;
        s = s.trim();
        if(s.length() == 0){
            System.out.println(0);
            return;
        }

        if(s.charAt(i) == '+' || s.charAt(i) == '-'){
            if(s.charAt(i) == '+'){
                sign = 1;
            }
            else if(s.charAt(i) == '-'){
                sign = -1;
            }
            i++;
        }

        while(i < s.length() && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i) - '0';
            num = num*10 + digit;
            if(sign*num > Integer.MAX_VALUE){
                System.out.println(Integer.MAX_VALUE);
                return;
            }
            else if(sign*num < Integer.MIN_VALUE){
                System.out.println(Integer.MIN_VALUE);
                return;
            }
            i++;
        }

        System.out.println((int)sign*num);
    }
}
