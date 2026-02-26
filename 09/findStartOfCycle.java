public class findStartOfCycle {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node findCycleStart(Node head) {
        Node slow = head, fast = head;

        // Step 1: Detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                // Step 2: Find cycle start
                Node ptr = head;
                while (ptr != slow) {
                    ptr = ptr.next;
                    slow = slow.next;
                }
                return ptr; // start of cycle
            }
        }
        return null; // no cycle
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // create cycle: 5 → 3
        head.next.next.next.next.next = head.next.next;

        Node cycleStart = findCycleStart(head);
        if (cycleStart != null) {
            System.out.println("Cycle starts at node with data: " + cycleStart.data);
        } else {
            System.out.println("No cycle detected in the linked list.");
        }
    }
}
