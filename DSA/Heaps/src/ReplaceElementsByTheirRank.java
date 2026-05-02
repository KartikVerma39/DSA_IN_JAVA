import java.util.PriorityQueue;

public class ReplaceElementsByTheirRank {
    public static void main(String[] args){
        int[] arr = {40,10,20,30};

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0] - b[0]);

        for(int i = 0 ; i < arr.length ; i++){
            pq.offer(new int[]{arr[i],i});
        }

        int prev = Integer.MIN_VALUE;
        int[] ans = new int[arr.length];
        int rank = 0;

        for(int i = 0 ; i < arr.length ; i++){
            int[] temp = pq.poll();

            if(prev != temp[0]){
                prev = temp[0];
                rank++;
            }

            ans[temp[1]] = rank;
        }

        for(int i  = 0 ; i < ans.length ; i++){
            System.out.println(ans[i]);
        }
    }
}
