package org.cf.util;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import bo.Customer;

public class Mytest {
	
	@PostConstruct
	public void init(){
		System.out.println("我要运行了");
		System.out.println("我要运行了");
		System.out.println("我要运行了");
		System.out.println("我要运行了");
		System.out.println("我要运行了");
		
	}
	
	public  Mytest(){
		System.out.println("我在容器初始化的时候被初始化了");
		System.out.println("我在容器初始化的时候被初始化了");
		System.out.println("我在容器初始化的时候被初始化了");
		System.out.println("我在容器初始化的时候被初始化了");
		System.out.println("我在容器初始化的时候被初始化了");
		System.out.println("我在容器初始化的时候被初始化了");
		System.out.println("我在容器初始化的时候被初始化了");
		System.out.println("我在容器初始化的时候被初始化了");
		System.out.println("我在容器初始化的时候被初始化了");
	}
	
	public   Map<String, Customer> getUserNmaeInfomation(){
		Map<String, Customer> map = new HashMap<String,Customer>();
		Customer customer = new Customer("18", "张三", "java开发");
		Customer customer1 = new Customer("16", "张三1", "java开发");
		Customer customer2 = new Customer("12", "张三2", "java开发");
		Customer customer3 = new Customer("14", "张三3", "java开发");
		map.put("1", customer);
		map.put("2", customer1);
		map.put("3", customer2);
		map.put("4", customer3);
		return map;
		
	}
	
	

}
