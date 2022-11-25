package member;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Conroller")
public class Conroller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Conroller() {
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
		String result = "member/";
		HttpSession session = null;
		boolean flag = false;
		String type = request.getParameter("type");
		Service service = new ServiceImpl();

		if (type.equals("join")) {
			String id = request.getParameter("id");
			String pwd = request.getParameter("pwd");
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			service.join(new Member(id, pwd, name, email));
			result += "login.jsp";
		} else if (type.equals("login")) {
			String id = request.getParameter("id");
			String pwd = request.getParameter("pwd");
			flag = service.login(id, pwd);
			if (flag) {
				session = request.getSession();
				session.setAttribute("id", id);
				result += "result.jsp";
			} else {
				result += "result.jsp";
			}
		} else if (type.equals("out")) {
			session = request.getSession();
			String id = (String) session.getAttribute("id");
			service.delMember(id);
			result += "login.jsp";
		} else if (type.equals("logout")) {
			session = request.getSession();
			session.removeAttribute("id");
			session.invalidate();
			result += "login.jsp";
		}else if(type.equals("search")) {
			session = request.getSession();
			String id = (String) session.getAttribute("id");
			Member m=service.getMember(id);
			request.setAttribute("m", m);
			result += "search.jsp";
		}else if(type.equals("edit")) {
			String id = request.getParameter("id");
			String pwd = request.getParameter("pwd");
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			service.editMember(new Member(id, pwd, name, email));
			result += "result.jsp";
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher(result);
		dispatcher.forward(request, response);
	}

}
