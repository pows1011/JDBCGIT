package board;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/BoardController")
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public BoardController() {
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
		String result = "board/";
		HttpSession session = null;
		String type = request.getParameter("type");
		BoardService service = new BoardServiceImpl();
		ArrayList<Article> list = new ArrayList<>();

		if (type.equals("write")) {
			int pwd = Integer.parseInt(request.getParameter("pwd"));
			String writer = request.getParameter("writer");
			String content = request.getParameter("content");
			service.addArticle(new Article(pwd, writer, content));
			result = "BoardController?type=boardlist";
		} else if (type.equals("boardlist")) {
			list = service.getAll();
			request.setAttribute("list", list);
			result += "list.jsp";

		} else if (type.equals("editForm")) {
			int num = Integer.parseInt(request.getParameter("num"));
			Article a = service.getArticle(num);
			request.setAttribute("a", a);
			result += "editForm.jsp";
		} else if (type.equals("edit")) {
			int pwd = Integer.parseInt(request.getParameter("pwd"));
			int num = Integer.parseInt(request.getParameter("num"));
			String content = request.getParameter("content");
			service.editArticle(new Article(num, pwd, null, content));
			result = "BoardController?type=boardlist";
		} else if (type.equals("del")) {
			int num = Integer.parseInt(request.getParameter("num"));
			service.delArticle(num);
			result = "BoardController?type=boardlist";
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(result);
		dispatcher.forward(request, response);
	}

}
