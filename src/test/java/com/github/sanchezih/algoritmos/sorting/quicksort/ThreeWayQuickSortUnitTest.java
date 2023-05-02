package com.github.sanchezih.algoritmos.sorting.quicksort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import com.github.sanchezih.algoritmos._01_sorting._03_quicksort.ThreeWayQuickSort;

public class ThreeWayQuickSortUnitTest {

	@Test
	public void givenIntegerArray_whenSortedWithThreeWayQuickSort_thenGetSortedArray() {
		int[] actual = { 3, 5, 5, 5, 3, 7, 7, 3, 5, 5, 7, 3, 3 };
		int[] expected = { 3, 3, 3, 3, 3, 5, 5, 5, 5, 5, 7, 7, 7 };
		ThreeWayQuickSort.threeWayQuickSort(actual, 0, actual.length - 1);
		assertArrayEquals(expected, actual);
	}
}