package LinkedList;

class Linked_List1 {
    private Node head;
    private Node tail;
    private int length;

    public Linked_List1(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;

    }

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }

    }

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void append(int value){
        Node newNode = new Node(value);
        if (length == 0){
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }
    public Node removeLast(){
        if (length == 0)  return null;
        Node temp = head;
        Node pre = head;
        while (temp.next!=null){

            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if(length == 0){
            head = null;
            tail = null;
        }
        return temp;

    }
    public void prepend(int value){
        Node newNode = new Node(value);
        if (length == 0){
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }
    public Node removeFirst(){
        if (length == 0) return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if(length == 0){
            tail = null;
        }

        return temp;

    }
    public Node get(int index){
        if (index < 0 || index >= length){
            return null;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public boolean set(int index,int value){
            Node temp = get(index);
            if (temp!=null){
                temp.value = value;
                return true;
            }
            return false;
    }
    // Insert a node at index
    public boolean insert(int index,int value){
        if(index < 0  || index > length)  return false;
        if(index == 0){
            prepend(value);
        }
        if (index == length){
            append(value);
        }

        Node newNode = new Node(value);
        Node temp = get(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
    return true;
    }

    public Node remove(int index){
        if(index < 0  || index >= length)  return null;
        if (index == 0){
            return removeFirst();
        }
        if(index == length - 1){
            return removeLast();
        }

        Node prev = get(index - 1);
        Node temp = prev.next;
        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }
    public void reverse(){
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;
        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }
}
public class GetAndSetMethod {
    public static void main(String[] args) {
        Linked_List1 my_linked_list = new Linked_List1(11);
        my_linked_list.append(3);
        my_linked_list.append(27);
        my_linked_list.append(7);
//        System.out.print("The get node is :"+my_linked_list.get(2).value + "\n");
//        System.out.println("The set node is :"+my_linked_list.set(1,4));
//        System.out.println("The removed node is :"+my_linked_list.remove(2).value);
        my_linked_list.reverse();
        my_linked_list.printList();


        // for insert
//        my_linked_list.append(2);
//        my_linked_list.insert(1,1);
//        my_linked_list.printList();


    }
}
