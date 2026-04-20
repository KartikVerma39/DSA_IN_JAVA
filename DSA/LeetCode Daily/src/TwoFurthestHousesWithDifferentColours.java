public class TwoFurthestHousesWithDifferentColours {
    public static void main(String[] args){
        int[] arr = {1,1,1,6,1,1,1};

        int n = arr.length;
        int maxDistance = Integer.MIN_VALUE;

        if(arr[0] != arr[n-1]){
            System.out.println(n-1);
            return;
        }


        int i = 0;
        int j = n - 1;

        while(i < j){
            if(arr[i] != arr[j]){
                maxDistance = Math.max(maxDistance , j - i);
            }
            i++;
        }

        i = 0;
        j = n - 1;

        while (i < j){
            if(arr[i] != arr[j]){
                maxDistance = Math.max(maxDistance , j - i);
            }
            j--;
        }

        System.out.println(maxDistance);

    }
}
