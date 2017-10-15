package com.rashidi.assignmnets.algorithms.sort;

/**
 * Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements
 * if they are in wrong order.
 *
 *
 * First pass   {57, 23, 32, 12, 34, 9, 88}
 * the algorithm compares the first two elements to check which one is greater.if the first one is greater
 * than the second one, they must be swapped. since 57 > 23 --> the algorithm swaps them --> {23, 57, 32, 12, 34, 9, 88}
 * Next, we compare 57 with 32, Swap since 57 > 32 --> {23, 32, 57, 12, 34, 9, 88}
 * Next, we compare 57 with 12, Swap since 57 > 12 --> {23, 32, 12, 57, 34, 9, 88}
 * Next, we compare 57 with 34, Swap since 57 > 34 --> {23, 32, 12, 34, 57, 9, 88}
 * Next, we compare 57 with 9, Swap since 57 > 9 --> {23, 32, 12, 34, 9, 57, 88}
 * Next, we compare 57 with 88, Now, since these elements are already in order, algorithm does not swap them. --> {23, 32, 12, 34, 9, 57, 88}
 *
 * Second pass   {23, 32, 12, 34, 9, 57, 88}
 * 23 < 32 --> algorithm does not swap them
 * 32 > 12 --> swap --> {23, 12, 32, 34, 9, 57, 88}
 * 32 < 34 --> algorithm does not swap them
 * 34 > 9 --> swap --> {23, 12, 32, 9, 34, 57, 88}
 * 34 < 57 --> algorithm does not swap them
 * 57 < 88 --> algorithm does not swap them
 *
 * it continues until the algorithm does not need to swap.
 *
 * Time complexity is O(n^2)
 *
 * @author Mina Rashidi
 */
public class BubbleSort {

    public static void main(String args[]) {

        BubbleSort bubbleSort = new BubbleSort();
        int arr[] = {57, 23, 32, 12, 34, 9, 88};
        bubbleSort.sort(arr);
        System.out.println("---Sorted array---");
        bubbleSort.printArray(arr);
    }

    private void sort(int array[]) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (array[j] > array[j + 1]) {
                    // swap elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
    }

    private void printArray(int array[]) {
        for (int anArr : array) {
            System.out.print(anArr + " ");
        }
    }

}
