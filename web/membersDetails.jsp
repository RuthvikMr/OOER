<%-- 
    Document   : membersDetails
    Created on : 7 May, 2019, 12:07:52 PM
    Author     : Ruthvik m r
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%
String url="jdbc:mysql://localhost:3306/openelective";

String user="root";
String driver="com.mysql.jdbc.Driver";
String pass="";
try{
    Class.forName(driver);
}catch(Exception e){
    e.printStackTrace();
}
Connection con=null;
Statement stmt=null;
ResultSet rs=null;
%>
<html>
    <head>
        <title>Student Registration Details</title>   
        <link rel="stylesheet" href="css/stylenav1.css" type="text/css" charset="utf-8"/>
        <style>
            table{
                border-collapse: collapse;
                width: 100%;
                left:20px;
                position: absolute;
            }
            td,th{
                border: 1px solid #dddddd;
                text-align: left;
                padding: 8px;
            }
            tr:nth-child(even){
                background-color:#dddddd; 
            }
            .table1{
                top: 100px;
                position: absolute;
                right: 200px;
            }
            h3{
                top: 50px;
                position: absolute;
                left: 500px;
            color: green;
            }
        </style>
</head>
<body>
    <h3>STUDENT REGISTRATION DETAILS</h3>
         
            <div class="topnav">
                <img src="photos/online.png" alt="not loaded" height="50" width="170">
                  <a class="active" href="admin.jsp">Home</a>
  <a href="addCourse.jsp">Add Course</a>
  <a href="acontact.jsp">Contact</a>
  <a href="logout.jsp">Logout</a>
</div>
    
    <table border="1" class="table1">
        <th>Name</th>
        <th>email</th>
        <th>Student ID</th>
        <th>Department</th>
        <th>Course</th>
        <th>Semester</th>
      
        <%

        try{
            Class.forName(driver);
             con=DriverManager.getConnection(url,user,pass);
             stmt=con.createStatement();
             rs=stmt.executeQuery("select * from members");
             
             while(rs.next()){
                 
                 %>
        <tr>
            <td><%=rs.getString("first_name")%></td>
            <td><%=rs.getString("email")%></td>
            <td><%=rs.getString("uname")%></td>
            <td><%=rs.getString("Department")%></td>
            <td><%=rs.getString("course")%></td>
            <td><%=rs.getString("semester")%></td>
             </tr>
        <%  }
        
       
              
             
    con.close();
}  
 catch(Exception e){
            e.printStackTrace();
        }
                 
                 %>
    </table>
</body>
</html>
