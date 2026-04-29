public class KthLargestElementInArray {
    public static void main(String[] args){
        int[] arr = {3,2,1,5,6,4};
        int k = 2;

        int[] heap = new int[k];

        for(int i = 0 ; i < k ; i++){
            heap[i] = arr[i];
        }

        for(int i = (k/2) - 1 ; i >= 0 ; i--){
            heapify(heap, i);
        }

        for(int i = k ; i < arr.length ; i++){
            if(heap[0] < arr[i]){
                heap[0] = arr[i];
                heapify(heap , 0);
            }
        }

        System.out.println(heap[0]);
    }

    public static void heapify(int[] heap , int x){
        int size = heap.length;

        while(x < size){
            int smallest = x;
            int leftIdx = (2 * x) + 1;
            int rightIdx = (2 * x) + 2;

            if(leftIdx < size && heap[leftIdx] < heap[smallest]){
                smallest = leftIdx;
            }
            if(rightIdx < size && heap[rightIdx] < heap[smallest]){
                smallest = rightIdx;
            }

            if(smallest != x){
                int temp = heap[smallest];
                heap[smallest] = heap[x];
                heap[x] = temp;
                x = smallest;
            }
            else{
                break;
            }
        }
    }
}
