package com.designpattarn.abstractfactory;

import com.designpattarn.abstractfactory.DeviceFactory;
public class AbstractFactoryDemo {

	public static void main(String[] args) {
		Device computer = DeviceFactory.getDevice(new ComputerFactory("16 GB","1 Tara","Corei7"));
		Device tab = DeviceFactory.getDevice(new ComputerFactory("2 GB","500 GB","2.4 GHz"));
		Device mobile = DeviceFactory.getDevice(new ComputerFactory("2 GB","32 GB","1.6 GHz"));
		System.out.println("Computer configuration is: "+computer);
		System.out.println("\nTab configuration is: "+tab);
		System.out.println("\nMobile configuration is: "+mobile);
	}

}
