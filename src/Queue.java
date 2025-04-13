public class Queue <T>{
    private MyLinkedList<T> list = new MyLinkedList<>();

    public boolean isEmpty(){
        return list.size() == 0;
    }
    public int size(){
        return list.size();
    }
    public void enqueue(T value){
        list.addLast(value);
    }
    public T dequeue(){
        T removingItem = peek();
        list.removeLast();
        return removingItem;
    }
    public T peek(){
        return list.getFirst();
    }
}
