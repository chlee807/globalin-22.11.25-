package jsptest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GradeAcction
 */
@WebServlet("/gradeaction")
public class GradeAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GradeAction() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doPost..호출");
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");

		int kor = 0;
		int eng = 0;
		int math = 0;

		try {
			kor = Integer.valueOf(request.getParameter("kor"));
			eng = Integer.valueOf(request.getParameter("eng"));
			math = Integer.valueOf(request.getParameter("math"));
		} catch (Exception e) {
			// TODO: handle exception
		}

		Grade grade = new Grade(kor, eng, math);
		PrintWriter writer = response.getWriter();
		writer.print("<html><head></head><body>");
		writer.print("평균: " + grade.average() + "<br>");
		writer.print("등급: " + grade.getGrade() + "<br>");
		writer.print("</body></html>");
	}

}
