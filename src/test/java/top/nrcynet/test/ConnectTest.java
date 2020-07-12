package top.nrcynet.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import top.nrcynet.service.connect.EmployeeConnect;

public class ConnectTest {

	@Test
	public void test() {
		
		String path = "applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(path);
		
		EmployeeConnect conn = (EmployeeConnect) context.getBean("employeeConnect");
		
		System.out.println(conn.selectAll());
	}
	
}
