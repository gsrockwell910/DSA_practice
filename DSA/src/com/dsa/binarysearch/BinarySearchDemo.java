package com.dsa.binarysearch;

public class BinarySearchDemo
{
    public static void main(String[] args)
    {
        int[] numbers = {11, 24, 53, 974, 42, 5, 6, 420}; // Array must be sorted.
        int target = 42; // Value to search for.

        int result = binarySearch(numbers, target); // Store result.

        if(result > 0) // If element was found.
            System.out.println("Target found at index: " + result); // Print result.
        else // Element not found.
            System.out.println("Target was not found in the array."); // Print not found message.
    }

    private static int binarySearch(int[] numbers, int target)
    {
        return -1;
    }
}
