public class P19 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode right = head, left = head;
        while (n > 0) {
            right = right.next;
            n--;
        }
        if (right == null) {
            assert head != null;
            head = head.next;
        }
        else {
            while (right.next != null) {
                left = left.next;
                right = right.next;
            }
            left.next = left.next.next;
        }
        return head;
    }
}
