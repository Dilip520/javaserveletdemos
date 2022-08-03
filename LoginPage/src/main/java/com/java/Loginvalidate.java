package com.java;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Loginvalidate")
public class Loginvalidate extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Loginvalidate() {
        // TODO Auto-generated constructor stub
    	super();
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		String name=request.getParameter("username");
		String password=request.getParameter("password");
		if(name.equals("Dilip12") && password.equals("939922293"))
		{
			pw.println("Successful login");
		}
		else
		{
			pw.println("Login failed");
		}
		pw.close();
	}

}
