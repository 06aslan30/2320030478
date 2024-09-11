package prioqueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class GenericPriorityQueue<T extends Comparable<T>> {
	 private ArrayList<T> queue;

	    public GenericPriorityQueue() {
	        queue = new ArrayList<>();
	    }
	    public void add(T element) {
	        queue.add(element);
	        Collections.sort(queue, Comparator.reverseOrder());
	    }

	    public T poll() {
	        if (!queue.isEmpty()) {
	            return queue.remove(0); 
	        }
	        return null;
	    }

	    public T peek() {
	        if (!queue.isEmpty()) {
	            return queue.get(0);
	        }
	        return null;
	    }


	    public boolean isEmpty() {
	        return queue.isEmpty();
	    }

	    public int size() {
	        return queue.size();
	    }
	}

