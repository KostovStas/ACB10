package linked_list;

/**
 * Created by gorobec on 08.05.16.
 */
public interface MyList {
    boolean add(Object o);
    void add(int index, Object o);
    void clear();
    boolean contains(Object o);
    Object get(int index);
    boolean isEmpty();
    Object remove(int index);
    boolean remove(Object o);
    int size();
    Object[] toArray();
}
