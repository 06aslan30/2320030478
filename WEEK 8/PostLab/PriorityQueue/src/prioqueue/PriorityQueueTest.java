package prioqueue;

public class PriorityQueueTest {
	public static void main(String[] args) {
       
        GenericPriorityQueue<Integer> intQueue = new GenericPriorityQueue<>();
        intQueue.add(5);
        intQueue.add(1);
        intQueue.add(3);
        System.out.println("Integer Queue:");
        while (!intQueue.isEmpty()) {
            System.out.println(intQueue.poll());
        }

   
        GenericPriorityQueue<Double> doubleQueue = new GenericPriorityQueue<>();
        doubleQueue.add(5.5);
        doubleQueue.add(1.1);
        doubleQueue.add(3.3);
        System.out.println("Double Queue:");
        while (!doubleQueue.isEmpty()) {
            System.out.println(doubleQueue.poll());
        }

    
        GenericPriorityQueue<String> stringQueue = new GenericPriorityQueue<>();
        stringQueue.add("apple");
        stringQueue.add("orange");
        stringQueue.add("banana");
        System.out.println("String Queue:");
        while (!stringQueue.isEmpty()) {
            System.out.println(stringQueue.poll());
        }
    }
}
