package edu.global.ex.command;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.global.ex.dao.BDao;
import edu.global.ex.dto.BDto;

/*
 * 10) 위에서 게시판 연습 글을 클릭하면 나오는 창에서, 
 * 답변을 클릭하여 다음페이지로 url이 어떻게 넘어가는지 확인한다. 
 * http://localhost:8282/jsp_board_test02/reply_view.do?bid=6  
 * 이렇게 reply_view.do를 치고 bid값이 주소로 넘어가므로 
 * DAO에서 reply_view() 메소드를 생성한다. 
 * (답변을 눌렀을때 글 내용이 그대로 있는 상태를 표현하는걸로 배웠기때문에 contentView() 
 * 메소드와 내용이 똑같다.) 
 * 
 * 
 * 
 * */
public class BReplyViewCommand implements BCommand {
	
	//자손이 구현하므로 interface의 메소드를 override한다.
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		System.out.println("BReplyViewCommand entry"); //->디버깅 문구
		String bid = request.getParameter("bid");
		
		
		BDao dao = new BDao();
		BDto dto = dao.reply_view(bid);
		
		request.setAttribute("reply_view", dto);		
		System.out.println("BReplyViewCommand over"); //->디버깅 문구  
		
	}	
}
