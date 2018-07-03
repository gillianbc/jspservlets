package org.gillianbc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XmlServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello from the GET method of the Xml Servlet.  The url is defined in web.xml;  not in this servlet class");
		response.getWriter().append("XmlServlet served at: ").append(request.getContextPath());
		
	}
}
