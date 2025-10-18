package assignment1;

public class MyStack<E extends Person> {
    private final int size;
    private int top;
    private E[] elements;

    @SuppressWarnings("unchecked")
    public MyStack(int size) {
        this.size = size;
        this.top = 0;
        this.elements = (E[]) new Object[size];
    }

    public E push(E element) {
        if (top >= size) {
            throw new StackOverflowError("Stack is full");
        }
        elements[top++] = element;
        return element;
    }

    public E pop() {
        if (top <= 0) {
            throw new IllegalStateException("Stack is empty");
        }
        E element = elements[--top];
        elements[top] = null;
        return element;
    }
}
