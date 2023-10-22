package LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.pgc.LinkedList.LinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LinkedListTest {
    private LinkedList<Integer> list;

    @BeforeEach
    void setup() {
        list = new LinkedList<>();
    }

    @Test
    void addFirstTest() {
        list.addFirst(1);
        list.addFirst(2);

        assertEquals(2, list.length());
    }

    void addTest() {

    }

    void removeTest() {

    }

    void searchTest() {

    }
}
