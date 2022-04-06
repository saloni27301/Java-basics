package com.harman.ui;

import java.util.Iterator;
import java.util.LinkedList;

public class App2 {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
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
		System.out.println("----------------------------------------------");

		Iterator<Integer> dit = list.descendingIterator();
		while (dit.hasNext()) {
			System.out.println(dit.next());
		}
		System.out.println("----------------------------------------------");
		
		
	}
}
