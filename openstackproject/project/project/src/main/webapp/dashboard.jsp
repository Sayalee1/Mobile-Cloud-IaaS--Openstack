<%@page import="emulator.android.android"%>
<%@page import="java.util.concurrent.TimeUnit"%>
<%@page import="rackspace.openstack.CreateInstance"%>
<%@page import="java.util.Calendar"%>
<%@page import= "java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="d"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <meta name="description" content="Creative Button Styles  - Modern and subtle styles &amp; effects for buttons" />
		<meta name="keywords" content="button styles, css3, modern, flat button, subtle, effects, hover, web design" />
		<meta name="author" content="Codrops" />
		<link rel="shortcut icon" href="../favicon.ico"> 
		<link rel="stylesheet" type="text/css" href="css/default.css" />
		<link rel="stylesheet" type="text/css" href="css/component.css" />
		<script src="js/modernizr.custom.js"></script>
<title>Openstack Dashboard</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">

<!-- Bootstrap Core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="css/stylish-portfolio.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="http://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,700,300italic,400italic,700italic" rel="stylesheet" type="text/css">
    
<!-- Latest compiled and minified JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>    
</head>
<body>

 <!-- Navigation -->
    <a id="menu-toggle" href="#" class="btn btn-dark btn-lg toggle"><i class="fa fa-bars"></i></a>
    <nav id="sidebar-wrapper">
        <ul class="sidebar-nav">
         <a id="menu-close" href="#" class="btn btn-light btn-lg pull-right toggle"><i class="fa fa-times"></i></a>
            <li class="sidebar-brand">
            <a href="#top"  onclick = $("#menu-close").click(); >MTaaS</a>
            </li>
            <li>
            <a href="#top" onclick = $("#menu-close").click(); >Account Details</a>
            </li>
            <li>
              <a href="#about" onclick = $("#menu-close").click(); >Projects</a>
            </li>
            <li>
             <a href="#services" onclick = $("#menu-close").click(); >Test Servers</a>
            </li>
            <li>
             <a href="#portfolio" onclick = $("#menu-close").click(); >Billing and Usage</a>
            </li>
            <li>
             <a href="#contact" onclick = $("#menu-close").click(); >Emulators</a>
            </li>
       </ul>
    </nav>
    <nav id="sidebar-wrapper">
        <ul class="sidebar-nav">
        </ul>
    </nav>
     <!-- Header -->
    <header id="top" class="header">
        <div class="text-vertical-center">
            <h1>MTaas - Using Openstack</h1>
            <p> <font color="#3399FF"> <b>Welcome Tester_1</b></p></font>
            <hr />
            <h2><b>Account Info</h2>
			<p>User Name: Tester_1</p>
			<p>User Id: 102</p>
			<p>User Email: tester_1@gmail.com</p></b>
            <br>
            <a href="#about" class="btn btn-dark btn-lg">Explore</a>
        </div>
    </header>
    <!-- About -->
    <section id="about" class="about">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <h2>Current Projects</h2>
                    <p class="lead">
                    <!-- <table> -->
                    <!-- <table class="table table-hover">
				<thead>
					<tr>
						<th class="center">Project Id</th>
						<th class= "center">Project Name</th>
					</tr>
				</thead> -->
				<!-- <tbody> -->	
					<a href="#services"class="btn btn-2 btn-2b">Project1</a>
					<!-- <tr>
					<th>1</th>
					<th>Project 1</th>
					</tr> -->
					<button class="btn btn-2 btn-2b">Project2</button>
					<!-- <tr>
					<th>2</th>
					<th>Project 2</th>
					</tr>
					 -->
					<button class="btn btn-2 btn-2b">Project3</button>
					<!-- <tr>
					<th>3</th>
					<th>Project 3</th>
					</tr> -->
					
					<button class="btn btn-2 btn-2b">Project4</button>
					<!-- <tr>
					<th>4</th>
					<th>Project 4</th>
					</tr>	 -->
					
				<!-- </tbody>
			</table> -->
                    </p>
                </div>
            </div>
            <!-- /.row -->
        </div>
        <!-- /.container -->
    </section>	
    
    <!-- Services -->
    <section id="services" class="services bg-primary">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <h2>Running Test Servers</h2>
                    <%-- <hr class="small">
                    <div class="container">
            			<div class="row">
							<div class="col-lg-12 text-center">
							<p align= "justify"> --%>
						<p class="lead">
						
						<form action = "CreateInstance" method="post" align = "center">
                    			<button type="submit" class="btn btn-info" name="CreateInstance" >Launch Android Test Server</button>
                    		</form>
                    		</br>
                    		<form action = "DeleteInstance" method="post" align = "center">
					<button type="submit" class="btn btn-danger" name="DeleteInstance">Delete Server</button>
							</form>
							</br>
			                    <table>
			                    <table class="table table-bordered">
						<thead>
								<tr>
									<th class= "text-center">Number</th>
									<th class="text-center">Test Server Id</th>
									<th class="text-center">Start Time</th>
								</tr>
							
							</thead>
						</thead>
                			
                   <%--  <div class="row">
                        <div class="col-md-3 col-sm-6">
                            <div class="service-item">
                                <h4>
                                  --%><tbody>
                                   <%
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
								
							
							%>	
								<tr><td><%= i++ %></td>
								<td ><%= rs.getString("vmId") %></td>
							    <td><%= rs.getDate("startTime") %></td>
							        <%}
							%>	
							
						    <%
						    rs.close();
						    stmt.close();
						    conn.close();
						    }
						catch(Exception e)
						{
						    e.printStackTrace();
						    }
							%>		
	
								<%-- <c:forEach items="${test}" var="v">
								<tr>
									<td>${v.vmid}</td>
									<td>${v.startTime}</td>
									<td>${v.endTime}</td>
								</tr>
								</c:forEach> --%>
								</tbody>
								</table>
					
                      
                                </h4>                          
                           </div>
                        </div> 
                        </div>
                    </div>
                    <!-- /.row (nested) -->
                </div>
                <!-- /.col-lg-10 -->
            </div>
            <!-- /.row -->
        </div>
        <!-- /.container -->
    </section>
    
     <!-- Callout -->
    <aside class="callout">
        <div class="text-vertical-center">
            <h1>MTaaS -IaaS</h1>
        </div>
    </aside>
    
    <!-- Portfolio -->
    <section id="portfolio" class="portfolio">
    <div class="container">
            <div class="row">
                <div class="col-lg-10 col-lg-offset-1 text-center">
                    <h2>Billing and Usage</h2>
                    <hr class="small">
                    <div class="row" width="70%" float="right">
                        <table class="table table-striped">
				<thead>
					<tr>
						<th class="text-center">Instance Id</th>
