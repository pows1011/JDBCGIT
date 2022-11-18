package controller;

import java.io.File;
import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import model.Product;
import service.Service;
import service.ServiceImpl;


@WebServlet(name = "ProdEditController", urlPatterns = { "/seller/Edit" })
public class EditController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public EditController() {
		super();
		
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		Service service = new ServiceImpl();
		
		String name=request.getParameter("name");
		int quantity=Integer.parseInt(request.getParameter("quantity"));
		int price=Integer.parseInt(request.getParameter("price"));
		String content=request.getParameter("content");
		int num=Integer.parseInt(request.getParameter("num"));
			
		service.editProduct(new Product(num, name, quantity, price, null, content));
		
		RequestDispatcher dis=request.getRequestDispatcher("/seller/List");
		dis.forward(request, response);
		
	}

}
