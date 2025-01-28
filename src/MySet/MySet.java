package MySet;

import MyArrayList.MyArrayList;

public class MySet {

    private MyArrayList list;

    public MySet() {
        list = new MyArrayList();
    }

    public boolean isEmpty() {
        return list.isEmpty();

    }

    public void add(String element) throws IllegalArgumentException {

        if (!list.contains(element))
            list.add(element);
        else
            throw new IllegalArgumentException("Element already exists!");
    }

    public int size() {
        return list.size();
    }


    public boolean contains(String element) {
        return list.contains(element);
    }

    public boolean remove(String element) {
        if (list.contains(element)) {
            list.remove(element);
            return true;
        }
        return false;
    }

    public void clear() {
        list.clear();
    }

    public boolean containsAll(String[] elements) {
        int match = 0;
        for (String element : elements) {
            if(contains(element))
                match++;
        }
        return match == elements.length;
    }

    public boolean removeAll(String[] elements) {
        int initialsSize = list.size();
        for (String element : elements) remove(element);

        return !(list.size() == initialsSize);
    }

    public boolean retainsAll(String[] elements) {
        int initialsSize = list.size();
        MyArrayList newList = new MyArrayList(elements.length);
        for (String element : elements) if(contains(element)) newList.add(element);
        list = newList;
        return !(list.size() == initialsSize);
    }
}
