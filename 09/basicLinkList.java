public class basicLinkList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static Node insertBegin(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode; // new head of the list
    }

    static Node insertEnd(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            return newNode; // new head of the list
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head; // head remains unchanged
    }

    static Node deleteValue(Node head, int key) {
        if (head == null) {
            return null;
        }
        if (head.data == key) {
            return head.next; // new head of the list
        }
        Node temp = head;
        while (temp.next != null && temp.next.data != key) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next; // bypass the node to be deleted
        }
        return head; // head remains unchanged
    }


    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Linked List:");
        printList(head);

        head = insertBegin(head, 0);
        System.out.println("Linked List after inserting 0 at the beginning:");
        printList(head);

        head = insertEnd(head, 6);
        System.out.println("Linked List after inserting 6 at the end:");
        printList(head);

        head = deleteValue(head, 3);
        System.out.println("Linked List after deleting value 3:");  
        printList(head);
    }
}
