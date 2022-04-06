package com.harman.ui;

import java.util.Arrays;

public class PredefinedArrayEqualOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Arr1= {10,20,40};
		int[] Arr2= {10,20,40};
		if(Arrays.equals(Arr1,Arr2)) {
			System.out.println("Equals Array Found");
		}
		else {
			System.out.println(" Not Equals Array Found");
		}
	}

}
