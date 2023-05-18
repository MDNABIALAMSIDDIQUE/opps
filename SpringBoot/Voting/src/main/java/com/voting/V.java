package com.voting;

import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/a")
public class V extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		try {
			PrintWriter printWriter = response.getWriter();
			response.setContentType("text/html");
			String name1=request.getParameter("name");
			String age1= request.getParameter("age");
		
//			int tage=Integer.parseInt(age1);
//			if (tage>=18) {
//					printWriter.println("Your Elgible Voting "+name1);
//			} else {
//				printWriter.println("Your not Elgible Voting"+name1);
//			}
//		
			printWriter.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}

         
}
}