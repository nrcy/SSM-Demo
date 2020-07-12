package top.nrcynet.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import top.nrcynet.dao.bean.Employee;
import top.nrcynet.service.connect.EmployeeConnect;

@RestController
public class RestControllerDemo {

	@Autowired
	private EmployeeConnect employeeConnect;
	
	@RequestMapping(value = "d1m1")
	public String d1m1() {
		return employeeConnect.selectAll().toString();
	}
	
}
