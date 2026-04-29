import java.util.PriorityQueue;

public class KthSmallestElementInArray {
    public static void main(String[] args){
        int[] arr = {10, 5, 4, 3, 48, 6, 2, 33, 53, 10};
        int k = 4;

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a);

        for(int i = 0; i < k ; i++){
            pq.offer(arr[i]);
        }

        for(int i = k ; i < arr.length ; i++){
            if(arr[i] < pq.peek()){
                pq.poll();
                pq.offer(arr[i]);
            }
        }

        System.out.println(pq.peek());
    }
}
