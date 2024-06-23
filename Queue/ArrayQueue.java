package Queue;
public class ArrayQueue<T> implements GenericQueue<T>{
    private T[] queueData;
    private int front;
    private int rear;

    @SuppressWarnings("unchecked")
    public ArrayQueue(int n){
        queueData = (T[]) new Object[n];
        front = -1;
        rear = -1; 
    }

    @Override
    public void enqueue(T element) {
        if(isFull()){
            throw new QueueOverflowException("Queue is full");
        }

        ++rear;
        queueData[rear] = element;
        
    }

    @Override
    public T dequeue() {
        if(isEmpty()){
            throw new QueueUnderflowException("Queue is empty");
        }

        ++front;
        T result = queueData[front];
        queueData[front] = null; // to avoid loitering
    
        return result;
    }
    @Override
    public boolean isEmpty() {
        return front == rear;
    }

    @Override
    public boolean isFull() {
        return rear == (queueData.length - 1);
    }

}
