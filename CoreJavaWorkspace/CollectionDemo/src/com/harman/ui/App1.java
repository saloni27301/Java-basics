package com.harman.ui;

import java.util.ArrayList;
import java.util.Iterator;

public class App1 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(105);
		list.add(20);
		list.add(27);
		list.add(80);
		
		System.out.println(list.toString());
		System.out.println("----------------------------------------------");
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("----------------------------------------------");
		
		for(Integer data : list) {
			System.out.println(data);
		}
		System.out.println("----------------------------------------------");
		
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("----------------------------------------------");

		for(int i = list.size() - 1; i >= 0; i--) {
			System.out.println(list.get(i));
		}
		
		
	}
}
