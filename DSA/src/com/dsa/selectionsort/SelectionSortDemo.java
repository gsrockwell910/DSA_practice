package com.dsa.selectionsort;

public class SelectionSortDemo
{
    public static void main(String[] arg)
    {
        int[] numbers = {6, 5, 2, 8, 9, 4};

        System.out.println("Before sorting: ");
        for(int num : numbers)
        {
            System.out.print(num + " ");
        }

        selectionSort(numbers);
        
        System.out.println("\nAfter sorting: ");
        for(int num : numbers)
        {
            System.out.print(num + " ");
        }
    }

    public static void selectionSort(int[] numbers)
    {
        int size = numbers.length;
        int temp = 0;
        int minIndex = -1;

        for(int i = 0; i < size - 1; i++)
        {
            minIndex = i;
            for(int j = i + 1; j < size; j++)
            {
                if(numbers[minIndex] > numbers[j])
                {
                    minIndex = j;
                }
            }
            temp = numbers[minIndex];
            numbers[minIndex] = numbers[i];
            numbers[i] = temp;
        }
    }
}
