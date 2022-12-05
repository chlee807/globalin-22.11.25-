package edu.global.ex.command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.global.ex.dao.BDao;
import edu.global.ex.dto.BDto;

public class BListCommand implements BCommand {
	public void excute(HttpServletRequest request, HttpServletResponse response) {
		BDao dao = new BDao();
		List<BDto> dtos = dao.list();
		request.setAttribute("list", dtos);
	}
}