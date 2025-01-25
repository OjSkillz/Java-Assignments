package MyStack;

import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

public class MyStackTest {

    @Test
    public void myStackExistenceTest() {
        MyStack myStack = new MyStack();
    }

    @Test
    public void myStackIsEmpty_returnsTrueTest() {
        MyStack myStack = new MyStack();
        assertTrue(myStack.empty());
    }

    @Test
    public void myStack_canHoldElement_isEmptyReturnsFalse() {
        MyStack myStack = new MyStack();

        myStack.push("Honda");
        assertFalse(myStack.empty());
    }

    @Test
    public void myStack_holdsElement_sizeIncreasesTest () {
        MyStack myStack = new MyStack();
        myStack.push("Honda");
        assertEquals(1, myStack.size());
    }

    @Test
    public void myStack_holdsElementsInStacksTest() {
        MyStack myStack = new MyStack();
        myStack.push("Honda");
        myStack.push("Suzuki");
        myStack.push("Chevrolet");

        assertEquals("Chevrolet", myStack.pop());

    }
    @Test
    public void myStackIsEmpty_attemptToRemoveElementFromStack_throwsException() {
        MyStack myStack = new MyStack();
        assertThrows(EmptyStackException.class, myStack::pop);
    }

    @Test
    public void addElementsToMyStack_checkElementAtTopOfStack() {
        MyStack myStack = new MyStack();
        myStack.push("Honda");
        myStack.push("Suzuki");
        myStack.push("Chevrolet");
        myStack.push("Hyundai");


        assertEquals("Hyundai", myStack.peek());
    }

    @Test
    public void attemptToPeekAtEmptyStack_throwsException() {
        MyStack myStack = new MyStack();
        assertThrows(EmptyStackException.class, myStack::peek);
    }

    @Test
    public void addElements_checkElementPositionInMyStack() {
        MyStack myStack = new MyStack();
        myStack.push("Honda");
        myStack.push("Suzuki");
        myStack.push("Chevrolet");
        myStack.push("Hyundai");
        myStack.push("Mercedes");

        assertEquals(3, myStack.search("Chevrolet"));
    }

    @Test
    public void addElement_NonExistentElementPositionCheckNegativeTest() {
        MyStack myStack = new MyStack();
        myStack.push("Honda");
        myStack.push("Suzuki");
        myStack.push("Chevrolet");
        myStack.push("Hyundai");

        assertEquals(-1, myStack.search("Kia"));
    }

}
