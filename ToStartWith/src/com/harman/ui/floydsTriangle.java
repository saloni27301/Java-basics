package com.harman.ui;

public class floydsTriangle {
	public static void main(String[] args) {
		int N =Integer.parseInt(args[0]);
		int count=1;
		for(int i=1;i<N;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(count+ " ");
				count++;
			}
			System.out.println();
		}
		
	}
}
