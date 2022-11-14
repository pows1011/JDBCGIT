package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Member;
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

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		String type=request.getParameter("type");
		EventService service=new EventService();
		String resultView="addr/";
		
		if(type.equals("insert")) {
			String name=request.getParameter("name");
			String tel=request.getParameter("tel");
			String address=request.getParameter("address");
			int postal=Integer.parseInt(request.getParameter("postal"));
			service.addMember(new Member(name, tel, address, postal));
			resultView+="index.jsp";
			
		}else if(type.equals("list")) {
			ArrayList<Member> list=service.Allmember();			
			request.setAttribute("list",list);			
			resultView+="list.jsp";
		}else if(type.equals("update")) {
			int num=Integer.parseInt(request.getParameter("num"));
			Member m=service.getMember(num);
			request.setAttribute("m",m);
			resultView+="update.jsp";
		}else if(type.equals("edit")) {
			int num=Integer.parseInt(request.getParameter("num"));
			String name=request.getParameter("name");
			String tel=request.getParameter("tel");
			String address=request.getParameter("address");
			int postal=Integer.parseInt(request.getParameter("postal"));
			
			service.editMember(new Member(num, name, tel, address, postal));
			
			resultView+="index.jsp";
		}else if(type.equals("delete")) {
			int num=Integer.parseInt(request.getParameter("num"));
			service.delMember(num);
			resultView="control?type=list";
		}
		
		
		
		RequestDispatcher dis=request.getRequestDispatcher(resultView);
		dis.forward(request, response);
	}

}
