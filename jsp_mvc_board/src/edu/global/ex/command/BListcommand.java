package edu.global.ex.command;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.global.ex.dao.BDao;
import edu.global.ex.dto.BDto;

public class BListcommand implements BCommand {
	
	//자손이 구현하므로 interface의 메소드를 override한다.
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		BDao dao = new BDao();
		//테이블에 있는 모든 데이터를 끌고 온다는 뜻
		List<BDto> dtos = dao.list();
		
		//forwarding될때까지 메모리에 살아있음을 반드시 기억해야한다★
		request.setAttribute("list", dtos);      
		
	}
	
}
