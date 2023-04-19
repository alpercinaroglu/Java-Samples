/**
 * @author alpinaro (Alper Çınaroğlu)
 * https://github.com/alpinaro
 */
public class Multipliers {

    public static void main(String[] args) {

        int[] dataArray = new int[]{0, 1, 2, 3, 4, 5, 7, 11, 13, 16, 18, 21, 24, 27, 32, 43, 46, 56, 58, 60, 66, 72, 80, 81};
        int[] searchNums = new int[]{4, 6};

        System.out.println("Count of multiplier elements: " + findMultiplierCount(dataArray, searchNums));
    }

    /*
    This method finds how many elements in the given array are multiples of at least one of the given numbers.

    To verify that the method is implemented correctly, we should test the following scenarios:
        - If the given array contains 0, it should not be counted.
        - Array elements that are multiplier of more than one number should be counted only once.
        - The method should report the error if the numbers contain 0.
     */
    private static int findMultiplierCount(int[] array, int[] numbers) {

        for (int number : numbers) {
            if (number == 0) {
                System.out.println("You can not divide by 0! Please, check your search numbers.");
                return 0;
            }
        }

        int count = 0;
        int indicator = 0;

        for (int element : array) {
            for (int number : numbers) {
                if (element % number == 0 && element != 0) {
                    indicator = 1;
                    break;
                }
            }
            if (indicator == 1) {
                count++;
                indicator = 0;
            }
        }
        return count;
    }
}
