package com.dsa.binarysearch;

import java.util.Arrays; // For sorting simplicity, sorting alogorithms will be added later.
/**
 *  The BinarySearchDemo class demonstrates a binary search
 *  operation in Java.
 */

public class BinarySearchDemo
{
    public static void main(String[] args)
    {
        int[] numbers = {24, 76, 1, 234, 42, 21, 420, 974}; // Array must be sorted.
        Arrays.sort(numbers); // Could manually sort, this way may be better for adding user input later though.
        // SORTED EXAMPLE ARRAY: { 1, 21, 24, 42, 76, 234, 420, 974 }

        int target = 420; // Value to search for.
        int result = binarySearch(numbers, target); // Store result.

        if(result >= 0) // If element was found.
            System.out.println("Target found at index: " + result); // Print result.
        else // Element not found.
            System.out.println("Target was not found in the array."); // Print not found message.
    }

    /**
     *  The binarySearch method takes in an int array of numbers
     *  and a target value to search for in that array. The binarySearch
     *  method then performs a binary search on the array.
     *
     * @param numbers The int array to search.
     * @param target The value to search for.
     * @return The index of the target element if found, otherwise -1 is returned.
     */
    private static int binarySearch(int[] numbers, int target)
    {
        int left = 0; // Starting point of search.
        int right = numbers.length - 1; // Ending point of search.

        while(left <= right) // Left should always be less than right to perform binary search properly.
        {
            int middle = (left + right) / 2; // Calculate a middle index.

            if(numbers[middle] == target) // If current number is target number.
                return middle; // Return current number.
            else if(numbers[middle] < target) // If current number is less than target
                left = middle + 1; // New starting point becomes 1 + middle (first position to the right of the middle).
            else // Current number must be greater than target
                right = middle - 1; // New ending point becomes 1 - middle (first position to the left of the middle.)
        }
        return -1; // Indicates target element was not found.
    }
}
