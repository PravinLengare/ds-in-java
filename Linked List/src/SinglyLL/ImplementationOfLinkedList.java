package SinglyLL;

public class ImplementationOfLinkedList {
    public static class Node {
        int data;
        Node next;

        Node (int data){
            this.data = data;
        }
    }

    public static class LinkedList{
        Node head = null;
        Node tail = null;
        int size = 0;

        public void insertAtStart(int val){
            Node newNode = new Node(val);
            if (head == null){
                head = newNode;
                tail = newNode;
            }
            Node temp = head;
            newNode.next = head;
            head = newNode;
            size++;
        }
        public void insertAtEnd(int val){

            Node newNode = new Node(val);
            if (head == null){
                head = newNode;
                tail = newNode;
            }
            tail.next = newNode;
            tail = newNode;
            size++;
        }
        public void insert(int val,int idx){
            Node newNode = new Node(val);
            Node temp = head;
            for (int i = 1; i <=idx-1 ; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            if (temp == null){
                head = newNode;
                tail = newNode;
            }
            else if (idx == 0) {
                insertAtStart(val);

            }
            else if (idx == size) {
                insertAtEnd(val);
            }

        }

        public void printLL(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;

            }
        }


    }
    public static void main(String[] args) {
        LinkedList newLL = new LinkedList();
        System.out.println(newLL.head);
        System.out.println(newLL.tail);
        newLL.insertAtStart(6);
        newLL.insertAtEnd(5);
        newLL.printLL();
        System.out.println();
        newLL.insert(9,0);
        newLL.printLL();
        System.out.println();
        newLL.insert(2,4);
        System.out.println();
        newLL.printLL();
        newLL.insert(4,2);
        System.out.println();
        newLL.printLL();
        newLL.printLL();


    }
}
