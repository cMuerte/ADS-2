public class MyStack<T> {
    private MyLinkedList<T> list = new MyLinkedList<>();

    public boolean isEmpty() {
        return list.size()==0;
    }

    public int size() {
        return list.size();
    }

    public T peek(){
        return list.getFirst();
    }

    public T push(T item){
        list.addFirst(item);
        return item;
    }

    public T pop(){
        T removingItem = peek();
        list.removeFirst();
        return removingItem;
    }
}
