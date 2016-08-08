package common.springTest.Information.impl;

import common.springTest.Information.Being;

/**
 * Bring的实现类
 * 
 * @author caijing
 *
 */
public class StaticBeingFactory {
	
	//普通静态工程方法
	public static Being getBeing(String type) {
		if (type.equals("汪星人")) {
		return	new CatService();
		} else {
		return 	new DogService();
		}
	}
}
