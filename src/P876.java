public class P876 {
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
    public ListNode middleNode(ListNode head) {
        int sum =0, med;
        ListNode temp = head;
        while (temp != null){
            sum += 1;
            temp = temp.next;
        }
        temp = head;
        med = sum/2;
        sum = 0;
        while (temp != null){
            if (sum == med) return temp;
            sum += 1;
            temp = temp.next;
            if (sum == med) return temp;
        }
        return null;
    }

    // 快慢指针
    public ListNode middleNode_2(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
