package com.harman.ui;

import java.util.ArrayList;
import java.util.Collections;

public class App4 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(105);
		list.add(20);
		list.add(27);
		list.add(80);
		
		System.out.println(list.toString());
		System.out.println("----------------------------------------------");
		
		Collections.sort(list);
		System.out.println(list.toString());
		System.out.println("----------------------------------------------");
		
	}
}
