package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BoardVO;
import service.BoardService;


@WebServlet("/BoardCon")
public class BoardCon extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public BoardCon() {
        super();
      
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		String type=request.getParameter("type");
		BoardService service=new BoardService();
		String resultView="board/";
		
		if(type.equals("board")) {
			ArrayList<BoardVO> list=service.AllBoard();
			
			request.setAttribute("boardlist",list);			
			resultView+="board.jsp";
			
		}else if(type.equals("boardAdd")) {
			String board_text=request.getParameter("board_text");
			String board_name=request.getParameter("board_name");	
			String board_content=request.getParameter("board_content");
			service.addBoard(new BoardVO(board_text, board_content, board_name,0));
			resultView="BoardCon?type=board";
		}
		
		
		RequestDispatcher dis=request.getRequestDispatcher(resultView);
		dis.forward(request, response);
		
		
		
		
	}

}
