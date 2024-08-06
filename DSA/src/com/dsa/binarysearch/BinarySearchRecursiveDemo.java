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
        if(left <= right)
        {
            int middle = (left + right) / 2;
            if (numbers[middle] == target)
                return middle;
            else if (numbers[middle] < target)
                return binarySearchRecursive(numbers, target, middle + 1, right);
            else if (numbers[middle] > target)
                return binarySearchRecursive(numbers, target, left, middle - 1);
        }
        return -1;
    }
}
