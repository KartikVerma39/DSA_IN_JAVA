public class FindXOROfANumberFromLtoR {
    public static void main(String[] args){
        int l = 4;
        int r = 8;

        System.out.println(helper(l - 1) ^ helper(r));
    }

    public static int helper(int ele){
        if(ele % 4 == 1){
            return 1;
        }
        else if(ele % 4 == 2){
            return ele+1;
        }
        else if(ele % 4 == 3){
            return 0;
        }
        return ele;
    }
}
