package genericstack;

import java.util.Arrays;

public class ArrayStack<T> implements Stack<T>  {
	 private T[] array;
	    private int top;
	    private int capacity;

	    @SuppressWarnings("unchecked")
	    public ArrayStack(int size) {
	        array = (T[]) new Object[size];
	        top = -1;
	        capacity = size;
	    }

	    @Override
	    public void push(T element) {
	        if (top == capacity - 1) {
	            resize();
	        }
	        array[++top] = element;
	    }

	    @Override
	    public T pop() {
	        if (isEmpty()) {
	            return null;
	        }
	        return array[top--];
	    }

	    @Override
	    public T peek() {
	        if (isEmpty()) {
	            return null;
	        }
	        return array[top];
	    }

	    @Override
	    public boolean isEmpty() {
	        return top == -1;
	    }

	    @SuppressWarnings("unchecked")
	    private void resize() {
	        capacity *= 2;
	        array = Arrays.copyOf(array, capacity);
	    }
	}