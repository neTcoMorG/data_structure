package com.example.demo.linkedlist.single;

public class LinkedList {

    protected Node head, tail;
    protected int size;

    public LinkedList () {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void add (Object data) {
        Node newNode = new Node(data, null);
        this.size++;

        if (head == null || tail == null) {
            this.head = newNode;
            this.tail = newNode;
            this.head.setNext(this.tail);
            return;
        }

        this.tail.setNext(newNode);
        this.tail = newNode;
    }

    public void add (int index, Object data) {
        if (isOverFlow(index)) {
            throw new IndexOutOfBoundsException();
        }

        Node prev = getAtNode(index-1);
        Node cur = this.head;

        for (int i=0; i<index; i++) {
            cur = cur.getNext();
        }

        Node newNode = new Node(data, cur);
        prev.setNext(newNode);
        this.size++;
    }

    private Node getAtNode (int index) {
        if (isOverFlow(index)) {
            throw new IndexOutOfBoundsException();
        }

        Node result = this.head;
        for (int i=0; i<index; i++) {
            result = result.getNext();
        }

        return result;
    }

    public Object getAt (int index) {
        if (isOverFlow(index)) {
            throw new IndexOutOfBoundsException();
        }

        Node result = this.head;
        for (int i=0; i<index; i++) {
            result = result.getNext();
        }

        return result.getData();
    }

    public boolean contains (Object object) {
        for (int i=0; i<this.size-1; i++) {
            if (getAt(i).equals(object)) {
                return true;
            }
        }
        return false;
    }

    public int[] toArray () {
        int[] result = new int[this.size];
        for (int i=0; i<size; i++) {
            result[i] = (int)getAt(i);
        }
        return result;
    }

    public void remove (int index) {
        if (isOverFlow(index)) {
            throw new IndexOutOfBoundsException();
        }

        Node prev = getAtNode(index-1);
        prev.setNext(getAtNode(index+1));
        this.size--;
    }

    private boolean isOverFlow (int index) {
        if (index > size - 1) {
            return true;
        }
        return false;
    }

    public Node getHead() {
        return head;
    }
    public Node getTail() {
        return tail;
    }
    public int size() {
        return this.size;
    }
}
