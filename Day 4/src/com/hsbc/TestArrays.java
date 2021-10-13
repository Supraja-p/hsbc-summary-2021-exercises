package com.hsbc;

import java.util.Scanner;

public class TestArrays {
	public static void main(String[] args) {
		/*
		 * Storing simple values in the array at runtime
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements you want to store");
		int size = scan.nextInt();
		// creation of array for int type of values
		int[] items = new int[size]; // each memory will have 0 by default
		for(int i = 0; i < size; i++) {
			System.out.println("Enter the element to store at index: "+i);
			items[i] = scan.nextInt();
		}
		// iterate the array elements & print
		for(int x : items) {
			System.out.println(x);
		}
		scan.close();
	}
}
