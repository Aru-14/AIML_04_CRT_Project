package com.student;

	import java.io.IOException;
	import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
@WebServlet("/submission")

//Annotations use DoPost and DoGet method instead of service of Servlet and web.xml
//using jsp and database
	public class student extends HttpServlet {
		
	public void DoPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		String n=req.getParameter("name");
		String email=req.getParameter("email");
		String rollno=req.getParameter("rollno");
		String contact=req.getParameter("contact");
		String password=req.getParameter("password");
		
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();

		out.println("<html><head><style>");
		out.println("body { font-family: 'Segoe UI', sans-serif; background-color: #f0f2f5; display: flex; justify-content: center; align-items: center; height: 100vh; margin: 0; }");
		out.println(".card { background: white; padding: 30px; border-radius: 12px; box-shadow: 0 10px 30px rgba(0,0,0,0.1); width: 350px; text-align: left; }");
		out.println(".card h2 { color: #2ecc71; text-align: center; margin-bottom: 20px; }");
		out.println(".info-row { border-bottom: 1px solid #eee; padding: 10px 0; display: flex; justify-content: space-between; }");
		out.println(".label { font-weight: bold; color: #555; }");
		out.println(".value { color: #333; }");
		out.println("</style></head><body>");

		out.println("<div class='card'>");
		out.println("<h2>Registration Success!</h2>");
		out.println("<div class='info-row'><span class='label'>Name:</span> <span class='value'>" + n + "</span></div>");
		out.println("<div class='info-row'><span class='label'>Email:</span> <span class='value'>" + email + "</span></div>");
		out.println("<div class='info-row'><span class='label'>Roll No:</span> <span class='value'>" + rollno + "</span></div>");
		out.println("<div class='info-row'><span class='label'>Contact:</span> <span class='value'>" + contact + "</span></div>");
		out.println("<div class='info-row'><span class='label'>Password:</span> <span class='value'>********</span></div>"); // Masked for security
		out.println("<br><center><small>Student data has been processed.</small></center>");
		out.println("</div>");

		out.println("</body></html>");
	}
	}
