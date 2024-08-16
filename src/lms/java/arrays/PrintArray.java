package lms.java.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrintArray {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = scanner.nextInt();

		System.out.println("Enter the elements of the array");
		int[] array1 = new int[size];
		for (int i = 0; i < size; i++) {
			array1[i] = scanner.nextInt();
		}

		populateArray(array1, size);
		 

		findMax(array1, size);

		findMin(array1, size);

		scanner.close();
	}

	private static void findMax(int[] array1, int size) {

		System.out.println("Maximum of array");
		int max = array1[0];
		for (int i = 0; i < size; i++) {
			if (array1[i] > max) {
				max = array1[i];
			}
		}
		System.out.println("Max = " + max);
	}

	private static void findMin(int[] array1, int size) {
		System.out.println("Minimum of array");
		int min = array1[size - 1];
		for (int i = 0; i < size; i++) {
			if (array1[i] < min) {
				min = array1[i];
			}
		}
		System.out.println("Min = " + min);

	}

	private static void populateArray(int[] array1, int size) {

		System.out.println("Array Elements :");
		Arrays.sort(array1);
		for (int i = 0; i < size; i++) {
			System.out.println(array1[i]);
		}
		
		
	}

}
