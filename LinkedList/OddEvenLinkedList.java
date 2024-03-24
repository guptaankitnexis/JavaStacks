// package LinkedList;

class Node {
    public int data;
    public Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

public class OddEvenLinkedList {
    public static Node createLinkedList(int[] values) {
        Node head = null;
        Node current = null;

        for (int value : values) {
            if (head == null) {
                head = new Node(value);
                current = head;
            } else {
                current.next = new Node(value);
                current = current.next;
            }
        }

        return head;
    }

    public static Node oddEvenList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node oddNode = head;
        Node evenNode = head.next;
        Node firstEvenNode = head.next;

        while (evenNode != null && evenNode.next != null) {
            oddNode.next = oddNode.next.next;
            evenNode.next = evenNode.next.next;
            oddNode = oddNode.next;
            evenNode = evenNode.next;
        }

        oddNode.next = firstEvenNode;
        return head;
    }

    // Helper function to print the linked list
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example usage:
        int[] values = {1, 2, 3, 4, 5};
        Node head = createLinkedList(values);

        System.out.println("Original list:");
        printList(head);

        Node newHead = oddEvenList(head);

        System.out.println("List after rearranging odd and even nodes:");
        printList(newHead);
    }
}
