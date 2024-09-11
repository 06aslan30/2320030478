package minmax;

public class GenericFounder {
	public static void main(String[] args) {
        // for integer
        Integer[] intArray = {3, 5, 7, 2, 8};
        ValueFinder1<Integer> intFinder = new ValueFinderImplementation<>();
        System.out.println("Integer Array: Max = " + intFinder.findMax(intArray) + ", Min = " + intFinder.findMin(intArray));
        
        // for array
        String[] strArray = {"apple", "orange", "banana", "grape"};
        ValueFinder1<String> strFinder = new ValueFinderImplementation<>();
        System.out.println("String Array: Max = " + strFinder.findMax(strArray) + ", Min = " + strFinder.findMin(strArray));
        
        // Character
        Character[] charArray = {'a', 'z', 'r', 'b'};
        ValueFinder1<Character> charFinder = new ValueFinderImplementation<>();
        System.out.println("Character Array: Max = " + charFinder.findMax(charArray) + ", Min = " + charFinder.findMin(charArray));
        
        // Float
        Float[] floatArray = {2.5f, 3.7f, 1.8f, 4.6f};
        ValueFinder1<Float> floatFinder = new ValueFinderImplementation<>();
        System.out.println("Float Array: Max = " + floatFinder.findMax(floatArray) + ", Min = " + floatFinder.findMin(floatArray));
    }

}
