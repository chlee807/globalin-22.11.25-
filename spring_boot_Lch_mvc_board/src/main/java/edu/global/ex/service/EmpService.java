package edu.global.ex.service;

import java.util.List;

import edu.global.ex.page.Criteria;
import edu.global.ex.vo.DeptVO;
import edu.global.ex.vo.EmpVO;

public interface EmpService {
	public List<EmpVO> getList();
	EmpVO read(int empno);
	List<DeptVO> getDeptEmpList();
	
	int getTotal();
	List<EmpVO> getList(Criteria criteria);
}
