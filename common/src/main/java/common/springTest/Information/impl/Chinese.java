package common.springTest.Information.impl;

import common.springTest.Information.Person;

public class Chinese implements Person{

	@Override
	public void sayHello(String name) {
		System.out.println(name+"你好！");
		
	}
	@Override
	public void sayGoodbye(String name) {
		System.out.println(name+"再见！");
		
	}

}
