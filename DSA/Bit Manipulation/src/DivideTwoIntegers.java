public class DivideTwoIntegers {
    public static void main(String[] args){
        int dividend = 10;
        int divisor = 3;
        boolean sign = true;

        if(dividend == Integer.MIN_VALUE && divisor == -1){
            System.out.println(Integer.MAX_VALUE);
            return;
        }

        if(dividend < 0 && divisor > 0){
            sign = false;
        }

        if (dividend > 0 && divisor < 0) {
            sign = false;
        }

        long n = Math.abs((long)dividend);
        long d = Math.abs((long)divisor);
        long question = 0;


        while(n >= d){
            int count = 0;
            while(n >= (d << (count + 1))){
                count++;
            }

            question += (1 << count);
            n -= (d << count);
        }

        if(question > Integer.MAX_VALUE && sign == true){
            System.out.println(Integer.MAX_VALUE);
            return;
        }

        if(question < Integer.MIN_VALUE && sign == false){
            System.out.println(Integer.MIN_VALUE);
            return;
        }

        if(sign == true){
            System.out.println(question);
        }

        if(sign == false){
            System.out.println(question * -1);
        }

    }
}
