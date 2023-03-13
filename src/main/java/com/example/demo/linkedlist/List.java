package com.example.demo.linkedlist;

public interface List<T> {

    void add (T data);
    void add (int index, T data);
    T getAt (int index);
    boolean contains (T data);
    int[] toArray();
    void remove (int index);
    int size();
}
