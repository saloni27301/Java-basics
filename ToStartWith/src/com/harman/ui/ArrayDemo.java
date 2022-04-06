package com.harman.ui;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] arr;
		arr = new int[5];
		arr[0] = 10;
		arr[1] = 11;
		arr[2] = 20;
		arr[3] = 17;
		arr[4] = 18;
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("----------------------------------------------------");
		for(int data : arr)//Enhanced for loop
		{
			System.out.println(data);
		}
		System.out.println("----------------------------------------------------");
		int[] arr2 = {10,30,20};
		int[] arr3 = {10,30,20}; //both are different object
		System.out.println(arr2==arr3);//array is object in java we cannot print object directly in java
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.equals(arr2, arr3));
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.binarySearch(arr2,22));//we will get the positive index if we able to find the element else get negative index
	}

	private static void Arrays(int[] arr2, int i) {
		// TODO Auto-generated method stub
		
	}
}
