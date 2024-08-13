package com.dsa.selectionsort;

/**
 *  The SelectionSortDemo class demonstrates
 *  the selectionSort method.
 */

public class SelectionSortDemo
{
    public static void main(String[] arg)
    {
        int[] numbers = {6, 5, 2, 8, 9, 4}; // Create array.

        System.out.println("Before sorting: "); // Output.
        for(int num : numbers) // For each
        {
            System.out.print(num + " "); // Print it out.
        }

        selectionSort(numbers); // Call selectionSort method.

        System.out.println("\nAfter sorting: "); // Output.
        for(int num : numbers) // For each
        {
            System.out.print(num + " "); // Print it out.
        }
    }

    /**
     *  The selectionSort method performs a selection sort operation
     *  an array of numbers.
     *
     * @param numbers The array to sort.
     */
    public static void selectionSort(int[] numbers)
    {
        int size = numbers.length; // Store array size in variable.
        int temp; // Temp for swapping.
        int minIndex; // Keeps track of the index of the smallest number found in the array.

        // First loop performs the swaps,
        // goes thorough every valid index in the array.
        for(int i = 0; i < size - 1; i++)
        {
            // Set minIndex to current index. moves forward one each iteration,
            // sorting the smallest number to the front in this case.
            minIndex = i;

            // Inner loop compares the number at the current index,
            // with the number at current index + 1.
            for(int j = i + 1; j < size; j++)
            {
                // If number at current index is greater than number at next index.
                if(numbers[minIndex] > numbers[j])
                {
                    minIndex = j; // Next index is stored as the minIndex;
                }
            }
            temp = numbers[minIndex]; // Set temp to index of smallest number found.
            // Swap the number at the index of the current smallest number for the number at the current index.
            numbers[minIndex] = numbers[i];
            numbers[i] = temp; // Set the number at the current index to the number at minIndex.
        }
    }
}
