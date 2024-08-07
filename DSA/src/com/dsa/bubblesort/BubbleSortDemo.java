package com.dsa.bubblesort;

/**
 *  The BubbleSortDemo class demonstrates
 *  the bubbleSort method.
 */
public class BubbleSortDemo
{
    public static void main(String[] args)
    {
        int[] numbers = {5, 1, 2, 8, 3, 7, 99, 0}; // Create array of numbers.

        System.out.println("Before sorting: ");
        for(int num : numbers) // Loop through each number in unsorted array.
        {
            System.out.print(num + " "); // Print it followed by a space.
        }

       bubbleSort(numbers); // Sort array wih bubble sort method.

       System.out.println("\nAfter sorting: ");
       for(int num : numbers) // Loop through each number in sorted array.
       {
           System.out.print(num + " "); // Print it followed by a space.
       }

    }

    /**
     *  The bubbleSort method takes in an integer array
     *  and performs a bubble sort operation on the array.
     *
     * @param numbers The array to be sorted.
     */
    private static void bubbleSort(int[] numbers)
    {
        // Store last valid index - 1 keeps the second loops iteration in bounds of the array.
        int size = numbers.length - 1;
        int temp; // Temp variable for holding swaps.

        // First loop keeps track of position in array, less than because of size - i
        // condition in inner loop.
        for (int i = 0; i < size ; i++)
        {
            // Second loop swaps values. goes til size - i because
            // after each iteration of the outer loop i elements are sorted
            // at the end of the array, so no need to check them again.
            // - 1 keeps the second loops iteration in bounds of the array.
            for (int j = 0; j < size - i; j++)
            {
                if (numbers[j] > numbers[j + 1]) // Check if current value is greater than next value.
                {
                    temp = numbers[j]; // Store current value in temp.

                    numbers[j] = numbers[j + 1]; // Swap current value and next value.
                    numbers[j + 1] = temp; // Complete swap.
                }
            }
        }
    }
}
