

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Test
 */
@WebServlet("/Test")
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String roll = request.getParameter("roll");
		String name = request.getParameter("name");
		String cgpa = request.getParameter("cgpa");
		out.println("<h1>Within Test Servlet</h1>");
		out.println("<br>Roll : " + roll);
		out.println("<br>Name : " + name);
		out.println("<br>Cgpa : " + cgpa);
		HttpSession session = request.getSession();
		session.setAttribute("roll", roll);
		session.setAttribute("name", name);
		session.setAttribute("cgpa", cgpa);
		out.print("<br><a href='address.html'>CLICK HERE FOR ADDRESS</a>");
	}

}
