package top.nrcynet.dao.mapper;

import java.util.List;

import top.nrcynet.dao.bean.Employee;

public interface EmployeeMapper {

	List<Employee> selectAll();
	
}
