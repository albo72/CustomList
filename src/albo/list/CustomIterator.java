package albo.list;

import java.util.Iterator;

public class CustomIterator<T> implements Iterator<T> {
    private final T[] array;
    private int counter = 0;

    public CustomIterator(T[] array) {

        this.array = array;
    }

    public boolean hasNext() {
        if (counter != this.array.length) {
            counter++;
            return true;
        } else {

            return false;
        }
    }

    @Override
    public T next() {
        return array[counter - 1];
    }
}
