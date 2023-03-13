package com.example.demo.linkedlist.doubly;

import com.example.demo.linkedlist.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListTest {

    List<Integer> list = new DoublyLinkedList<>();

    @Test
    @DisplayName("add 실행 후 사이즈 확인")
    void add () {
        list.add(1);
        list.add(2);
        list.add(3);

        assertEquals(3, list.size());
    }
    
    @Test
    @DisplayName("getAt 테스트")
    void getAt() {
        list.add(5);
        list.add(6);

        assertEquals(5, list.getAt(0));
        assertEquals(6, list.getAt(1));

    }
}