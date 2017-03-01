package com.designpattarn.abstractfactory;

public class DeviceFactory {
	public static Device getDevice(DeviceAbstractFactory factory){
		return factory.createDevice();
	}
}
