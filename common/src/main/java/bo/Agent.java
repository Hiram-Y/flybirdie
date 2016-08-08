package bo;

import java.util.List;

/**
 * 旅游代理员信息
 * @author caijing
 *
 */

public class Agent {
	private  String  agnetName;
	private String  agentNo;
	private  List<Customer> customers;
	
	public Agent(){
		
	}

	public String getAgnetName() {
		return agnetName;
	}

	public void setAgnetName(String agnetName) {
		this.agnetName = agnetName;
	}

	public String getAgentNo() {
		return agentNo;
	}

	public void setAgentNo(String agentNo) {
		this.agentNo = agentNo;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	@Override
	public String toString() {
		return "Agent [agnetName=" + agnetName + ", agentNo=" + agentNo + ", customers=" + customers + "]";
	}
	
	
}
