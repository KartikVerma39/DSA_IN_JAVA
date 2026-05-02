import java.util.*;

public class MergeKSortedLists {

    // Definition for singly-linked list
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    // 🔥 You implement this
    public static ListNode mergeKLists(ListNode[] lists) {

        PriorityQueue<ListNode> pq  = new PriorityQueue<>((a,b)->a.val - b.val);

        for(int i = 0 ; i < lists.length ; i++){
            if(lists[i] != null){
                pq.offer(lists[i]);
            }
        }

        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        while(!pq.isEmpty()){
            curr.next = pq.poll();
            curr = curr.next;

            if(curr.next != null){
                pq.offer(curr.next);
            }
        }

        return dummy.next;
    }

    // Helper: build linked list from array
    public static ListNode buildList(int[] arr) {
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        for (int x : arr) {
            curr.next = new ListNode(x);
            curr = curr.next;
        }

        return dummy.next;
    }

    // Helper: print linked list
    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        // Input: [[1,4,5],[1,3,4],[2,6]]
        int[][] input = {
                {1, 4, 5},
                {1, 3, 4},
                {2, 6}
        };

        // Convert to ListNode[]
        ListNode[] lists = new ListNode[input.length];

        for (int i = 0; i < input.length; i++) {
            lists[i] = buildList(input[i]);
        }

        // Call your function
        ListNode result = mergeKLists(lists);

        // Print result
        printList(result);
    }
}