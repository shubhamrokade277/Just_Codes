package Stack;

//generic stack inteface
public interface Stack {
    void push(int element);
    int pop();
    int peek();
    boolean isEmpty();
    boolean isFull();
}
