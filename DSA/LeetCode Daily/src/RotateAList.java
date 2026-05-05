public class RotateAList {

    // Definition for singly-linked list
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    // Your solution
    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }

        ListNode tail = head;
        int size = 1;

        while (tail.next != null) {
            tail = tail.next;
            size++;
        }

        k = k % size;

        if (k == 0) {
            return head;
        }

        int steps = size - k;
        ListNode curr = head;

        for (int i = 1; i < steps; i++) {
            curr = curr.next;
        }

        ListNode rotate = curr.next;
        curr.next = null;
        tail.next = head;
        head = rotate;

        return head;
    }

    // Helper to print list
    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    // MAIN METHOD
    public static void main(String[] args) {

        // Create list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5)))));

        System.out.print("Original: ");
        printList(head);

        int k = 2;

        head = rotateRight(head, k);

        System.out.print("Rotated: ");
        printList(head);
    }
}