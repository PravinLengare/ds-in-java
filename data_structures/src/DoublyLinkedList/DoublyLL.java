package DoublyLinkedList;

class DoublyLinked_List{

    private Node head;
    private Node tail;
    private int length;


    public DoublyLinked_List(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }


    class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value){
            this.value = value; // We didn't need to write it because in Java, all object references (like next and prev) are initialized to null by default when an object is created.

        }
    }
    public void printList(){
        System.out.println("The DD LL is :");
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+" ");
//            System.out.print(" -> ");
//            System.out.println(" <- ");
            temp = temp.next;
        }
        System.out.println(" -> null");
    }

    public void getHead(){
        System.out.println("The head is :"+head.value);
    }
    public void getTail(){
        System.out.println("The tail is :"+tail.value);
    }
    public void getLength(){
        System.out.println("The length is :"+length);
    }
    // append node at last
    public void append(int value){
        Node newNode = new Node(value);
        if (length == 0){
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }
    public Node removeLast(){
        if (length == 0)  return null;
        Node temp = tail;
        if (length == 1){
            head = null;
            tail = null;
        }
        else {
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;

        }
        length --;
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
            head.prev = newNode;
            head = newNode;
        }
        length++;
    }
    public Node removeFirst() {
        if (length == 0) {
            return null;
        }
        Node temp = head;
        if(length == 1){
            head = null;
            tail = null;
        }
        else {

            head = head.next;
            head.prev = null;
            temp.next = null;
        }
        length--;
        return temp;
    }
    public Node get(int index){
        if (index < 0 || index >= length) return null;

        Node temp  = head;
        if(index < length/2){
            for (int i = 0; i < index; i++){
                temp = temp.next;
            }
        }
        else {
            temp = tail;
            for (int i = length - 1; i > index ; i--) {
                temp = temp.prev;
            }
        }
        return temp;
    }
    public boolean set(int index,int value){
        Node temp = get(index);
        if (temp!= null){
            temp.value = value;
            return true;
        }
        return false;
    }
    public boolean insert(int index,int value){
        if(index < 0 || index > length){
            return false;
        }
        if (index == 0){
            prepend(value);
            return true;
        }
        if (index == length){
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node before = get(index - 1);
        Node after = before.next;

//        newNode.next = before.next;
//        newNode.prev = after.prev;
//        before.next = newNode;
//        after.prev = newNode;
        // method 2 for pointer :-

        after.prev = newNode;
        before.next = newNode;
        newNode.prev = before;
        newNode.next = after;
        length++;
        return true;
    }
    public Node remove(int index){
        if(index < 0 || index >= length){
            return null;
        }
        if (index == 0){
           return removeFirst();

        }
        if (index == length - 1){
             return removeLast();
        }
        Node temp = get(index);

        temp.next.prev = temp.prev;
        temp.prev.next = temp.next;
        temp.next = null;
        temp.prev = null;
        length--;
        return temp;
    }

}
public class DoublyLL {
    public static void main(String[] args) {
        DoublyLinked_List my_linked_list = new DoublyLinked_List(7);
//        my_linked_list.getHead();
//        my_linked_list.getTail();
//        my_linked_list.getLength();
//        my_linked_list.append(3);
//        System.out.println("LL before remove:");
//        my_linked_list.printList();
//        System.out.println("LL after removed:");
//        System.out.println(my_linked_list.removeLast().value);
//        my_linked_list.printList();
//        System.out.println(my_linked_list.removeLast().value);

        /* For prepend :-
        my_linked_list.prepend(2);
        my_linked_list.printList();

        */

        // For remove first

//            my_linked_list.append(4);
//            my_linked_list.printList();
//            my_linked_list.removeFirst();
//            my_linked_list.printList();

        // For Get method :-

//        my_linked_list.append(3);
//        my_linked_list.append(4);
//        my_linked_list.append(5);
//        my_linked_list.printList();
//        System.out.println("The get value is : "+my_linked_list.get(3).value);

        // For set node
//            my_linked_list.append(3);
//            my_linked_list.append(4);
//            my_linked_list.append(5);
//            my_linked_list.printList();
//            System.out.println("After setting value  is :");
//            my_linked_list.set(3,2);
//            my_linked_list.printList();

        // For insert
//                my_linked_list.append(3);
//                my_linked_list.append(4);
//                my_linked_list.append(5);
//                my_linked_list.printList();
//                System.out.println("After setting value  is :");
//                my_linked_list.insert(3,2);
//                my_linked_list.printList();

        // For remove

        my_linked_list.append(2);
        my_linked_list.append(3);
        my_linked_list.append(4);
        my_linked_list.append(5);
        my_linked_list.printList();
        System.out.println("After deleting value is :");
        System.out.println(my_linked_list.remove(3).value);
        my_linked_list.printList();



    }
}
