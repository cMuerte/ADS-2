import java.util.Comparator;
import java.util.Iterator;

public interface MyList<T> extends Iterable<T> {
    void add(T t);
    void set(int index, T t);
    void add(int index, T t);
    void addFirst(T t);
    void addLast(T t);
    T get(int index);
    T getFirst();
    T getLast();
    void remove(int index);
    void removeFirst();
    void removeLast();
    void sort(Comparator<T> cmp);
    int indexOf(Object object);
    int lastIndexOf(Object object);
    boolean exists(Object object);
    public Object[] toArray();
    void clear();
    int size();
}