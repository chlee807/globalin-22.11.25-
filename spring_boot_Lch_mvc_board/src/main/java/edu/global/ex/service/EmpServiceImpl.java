package edu.global.ex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.global.ex.mapper.EmpMapper;
import edu.global.ex.page.Criteria;
import edu.global.ex.vo.DeptVO;
import edu.global.ex.vo.EmpVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	private EmpMapper empMapper;

	// 글 전체목록
	@Override
	public List<EmpVO> getList() {
		log.info("getList()..");
		return empMapper.getList();
	}
	
	@Override
	public EmpVO read(int empno) {
		log.info("read()..");
		return empMapper.read(empno);
	}

	@Override
	public int getTotal() {
		log.info("getTotal() ..");

		return empMapper.getTotalCount();
	}

	@Override
	public List<EmpVO> getList(Criteria criteria) {
		log.info("getList(Criteria criteria) ..");

		return empMapper.getListWithPaging(criteria);
	}

	@Override
	public List<DeptVO> getDeptEmpList(){
		return empMapper.getDeptEmpList();
	}
}
