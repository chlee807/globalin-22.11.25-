package edu.global.ex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.global.ex.page.Criteria;
import edu.global.ex.page.PageVO;
import edu.global.ex.service.EmpService;
import edu.global.ex.vo.EmpVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller

/* @RequestMapping("/emp_page") */
public class EmpController {

	@Autowired
	private EmpService empService;

	/*
	 * // http://localhost:8282/list2?pageNum=5&amount=10">1</a>
	 * 
	 * @GetMapping("/emp_list") public String emp_list(Criteria cri, Model model) {
	 * log.info("emp_list() .."); log.info("emp_list() Criteria " + cri);
	 * 
	 * model.addAttribute("emps", empService.getList(cri));
	 * 
	 * int total = empService.getTotal(); log.info("total" + total);
	 * 
	 * model.addAttribute("pageMaker", new PageVO(cri, total));
	 * 
	 * return "emp_page/emp_list"; }
	 * 
	 * @GetMapping("/emp_content_view") public String content_view(EmpVO empVO,
	 * Model model) { log.info("emp_content_view()..");
	 * 
	 * int empno = empVO.getEmpno(); model.addAttribute("content_view",
	 * empService.read(empno));
	 * 
	 * return "emp_page/emp_content_view"; }
	 */

	@GetMapping("/emp")
	public String emp(Model model) {
		log.info("tables()..");
		
		model.addAttribute("depts", empService.getDeptEmpList());
		
		return "tables";
	}
}
