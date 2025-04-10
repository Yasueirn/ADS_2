public class MyQueue<T> {
    private MyLinkedList<T> list = new MyLinkedList<>();

    public T peek() {
        return list.getFirst();
    }

    public void enqueue(T item) {
        list.addLast(item);
    }

    public T dequeue() {

        T removingItem = peek();
        list.removeFirst();
        return removingItem;
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }

}
