package MyArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyArrayListTest {

    private MyArrayList strings;

    @BeforeEach
    public void setUp() {
        strings = new MyArrayList();
    }
    @Test
    public void NewList_CanBeCreatedTest() {
    }

    @Test
    public void NewList_IsEmptyTest() {
       assertTrue(strings.isEmpty());
    }

    @Test
    public void addElements_NewListIsNotEmptyTest() {
        strings.add("John");
        strings.add("Kunle");

        assertEquals(2, strings.size());
    }

    @Test
    public void removeElements_NewListReducesSizeTest() {
        MyArrayList strings = new MyArrayList(2);
        strings.add("John");
        strings.add("Kunle");

        assertEquals(2, strings.size());

        strings.remove("Kunle");
        assertEquals(1, strings.size());
    }
@Test
public void listCapacity_canExpandTest() {
        MyArrayList strings = new MyArrayList(2);
        strings.expandCapacity();
        assertEquals(4, strings.getNewCapacity());
}
    @Test
    public void addABCD_removeACheckForDAtNewPosition() {
        strings.add("John");
        strings.add("Kunle");
        strings.add("Jemima");
        strings.add("Jacinta");

        strings.remove("Jemima");

        assertEquals("Jacinta", strings.get(2));

        strings.add("Wilson");
        strings.remove("Kunle");

        assertEquals("Jacinta", strings.get(1));
    }

    @Test
    public void addElements_checkIfListSizeExpands() {
        strings.add("John");
        strings.add("Kunle");
        strings.add("Jemima");
        strings.add("Jacinta");
        strings.add("Wilson");
        strings.add("Bimbo");
        assertEquals(6, strings.size());
    }

    @Test
    public void addElementAtSpecificIndex_checkElementAtIndex() {
        strings.add("John");
        strings.add("Kunle");
        strings.add("Jemima");
        strings.add("Jacinta");
        strings.add("Wilson");
        strings.add("Bimbo");
        strings.add(3, "Loveth");

        assertEquals("Loveth", strings.get(3));
        assertEquals("Bimbo", strings.get(6));
    }

    @Test
    public void replaceElementAtSpecifiedIndex_returnsElementAtIndex() {
        strings.add("John");
        strings.add("Kunle");
        strings.add("Jemima");
        strings.add("Jacinta");
        strings.add("Wilson");

        assertEquals("Jemima", strings.set(2, "Edwin"));
    }

    @Test
    public void replaceElementAtSpecificIndex_checkElementAtIndex() {
        strings.add("John");
        strings.add("Kunle");
        strings.add("Jemima");
        strings.add("Jacinta");
        strings.add("Wilson");
        strings.set(2, "Edwin");
        assertEquals("Edwin", strings.get(2));
    }

    @Test
    public void addXYZ_listContainsYReturnsTrue() {
        strings.add("John");
        strings.add("Kunle");
        strings.add("Jemima");
        assertTrue(strings.contain("Jemima"));
    }

    @Test
    public void addXYZ_listContainsAReturnsFalse() {
        MyArrayList strings = new MyArrayList(4);
        strings.add("John");
        strings.add("Kunle");
        strings.add("Jemima");
        strings.add("Jacinta");
        strings.add("Wilson");

        assertFalse(strings.contain("Bob"));
    }

    @Test
    public void addXYZ_clearListReturnsEmptyTest() {
        MyArrayList strings = new MyArrayList(3);
        strings.add("John");
        strings.add("Kunle");
        strings.add("Jemima");

        strings.clear();
        assertTrue(strings.isEmpty());
    }

    @Test
    public void addXYZ_getIndexOfY() {
        MyArrayList strings = new MyArrayList(3);
        strings.add("John");
        strings.add("Kunle");
        strings.add("Jemima");

        assertEquals(1, strings.indexOf("Kunle"));


    }
}



