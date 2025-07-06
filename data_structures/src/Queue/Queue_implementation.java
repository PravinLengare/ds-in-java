package Queue;


class Queue{
private  Node first;
private Node last;
private int length;

public Queue (int value){
    Node newNode = new Node(value);
    first = newNode;
    last = newNode;
    length= 1;

}

class Node{
    int value;
    Node next;

    public Node(int value){
        this.value = value;
    }
}


    public void printQueue(){
    System.out.println("The Queue is : ");
    Node temp = first;
    while(temp!=null){
        System.out.println(temp.value);
        temp = temp.next;
    }
}

    public void enqueue(int value){
        Node newNode = new Node(value);
        if(length == 0){
            first = newNode;
            last = newNode;
        }
        else {
            last.next = newNode;
            last = newNode;
        }
        length++;
    }
    public Node dequeue(){
        if(length == 0 ){
            return  null;
        }
        Node temp = first;
        if(length == 1){
            first = null;
            last = null;
        }
        else {
            first = first.next;
            temp.next = null;
        }
        length--;
        return temp;
    }
}
public class Queue_implementation {
    public static void main(String[] args) {
        Queue my_queue = new Queue(4);
        my_queue.printQueue();

        my_queue.enqueue(5);
        my_queue.printQueue();
        System.out.println("The removed nodes are : ");
        System.out.println(my_queue.dequeue().value);
        System.out.println(my_queue.dequeue().value);
        System.out.println(my_queue.dequeue());

    }
}
