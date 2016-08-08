package org.cf.spring;



import org.apache.log4j.Logger;
import org.cf.spring.service.CustormerIdentifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import bo.Customer;

@Controller
public class  CustormerIdentify{
	
	private Logger  logger = Logger.getLogger(CustormerIdentify.class);
	@Autowired
	private  CustormerIdentifyService custormerIdentify;
	
	
	
	@RequestMapping(value="/querycustomr")
	@ResponseBody
	public Customer  querycustomr(@RequestBody Customer  customer){
		logger.info(customer.getAge());
		logger.info(customer.getJob());
		logger.info(customer.getName());
		Customer  customers= custormerIdentify.querycustomrService(customer);
		return  customers;
	}
	
	
	@RequestMapping(value="/querycustomr2")
	public Customer  querycustomr2(String age,String   job,String name){
		logger.info(age);
		logger.info(job);
		logger.info(name);
		return  null;
	}
	
	@RequestMapping(value="/querycustomr3",method=RequestMethod.POST)
	public String  querycustomr3(String age){
		logger.info(age);
		return  "age";
	}
	
	



	
	

	
	
	

}
