public class MinimumBitFlipsToConvertNumber {
    public static void main(String[] args){
        int start = 10;
        int goal = 7;

        int need = start ^ goal;
        int needFlips = 0;

        for(int i = 0 ; i < 32 ; i++){
            needFlips += need & 1;
            need = need >> 1;
        }

        System.out.println(needFlips);
    }
}
