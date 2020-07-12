package top.nrcynet.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import top.nrcynet.dao.bean.Employee;
import top.nrcynet.service.connect.EmployeeConnect;

@Controller
public class UrlControllerDemo {

	@Autowired
	private EmployeeConnect employeeConnect;
	
	@RequestMapping("d2m1")
	public String d2m1(HttpServletRequest request,
			HttpServletResponse response) {
		List<Employee> employees = employeeConnect.selectAll();
		
		request.setAttribute("employees", employees);
		
		return "forward:/view/employee.jsp";
				
	}
	
	
}
