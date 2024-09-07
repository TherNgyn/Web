package io.session;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet(urlPatterns = {"/ShowSession"})
public class ShowSession extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		
		PrintWriter out = resp.getWriter();
		String ten = "";
		HttpSession hs = req.getSession();
		Object ob = hs.getAttribute("ten");
		if(ob!=null) {
			ten = String.valueOf(ob);
		}else {
			resp.sendRedirect("/session/CreateSession");
		}
		
		out.println(ten);
		out.close();
	}
	
}
