package albo.list;

import java.util.Iterator;

public class CustomList<T> implements Iterable<T> {

    private final T[] content;

    public CustomList(T[] content) {
        this.content = content;
    }

    @Override
    public Iterator<T> iterator() {
        return new CustomIterator(content);
    }

}