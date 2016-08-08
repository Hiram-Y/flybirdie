package org.cf.bean;

import org.apache.log4j.Logger;
import org.cf.bean.service.AgentIdentifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import bo.Agent;

@Controller
public class AgentIdentify {
	
	
	Logger  logger = Logger.getLogger(AgentIdentify.class);
	
	@Autowired
	private AgentIdentifyService agentIdentify;
	
	
	
	
	@RequestMapping(value="queryAgentInfomationTravle",consumes="application/json",method =RequestMethod.POST)
	public  Agent  queryAgentInfomationTravle(@RequestBody Agent  agent){
		logger.info(agent.toString());
		
		Agent agent2 = agentIdentify.queryAgentInfomationTravle(agent);
		
		return agent2;
		
	}

}
