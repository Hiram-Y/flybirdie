package common.springTest.Information.impl;

import common.springTest.Information.Person;

/**
 * 7.7.3: Bean实例的创建方式及依赖配置---调用实例工厂方法创建Bean
 * @author caijing
 *
 */
public class PersonBeanInstanceFactory {
	//工厂方法
	public  Person getPersion(String name){
		if(name.equals("chinese")){
			return  new Chinese();
		}else{
			return  new American();
		}
	}
}
