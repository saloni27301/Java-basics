package com.harman.ui;

import java.util.HashMap;

public class App5 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Core Java", 30);
		map.put("Oracle", 15);
		map.put("Hibernate", 12);
		map.put("Servlet", 4);
		
		System.out.println(map);
		System.out.println("-----------------------------------------------------");
		
		for(String key : map.keySet()) {
			System.out.println(key + "\t" + map.get(key));
		}
		System.out.println("-----------------------------------------------------");
		for(Integer data : map.values()) {
			System.out.println(data);
		}
		System.out.println("-----------------------------------------------------");
	}

}
