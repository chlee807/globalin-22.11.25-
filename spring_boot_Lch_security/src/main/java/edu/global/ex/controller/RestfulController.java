package edu.global.ex.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
/*
 * 기존의 jsp기반의 Controller가 아님을 알려줌
 * Restful 기반임을 알려주는 애너테이션
 */
@RestController
@RequestMapping("/restful")
public class RestfulController {
	@GetMapping("/")
	public String restMain() {
		return "안녕히계세요 여러분~~";
	}
}
