package com.javapractice.algorithms.sorting;

import java.util.Arrays;

/**
 * Insertion sort is an in place algorithm.
 * 
 * It has time complexity of O(n^2)
 * 
 * It is a stable sort algorithm.
 * 
 * In insertion sort the entire array is divided in to 2 logical partition. A
 * sorted partition and an unsorted partition. To start with, the first index in
 * the array is a sorted partition and the second index is the first element of
 * unsorted partition and the element at this position is considered as a
 * newElement. The new element is compared with each element in the sorted
 * Partition from right to left. if the element in sorted partition is greater
 * than the new element then the elements in the sorted partition moved to the
 * right by place to make room for the new element. this movement continues
 * until the comparison mismatch or we hit the start of array, finally the
 * element is put into the index where the comparison mismatch.This way in each
 * iteration the sorted partition grow and unsorted partition reduces by length
 * one
 *
 */
public class InsertionSort {

	public static int[] insertionSort(int[] intArray) {
		for (int unsortedArrayIndex = 1; unsortedArrayIndex < intArray.length; unsortedArrayIndex++) {
			int newElement = intArray[unsortedArrayIndex];
			int i;
			for (i = unsortedArrayIndex; i > 0 && intArray[i - 1] > newElement; i--) {
				intArray[i] = intArray[i - 1];
			}
			intArray[i] = newElement;
		}
		return intArray;
	}

	public static void main(String args[]) {
		int[] intArray = { 20, 35, -15, 7, 55, 1 - 22 };
		System.out.println("Insertion Sorted array " + Arrays.toString(intArray) + " : "
				+ Arrays.toString(insertionSort(intArray)));
	}

}
