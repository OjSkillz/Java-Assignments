package MyArrayList;

public class MyArrayList {
    private int size = 0;
    private final int initialCapacity;
    private int newCapacity;
    private String[] strings;

    public MyArrayList() {
        initialCapacity = 10;
        strings = new String[initialCapacity];
    }

    public MyArrayList(int initialCapacity) {
        this.initialCapacity = initialCapacity;
        strings = new String[initialCapacity];
    }

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

    public void add(int index, String element) {
        if (isFull()) expandCapacity();
        String[] temp = new String[size + 1];

        if (index >= 0) System.arraycopy(strings, 0, temp, 0, index);
        temp[index] = element;
        System.arraycopy(strings, index , temp, index + 1, temp.length - (index + 1));

        strings = temp;
        size++;


    }

    protected void expandCapacity() {
        newCapacity = strings.length * 2;
        String[] newStrings = new String[newCapacity];
        System.arraycopy(strings, 0, newStrings, 0, strings.length);
        strings = newStrings;
    }

    public int getNewCapacity() {
        return newCapacity;
    }

    private boolean isFull() {
        return size == strings.length;
    }


    public void remove(String element) {
        int elementIndex = indexOf(element);
        for (int index = elementIndex; index < size - 1; index++) {
            strings[index] = strings[index + 1];
        }
        strings[size - 1] = null;
        size--;
    }

    public int indexOf(String element) {
        int indexOfElement = -1;
        for (int i = 0; i < size; i++) {
            if (strings[i].equals(element)) indexOfElement = i;
        }
        return indexOfElement;
    }

    public String get(int index) {
        String element = null;
        for (int i = 0; i < size; i++) {
            if (strings[index].equals(strings[i])) element = strings[i];
        }
        return element;
    }


    public String set(int index, String element) {
        String oldElement = strings[index];
        strings[index] = element;
        return oldElement;
    }

    public boolean contain(String element) {
        for (int i = 0; i < size; i++) {
            if (strings[i].equals(element)) return true;
        }
        return false;
    }

    public void clear() {
        String[] temp = new String[size];
        strings = temp;
        size = 0;
    }

}
