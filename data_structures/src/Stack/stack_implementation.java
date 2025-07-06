package Stack;

import javax.swing.plaf.SplitPaneUI;
import javax.xml.soap.Node;

class stack{
    private Node top;
    private int height;

    public stack (int value){
        Node newNode = new Node(value);
        top = newNode;
        height = 1;

    }

    class Node{
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }
    }

    public void printStack(){
        System.out.println("The Stack is : ");
        Node temp = top;
        while(temp!=null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    public void getTop(){
        System.out.println("The top is : "+top.value);
    }
    public void getHeight(){
        System.out.println("The height is : "+height);
    }

    public void push(int value){
        Node newNode = new Node(value);
        if(height == 0){
            top = newNode;
        }
        else {
            newNode.next = top;
            top = newNode;
        }
        height++;
    }

    public Node pop(){
        if(height == 0) return  null;

        Node temp = top;
        top = top.next;
        temp.next = null;
        height--;

        return temp;
    }


}
public class stack_implementation {
    public static void main(String[] args) {
        stack my_stack = new stack(4);
        my_stack.getTop();
        my_stack.getHeight();

        // for push method :-

//            my_stack.push(2);
//            System.out.println("After pushing node stack is :");
//            my_stack.getTop();
//            my_stack.getHeight();
//            my_stack.printStack();

        // for pop method :-
        my_stack.push(2);
        my_stack.push(3);
        System.out.println("After popping  node from stack :");
        System.out.println("The node which is popped is : "+my_stack.pop().value);
        my_stack.printStack();




    }
}
