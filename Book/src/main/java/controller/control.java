package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BookVo;
import service.EventService;

@WebServlet("/control")
public class control extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public control() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		String type = request.getParameter("type");
		String resultView = "book/";
		EventService service = new EventService();

		if (type.equals("insert")) {
			String author = request.getParameter("author");
			String title = request.getParameter("title");
			String publisher = request.getParameter("publisher");
			String content = request.getParameter("content");

			service.addBoard(new BookVo(0, title, author, publisher, content));

			resultView += "index.jsp";
		} else if (type.equals("list")) {
			ArrayList<BookVo> list = service.AllBoard();
			request.setAttribute("list", list);
			resultView += "list.jsp";

		} else if (type.equals("update")) {
			int num = Integer.parseInt(request.getParameter("num"));
			BookVo vo = service.getMem(num);
			request.setAttribute("vo", vo);
			resultView += "update.jsp";
		}else if(type.equals("edit")) {
			int num = Integer.parseInt(request.getParameter("num"));
			String author = request.getParameter("author");
			String title = request.getParameter("title");
			String publisher = request.getParameter("publisher");
			String content = request.getParameter("content");			
			service.editBoard(new BookVo(num, title, author, publisher, content));			
			resultView += "index.jsp";
		}else if(type.equals("delete")) {
			int num = Integer.parseInt(request.getParameter("num"));
			service.delBoard(num);
			resultView += "index.jsp";
		}

		RequestDispatcher dis = request.getRequestDispatcher(resultView);
		dis.forward(request, response);
	}

}
