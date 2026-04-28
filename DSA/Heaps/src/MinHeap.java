import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinHeap {
    List<Integer> heap;

    public MinHeap(){
        heap = new ArrayList<>();
    }

    public MinHeap(int[] nums){
        heap = new ArrayList<>();

        for(int i = 0 ; i < nums.length ; i++){
            heap.add(nums[i]);
        }

        for(int i = (nums.length/2) - 1 ; i>=0 ; i--){
            heapify(i);
        }
    }

    public void heapify(int x){
        int size = heap.size();

        while(x < size){
            int smallest = x;
            int leftIdx = (x * 2) + 1;
            int rightIdx = (x * 2) + 2;

            if(leftIdx < size && heap.get(leftIdx) < heap.get(smallest)){
                smallest = leftIdx;
            }
            if(rightIdx < size && heap.get(rightIdx) < heap.get(smallest)){
                smallest = rightIdx;
            }

            if(smallest != x){
                Collections.swap(heap , smallest , x);
                x = smallest;
            }
            else{
                break;
            }
        }
    }

    public void insert(int x){
        heap.add(x);

        int size = heap.size();
        int idx = size - 1;

        while(idx > 0){
            int parentIdx = (idx - 1)/2;
            if(heap.get(parentIdx) > heap.get(idx)){
                Collections.swap(heap,parentIdx,idx);
                idx = parentIdx;
            }
            else{
                break;
            }
        }
    }

    public int pop(){

        if(heap.size() == 0) return -1;

        int size = heap.size();

        int first = heap.get(0);
        int last = heap.remove(size - 1);

        if(heap.size() > 0){
            heap.set(0,last);
            heapify(0);
        }

        return first;
    }

    public int size(){
        return heap.size();
    }

    public int peek(){
        if(heap.size() == 0){
            return  -1;
        }
        return heap.get(0);
    }

    public void print(){
        for(int i = 0 ; i < heap.size() ; i++){
            System.out.println(heap.get(i));
        }
    }

    public static void main(String[] args){
        MinHeap mh = new MinHeap();

        mh.insert(100);
        mh.insert(200);
        mh.insert(50);
        mh.insert(500);

        System.out.println("-------- HEAP START ---------");
        mh.print();
        System.out.println("-------- HEAP END ---------");

        System.out.println(mh.pop());
        System.out.println(mh.peek());;

        System.out.println("-------- HEAP START ---------");
        mh.print();
        System.out.println("-------- HEAP END ---------");

    }
}
