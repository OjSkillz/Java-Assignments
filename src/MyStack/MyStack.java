package MyStack;

import MyArrayList.MyArrayList;

import java.util.EmptyStackException;

public class MyStack {

    private MyArrayList stackArray;

    public MyStack() {
        stackArray = new MyArrayList(3);
    }

    public boolean empty() {
        return stackArray.isEmpty();
    }

    public String push(String element) {
        stackArray.add(element);
        return element;
    }

    public int size() {
        return stackArray.size();
    }

    public String pop() throws EmptyStackException {
        if (empty()) throw new EmptyStackException();
        String returned = stackArray.get(size() - 1);
        stackArray.remove(stackArray.get(size() - 1));

        return returned;
    }

    public String peek() {
        if (empty()) throw new EmptyStackException();
        return stackArray.get(stackArray.size() - 1);
    }

    public int search(String element) {
        int position = -1;
        if (stackArray.indexOf(element) != -1)
            return stackArray.size() - stackArray.indexOf(element);
        return position;
    }
}
