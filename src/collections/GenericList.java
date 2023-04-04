package collections;

import java.util.Iterator;

public class GenericList<T> implements Iterable<T> {
    private T[] items;
    private int size;

    GenericList() {
        this.size = 0;
        items = (T[]) new Object[100];
    }

    private T[] copyList() {
        T[] newList = (T[]) new Object[this.items.length * 2];

        for (int i = 0; i < this.items.length; i++) {
            newList[i] = this.items[i];
        }

        return newList;
    }

    void add(T item) {
        if (size == items.length) {
            this.items = copyList();
        }

        this.items[size++] = item;
    }

    @Override
    public Iterator<T> iterator() {
        GenericIterator<T> it = new GenericIterator<>(this);
        return it;
    }

    private class GenericIterator<T> implements Iterator<T> {
        GenericList<T> list;
        int index;

        GenericIterator(GenericList<T> list) {
            this.index = 0;
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            return this.index < this.list.size;
        }

        @Override
        public T next() {
            return this.list.items[index++];
        }
    }
}
