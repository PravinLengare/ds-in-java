package com.tree;

public class BinarySearchTreeInsert {
    private Node root;

    class Node{
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }

    }
    public boolean insert(int value){
        Node newNode = new Node(value);
        Node temp = root;
        if(root == null){
            root = newNode;
            return true;
        }
        while (true){
            if(newNode.value == temp.value)  return false;
            if (newNode.value < temp.value){
                if(temp.left == null){
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            }
            else {
                if(temp.right == null){
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }


        }
    }

}
