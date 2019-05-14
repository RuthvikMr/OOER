<%@ page import ="java.sql.*" %>
<%
    String user = request.getParameter("uname");    
    String pwd = request.getParameter("pass");
    String fname = request.getParameter("fname");
    String semester=request.getParameter("semester");
    String course=request.getParameter("course");
    String email = request.getParameter("email");
    String dep=request.getParameter("dep");
    
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/openelective",
            "root", "");
    Statement st = con.createStatement();
    //ResultSet rs;
    int i = st.executeUpdate("insert into members(first_name,email, uname,semester,course,Department,pass, regdate) values ('" + fname + "','" + email + "','" +user + "','"+semester+"','"+course+"','"+dep+"','" + pwd + "', CURDATE())");
    if (i > 0) {
        //session.setAttribute("userid", user);
        //response.sendRedirect("welcome.jsp");
       // out.print("Registration Successfull!"+"<a href='index.jsp'>Go to Login</a>");
       %>
       <html>
           <head>
               <title>Registration</title>
               <style>
                   h3{
                       position: absolute;
                       top: 200px;
                       left: 550px;
                       color: green;
                   }
                   .img1{
                       position: absolute;
                       top: 100px;
                       left: 600px;
                   }
               </style>
               <link rel="stylesheet" href="css/stylenav1.css" type="text/css" charset="utf-8"/>
           </head>
           <body>
               
            <div class="topnav">
                <img src="photos/online.png" alt="not loaded" height="50" width="170">
                  <a class="active" href="index.jsp">Login</a>
 
  <a href="reg.jsp">Registration</a>
  <a href="scontact.jsp">Contact</a>
  <a href="about.jsp">About</a>

</div>
               <img src="photos/tick.png" alt="Image Not Loaded" width="100" height="100" class="img1"/>
               <h3>Registration Success....! <br/><a href="index.jsp">Click To Login</a> </h3>
           </body>
       </html>
       <%
    } else {
        response.sendRedirect("index.jsp");
    }
%>