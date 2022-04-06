package com.harman.ui;

public class CallByValue {
	static void change(int num) {
		num++;
	}
	public static void main(String[] args) {
		int number=10;
		change(number);//this is call by value method 
		System.out.println(number);
		}

	}
//and we dont have pointers in java so we dont call for call by refernece method