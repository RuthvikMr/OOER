
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*,com.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Choose the Course</title>
        
    </head>
     <link rel="stylesheet" href="css/stylenav1.css" type="text/css" charset="utf-8"/>
    <style>
        .styleUserid{color: red;}
        #layout{
             position: absolute;
                top: 160px;
                align-content: center;
                z-index: 1;
                left: 400px;
        }
        h1{
            top: 60px;
            position: absolute;
            left: 460px;
            color: green;
        }
        table{
                border-collapse: collapse;
                width: 100%;
                position: absolute;
                left: 10px;
            }
            td,th{
                border: 1px solid #dddddd;
                text-align: left;
                padding: 8px;
            }
            tr:nth-child(even){
                background-color:#dddddd; 
            }
                
        </style>
    <body>
               <div class="topnav">
                <img src="photos/online.png" alt="not loaded" height="50" width="170">
                 <a  class="active" href="studentPage.jsp">Home</a>
                 <a href="stucontact.jsp">Contact us</a>
                  <a href="logout.jsp">Logout</a>
                  
</div>
        <h1>Choose Your Elective Course</h1> 
     
        <form method="post" action="CS_Action.jsp">
            <div id="layout">
            <table border="1" width="150" height="200">
                
                <tr>
                  
                    <th>Sl NO</th>
        <th>Course Code </th>
        <th width="55">Course Title</th>
        <th> Course Provided By</th>
        <th> Course Description</th>
        <th> Course Lecture</th>
         <th> Click Button To add </th>
        
                </tr>
        
        
        <%
 
            String dep="";
            String sem="";
            String course="";
            
            dep=session.getAttribute("dep").toString();
            sem=session.getAttribute("sem").toString();
            course=session.getAttribute("course").toString();
        Connection con=SqlCon.getCon();
        Statement st=con.createStatement();
        ResultSet rs=null;
        String query1="SELECT * FROM `course_list` WHERE degree='"+course+"'AND providedby!='"+dep+"'AND sem='"+sem+"'";
rs=st.executeQuery(query1);
while(rs.next()){
    

%>
        <tr>
            
            <td><%=rs.getString("id")%></td>
            <td><%=rs.getString("course_id")%></td>
            <td><%=rs.getString("course_name")%></td>
            <td><%=rs.getString("providedby")%></td>
            <td><%=rs.getString("des")%></td>
            <td><%=rs.getString("lec")%></td>
            <td><input type="submit" name="course" value="<%=rs.getString("course_name")%>"></td>
        </tr>
        <%
        }

        %>
       
            </table>
            </div>
        </form>
    </body>
</html>
