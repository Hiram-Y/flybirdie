package common.springTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import bo.Customer;
import common.springTest.Information.CustomerInformation;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath*:spring/web-common.xml" })
public class InstanceBean {
	
	private CustomerInformation customerInformation;
	public void setCustomerInformation(CustomerInformation customerInformation) {
		this.customerInformation = customerInformation;
	}
	@Test
	public void getCustromerInformation() {
		Customer customer= customerInformation.getCustomerInformation();
		System.out.println(customer.toString());
	}
	//测试方法二,使用配置文件加载
	public static void main(String[] args){
		ClassPathXmlApplicationContext  ctx = new ClassPathXmlApplicationContext ("classpath*:spring/web-common.xml");
		InstanceBean instanceBean = (InstanceBean)ctx.getBean("instanceBean",InstanceBean.class);
		System.out.println(instanceBean.customerInformation.toString()); 
	}

}
