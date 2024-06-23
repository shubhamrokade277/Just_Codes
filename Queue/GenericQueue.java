package Queue;
public interface GenericQueue<T> {
    void enqueue(T element);
    T dequeue();
    boolean isEmpty();
    boolean isFull();
}
