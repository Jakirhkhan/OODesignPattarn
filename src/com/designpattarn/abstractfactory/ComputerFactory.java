package com.designpattarn.abstractfactory;

public class ComputerFactory implements DeviceAbstractFactory {
	private String ram;
	private String hdd;
	private String cpu;
	

	public ComputerFactory(String ram, String hdd, String cpu) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}


	@Override
	public Device createDevice() {
		// TODO Auto-generated method stub
		return new Computer(ram, hdd, cpu);
	}

}
