package com.dsa.linearsearch;

/**
 *  The LinearSearch class demonstrates a linear search
 *  operation in java.
 */

public class LinearSearch
{
    public static void main(String[] args)
    {
        int[] numbers = {1, 2, 3, 4, 42, 5, 6, 42}; // Array does not have to be sorted.
        int target = 42; // Value to search for.

        int result = linearSearch(numbers, target); // Store result.

        if(result > 0) // If element was found.
            System.out.println("Target found at index: " + result); // Print result.
        else // Element not found.
            System.out.println("Target was not found in the array."); // Print not found message.
    }

    /**
     *  The linearSearch method takes in an int array of numbers
     *  and a target value to search for in that array.
     *
     * @param numbers An int array of numbers to search
     * @param target A target value to search for in the array
     * @return The index of the target element if found, otherwise it returns -1.
     */
    private static int linearSearch(int[] numbers, int target)
    {
        int end = numbers.length; // Store array length as end value (last valid index +1).

        for(int index = 0; index < end; index++) // Loop through numbers array.
        {
            if(numbers[index] == target) // If the current number is the target number.
                return index; // Return index number target was found at (first occurrence).
        }
        return -1; // Indicates target was not found.
    }
}
