package common.springTest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import common.springTest.Information.Being;
import common.springTest.Information.Person;


/**
 * 
 * 测试类
 * 7.7.3: Bean实例的创建方式及依赖配置---调用实例工厂方法创建Bean
 * @author caijing
 *
 */
public class InstanceFactoryBean {

	
	//测试方法二,使用配置文件加载
			public static void main(String[] args){
				ClassPathXmlApplicationContext  ctx = new ClassPathXmlApplicationContext ("classpath*:spring/web-common.xml");
				Person instanceBean = (Person)ctx.getBean("chinese",Person.class);
				instanceBean.sayGoodbye("chinese");
				Person catService =(Person) ctx.getBean("American",Person.class);
				catService.sayHello("American");
			}
}
