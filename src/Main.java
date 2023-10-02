public class Main {
    public static void main(String[] args) {
        // Array creation with predefined size
        int[] intArray = new int[10];

// Array creation with size defined in a variable
        int size = 5;
        double[] doubleArray = new double[size];

// Literal array creation
        String[] stringArray = {"a", "b", "c", "d", "e"};

// Array with different types of elements
        char[] charArray = {'a', 'b', 'c', 'd', 'e'};
        boolean[] booleanArray = {true, false, true, false, true};

// Use of array.length
        System.out.println("Length of intArray: " + intArray.length);
        System.out.println("Length of doubleArray: " + doubleArray.length);
        System.out.println("Length of stringArray: " + stringArray.length);
        System.out.println("Length of charArray: " + charArray.length);
        System.out.println("Length of booleanArray: " + booleanArray.length);

    }
}