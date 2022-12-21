package edu.global.ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class HomeController {

	@GetMapping("/")
	public String home() {
		return "main";
	}
	
	@GetMapping("/user/userHome")
	public String userHome() {
		log.info("userHome()..");
		return "/user/userHome";
	}
	
	/*
	 * 아래코드와 동일
	 * @GetMapping("/admin/adminHome") public String adminHome() {
	 * log.info("adminHome().."); return "/admin/adminHome"; }
	 */
	
	@GetMapping("/admin/adminHome")
	public void adminHome() {
		log.info("adminHome()..");
	}
}
