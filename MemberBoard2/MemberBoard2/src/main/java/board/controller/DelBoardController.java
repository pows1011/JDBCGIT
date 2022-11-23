package board.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.service.Service;
import board.service.ServiceImpl;
import model.Board;

@WebServlet("/DelBoardController")
public class DelBoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DelBoardController() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		Service service = new ServiceImpl();
		int num = Integer.parseInt(request.getParameter("num"));
		service.delBoard(num);
		RequestDispatcher dis = request.getRequestDispatcher("member/result.jsp");
		dis.forward(request, response);

	}

}
