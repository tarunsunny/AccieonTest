package com.accionlabs.core;

public class ArrayMoveAllZeores {

	static void sendallzeroToEnd(int arr[], int n) {
		int count = 0;
		for (int i = 0; i < n; i++) 
			if (arr[i] != 0)
				arr[count++] = arr[i];

			while (count < n)
				arr[count++] = 0;
		}
	

	public static void main(String[] args) {
		int arr[] = { 6, 0, 8, 2, 3, 0, 4, 0, 1 };
		int n = arr.length;
		sendallzeroToEnd(arr, n);
		System.out.println("Array after sending zeros to the end: ");
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}

}
