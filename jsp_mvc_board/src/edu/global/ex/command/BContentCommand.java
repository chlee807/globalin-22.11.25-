package edu.global.ex.command;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.global.ex.dao.BDao;
import edu.global.ex.dto.BDto;

public class BContentCommand implements BCommand {
	
	//자손이 구현하므로 interface의 메소드를 override한다.
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		System.out.println("BContentCommand ..");
		
		String bid = request.getParameter("bid");
		
		
		//request에 담긴 데이터를 BController에서 forwarding으로 넘김으로써  
	    //dto객체를 content_view.jsp에서 사용할 수 있도록 한다.
		BDao dao = new BDao();
		//테이블에 있는 모든 데이터를 끌고 온다는 뜻
		BDto dto = dao.contentView(bid);
		
		request.setAttribute("content_view", dto);
	   
		
	}
	
}
