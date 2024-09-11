package generic.binary.search;

public class Main {

	public static void main(String[] args) {
		Integer[] intArray = {1, 3, 5, 7, 9, 11, 13};
        BinarySearch<Integer> intSearch = new BinarySearch<>();
        int intIndex = intSearch.search(intArray, 7);
        System.out.println("Integer array: 7 found at index: " + intIndex);

        //  with Double
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        BinarySearch<Double> doubleSearch = new BinarySearch<>();
        int doubleIndex = doubleSearch.search(doubleArray, 4.4);
        System.out.println("Double array: 4.4 found at index: " + doubleIndex);

        // with String
        String[] stringArray = {"apple", "banana", "cherry", "date", "fig"};
        BinarySearch<String> stringSearch = new BinarySearch<>();
        int stringIndex = stringSearch.search(stringArray, "cherry");
        System.out.println("String array: 'cherry' found at index: " + stringIndex);
    }

}
