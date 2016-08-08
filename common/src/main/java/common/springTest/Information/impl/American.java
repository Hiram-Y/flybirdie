package common.springTest.Information.impl;

import common.springTest.Information.Person;

public class American implements Person {

	@Override
	public void sayHello(String name) {
		// TODO Auto-generated method stub
		System.out.println(name+"hello！");

	}
	@Override
	public void sayGoodbye(String name) {
		// TODO Auto-generated method stub
		System.out.println(name+"Goodbye！");
	}

}
