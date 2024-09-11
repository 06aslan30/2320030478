package minmax;

public interface ValueFInder <T extends Comparable<T>> {
	   T findMax(T[] array);
	    T findMin(T[] array);
	}