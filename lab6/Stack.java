package Lab6;

public class Stack<T> {
    private T[] data;
    private int size;
    private int top;

    public Stack(int capacity) {
        data = (T[]) new Object[capacity];
        size = 0;
        top = -1;

    }

    public void push(T element) {
        data[++top] = element;
    }

    public T pop() {
        T item = (T) data[top];
        data[top] = null;
        top--;
        return item;

    }

    public T peek() {
        T item = (T) data[top];
        return item;
    
    }

    public boolean isEmpty(){
        if (size == 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(4);
        stack.push(121);
        stack.push(122);
        stack.push(123);
        stack.push(124);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.isEmpty());
    }
}
