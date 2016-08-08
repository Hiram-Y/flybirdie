package common.springTest;

import java.util.Map;

import org.cf.util.Mytest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import bo.Customer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring/webapp-context.xml" })
public class InstanceIOC {

	@Autowired
	private Mytest mytest;

	@Test
	public void testname() throws Exception {

		System.out.println(1);

	}

	@Test
	public Map<String, Customer> getcumsomerInfomation() {
		Map<String, Customer> map = mytest.getUserNmaeInfomation();
		System.out.println(map);

		return map;

	}

	public static void main(String[] args) {
		// 实例化springIOC容器
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath*:spring/webapp-context.xml");
		// 从实例化的IOC容器中获取bean对象
		/*
		 * 当spring容器启动后，因为spring容器可以管理bean对象的创建，销毁等生命周期，
		 * 所以我们只需从容器直接获取Bean对象就行，而不用编写一句代码来创建bean对象。 从容器获取bean对象的代码如下：
		 */
		Mytest fqaService = (Mytest) context.getBean("mytest");
		System.out.println(fqaService);
	}

}
