package Stack;

public class ResizableArrayStack implements Stack{
    private int[] stackData;
    private int top;
    private static final int INITIAL_CAPACITY = 10;

    //use CTRO to inti values:
    public ResizableArrayStack(){
        stackData = new int[INITIAL_CAPACITY];
        top = -1;
    }

    @Override
    public void push(int element) {
        if(top == stackData.length-1){
            resize(stackData.length * 2);  //making size double ie 10*2 = 20
        }
        stackData[++top] = element;
    }

    @Override
    public int pop() {
        if(isEmpty()){
            throw new StackUnderflowException("Stack is empty!!");
        }
        int result = stackData[top];
        --top;

        return result;
    }

    @Override
    public int peek() {
        if(isEmpty()){
            throw new StackUnderflowException("Stack is empty!!");
        }
        return stackData[top];
    }

    @Override
    public boolean isEmpty() {
        if (top == -1)
			return true;
		return false;
    }

    @Override
    public boolean isFull() {
        return false; // A resizable array stack is never full
    }

    private void resize(int newCapacity){
        int[] newArray = new int[newCapacity];
        for(int i=0 ; i<=top ; i++){
            newArray[i] = stackData[i];
        }
        stackData = newArray;
    }
}
