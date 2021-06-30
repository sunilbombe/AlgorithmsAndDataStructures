package com.javapractice.algorithms.sorting;

import java.util.Arrays;

/**
 * This is an in place algorithm.
 * 
 * It has time complexity of O(n^2)
 * 
 * It is type of insertion sort.
 * 
 * As this is a type of insertion sort, it works in the same fashion with one
 * change, the gap between the value to be compared is higher in the beginning
 * which reduces over iterations so in the last iteration it works like a
 * insertion sort only. it is more performant than insertion sort as the number
 * of shift's are reduced
 * 
 */
public class ShellSort {

	public static void shellSort(int[] intArray) {

		for (int gap = intArray.length / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < intArray.length; i++) {
				int newElement = intArray[i];
				int j = i;
				while (j >= gap && intArray[j - gap] > newElement) {
					intArray[j] = intArray[j - gap];
					j -= gap;
				}
				intArray[j] = newElement;
			}
		}
	}

	public static void main(String args[]) {
		int[] intArray = { 20, 35, -15, 7, 55, -21 };
		System.out.print("Shell sorted array " + Arrays.toString(intArray));
		shellSort(intArray);
		System.out.print(": " + Arrays.toString(intArray));
	}
}
