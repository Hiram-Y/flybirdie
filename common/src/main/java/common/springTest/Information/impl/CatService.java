package common.springTest.Information.impl;

import common.springTest.Information.Being;

public class CatService implements Being {
	
	
	private String mas;
	
	public void setMas(String mas) {
		this.mas = mas;
	}

	@Override
	public void toBeing() {
		System.out.println("喵星人爱老鼠");

	}

}
