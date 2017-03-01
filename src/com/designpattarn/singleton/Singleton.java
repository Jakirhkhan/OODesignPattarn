package com.designpattarn.singleton;

public class Singleton {
	private static Singleton instance;
	private int item;

	private Singleton(int item) {
		this.item = item;
	}
	
	public static Singleton getInstance(int item){
		if(instance == null){
			instance = new Singleton(item);
		}
		return instance;
	}

	@Override
	public String toString() {
		return "" + item + "";
	}
	
	
}
