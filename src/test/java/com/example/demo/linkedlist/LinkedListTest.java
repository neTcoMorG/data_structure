package com.example.demo.linkedlist;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class LinkedListTest {

    LinkedList linkedList = new LinkedList();

    @Test
    @DisplayName("노드의 append 테스트")
    void append () {
        linkedList.add(10);

        assertNotNull(linkedList.getHead());
        assertNotNull(linkedList.getTail());

        System.out.println(linkedList.getHead().toString());
        System.out.println(linkedList.getTail().toString());
    }

    @Test
    @DisplayName("노드 2개 append 할 때 head와 tail이 정확한지 테스트")
    void append_next_check () {
        linkedList.add(10);
        linkedList.add(20);

        assertEquals(10, linkedList.getHead().getData());
        assertEquals(20, linkedList.getTail().getData());
    }

    @Test
    @DisplayName("getAt 동작 테스트")
    void getAt_test () {
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        assertEquals(10, linkedList.getAt(0));
        assertEquals(20, linkedList.getAt(1));
        assertEquals(30, linkedList.getAt(2));
        assertThrows(IndexOutOfBoundsException.class, ()->linkedList.getAt(3));
    }

    @Test
    @DisplayName("연결리스트 밖의 인덱스를 조회할 때 예외 발생해야함")
    void linkedList_index_out_exception_test () {
        linkedList.add(10);

        assertThrows(IndexOutOfBoundsException.class, ()->linkedList.getAt(10));
    }
    
    @Test
    @DisplayName("contains 테스트")
    void contains_test () {
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);

        assertEquals(true, linkedList.contains(20));
        assertEquals(false, linkedList.contains(61));
    }
    
    @Test
    @DisplayName("중간에 삽입했을 때 테스트")
    void add_insert_loc () {
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(2, 30);

        assertEquals(30, linkedList.getAt(2));
        assertEquals(30, linkedList.getAt(3));


    }
    
    @Test
    @DisplayName("toArray 테스트")
    void toArray_test () {
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        linkedList.add(1, 5);

        int[] arr = linkedList.toArray();
        for (int i : arr) {
            System.out.printf(i + " ");
        }
    }

    @Test
    @DisplayName("remove 테스트")
    void remove_test () {
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        linkedList.remove(1);
        assertEquals(3, linkedList.getAt(1));
    }
    
    @Test
    @DisplayName("size 테스트")
    void test () {
        linkedList.add(1);
        linkedList.add(1);
        linkedList.add(1);

        assertEquals(3, linkedList.size());

        linkedList.remove(1);

        assertEquals(2, linkedList.size());

        linkedList.add(1, 1);

        assertEquals(3, linkedList.size());
    }
}