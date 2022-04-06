package com.harman.ui;

public class MatrixAddition {

	public static void main(String[] args) {
		int[][] Arr= {{1,2,3},{4,5,6},{7,8,9}};
		int Sum=0;
		for(int i=0;i<Arr.length;i++) {
			for(int j=0;j<Arr.length;j++) {
				Sum =Sum+Arr[i][j];
			}
		}
		System.out.println("sum of matrix:"+ Sum);

	}

}
