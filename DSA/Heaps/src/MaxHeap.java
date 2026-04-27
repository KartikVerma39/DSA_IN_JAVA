import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxHeap {

    List<Integer> heap;

    public MaxHeap(){
        heap = new ArrayList<>();
    }

    public MaxHeap(int[] nums){
        heap = new ArrayList<>();

        for(int i = 0 ; i < nums.length ; i++){
            heap.add(nums[i]);
        }

        for(int i = (heap.size() / 2) - 1 ; i >= 0 ; i--){
            heapify(i);
        }
    }

    public int peek(){
        if(heap.size() == 0){
            return -1;
        }

        return heap.get(0);
    }

    public void heapify(int index){
        int largest = index;
        int size = heap.size();

        while(index < size) {

            int leftChildIdx = 2 * (index) + 1;
            int rightChildIdx = 2 * (index) + 2;

            if (leftChildIdx < size && heap.get(leftChildIdx) > heap.get(largest)) {
                largest = leftChildIdx;
            }

            if (rightChildIdx < size && heap.get(rightChildIdx) > heap.get(largest)) {
                largest = rightChildIdx;
            }

            if (index != largest) {
                Collections.swap(heap, index, largest);
                index = largest;
            } else {
                break;
            }
        }
    }

    public void insert(int ele){
        heap.add(ele);
        int size = heap.size();
        int index = size - 1;

        while(index > 0){
            int parentIdx = (index - 1)/2;
            if(heap.get(parentIdx) < heap.get(index)){
                Collections.swap(heap,parentIdx,index);
                index = parentIdx;
            }
            else{
                break;
            }
        }
    }

    public int pop(){

        int size = heap.size();

        if(0 == size){
            return  -1;
        }

        int root = heap.get(0);
        int last = heap.remove(size - 1);

        if(heap.size() > 0) {
            heap.set(0, last);
            heapify(0);
        }

        return root;
    }

    public void printHeap(){
        for(int i = 0 ; i < heap.size() ; i++){
            System.out.println(heap.get(i));
        }
    }


    public static void main(String[] args){
//        MaxHeap mh = new MaxHeap();
//        mh.insert(200);
//        mh.insert(400);
//        mh.insert(100);
//        System.out.println(mh.pop());
//        System.out.println(mh.peek());
//
//        System.out.println("------- HEAP STARTS -------");
//        mh.printHeap();
//        System.out.println("------- HEAP ENDS -------");


        int[] nums = {20,10,17,30,40};
        MaxHeap mh = new MaxHeap(nums);

        System.out.println("------- HEAP STARTS -------");
        mh.printHeap();
        System.out.println("------- HEAP ENDS -------");

        System.out.println(mh.pop());

        System.out.println("------- HEAP STARTS -------");
        mh.printHeap();
        System.out.println("------- HEAP ENDS -------");

        System.out.println(mh.peek());

    }
}
