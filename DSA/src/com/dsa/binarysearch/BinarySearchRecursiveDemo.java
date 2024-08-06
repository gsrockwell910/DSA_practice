package com.dsa.binarysearch;

import java.util.Arrays;

/**
 *  The BinarySearchRecursiveDemo class demonstrates a recursive
 *  binary search operation in Java.
 */

public class BinarySearchRecursiveDemo
{
    public static void main(String[] args)
    {
        int[] numbers = {24, 76, 1, 234, 42, 21, 420, 974}; // Array must be sorted.
        Arrays.sort(numbers); // Could manually sort, this way may be better for adding user input later though.
        // SORTED EXAMPLE ARRAY: { 1, 21, 24, 42, 76, 234, 420, 974 }

        int target = 420; // Value to search for.
        int result = binarySearchRecursive(numbers, target, 0, numbers.length - 1); // Store result.

        if(result >= 0) // If element was found.
            System.out.println("Target found at index: " + result); // Print result.
        else // Element not found.
            System.out.println("Target was not found in the array."); // Print not found message.
    }

    private static int binarySearchRecursive(int[] numbers, int target, int left, int right)
    {
        if(left <= right) // Same as regular BS, left should be less.
        {
            int middle = (left + right) / 2; // Calculate middle.
            if (numbers[middle] == target) // If current element is target.
                return middle; // Return element.
            else if (numbers[middle] < target) // If current element is less than target.
                // Perform recursive search, moving the start point of the search
                // to one element to the right of the middle.
                return binarySearchRecursive(numbers, target, middle + 1, right);
            else if (numbers[middle] > target)
                // Perform recursive search, moving the end point of the search
                // to one element before the middle.
                return binarySearchRecursive(numbers, target, left, middle - 1);
        }
        return -1; // Indicates target element was not in the array.
    }
}
