package mvcdemo.Controller;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 





import mvcdemo.model.AndroidEmulatorLoader;
import mvcdemo.model.Authentication;
import mvcdemo.model.DBConnection;
import mvcdemo.model.UserDetails;
import mvcdemo.model.ValueStore;
 
//import sun.text.normalizer.ICUBinary.Authenticate;
 

public class LoginController extends HttpServlet 
{
	
	//Android m_androidObj = new Android();
	private static final long serialVersionUID = 1L;
 
	public LoginController() {
		super();
	}
 @Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
 
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		RequestDispatcher rd = null;
		//System.out.println("hello");
 
		Authentication authenticator = new Authentication();
		String result = authenticator.authenticate(username, password);
		if (result.equals("success")) {
			rd = request.getRequestDispatcher("/dashboard.jsp");
			UserDetails user1 = new UserDetails(username, password);
			System.out.println(user1);
			request.setAttribute("user", user1);
			
			DBConnection db= new DBConnection();
			List<ValueStore> s  = db.dbconn();
			System.out.println("printing list");
			System.out.println(s);
			request.setAttribute("test", s);
			
			
		} else {
			rd = request.getRequestDispatcher("/error.jsp");
		}
		
		System.out.println("here are we!");
		rd.forward(request, response);
	}
 
}