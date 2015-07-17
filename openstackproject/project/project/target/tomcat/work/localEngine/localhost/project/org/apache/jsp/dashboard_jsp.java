package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import emulator.android.android;
import java.util.concurrent.TimeUnit;
import rackspace.openstack.CreateInstance;
import java.util.Calendar;
import java.sql.*;

public final class dashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("    <meta name=\"description\" content=\"Creative Button Styles  - Modern and subtle styles &amp; effects for buttons\" />\r\n");
      out.write("\t\t<meta name=\"keywords\" content=\"button styles, css3, modern, flat button, subtle, effects, hover, web design\" />\r\n");
      out.write("\t\t<meta name=\"author\" content=\"Codrops\" />\r\n");
      out.write("\t\t<link rel=\"shortcut icon\" href=\"../favicon.ico\"> \r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/default.css\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/component.css\" />\r\n");
      out.write("\t\t<script src=\"js/modernizr.custom.js\"></script>\r\n");
      out.write("<title>Openstack Dashboard</title>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- Optional theme -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap Core CSS -->\r\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom CSS -->\r\n");
      out.write("    <link href=\"css/stylish-portfolio.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom Fonts -->\r\n");
      out.write("    <link href=\"font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("    <link href=\"http://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,700,300italic,400italic,700italic\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("    \r\n");
      out.write("<!-- Latest compiled and minified JavaScript -->\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js\"></script>    \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write(" <!-- Navigation -->\r\n");
      out.write("    <a id=\"menu-toggle\" href=\"#\" class=\"btn btn-dark btn-lg toggle\"><i class=\"fa fa-bars\"></i></a>\r\n");
      out.write("    <nav id=\"sidebar-wrapper\">\r\n");
      out.write("        <ul class=\"sidebar-nav\">\r\n");
      out.write("         <a id=\"menu-close\" href=\"#\" class=\"btn btn-light btn-lg pull-right toggle\"><i class=\"fa fa-times\"></i></a>\r\n");
      out.write("            <li class=\"sidebar-brand\">\r\n");
      out.write("            <a href=\"#top\"  onclick = $(\"#menu-close\").click(); >MTaaS</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("            <a href=\"#top\" onclick = $(\"#menu-close\").click(); >Account Details</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("              <a href=\"#about\" onclick = $(\"#menu-close\").click(); >Projects</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("             <a href=\"#services\" onclick = $(\"#menu-close\").click(); >Test Servers</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("             <a href=\"#portfolio\" onclick = $(\"#menu-close\").click(); >Billing and Usage</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("             <a href=\"#contact\" onclick = $(\"#menu-close\").click(); >Emulators</a>\r\n");
      out.write("            </li>\r\n");
      out.write("       </ul>\r\n");
      out.write("    </nav>\r\n");
      out.write("    <nav id=\"sidebar-wrapper\">\r\n");
      out.write("        <ul class=\"sidebar-nav\">\r\n");
      out.write("        </ul>\r\n");
      out.write("    </nav>\r\n");
      out.write("     <!-- Header -->\r\n");
      out.write("    <header id=\"top\" class=\"header\">\r\n");
      out.write("        <div class=\"text-vertical-center\">\r\n");
      out.write("            <h1>MTaas - Using Openstack</h1>\r\n");
      out.write("            <p> <font color=\"#3399FF\"> <b>Welcome Tester_1</b></p></font>\r\n");
      out.write("            <hr />\r\n");
      out.write("            <h2><b>Account Info</h2>\r\n");
      out.write("\t\t\t<p>User Name: Tester_1</p>\r\n");
      out.write("\t\t\t<p>User Id: 102</p>\r\n");
      out.write("\t\t\t<p>User Email: tester_1@gmail.com</p></b>\r\n");
      out.write("            <br>\r\n");
      out.write("            <a href=\"#about\" class=\"btn btn-dark btn-lg\">Explore</a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </header>\r\n");
      out.write("    <!-- About -->\r\n");
      out.write("    <section id=\"about\" class=\"about\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-12 text-center\">\r\n");
      out.write("                    <h2>Current Projects</h2>\r\n");
      out.write("                    <p class=\"lead\">\r\n");
      out.write("                    <!-- <table> -->\r\n");
      out.write("                    <!-- <table class=\"table table-hover\">\r\n");
      out.write("\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th class=\"center\">Project Id</th>\r\n");
      out.write("\t\t\t\t\t\t<th class= \"center\">Project Name</th>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</thead> -->\r\n");
      out.write("\t\t\t\t<!-- <tbody> -->\t\r\n");
      out.write("\t\t\t\t\t<a href=\"#services\"class=\"btn btn-2 btn-2b\">Project1</a>\r\n");
      out.write("\t\t\t\t\t<!-- <tr>\r\n");
      out.write("\t\t\t\t\t<th>1</th>\r\n");
      out.write("\t\t\t\t\t<th>Project 1</th>\r\n");
      out.write("\t\t\t\t\t</tr> -->\r\n");
      out.write("\t\t\t\t\t<button class=\"btn btn-2 btn-2b\">Project2</button>\r\n");
      out.write("\t\t\t\t\t<!-- <tr>\r\n");
      out.write("\t\t\t\t\t<th>2</th>\r\n");
      out.write("\t\t\t\t\t<th>Project 2</th>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t -->\r\n");
      out.write("\t\t\t\t\t<button class=\"btn btn-2 btn-2b\">Project3</button>\r\n");
      out.write("\t\t\t\t\t<!-- <tr>\r\n");
      out.write("\t\t\t\t\t<th>3</th>\r\n");
      out.write("\t\t\t\t\t<th>Project 3</th>\r\n");
      out.write("\t\t\t\t\t</tr> -->\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<button class=\"btn btn-2 btn-2b\">Project4</button>\r\n");
      out.write("\t\t\t\t\t<!-- <tr>\r\n");
      out.write("\t\t\t\t\t<th>4</th>\r\n");
      out.write("\t\t\t\t\t<th>Project 4</th>\r\n");
      out.write("\t\t\t\t\t</tr>\t -->\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t<!-- </tbody>\r\n");
      out.write("\t\t\t</table> -->\r\n");
      out.write("                    </p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /.row -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /.container -->\r\n");
      out.write("    </section>\t\r\n");
      out.write("    \r\n");
      out.write("    <!-- Services -->\r\n");
      out.write("    <section id=\"services\" class=\"services bg-primary\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-12 text-center\">\r\n");
      out.write("                    <h2>Running Test Servers</h2>\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<p class=\"lead\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<form action = \"CreateInstance\" method=\"post\" align = \"center\">\r\n");
      out.write("                    \t\t\t<button type=\"submit\" class=\"btn btn-info\" name=\"CreateInstance\" >Launch Android Test Server</button>\r\n");
      out.write("                    \t\t</form>\r\n");
      out.write("                    \t\t</br>\r\n");
      out.write("                    \t\t<form action = \"DeleteInstance\" method=\"post\" align = \"center\">\r\n");
      out.write("\t\t\t\t\t<button type=\"submit\" class=\"btn btn-danger\" name=\"DeleteInstance\">Delete Server</button>\r\n");
      out.write("\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t</br>\r\n");
      out.write("\t\t\t                    <table>\r\n");
      out.write("\t\t\t                    <table class=\"table table-bordered\">\r\n");
      out.write("\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th class= \"text-center\">Number</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th class=\"text-center\">Test Server Id</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th class=\"text-center\">Start Time</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t</thead>\r\n");
      out.write("                \t\t\t\r\n");
      out.write("                   ");
      out.write("<tbody>\r\n");
      out.write("                                   ");

					try
							{
							Class.forName("com.mysql.jdbc.Driver");
							String url="jdbc:mysql://us-cdbr-iron-east-02.cleardb.net/ad_dd04da4b2fa8fee";
							String username="b1a0963e48fe10";
							String password="3bb69fb409842cf";
							String query="select * from ad_dd04da4b2fa8fee.virtualmachine";
							Connection conn=DriverManager.getConnection(url,username,password);
							Statement stmt=conn.createStatement();
							ResultSet rs=stmt.executeQuery(query);
							int i = 0;
							while(rs.next())
							{ 
								
							
							
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr><td>");
      out.print( i++ );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td >");
      out.print( rs.getString("vmId") );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t    <td>");
      out.print( rs.getDate("startTime") );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t        ");
}
							
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t    ");

						    rs.close();
						    stmt.close();
						    conn.close();
						    }
						catch(Exception e)
						{
						    e.printStackTrace();
						    }
							
      out.write("\t\t\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("                      \r\n");
      out.write("                                </h4>                          \r\n");
      out.write("                           </div>\r\n");
      out.write("                        </div> \r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- /.row (nested) -->\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- /.col-lg-10 -->\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /.row -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /.container -->\r\n");
      out.write("    </section>\r\n");
      out.write("    \r\n");
      out.write("     <!-- Callout -->\r\n");
      out.write("    <aside class=\"callout\">\r\n");
      out.write("        <div class=\"text-vertical-center\">\r\n");
      out.write("            <h1>MTaaS -IaaS</h1>\r\n");
      out.write("        </div>\r\n");
      out.write("    </aside>\r\n");
      out.write("    \r\n");
      out.write("    <!-- Portfolio -->\r\n");
      out.write("    <section id=\"portfolio\" class=\"portfolio\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-10 col-lg-offset-1 text-center\">\r\n");
      out.write("                    <h2>Billing and Usage</h2>\r\n");
      out.write("                    <hr class=\"small\">\r\n");
      out.write("                    <div class=\"row\" width=\"70%\" float=\"right\">\r\n");
      out.write("                        <table class=\"table table-striped\">\r\n");
      out.write("\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th class=\"text-center\">Instance Id</th>\r\n");
      out.write("<!-- \t\t\t\t\t\t<th>Start Time</th>\r\n");
      out.write("\t\t\t\t\t\t<th>End Time</th> -->\r\n");
      out.write("\t\t\t\t\t\t<th class=\"text-center\">Number of Hours</th>\r\n");
      out.write("\t\t\t\t\t\t<th class=\"text-center\">$ in USD</th>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t<tbody>\t\r\n");
      out.write("\t\t\t\t");

					try
							{
							Class.forName("com.mysql.jdbc.Driver");
							String url="jdbc:mysql://us-cdbr-iron-east-02.cleardb.net/ad_dd04da4b2fa8fee";
							String username="b1a0963e48fe10";
							String password="3bb69fb409842cf";
							String query="select * from ad_dd04da4b2fa8fee.virtualmachine";
							Connection conn=DriverManager.getConnection(url,username,password);
							Statement stmt=conn.createStatement();
							ResultSet rs=stmt.executeQuery(query);
							
							CreateInstance m_createInstanceObj = new CreateInstance();
							long temp = System.currentTimeMillis();
							
							android  m_androidObj = new android();
							
							//System.out.println("hadbkkkkkkkkkkkkaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+m_androidObj.m_creationTime);
							while(rs.next())
							{
								long diff = temp -  rs.getDate("startTime").getTime() ;
								//long seconds = diff % 1000;
								long seconds = (TimeUnit.MILLISECONDS.toSeconds(diff));
								String s_secs = Long.toString(seconds);
								long minutes = TimeUnit.MILLISECONDS.toMinutes(diff);
								String s_mins = Long.toString(minutes);
								long hours = TimeUnit.MILLISECONDS.toHours(diff);
								String s_hours = Long.toString(hours);
															
								String s_time = s_hours /*+ ":" + s_mins + ":" + s_secs */;
								
								double m_multiplicationFactor = 0.1;
								double m_price = hours * 0.1;
								String s_price  = Double.toString(m_price);
								//s_price = s_price.substring(0, 4);
								 
								//System.Out.println("hours " + hours + " minutes " + minutes + " seconds " + seconds + " m_time " + m_time);
								 
							       
							
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr><td class=\"text-center\">");
      out.print( rs.getString("vmId") );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t    <td class=\"text-center\">");
      out.print( s_time  );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"text-center\">");
      out.print( s_price  );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t        ");

							
							}
							
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t    ");

						    rs.close();
						    stmt.close();
						    conn.close();
						    }
						catch(Exception e)
						{
						    e.printStackTrace();
						    }
							
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t</table>                    \r\n");
      out.write("            </div>\r\n");
      out.write("                    <!-- /.row (nested) -->\r\n");
      out.write("                    <img src=\"\" width=\"30%\" float=\"right\">\r\n");
      out.write("                    <a href=\"#contact\" class=\"btn btn-dark\">View More Items</a>\r\n");
      out.write("             </div>\r\n");
      out.write("                <!-- /.col-lg-10 -->\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /.row -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /.container -->\r\n");
      out.write("    </section>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <!-- Call to Action -->\r\n");
      out.write(" <section id=\"contact\" class=\"contact\">\r\n");
      out.write("    <aside class=\"call-to-action bg-primary\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-12 text-center\">\r\n");
      out.write("                    <h3>Launch Testing Environments</h3>\r\n");
      out.write("                    <form action = \"android\" method=\"post\">\r\n");
      out.write("                    <button value = \"Android\" type=\"submit\" class=\"btn btn-info\" name=\"android\" >Test on Android Device</button>\r\n");
      out.write("                    <table>\r\n");
      out.write("                    <table class=\"table table-bordered\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<thead><tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr><th class=\"text-center\">Running in minutes</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th class=\"text-center\">Bill Amount in $USD</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr></thead>\r\n");
      out.write("\t\t\t\t\t\t\t<tbody>\t\r\n");
      out.write("\t\t\t\t");

					try
							{
							
							android  m_androidObj = new android();							       
							
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr><td class=\"text-center\">");
      out.print(  m_androidObj.m_creationTime );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td class=\"text-center\">");
      out.print( m_androidObj.m_creationTime * 0.01);
      out.write("</td></tr>\r\n");
      out.write("\t\t\t\t\t\t\t        ");

							
							
							
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t    ");

						    }
						catch(Exception e)
						{
						    e.printStackTrace();
						    }
							
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</tbody>\r\n");
      out.write("                    </table>\r\n");
      out.write("                     </form>\r\n");
      out.write("                     <form action = \"androidvm\" method=\"post\">\r\n");
      out.write("                     <button value = \"Android\" type=\"submit\" class=\"btn btn-info\" name=\"androidvm\" >Test on Android Emulator</button>\r\n");
      out.write("                     <table>\r\n");
      out.write("                    <table class=\"table table-bordered\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<thead><tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr><th class=\"text-center\">Running in minutes</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th class=\"text-center\">Bill Amount in $USD</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr></thead>\r\n");
      out.write("\t\t\t\t\t\t\t<tbody>\t\r\n");
      out.write("\t\t\t\t");

					try
							{
							
							android  m_androidObj = new android();							       
							
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr><td class=\"text-center\">");
      out.print(  m_androidObj.m_creationTime );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td class=\"text-center\">");
      out.print( m_androidObj.m_creationTime * 0.01);
      out.write("</td></tr>\r\n");
      out.write("\t\t\t\t\t\t\t        ");

							
							
							
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t    ");

						    }
						catch(Exception e)
						{
						    e.printStackTrace();
						    }
							
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</tbody>\r\n");
      out.write("                    </table>\r\n");
      out.write("                     </form>                    \r\n");
      out.write("                    <form action = \"ios\" method=\"post\">\r\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-info\" name=\"ios\">Test on iOS Simulator</button>\r\n");
      out.write("                    <table>\r\n");
      out.write("                    <table class=\"table table-bordered\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<thead><tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr><th class=\"text-center\">Running in minutes</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th class=\"text-center\">Bill Amount in $USD</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr></thead>\r\n");
      out.write("\t\t\t\t\t\t\t<tbody>\t\r\n");
      out.write("\t\t\t\t");

					try
							{
							
							android  m_androidObj = new android();							       
							
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr><td class=\"text-center\">");
      out.print(  m_androidObj.m_creationTime );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td class=\"text-center\">");
      out.print( m_androidObj.m_creationTime * 0.01);
      out.write("</td></tr>\r\n");
      out.write("\t\t\t\t\t\t\t        ");

							
							
							
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t    ");

						    }
						catch(Exception e)
						{
						    e.printStackTrace();
						    }
							
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</tbody>\r\n");
      out.write("                    </table>\r\n");
      out.write("                    </form>\t\t \r\n");
      out.write("                </div>\r\n");
      out.write("            </div> \r\n");
      out.write("        </div>\r\n");
      out.write("    </aside>\r\n");
      out.write("    \r\n");
      out.write("</body>\r\n");
      out.write(" <!-- jQuery -->\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("    <script src=\"js/jquery.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap Core JavaScript -->\r\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom Theme JavaScript -->\r\n");
      out.write("    <script>\r\n");
      out.write("    // Closes the sidebar menu\r\n");
      out.write("    $(\"#menu-close\").click(function(e) {\r\n");
      out.write("        e.preventDefault();\r\n");
      out.write("        $(\"#sidebar-wrapper\").toggleClass(\"active\");\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    // Opens the sidebar menu\r\n");
      out.write("    $(\"#menu-toggle\").click(function(e) {\r\n");
      out.write("        e.preventDefault();\r\n");
      out.write("        $(\"#sidebar-wrapper\").toggleClass(\"active\");\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write(" // Scrolls to the selected menu item on the page\r\n");
      out.write("    $(function() {\r\n");
      out.write("        $('a[href*=#]:not([href=#])').click(function() {\r\n");
      out.write("            if (location.pathname.replace(/^\\//, '') == this.pathname.replace(/^\\//, '') || location.hostname == this.hostname) {\r\n");
      out.write("\r\n");
      out.write("                var target = $(this.hash);\r\n");
      out.write("                target = target.length ? target : $('[name=' + this.hash.slice(1) + ']');\r\n");
      out.write("                if (target.length) {\r\n");
      out.write("                    $('html,body').animate({\r\n");
      out.write("                        scrollTop: target.offset().top\r\n");
      out.write("                    }, 1000);\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    })\r\n");
      out.write("    </script>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
