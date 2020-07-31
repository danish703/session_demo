package session_demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionCheck extends HttpServlet{

	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		HttpSession session = req.getSession();
		PrintWriter writer = res.getWriter();
		String s = (String) session.getAttribute("data");
		if(!s.equalsIgnoreCase("")) {
			writer.println("Your session is "+s);
		}else {
			writer.println("sorry you do not have set the session");
		}
			
	}
}
