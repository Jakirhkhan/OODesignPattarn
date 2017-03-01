package com.designpattarn.abstractfactory;

public class MobileFactory implements DeviceAbstractFactory {
	private String ram;
	private String hdd;
	private String cpu;
	
	public MobileFactory(String ram, String hdd, String cpu) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public Device createDevice() {
		// TODO Auto-generated method stub
		return new Mobile(ram, hdd, cpu);
	}

}
