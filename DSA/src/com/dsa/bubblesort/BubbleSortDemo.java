package com.dsa.bubblesort;

public class BubbleSortDemo
{
    public static void main(String[] args)
    {
        int[] numbers = {5, 1, 2, 8, 3, 7, 99, 0};

        System.out.println("Before sorting: ");
        for(int num : numbers)
        {
            System.out.print(num + " ");
        }

       bubbleSort(numbers);

       System.out.println("\nAfter sorting: ");
       for(int num : numbers)
       {
           System.out.print(num + " ");
       }

    }

    private static int[] bubbleSort(int[] numbers)
    {
        return null;
    }
}
