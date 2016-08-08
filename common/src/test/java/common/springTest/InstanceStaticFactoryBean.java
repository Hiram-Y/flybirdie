package common.springTest;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import common.springTest.Information.Being;

public class InstanceStaticFactoryBean {
	
	//测试方法二,使用配置文件加载
		public static void main(String[] args){
			ClassPathXmlApplicationContext  ctx = new ClassPathXmlApplicationContext ("classpath*:spring/web-common.xml");
			Being instanceBean = (Being)ctx.getBean("dogFactory",Being.class);
			instanceBean.toBeing();
			Being catService =(Being) ctx.getBean("catFactory",Being.class);
			catService.toBeing();
		}

}
  