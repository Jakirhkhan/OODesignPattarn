package com.designpattarn.factory;

public class Tab extends Device {
	private String ram;
	private String hdd;
	private String cpu;
	
	public Tab(String ram, String hdd, String cpu) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public String getRAM() {
		// TODO Auto-generated method stub
		return ram;
	}

	@Override
	public String getHDD() {
		// TODO Auto-generated method stub
		return hdd;
	}

	@Override
	public String getCPU() {
		// TODO Auto-generated method stub
		return cpu;
	}

}
