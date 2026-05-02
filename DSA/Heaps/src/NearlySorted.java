import java.util.PriorityQueue;

public class NearlySorted {
    public static void main(String[] args){
        int[] arr = {2, 3, 1, 4};
        int k = 2;
        int n = arr.length;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0 ; i < k + 1 ; i++){
            pq.offer(arr[i]);
        }

        int index = 0;
        for(int i = k + 1 ; i < n ; i++){
            arr[index] = pq.poll();
            index++;
            pq.offer(arr[i]);
        }

        while(!pq.isEmpty()){
            arr[index] = pq.poll();
            index++;
        }


        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
