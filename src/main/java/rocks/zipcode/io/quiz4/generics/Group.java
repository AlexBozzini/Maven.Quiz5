package rocks.zipcode.io.quiz4.generics;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class Group<_> implements Iterable<_>{
    private List<_> items;

    public Group() {
        this.items = new LinkedList<>();
    }

    public Group(List<_> items) {
        this.items = items;
    }

    public Integer count() {
        return items.size();
    }

    public void insert(_ value) {
        items.add(value);
    }

    public Boolean has(_ value) {
        return items.contains(value);
    }

    public _ fetch(int indexOfValue) {
        return items.get(indexOfValue);
    }

    public void delete(_ value) {
        items.remove(value);
    }

    public void clear() {
        items.clear();
    }

    public String toString(){
        return items.toString();
    }

    @Override
    public Iterator<_> iterator() {
        return new Iterator<_>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public _ next() {
                return null;
            }
        };
    }
}
