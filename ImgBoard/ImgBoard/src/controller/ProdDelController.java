package controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Product;
import service.Service;
import service.ServiceImpl;



@WebServlet("/seller/Del")
public class ProdDelController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
     
     
    public ProdDelController() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doPost(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		Service service = new ServiceImpl();
		int num=Integer.parseInt(request.getParameter("num"));
		Product p=service.getProduct(num);
		service.delProduct(num);
		
		
		String uploadPath = "C:\\Web\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\webapps\\shop_img\\";
		String[] arr=p.getImg().split("/");
		String fname=arr[arr.length-1];		
		File f=new File(uploadPath+fname);		
		f.delete();
		response.sendRedirect("/ImgBoard/seller/List");		
		
	}

}
