package emulator.ios;
import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emulator.android.android;

public class ios extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		ios a = new ios();
		
		if (request.getParameter("ios") !=null)
		{
			System.out.print("Working");
			a.runios();
		}
		else
		{
			System.out.print("Not Working");
		}
		
		request.getRequestDispatcher("/dashboard.jsp").forward(request, response);
	}
	
	
	/*public static void main(String args[]){
		ios a = new ios();
		try {
			a.runios();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
*/
public void runios()throws IOException{
	   Runtime r=Runtime.getRuntime();
	   Process p=null;
	   try
	   {
	     String s="c:\\Program Files (x86)\\iPadian\\iPadian.exe";
	     p=r.exec(s);
	   }
	   catch(Exception e){
	     System.out.println("error==="+e.getMessage());
	     e.printStackTrace();
	   }
	 }
	 
	 
	}

