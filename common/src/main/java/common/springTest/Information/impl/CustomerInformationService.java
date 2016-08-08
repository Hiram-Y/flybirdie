package common.springTest.Information.impl;

import javax.annotation.PostConstruct;

import bo.Customer;
import common.springTest.Information.CustomerInformation;


public class CustomerInformationService implements CustomerInformation{
	
	@PostConstruct
	public  void  init(){
		System.out.println(11111);
		System.out.println(11111);
		System.out.println(11111);
  		System.out.println(11111);
		System.out.println(11111);	
		System.out.println(11111);
		
	}
	
	public CustomerInformationService(){
		System.out.println(12312323);
		System.out.println(12312323);
		System.out.println(12312323);
		System.out.println(12312323);
		System.out.println(12312323);
		System.out.println(12312323);
		System.out.println(12312323);
		System.out.println(12312323);
		System.out.println(12312323);
		System.out.println(12312323);
		System.out.println(12312323);
		
		
		
	}
	
	@Override
	public Customer getCustomerInformation() {
	
		return new Customer("age", "name", "job");
	}

}
