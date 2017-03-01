package com.designpattarn.singleton;

public class SingletonTest {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++){
			System.out.println(i+"th Object is :"+Singleton.getInstance(i).toString());			
		}
		
	}

}
