
public class DoublyLinkedList {
    class Node{
        int data;
        Node previous;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    Node head, tail = null;
    public void addNode(int data) {
        //Create a new node
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
            head.previous = null;
            tail.next = null;
        }
        else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = null;
        }
    }
    public void display() {
        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of doubly linked list: ");
        while(current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {

        DoublyLinkedList d = new DoublyLinkedList();

        d.addNode(10);
        d.addNode(20);
        d.addNode(30);
        d.display();
    }
}
