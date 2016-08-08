package common.springTest.Information.impl;

import common.springTest.Information.chineseTemplept;

/**
 * 7.8.2: 深入理解容器中的Bean---使用子Bean、抽象bean的使用
 * @author caijing
 *
 */

public class ChineseTempleptService implements chineseTemplept {
	
	public  String  name;
	

	public void setName(String name) {
		this.name = name;
	}



	@Override
	public void sayhello(String name) {
		// TODO Auto-generated method stub
		System.out.println(name+",你好！");
	}

}
