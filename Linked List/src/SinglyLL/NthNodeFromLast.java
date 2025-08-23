package SinglyLL;

public class NthNodeFromLast {
    public static class Node {
        int data;
        Node next;

        Node (int data){
            this.data = data;
        }
    }
    public static Node NthNode(Node head,int n){
        Node temp = head;
        int size = 0;
        while (temp!=null){
            size++;
            temp = temp.next;
        }
        int m = size - n + 1;
        temp = head;
        for (int i = 1; i <= m - 1; i++) {
            temp = temp.next;
        }
        return temp;
    }
    public static Node NthNode1(Node head,int n){
        Node slow = head;
        Node fast = head;

        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }

        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(7);
        Node d = new Node(2);

        a.next = b;
        b.next = c;
        c.next = d;
        // using the first method
        /*
        Node temp = NthNode(a,2);
        System.out.println(temp.data);

         */
        // using the second method
        Node temp = NthNode1(a,2);
        System.out.println(temp.data);
    }
}
