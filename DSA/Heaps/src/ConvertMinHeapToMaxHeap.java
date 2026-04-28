public class ConvertMinHeapToMaxHeap {
    public static void heapify(int[] arr , int idx){
        int size = arr.length;

        while(idx < size){
            int largest = idx;
            int leftIdx = (idx * 2) + 1;
            int rightIdx = (idx * 2) + 2;

            if(leftIdx < size && arr[leftIdx] > arr[largest]){
                largest = leftIdx;
            }
            if(rightIdx < size && arr[rightIdx] > arr[largest]){
                largest = rightIdx;
            }

            if(idx != largest){
                int temp = arr[largest];
                arr[largest] = arr[idx];
                arr[idx] = temp;
                idx = largest;
            }
            else{
                break;
            }
        }
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4};

        int size = arr.length;

        for(int i = (size/2) - 1 ; i >= 0 ; i--){
            heapify(arr , i);
        }

        for(int i = 0 ; i < size ; i++){
            System.out.println(arr[i]);
        }
    }
}
