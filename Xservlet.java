import javax.servlet.*;
import java.io.*;
public class Xservlet implements Servlet
{
	public abstract void init(ServletConfig paramServletConfig) throws ServletException
    {

    }

  public abstract ServletConfig getServletConfig()
  {
  	return null;
  }

  public abstract void service(ServletRequest request, ServletResponse response) throws ServletException, IOException
    {
    	System.out.println("Welcome to first servlet application");
      System.out.println("Welcome to first servlet application"); // will print in console
      PrintWriter out = response.getWriter();
      response.setContentType("text/html");
      out.println("Request Processing..."); //Will print in browser
    }

  public abstract String getServletInfo()
  {
  	return null;
  }

  public abstract void destroy()
  {
  	return null;
  }
  
}