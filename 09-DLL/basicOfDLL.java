public class basicOfDLL {
    // structure of node in DLL
    class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
            prev = next = null;
        }
    }
}
