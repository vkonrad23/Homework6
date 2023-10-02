import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {

        {

            int[] numbers = new int[10];

            // Create an array with size defined in a variable
            int size = 5;
            int[] otherNumbers = new int[size];

            String[] names = {"John", "Jane", "Peter", "Mary"};


            double[] doubles = {1.2, 3.4, 5.6, 7.8};


            char[] chars = {'a', 'b', 'c', 'd'};


            boolean[] booleans = {true, false, true, false};

            // Set and access array elements by index
            numbers[0] = 10;
            numbers[1] = 20;
            numbers[2] = 30;

            System.out.println("5th element value: " + numbers[4]);


            System.out.println("1000th element value: " + numbers[9]);


            for (int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[i]);
            }


            for (int value : numbers) {
                System.out.println(value);
            }


            int i = 0;
            while (i < numbers.length) {
                System.out.println(numbers[i]);
                i++;
            }
        }
    }

}
