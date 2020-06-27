

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
@WebServlet("/S2")
public class S2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public S2() {
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
		HttpSession session = request.getSession();
		String roll = (String) session.getAttribute("roll");
		String name = (String) session.getAttribute("name");
		String cgpa = (String) session.getAttribute("cgpa");
		String city = (String) session.getAttribute("city");
		String state = (String) session.getAttribute("state");
		String email = (String) session.getAttribute("email");
		String phone = (String) session.getAttribute("phone");
		out.println("<h1>Within S2 Servlet</h1>");
		out.println("<br>Roll : " + roll);
		out.println("<br>Name : " + name);
		out.println("<br>Cgpa : " + cgpa);
		out.println("<br>City : " + city);
		out.println("<br>State : " + state);
		out.println("<br>Email : " + email);
		out.println("<br>Phone : " + phone);
		session.invalidate();
		out.print("<br><a href='S3'>CLICK HERE FOR S3</a>");
	}

}
