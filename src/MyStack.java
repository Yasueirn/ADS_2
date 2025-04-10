public class MyStack<T> {
    private MyLinkedList<T> list = new MyLinkedList<>();

    public void push(T item){
        list.addFirst(item);
    }

    public T peek(){
        return list.getFirst();
    }

    public T pop(){

        T removingItem = peek();
        list.removeFirst();
        return removingItem;
    }

    public boolean isEmpty(){
        return list.size() == 0;
    }

    public int size(){
        return list.size();
    }

}
