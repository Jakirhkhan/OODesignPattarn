package com.designpattarn.factory;

public class DeviceFactory {
	public static Device getDevice(String deviceName, String hdd, String cpu, String ram) {
		if ("computer".equalsIgnoreCase(deviceName)) {
			return new Computer(ram, hdd, cpu);
		} else if ("mobile".equalsIgnoreCase(deviceName)) {
			return new Mobile(ram, hdd, cpu);
		} else if ("tab".equalsIgnoreCase(deviceName)) {
			return new Tab(ram, hdd, cpu);
		}
		return null;
	}
}
