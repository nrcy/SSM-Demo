package top.nrcynet.service.connect;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import top.nrcynet.dao.bean.Employee;
import top.nrcynet.dao.mapper.EmployeeMapper;

public class EmployeeConnect implements EmployeeMapper{
	
	private SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	public List<Employee> selectAll() {
		return sqlSession.getMapper(EmployeeMapper.class).selectAll();
	}
	
	
	
	
}
