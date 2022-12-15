package edu.global.ex.vo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BoardVOTest {

	@Test
	void test() {
		BoardVO vo = new BoardVO();
		vo.setBname("홍길동");
		//assertEquals(vo.getBname(), "홍길자");
		System.out.println(vo);
	}

}
