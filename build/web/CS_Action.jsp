<%-- 
    Document   : CS_Action
    Created on : 18 Apr, 2019, 10:21:21 PM
    Author     : Ruthvik m r
--%>

<%@page import="java.sql.*"%>
<html>
    <head>
        <title>Your Course has Been Saved</title>
        <link rel="stylesheet" href="css/stylenav1.css" type="text/css" charset="utf-8"/>
        <style>
            h1{
                top: 250px;
                position: absolute;
                left: 430px;
                color: green;
            }
           
            .img1{
                top: 150px;
                position: absolute;
                left: 680px;
            }
            .a1{
                top: 400px;
                position: absolute;
                left: 680px;
                font-weight: bold;
            }
        </style>
   </head>
   <body>
       <div class="topnav">
                <img src="photos/online.png" alt="not loaded" height="50" width="170">
                  <a class="active" href="logout.jsp">LOGOUT</a>
                  <img src="photos/tick.png" alt="Image Not Loaded" width="100" height="100" class="img1"/>
       
</div>
       <a href="logout.jsp" class="a1"> Click to Logout</a>
   </body>
</html>
<%
    String user_id="";
    user_id=session.getAttribute("userid").toString();
    String userid=request.getParameter("userid");
String CScourse="";
String course[]=request.getParameterValues("course");
for(int i=0;i<course.length;i++)
    CScourse=course[i]+" ";
try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/openelective","root","");
    Statement stmt=con.createStatement();
    int i=stmt.executeUpdate("insert into course(courseSelected,userid) values('"+CScourse+"','"+user_id+"')");
   // out.print("Your Selected Course has been Saved...! Thank You... ");
   %>
   <h1>
       Your Selected Course has Successfully Saved...! <br/><center>Thank You...</center>
   </h1>
<%
   }
catch(Exception e){
    System.out.println(e);
}
%>