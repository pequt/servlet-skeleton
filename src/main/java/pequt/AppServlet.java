package pequt;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppServlet extends HttpServlet {
	private static final long serialVersionUID = -514365812430086138L;

	private static Logger logger = LoggerFactory.getLogger(AppServlet.class);

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		logger.debug("doGet at {}", new Date());
		
		resp.setContentType("text/html");
	    PrintWriter out = resp.getWriter();

	    out.println("<HTML>");
	    out.println("<HEAD><TITLE>Hello World</TITLE></HEAD>");
	    out.println("<BODY>");
	    out.println("<h1>Hello World</h1>");
	    out.println("</BODY></HTML>");
	}

	public String hello() {
		return "Hello";
	}
}