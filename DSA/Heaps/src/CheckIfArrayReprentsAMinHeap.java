public class CheckIfArrayReprentsAMinHeap {
    public static void main(String[] args){
        int[] arr = {9, 15, 10, 7, 12, 11};

        int size = arr.length;

        for(int i = 0 ; i < size ; i++){
            int parent = arr[i];
            int leftIdx = (i * 2) + 1;
            int rightIdx = (i * 2) + 2;

            if(leftIdx < size && arr[leftIdx] < parent){
                System.out.println("False");
                return;
            }
            if(rightIdx < size && arr[rightIdx] < parent){
                System.out.println("False");
                return;
            }
        }

        System.out.println("True");
    }
}
