package com.example.demo.linkedlist.doubly;

public class Node<T> {

    public Node(Node next, Node prev, T data) {
        this.next = next;
        this.prev = prev;
        this.data = data;
    }

    private Node next;
    private Node prev;
    private T data;

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public T getData() {
        return data;
    }
}
