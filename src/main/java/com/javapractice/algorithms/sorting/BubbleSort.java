package com.javapractice.algorithms.sorting;

import java.util.Arrays;

/**
 * Bubble sort is an in place algorithm. It has a worst time complexity of
 * O(n^2) (Quadratic)
 * 
 * It creates a logical partition in the array and considers the nth index as
 * unsorted array at the beginning as nothing is sorted. In each iteration it
 * compared the consecutive array indexes from the beginning until unsorted
 * index and move the large element to the end of unsorted array. In the next
 * iteration unsorted array index reduces by one and sorted array length
 * increases by one. the entire array gets sorted when unsorted index reached to
 * 1.
 */
public class BubbleSort {

	public static int[] bubleSort(int[] intArray) {

		for (int lastUnsortedIndex = intArray.length; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			for (int j = 0; j < lastUnsortedIndex - 1; j++) {
				if (intArray[j] > intArray[j + 1]) {
					int temp = intArray[j];
					intArray[j] = intArray[j + 1];
					intArray[j + 1] = temp;
				}
			}
		}
		return intArray;
	}

	public static void main(String[] args) {
		int[] intArr = new int[] { 2, 5, -10, 88, 54, 01 };
		System.out.println("Bubble Sorted " + Arrays.toString(intArr) + " : " + Arrays.toString((bubleSort(intArr))));
	}

}
