package edu.global.ex.command;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.global.ex.dao.BDao;
import edu.global.ex.dto.BDto;

public class BReplyCommand implements BCommand {
   
   //자손이 구현하므로 interface의 메소드를 override한다.
   @Override
   public void execute(HttpServletRequest request, HttpServletResponse response) {
      
      System.out.println("BReplyCommand entry"); // -> 디버깅문구
      
      String bid = request.getParameter("bid");
      String bname = request.getParameter("bname");
      String btitle = request.getParameter("btitle");
      String bcontent = request.getParameter("bcontent");
      String bgroup = request.getParameter("bgroup");
      String bstep = request.getParameter("bstep");
      String bindent = request.getParameter("bindent");

      BDao dao = new BDao();
      dao.reply(bid, bname, btitle, bcontent, bgroup, bstep, bindent);

      //request.setAttribute("reply_view", dao);
      
      System.out.println("BReplyCommand over"); // -> 디버깅문구      
      
   }
   
}