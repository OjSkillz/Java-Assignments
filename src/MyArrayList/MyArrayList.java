package MyArrayList;

public class MyArrayList {
    private int size = 0;
    private String[] strings = new String[4];

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void add(String element) {
        if (isFull()) expandCapacity();
        strings[size] = element;
        size++;
    }

    private void expandCapacity() {
        int newCapacity = strings.length * 2;
        String[] newStrings = new String[newCapacity];
        for (int i = 0; i < strings.length; i++) {
            newStrings[i] = strings[i];
        }
        strings = newStrings;
    }

    private boolean isFull() {
        if (size == strings.length) {
            return true;
        }
        return false;
    }


    public void remove(String element) {
        int elementIndex = getElementIndex(element);
        for (int index = elementIndex; index < size - 1; index++) {
            strings[index] = strings[index + 1];
        }
        strings[size - 1] = null;
        size--;
    }

    private int getElementIndex(String element) {
        int indexOfElement = -1;
        for (int i = 0; i < size; i++) {
            if (strings[i].equals(element)) indexOfElement = i;
        }
        return indexOfElement;
    }

    public String get(int index) {
        String element = "";
        for (int i = 0; i < size; i++) {
            if (strings[i].equals(strings[index])) element = strings[i];
        }
        return element;
    }
}
