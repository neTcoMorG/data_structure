package com.example.demo.linkedlist.doubly;

import com.example.demo.linkedlist.List;

public class DoublyLinkedList<T> implements List<T> {

    private Node<T> head, tail;
    private int size;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    @Override
    public void add(T data) {
        this.size++;

        if (head == null || tail == null) {
            Node newNode = new Node(tail, null, data);
            tail = newNode;
            head = newNode;
            return;
        }

        Node newNode = new Node(null, tail, data);
        tail.setNext(newNode);
        tail = newNode;
    }

    @Override
    public void add(int index, T data) {

    }

    @Override
    public T getAt(int index) {
        if (isOverflow(index)) {
            throw new IndexOutOfBoundsException();
        }

        Node cur = null;
        if ((this.size/2) < index) {
            cur = this.tail;
            for (int i=0; i<index; i++) {
                cur = cur.getPrev();
            }
            return (T)cur.getData();
        }
        cur = this.head;
        for (int i=0; i<index; i++) {
            cur = cur.getNext();
        }
        return (T)cur.getData();
    }

    @Override
    public boolean contains(T data) {
        return false;
    }

    @Override
    public int[] toArray() {
        return new int[0];
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public int size() {
        return this.size;
    }

    private boolean isOverflow (int index) {
        if (index > size-1) {
            return true;
        }
        return false;
    }
}
