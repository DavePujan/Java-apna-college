//  ll 92 - still wrong - go to E:\DSA TCS\09\reverseSublistLtoR.java

public class reverseLL2 {

    static class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public ListNode reverseBetween(ListNode head, int left, int right) {

         if (head == null || left == right) return head;
         
        int index = left-1;
        int lastIndex = right-1;
        int currIndex=1;

        ListNode temp = head;

        while(currIndex != index){
            temp = temp.next;
            currIndex++;
        }

        ListNode prev = temp;
        ListNode curr = temp.next;

        while(currIndex != lastIndex){
            currIndex++;
            ListNode next= curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return curr;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);    
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original List:");
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
        
        reverseLL2 obj = new reverseLL2();
        head = obj.reverseBetween(head, 2, 4);
        
        System.out.println("Reversed List:");
        current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

}
