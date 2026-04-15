import java.util.ArrayList;

public class PrintAllPrimeFactorsOfANumber {
    public static void main(String[] args){
        int n = 100;
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 2 ; i * i <= n ; i++){
            if(n%i == 0){
                list.add(i);
                while(n%i == 0){
                    n /= i;
                }
            }
        }

        if(n != 1){
            list.add(n);
        }

        System.out.println(list);
    }
}
