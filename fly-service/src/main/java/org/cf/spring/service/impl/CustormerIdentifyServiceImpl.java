package org.cf.spring.service.impl;

import org.apache.log4j.Logger;
import org.cf.spring.service.CustormerIdentifyService;
import org.springframework.stereotype.Service;

import bo.Customer;




@Service
public class CustormerIdentifyServiceImpl implements CustormerIdentifyService {

	Logger Log = Logger.getLogger(CustormerIdentifyServiceImpl.class);
	
	
	@Override
	public Customer querycustomrService(Customer customer) {
		// TODO Auto-generated method stub
		Log.info(customer.toString());
		Customer customer2 = new  Customer();
		customer2.setAge("30");
		customer2.setJob("工程师");
		customer2.setName("李四");
		return customer2;
	}

}
