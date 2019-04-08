package rocks.zipcode.io.quiz4.generics;

import sun.invoke.empty.Empty;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.List;

/**
 * @author leon on 11/12/2018.
 */
public class MyStack<SomeType> implements Iterable<SomeType> {
    private List<SomeType> items;

    public MyStack() {
        this.items = new ArrayList<>();
    }

    public MyStack(List<SomeType> items){
        this.items = items;
    }

    public Boolean isEmpty() {
        return items.isEmpty();
    }

    public void push(SomeType i) {
        items.remove(i);
        items.add(items.size(), i);
    }

    public SomeType peek() {
        if (!isEmpty()) {
            return items.get(items.size() - 1);
        }
        return null;
    }

    public SomeType pop() {
        if (!isEmpty()) {
            SomeType item = peek();
            items.remove(items.size() - 1);
            return item;
        }
        throw new EmptyStackException();
    }

    @Override
    public Iterator<SomeType> iterator() {
        return null;
    }
}
