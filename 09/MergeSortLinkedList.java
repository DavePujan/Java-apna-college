// lc 148. Sort List
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class MergeSortLinkedList {
        
    public ListNode sortList(ListNode head) {

        if (head == null || head.next == null) return head;

        ListNode mid = getMid(head);
        ListNode right = mid.next;
        mid.next = null;
        ListNode leftSorted = sortList(head);
        ListNode rightSorted = sortList(right);

        return merge(leftSorted,rightSorted);
    }

    public static ListNode getMid(ListNode head){
        ListNode slow = head, fast = head.next;
        while(fast!= null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static ListNode merge(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(-1);
        ListNode temp= dummy;
        while(l1!=null && l2!=null){
            if(l1.val <= l2.val){
                temp.next = l1;
                l1 = l1.next;
            }else{
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }
        if(l1!=null) temp.next=l1;
        if(l2!=null) temp.next=l2;
        return dummy.next;
    }

    public static void main(String[] args) {
        MergeSortLinkedList m = new MergeSortLinkedList();
        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);

        ListNode sortedHead = m.sortList(head);

        // Print the sorted linked list
        ListNode temp = sortedHead;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}