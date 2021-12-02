// SY HAP, Nanako
// GDSTRUC OTIE1
package com.nanakosyhap;

public class Main {

    public static void main(String[] args) {

        int[] numbers = new int[10];

        numbers[0] = 20;
        numbers[1] = 52;
        numbers[2] = 10;
        numbers[3] = 1;
        numbers[4] = -15;
        numbers[5] = 23;
        numbers[6] = 79;
        numbers[7] = 43;
        numbers[8] = 65;
        numbers[9] = 32;

        System.out.println("Before Sorting:");
        printArrayElements(numbers);

        bubbleSortA(numbers);
        System.out.println("\n\nAscending Bubble Sort:");
        printArrayElements(numbers);

        bubbleSortD(numbers);
        System.out.println("\n\nDescending Bubble Sort:");
        printArrayElements(numbers);

        selectionSortA(numbers);
        System.out.println("\n\nAscending Selection Sort:");
        printArrayElements(numbers);

        selectionSortD(numbers);
        System.out.println("\n\nDescending Selection Sort:");
        printArrayElements(numbers);

    }

    private static void bubbleSortA(int[] arr)
    {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            for (int i = 0; i < lastSortedIndex; i++)
            {
                if (arr[i] > arr[i + 1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    private static void bubbleSortD(int[] arr)
    {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            for (int i = 0; i < lastSortedIndex; i++)
            {
                if (arr[i] < arr[i + 1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    private static void selectionSortA(int[]arr)
    {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            int largestIndex = 0;

            for (int i = 1; i <= lastSortedIndex; i++)
            {
                if (arr[i] > arr[largestIndex])
                {
                    largestIndex = i;
                }
            }

            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[largestIndex];
            arr[largestIndex] = temp;
        }
    }

    private static void selectionSortD(int[]arr)
    {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            int largestIndex = 0;

            for (int i = 1; i <= lastSortedIndex; i++)
            {
                if (arr[i] < arr[largestIndex])
                {
                    largestIndex = i;
                }
            }

            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[largestIndex];
            arr[largestIndex] = temp;
        }
    }

    private static void printArrayElements(int[] arr)
    {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}































