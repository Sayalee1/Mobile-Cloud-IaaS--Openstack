package emulator.android;
import java.io.*;
import java.util.concurrent.TimeUnit;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class android extends HttpServlet 
{
	public long m_creationTime;
	public long temp;
	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException 
	{		
		android a = new android();
		
		if (request.getParameter("android") !=null)
		{
			m_creationTime = System.currentTimeMillis();
			System.out.print("Android Working for --- " + m_creationTime );
			temp = TimeUnit.MILLISECONDS.toMinutes(m_creationTime);
			System.out.print("Android Working for --- " + temp );
			a.runAndroid();
		}
		else
		{
			System.out.print("Not Working");
		}
		
		request.getRequestDispatcher("/dashboard.jsp").forward(request, response);
	}
	
	
/*	public static void main(String args[]){
		android a = new android();
		try {
			System.out.print("qwertyuio");
			a.runAndroid();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}*/
	public void runAndroid()throws IOException{
		   Runtime r=Runtime.getRuntime();
		   Process p=null;
		   try
		   {
			   
		     String s="javaws c:\\Users\\Sayalee\\Downloads\\androidscreencast.jnlp";
		     p=r.exec(s);
		   }
		   catch(Exception e){
		     System.out.println("error==="+e.getMessage());
		     e.printStackTrace();
		   }
		 }	 
}
