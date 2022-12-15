package edu.global.ex.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import edu.global.ex.page.Criteria;
import edu.global.ex.vo.DeptVO;
import edu.global.ex.vo.EmpDeptVO;
import edu.global.ex.vo.EmpVO;

@Mapper
public interface EmpMapper {
	public List<EmpVO> getList();
	public EmpVO read(int empno);//예제
	
	//조인 받아오기 방법1
	@Select("SELECT * FROM EMP, DEPT WHERE EMP.DEPTNO = DEPT.DEPTNO")
	List<EmpDeptVO> getEmpDeptList();
	
	//방법2 resultMap사용 (권장)
	List<DeptVO> getDeptEmpList();
	
	//paging 관련
	int getTotalCount();
	public List<EmpVO> getListWithPaging(Criteria cri);
}
