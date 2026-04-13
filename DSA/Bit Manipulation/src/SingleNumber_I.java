public class SingleNumber_I {
    public static void main(String[] args){
        int[] arr = {2,2,1,3,4,1,4};
        int num = arr[0];

        for(int i = 1 ; i < arr.length ; i++){
            num ^= arr[i];
        }

        System.out.println(num);
    }
}
