package com.j2ee;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Message  extends HttpServlet {
	
	public void sevice(HttpServletRequest request, HttpServletResponse response) {
		
		response.setContentType("text/html");
		try {
			PrintWriter printWriter =  response.getWriter();
			LocalDateTime dateTime= LocalDateTime.now();
		int hr=dateTime.getDayOfMonth();
		
			if (hr>=3 && hr<=6)
				printWriter.println("Summer");
			else if (hr>=7 && hr<=10)
				printWriter.println("Rainy");
			else 
				printWriter.println("Winter");
			printWriter.println("<br><a href=\"http://localhost:1317/J2EE/securl\">Get Session Name</a></br>");
		printWriter.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	

}
