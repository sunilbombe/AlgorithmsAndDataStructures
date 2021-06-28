package com.javapractice.algorithms.sorting;

import java.util.Arrays;

/**
 * Bubble sort is an in place algorithm.
 * 
 * It has a time complexity of O(n^2) (Quadratic)
 * 
 * It is a stable sorting algorithm.
 * 
 * In bubble sort, the original array is logically divided into 2 sub arrays. an
 * unsorted and a sorted array. An unsorted array index is defined as the last
 * index of array which gets reduced in each iteration and hence in every
 * iteration the unsorted array length decreases and sorted array length
 * increase.
 * 
 * In each iteration it compared the consecutive array indexes from the
 * beginning until unsorted index and move the large element to the end of
 * unsorted array (by swiping the index values if first is greater than second).
 * In the next iteration unsorted array index reduces by one and sorted array
 * length increases by one. The entire array gets sorted when unsorted index
 * reaches to 1.
 */
public class BubbleSort {

	public static int[] bubleSort(int[] intArray) {

		for (int lastUnsortedIndex = intArray.length; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			for (int i = 0; i < lastUnsortedIndex - 1; i++) {
				if (intArray[i] > intArray[i]) {
					swap(intArray, i, i + 1);
				}
			}
		}
		return intArray;
	}

	public static void swap(int[] intArray, int i, int j) {
		int temp = intArray[i];
		intArray[i] = intArray[j];
		intArray[j] = temp;
	}

	public static void main(String[] args) {
		int[] intArr = { 2, 5, -10, 88, 54, 01 };
		System.out.println("Bubble Sorted " + Arrays.toString(intArr) + " : " + Arrays.toString((bubleSort(intArr))));
	}

}
