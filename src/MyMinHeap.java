public class MyMinHeap<T extends Comparable<T>> {

    private MyArrayList<T> heap = new MyArrayList<>();

    public MyMinHeap() {
        heap.add(null);
    }

    public boolean empty() {
        return size() == 0;
    }

    public int size() {
        return heap.size() - 1;
    }

    public T getMin() {
        return heap.get(1);
    }

    public T extractMin() {
        if (empty()){
            return null;
        }

        T min = heap.get(1);
        T last = heap.get(heap.size() -1);
        heap.set(1, last);
        heap.removeLast();
        heapify(1);

        return min;
    }

    public void insert(T item) {
        heap.add(item);
        traverseUp(heap.size() - 1);
    }

    private void heapify(int index) {
        int left = leftChildOf(index);
        int right = rightChildOf(index);
        int smallest = index;

        if (left <= size() && heap.get(left).compareTo(heap.get(smallest)) < 0) {
            smallest = left;
        }

        if (right <= size() && heap.get(right).compareTo(heap.get(smallest)) < 0) {
            smallest = right;
        }

        if (smallest != index) {
            swap(index, smallest);
            heapify(smallest);
        }
    }

    private void traverseUp(int index) {
        while (index > 1 && heap.get(index).compareTo(heap.get(parentOf(index))) < 0) {
            swap(index, parentOf(index));
            index = parentOf(index);
        }
    }

    private int leftChildOf(int index) {
        return 2 * index;
    }

    private int rightChildOf(int index) {
        return 2 * index + 1;
    }

    private int parentOf(int index) {
        return index / 2;
    }

    private void swap(int index1, int index2) {
        T temp = heap.get(index1);
        heap.set(index1, heap.get(index2));
        heap.set(index2, temp);
    }
}
