package generic.binary.search;

public class BinarySearch<T extends Comparable<T>> {
	  public int search(T[] array, T key) {
	        return binarySearch(array, key, 0, array.length - 1);
	    }

	    private int binarySearch(T[] array, T key, int low, int high) {
	        while (low <= high) {
	            int mid = low + (high - low) / 2;
	            int cmp = key.compareTo(array[mid]);

	            if (cmp == 0) {
	                return mid; // key found
	            } else if (cmp < 0) {
	                high = mid - 1; // search left
	            } else {
	                low = mid + 1; // search right
	            }
	        }
	        return -1; // if key not found
	    }
}
