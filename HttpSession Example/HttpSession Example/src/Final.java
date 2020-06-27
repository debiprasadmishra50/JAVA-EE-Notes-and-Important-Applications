

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
@WebServlet("/Final")
public class Final extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Final() {
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
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		session.setAttribute("email", email);
		session.setAttribute("phone", phone);
		out.println("<h1>Within Final Servlet</h1>");
		out.println("<br>Roll : " + roll);
		out.println("<br>Name : " + name);
		out.println("<br>Cgpa : " + cgpa);
		out.println("<br>City : " + city);
		out.println("<br>State : " + state);
		out.println("<br>Email : " + email);
		out.println("<br>Phone : " + phone);
		out.print("<br><a href='S1'>CLICK HERE FOR S1</a>");
	}

}
