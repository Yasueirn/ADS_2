public class Main {
    public static void main(String[] args) {
        MyMinHeap<Integer> heap = new MyMinHeap<>();

        heap.insert(5);
        heap.insert(3);
        heap.insert(8);
        heap.insert(1);
        heap.insert(6);

        System.out.println(heap.size());
        System.out.println(heap.getMin());

        while (!heap.empty()) {
            System.out.println(heap.extractMin());
        }

        System.out.println(heap.size());
    }




    }
