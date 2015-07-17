package emulator.androidvm;
import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class androidvm extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		androidvm a = new androidvm();
		
		if (request.getParameter("androidvm") !=null)
		{
			System.out.print("Working");
			a.runAndroidvm();
		}
		else
		{
			System.out.print("Not Working");
		}
		
		request.getRequestDispatcher("/dashboard.jsp").forward(request, response);
	}
	
	
	/*public static void main(String args[]){
		androidvm a = new androidvm();
		try {
			a.runAndroidvm();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}*/
	public void runAndroidvm()throws IOException{
		   Runtime r=Runtime.getRuntime();
		   Process p=null;
		   try
		   {
		     String s="C:\\Program Files\\Oracle\\VirtualBox\\vboxmanage startvm android";
		     p=r.exec(s);
		   }
		   catch(Exception e){
		     System.out.println("error==="+e.getMessage());
		     e.printStackTrace();
		   }
		 }
		 
		 
		}


