package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.MemberVO;
import service.MemberService;

@WebServlet("/MemberCon")
public class MemberCon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MemberCon() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		String type = request.getParameter("type");
		MemberService service = new MemberService();
		String view = "board/";
		PrintWriter out = response.getWriter();

		if (type.equals("insert")) {
			String id = request.getParameter("id");
			String password = request.getParameter("password");
			String name = request.getParameter("name");
			String tel = request.getParameter("tel");
			String address = request.getParameter("address");
			String email = request.getParameter("email");
			service.add(new MemberVO(id, password, name, tel, address, email));
			view += "login.jsp";
		} else if (type.equals("login")) {
			String id = request.getParameter("id");
			String password = request.getParameter("password");
			ArrayList<MemberVO> list = service.login(id, password);
			if (list.isEmpty()) {
				out.print("<script>");
				out.print("alert('아이디 비밀번호가 틀렸습니다');");
				out.print("</script>");
				view += "login.jsp";
			} else {
				HttpSession session = request.getSession();
				session.setAttribute("memlist", list);
				view += "index.jsp";
			}

		} else if (type.equals("logout")) {
			HttpSession session = request.getSession();
			session.invalidate();
			view += "index.jsp";
		}

		RequestDispatcher dis = request.getRequestDispatcher(view);
		dis.forward(request, response);
	}

}
