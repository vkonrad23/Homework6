public class Main2 {
    public static void main(String[] args) {
        int[] intArray = new int[10];

// Assign a value to the 5th element of the array
        intArray[4] = 45;

// Print the value of the 5th element of the array
        System.out.println("5th element value: " + intArray[4]);

// Try to access the 1000th element of the array
        try {
            System.out.println("1000th element value: " + intArray[1000]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

    }
}
