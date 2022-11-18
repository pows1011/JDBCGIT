package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Product;
import service.Service;
import service.ServiceImpl;


@WebServlet("/seller/List")
public class ListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ListController() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		Service service = new ServiceImpl();
		
		ArrayList<Product> list=service.getProductAll();
		request.setAttribute("list", list);
		RequestDispatcher dis=request.getRequestDispatcher("/view/seller/list.jsp");
		dis.forward(request, response);
		
	}

}
