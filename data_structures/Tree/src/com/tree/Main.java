package com.tree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTreeInsert bst = new BinarySearchTreeInsert();
       //  System.out.println("Root = "+bst.root);
        bst.insert(4);
        bst.insert(3);
        bst.insert(5);
        bst.insert(7);
        System.out.println(bst.insert(1));
    }
}