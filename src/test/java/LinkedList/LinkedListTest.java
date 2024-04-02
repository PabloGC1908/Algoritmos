package LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.pgc.data_structures.linkedlist.LinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LinkedListTest {
    private LinkedList<Integer> list;

    @BeforeEach
    void setup() {
        list = new LinkedList<>();
    }

    @Test
    void addFirstNodeTest() {
        list.addFirst(1);
        list.addFirst(2);

        assertEquals(2, list.length());
    }

    void addNodeTest() {

    }

    void removeNodeTest() {

    }

    void searchNodeTest() {

    }
}
