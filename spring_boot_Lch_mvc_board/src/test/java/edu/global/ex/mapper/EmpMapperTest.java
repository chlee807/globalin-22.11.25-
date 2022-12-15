package edu.global.ex.mapper;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.global.ex.vo.DeptVO;
import edu.global.ex.vo.EmpDeptVO;
import edu.global.ex.vo.EmpVO;

@SpringBootTest
class EmpMapperTest {

	@Autowired
	private EmpMapper empMapper; 
	
	@Test
	void testList() {
		System.out.println(empMapper);
		
		List<EmpVO> emps = empMapper.getList();
		
		for (EmpVO emp : emps) {
			System.out.println(emp);
		}
	}
	
	@Test
	void testRead() {
		
		EmpVO emp = empMapper.read(7902);
		
		System.out.println(emp);
	}
	
	//조인 방법1
	@Test
	void testGetEmpDeptList() {
		System.out.println(empMapper);
		
		List<EmpDeptVO> vos = empMapper.getEmpDeptList();
		
		for (EmpDeptVO vo : vos) {
			System.out.println(vo);
		}
	}
	
	//조인 방법2
	@Test
	void testGetDeptEmpList() {
		System.out.println(empMapper);
		
		List<DeptVO> vos = empMapper.getDeptEmpList();
		
		for (DeptVO vo : vos) {
			System.out.println(vo);
			for (EmpVO emp : vo.getEmpList()) {
				System.out.println(emp);
			}
		}
	}
}
