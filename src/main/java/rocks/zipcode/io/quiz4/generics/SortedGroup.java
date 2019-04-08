package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<_> extends Group<_> {
    List<_> items;

    public SortedGroup(){
        this.items = new ArrayList<>();
    }

    public SortedGroup(List<_> items){
        this.items = items;
    }

    @Override
    public void insert(_ value) {
        for (int i = 0; i < items.size(); i++){

        }
    }

    @Override
    public void delete(_ value) {
        items.remove(value);
    }

    public Integer indexOf(_ value) {
        return items.indexOf(value);
    }
}
