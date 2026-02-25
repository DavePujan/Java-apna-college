// head → 10 → 20 → 30 → 40 → null
// insertAtPos(head, 2, 25)
public class insertAtPos {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node insertAtPosition(Node head, int pos, int data) {
        Node newNode = new Node(data);
        if (pos == 0) {
            newNode.next = head;
            return newNode; // new head
        }

        Node curr = head;
        for (int i = 0; i < pos - 1 && curr != null; i++) {
            curr = curr.next;
        }
        if (curr != null) {
            newNode.next = curr.next;
            curr.next = newNode;
        }
        return head; // unchanged head
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        int pos = 2, data = 25;
        head = insertAtPosition(head, pos, data);

        // Print the updated linked list
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}
