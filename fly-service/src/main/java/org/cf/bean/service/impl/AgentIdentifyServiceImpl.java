package org.cf.bean.service.impl;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.cf.bean.service.AgentIdentifyService;
import org.springframework.stereotype.Component;

import bo.Agent;
import bo.Customer;

@Component
public class AgentIdentifyServiceImpl implements AgentIdentifyService {

	private  Logger Log = Logger.getLogger(AgentIdentifyServiceImpl.class);
	
	@Override
	public Agent queryAgentInfomationTravle(Agent agent) {
		Log.info(agent.toString());
		Agent agent2 = new Agent();
		Customer customer2 = new  Customer();
		customer2.setAge("30");
		customer2.setJob("工程师");
		customer2.setName("李四");
		Customer customer3 = new  Customer();
		customer3.setAge("301");
		customer3.setJob("工程师1");
		customer3.setName("李四1");
		 List<Customer> list = new ArrayList<Customer>();
		list.add(customer2);
		list.add(customer3);
		agent2.setAgentNo(agent.getAgentNo());
		agent2.setAgnetName(agent.getAgnetName());
		agent2.setCustomers(list);
		return agent2;
	}

}
