package edu.global.ex.vo;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EmpVO {
	private int empno;
	private String ename;
	private String job;
	private String mgr;
	private Timestamp hiredate;
	private int sal;
	private int comm;
	private int deptno;
}
