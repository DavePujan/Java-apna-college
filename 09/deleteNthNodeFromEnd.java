public class deleteNthNodeFromEnd {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node removeNth(Node head, int n) {
    Node dummy = new Node(0);
    dummy.next = head;

    Node fast = dummy, slow = dummy;

    for (int i = 0; i < n; i++) fast = fast.next;

    while (fast.next != null) {
        fast = fast.next;
        slow = slow.next;
    }

    slow.next = slow.next.next;
    return dummy.next;
}

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        int n = 2;
        head = removeNth(head, n);

        // Print the updated linked list
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
}
}