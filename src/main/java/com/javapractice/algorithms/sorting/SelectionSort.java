package com.javapractice.algorithms.sorting;

import java.util.Arrays;

/**
 * Selection sort is an in place algorithm.
 * 
 * It has a time complexity of O(n^2)
 * 
 * It is an unstable algorithm.
 * 
 * In selection sort, the original array is logically divided into 2 sub arrays.
 * an unsorted and a sorted array. An unsorted array index is defined as the
 * last index of array which gets reduced in each iteration and hence in every
 * iteration the unsorted array length decreases and sorted array length
 * increase.
 * 
 * In every iteration, the 0th index is considered as the index holding the
 * largest element in an array and it is compared with other elements from 1st
 * index until the unsorted index, if the largest index holds lesser value than
 * iterator index value then this index is marked as largest index, at the end
 * of the iteration the largest index value is swiped with unsorted index value.
 * 
 * Unlike bubble sort this algorithm doesn't do a lot of swipes hence in certain
 * cases it is considered better than bubble sort.
 * 
 */
public class SelectionSort {

	public static int[] selectionSort(int[] intArray) {

		for (int unsortedIndex = intArray.length - 1; unsortedIndex > 0; unsortedIndex--) {
			int highestIndex = 0;
			for (int i = 1; i <= unsortedIndex; i++) {
				if (intArray[highestIndex] < intArray[i]) {
					highestIndex = i;
				}
			}
			sort(intArray, highestIndex, unsortedIndex);
		}

		return intArray;
	}

	public static void sort(int[] intArray, int i, int j) {
		int temp = intArray[i];
		intArray[i] = intArray[j];
		intArray[j] = temp;
	}

	public static void main(String args[]) throws Exception {
		int[] intArray = { 2, 5, -10, 88, 54, 1 };
		System.out.println("Selection Sorted array " + Arrays.toString(intArray) + " : "
				+ Arrays.toString(selectionSort(intArray)));
	}
}
