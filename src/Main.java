public class Main {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop());        //Output: 30
        System.out.println(stack.peek());       //Output: 20
        System.out.println(stack.size());       //Output: 2
        System.out.println(stack.isEmpty());    //Output: false

        Queue<Integer> queue = new Queue<>();
        queue.enqueue(100);
        queue.enqueue(200);
        queue.enqueue(300);
        System.out.println(queue.dequeue());    //Output: 100
        System.out.println(queue.peek());       //Output: 200
        System.out.println(queue.size());       //Output: 2
        System.out.println(queue.isEmpty());    //Output: false

        MyMinHeap<Integer> heap = new MyMinHeap<>();
        heap.insert(40);
        heap.insert(10);
        heap.insert(30);
        heap.insert(20);
        System.out.println(heap.getMin());      //Output: 10
        System.out.println(heap.extractMin());  //Output: 10
        System.out.println(heap.getMin());      //Output: 20
        heap.insert(5);
        System.out.println(heap.extractMin());  //Output: 5
        System.out.println(heap.size());        //Output: 3
        System.out.println(heap.empty());       //Output: false
    }
}