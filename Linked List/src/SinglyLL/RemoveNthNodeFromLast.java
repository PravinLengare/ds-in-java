package SinglyLL;

public class RemoveNthNodeFromLast {
    public static class Node {
        int data;
        Node next;

        Node (int data){
            this.data = data;
        }
    }
    public static void printLL(Node head){   // If we print using the head by head = head.next then we will lose our head so we create a var and then by using it we print the whole linked list.
        System.out.println("Printing by using function !");
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void removeNthLast(Node head,int n){
        Node slow = head;
        Node fast = head;

        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }
        if(fast == null){       // handled edge case
            head = head.next;
            return;
        }
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;



    }
    public static void main(String[] args) {
         Node a = new  Node(3);
         Node b = new  Node(5);
         Node c = new  Node(7);
         Node d = new  Node(2);

            a.next = b;
            b.next = c;
            c.next = d;

         removeNthLast(a,2);
         printLL(a);
    }
}
