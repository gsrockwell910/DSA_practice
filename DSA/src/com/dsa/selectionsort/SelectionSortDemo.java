package com.dsa.selectionsort;

public class SelectionSortDemo
{
    public static void main(String[] arg)
    {
        int[] numbers = {6, 5, 2, 8, 9, 4};
        int size = numbers.length;
        int temp = 0;

        System.out.println("Before sorting: ");
        for(int num : numbers)
        {
            System.out.print(num + " ");
        }

        System.out.println("\nAfter sorting: ");
        for(int num : numbers)
        {
            System.out.print(num + " ");
        }
    }
}
