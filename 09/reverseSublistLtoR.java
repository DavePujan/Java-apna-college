public class reverseSublistLtoR {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node reverseSublist(Node head, int left, int right) {
        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;

        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        Node curr = prev.next;

        for (int i = 0; i < right - left; i++) {
            Node next = curr.next;
            curr.next = next.next;
            next.next = prev.next;
            prev.next = next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        int left = 2, right = 4;
        head = reverseSublist(head, left, right);

        // Print the updated linked list
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}