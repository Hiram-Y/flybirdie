package common.springTest.Information.impl;

import common.springTest.Information.Being;

public class DogService implements Being {
	
	private String mas;
	
	public void setMas(String mas) {
		this.mas = mas;
	}
	@Override
	public void toBeing() {
		// TODO Auto-generated method stub
		System.out.println("汪星人爱吃骨头！");

	}
}
