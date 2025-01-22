package MyArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyArrayListTest {

    private MyArrayList strings;

    @BeforeEach
    public void createNewArrayList() {
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

        assertEquals(2, strings.getSize());
    }

    @Test
    public void removeElements_NewListReducesSizeTest() {
        strings.add("John");
        strings.add("Kunle");

        assertEquals(2, strings.getSize());

        strings.remove("Kunle");
        assertEquals(1, strings.getSize());
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
        assertEquals(6, strings.getSize());
    }
}



