package com.Bridgelabz.stacks;

public class Stack <T> {
    private static LinkedList  LinkedList;

    public Stack() {
        LinkedList = new LinkedList<>();
    }
    public void push (Node<T> element){
        LinkedList.add((T) element);
    }
    public static Node peak(){
        return LinkedList.head;

    }
    public Node<T> pop(){
        return (Node<T>) LinkedList.pop();
    }
    public static void printStack(){
        LinkedList.show();
    }
}