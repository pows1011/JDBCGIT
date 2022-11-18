package Controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

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
		String resultView="blog/";
		BoardVO b=new BoardVO();
		if(type.equals("list")) {
			ArrayList<BoardVO> list=service.AllBoard();			
			request.setAttribute("list",list);		
			
			resultView+="board.jsp";
			
			RequestDispatcher dis=request.getRequestDispatcher(resultView);
			dis.forward(request, response);
			
		}else if(type.equals("boardAdd")) {
			String img = "";
			int maxSize = 1024 * 1024 * 10;
			MultipartRequest multi = null;
			final String filePath="blog/file";
			String uploadPath = request.getSession().getServletContext().getRealPath(filePath);
			System.out.println(uploadPath);
			File upDir = new File(uploadPath);
			if(!upDir.exists()){
			upDir.mkdirs();
			}
			try {
				multi = new MultipartRequest(request, uploadPath, maxSize, "UTF-8", new DefaultFileRenamePolicy());
				b.setBoard_text(multi.getParameter("board_text"));
				b.setBoard_content(multi.getParameter("board_content"));
				b.setBoard_name(multi.getParameter("board_name"));
				
				Enumeration files=multi.getFileNames();			
				while(files.hasMoreElements()) {				
					String file1=(String)files.nextElement();				
					img=multi.getFilesystemName(file1);				
					File file=multi.getFile(file1);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			b.setBoard_img("/file/"+img);
			service.addBoard(b);				
			response.sendRedirect("BoardCon?type=list");
			
			
			
		}else if(type.equals("detail")) {
			int board_num=Integer.parseInt(request.getParameter("board_num"));
			BoardVO vo=service.getBoard(board_num);
			request.setAttribute("vo",vo);
			resultView+="boarddetail.jsp";
			RequestDispatcher dis=request.getRequestDispatcher(resultView);
			dis.forward(request, response);
		}
		

		
		
		
	}

}
