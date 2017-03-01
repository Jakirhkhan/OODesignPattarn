package com.designpattarn.factory;

public class DeviceFactoryDemo {

	public static void main(String[] args) {
		Device computer = DeviceFactory.getDevice("computer", "1 Tara", "Core i7 3.2", "16GB");
		Device mobile = DeviceFactory.getDevice("mobile", "16 GB", "Dual Core 1.6", "2GB");
		Device tab = DeviceFactory.getDevice("tab", "32 GB", "Quad Core 3.2", "8GB");
		System.out.println("Computer configuration is: "+computer);
		System.out.println("\nTab configuration is: "+tab);
		System.out.println("\nMobile configuration is: "+mobile);
	}

}