<!-- 						<th>Start Time</th>
						<th>End Time</th> -->
						<th class="text-center">Number of Hours</th>
						<th class="text-center">$ in USD</th>
					</tr>
				</thead>
				<tbody>	
				<%
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
								 
							       
							%>	
								<tr><td class="text-center"><%= rs.getString("vmId") %></td>
							    <td class="text-center"><%= s_time  %></td>
								<td class="text-center"><%= s_price  %></td>
							        <%
							
							}
							%>	
							</table>
						    <%
						    rs.close();
						    stmt.close();
						    conn.close();
						    }
						catch(Exception e)
						{
						    e.printStackTrace();
						    }
							%>					
				</tbody>
			</table>                    
            </div>
                    <!-- /.row (nested) -->
                    <img src="" width="30%" float="right">
                    <a href="#contact" class="btn btn-dark">View More Items</a>
             </div>
                <!-- /.col-lg-10 -->
            </div>
            <!-- /.row -->
        </div>
        <!-- /.container -->
    </section>
    
    
    
    <!-- Call to Action -->
 <section id="contact" class="contact">
    <aside class="call-to-action bg-primary">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <h3>Launch Testing Environments</h3>
                    <form action = "android" method="post">
                    <button value = "Android" type="submit" class="btn btn-info" name="android" >Test on Android Device</button>
                    <table>
                    <table class="table table-bordered">
								<thead><tr>
									<tr><th class="text-center">Running in minutes</th>
									<th class="text-center">Bill Amount in $USD</th>
								</tr></thead>
							<tbody>	
				<%
					try
							{
							
							android  m_androidObj = new android();							       
							%>	
								<tr><td class="text-center"><%=  m_androidObj.m_creationTime %></td>
									<td class="text-center"><%= m_androidObj.m_creationTime * 0.01%></td></tr>
							        <%
							
							
							%>	
						    <%
						    }
						catch(Exception e)
						{
						    e.printStackTrace();
						    }
							%>					
				</tbody>
                    </table>
                     </form>
                     <form action = "androidvm" method="post">
                     <button value = "Android" type="submit" class="btn btn-info" name="androidvm" >Test on Android Emulator</button>
                     <table>
                    <table class="table table-bordered">
								<thead><tr>
									<tr><th class="text-center">Running in minutes</th>
									<th class="text-center">Bill Amount in $USD</th>
								</tr></thead>
							<tbody>	
				<%
					try
							{
							
							android  m_androidObj = new android();							       
							%>	
								<tr><td class="text-center"><%=  m_androidObj.m_creationTime %></td>
									<td class="text-center"><%= m_androidObj.m_creationTime * 0.01%></td></tr>
							        <%
							
							
							%>	
						    <%
						    }
						catch(Exception e)
						{
						    e.printStackTrace();
						    }
							%>					
				</tbody>
                    </table>
                     </form>                    
                    <form action = "ios" method="post">
                    <button type="submit" class="btn btn-info" name="ios">Test on iOS Simulator</button>
                    <table>
                    <table class="table table-bordered">
								<thead><tr>
									<tr><th class="text-center">Running in minutes</th>
									<th class="text-center">Bill Amount in $USD</th>
								</tr></thead>
							<tbody>	
				<%
					try
							{
							
							android  m_androidObj = new android();							       
							%>	
								<tr><td class="text-center"><%=  m_androidObj.m_creationTime %></td>
									<td class="text-center"><%= m_androidObj.m_creationTime * 0.01%></td></tr>
							        <%
							
							
							%>	
						    <%
						    }
						catch(Exception e)
						{
						    e.printStackTrace();
						    }
							%>					
				</tbody>
                    </table>
                    </form>		 
                </div>
            </div> 
        </div>
    </aside>
    
</body>
 <!-- jQuery -->
 
 
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

    <!-- Custom Theme JavaScript -->
    <script>
    // Closes the sidebar menu
    $("#menu-close").click(function(e) {
        e.preventDefault();
        $("#sidebar-wrapper").toggleClass("active");
    });

    // Opens the sidebar menu
    $("#menu-toggle").click(function(e) {
        e.preventDefault();
        $("#sidebar-wrapper").toggleClass("active");
    });

 // Scrolls to the selected menu item on the page
    $(function() {
        $('a[href*=#]:not([href=#])').click(function() {
            if (location.pathname.replace(/^\//, '') == this.pathname.replace(/^\//, '') || location.hostname == this.hostname) {

                var target = $(this.hash);
                target = target.length ? target : $('[name=' + this.hash.slice(1) + ']');
                if (target.length) {
                    $('html,body').animate({
                        scrollTop: target.offset().top
                    }, 1000);
                    return false;
                }
            }
        });
    })
    </script>
</html>