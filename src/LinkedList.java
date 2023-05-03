
    public class LinkedList{
        Node head;
        Node tail;

        public static LinkedList insert(LinkedList l1 , int data){
            Node newNode = new Node(data);
            if (l1.head == null){
                l1.head = newNode;
            }
            else{
                Node last = l1.head;
                while(last.next !=null){
                    last = last.next;
                }
                last.next = newNode;

            }
            return l1;

        }

        public static void print(LinkedList l1){
            Node currentNode = l1.head;
            System.out.println(" Linked List :");
            while (currentNode != null){
                System.out.println(currentNode.data + "  ");
                currentNode = currentNode.next;
            }
        }
        public static void main(String[] args) {

            LinkedList l = new LinkedList();
            l = insert(l, 89);
            l = insert(l, 8);
            l = insert(l, 9);
            l = insert(l, 290);
            l = insert(l, 833);
            l = insert(l, 234);
            l = insert(l, 3);
            l = insert(l, 6);
            l = insert(l, 19);
            print(l);

        }

    }
