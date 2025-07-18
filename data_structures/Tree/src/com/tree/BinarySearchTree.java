package com.tree;

public class BinarySearchTree {
   public Node root;

    class Node{
        int value;
        Node left;
        Node right;

        private Node(int value){
            this.value = value;
        }
    }
}
