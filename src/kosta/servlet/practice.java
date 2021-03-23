package kosta.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({ "/practice", "/prac" })
public class practice extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public practice() {
        super();
            }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();//라이터 객체 연결
		out.println("<html><head><title>Hello</title></head>");
		out.println("<body>");
		out.println("<h1>HelloServlet!!</h1>");
		out.println("</body></html>");
		
		out.close();
	}

}
