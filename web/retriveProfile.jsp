
<%@page import="java.sql.*"%>

<%
String id = (String)session.getAttribute("userid");
String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "openelective";
String userid = "root";
String password = "";
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<!DOCTYPE html>
<html><head>
    <title>Profile Details</title>
     <link rel="stylesheet" href="css/stylenav1.css" type="text/css" charset="utf-8"/>
     <style>
         table{
                border-collapse: collapse;
                width: 100;
                position: absolute;
                top: 170px;
                left: 130px;
                
            }
            td,th{
                border: 1px solid #dddddd;
                text-align: left;
                padding: 8px;
                font-weight: bold;
            }
            tr:nth-child(even){
                background-color:#dddddd; 
            }
            h3{
                position: absolute;
                top: 100px;
                left: 200px;
                color: red;
            }
            .img1{
                position: absolute;
                top: 100px;
                left: 370px;
            }
     </style>
    </head>
<body>
         <div class="topnav">
                <img src="photos/online.png" alt="not loaded" height="50" width="170">
                  <a class="active" href="studentPage.jsp">Home</a>
 
  <a href="CourseList_cs.jsp">Select Course</a>
  <a href="stucontact.jsp">Contact</a>
  <a href="logout.jsp">Logout</a>

</div>
<h3>EDIT PROFILE </h3>

<%
try{
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();
String sql ="select * from members where uname='"+id+"'";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<form method="post" >
    <table border="1">
        <tr>
            <td>Name:</td>
            <td><input type="text" value="<%=resultSet.getString("first_name") %>" name="fname"></td>
        </tr>
        <tr>    
            <td>Email:</td>
            <td><input type="text" value="<%=resultSet.getString("email") %>" name="email"></td>
        </tr>
        <tr>
            <td>Reg Number</td>
            <td><input type="text"value="<%=resultSet.getString("uname") %>" name="reg" readonly></td>
        </tr>
        <tr>
            <td>Semester:</td>
            <td>
                <select value="<%=resultSet.getString("semester")%>" name="sem">
                                        <option value="select">Select option</option>
                                        <option value="4th semester">4th Semester</option>
                                        <option value="5th Semester">5th Semester</option>
                                        <option value="6th semester">6th Semester</option>
                                        <option value="7th Semester">7th Semester</option>
                                        <option value="8th semester">8th Semester</option>
                                        <option value="9th Semester">9th Semester</option>
                                        <option value="10th semester">10th Semester</option>
                </select></td>
        </tr>
        <tr>
            <td>Course</td>
            <td><select name="course" value="<%=resultSet.getString("course")%>">
                    <option value="select">Select option</option>
                                        <option value="BCA">BCA</option>
                                        <option value="Int.MCA">Int.MCA</option>
                                        <option value="B.com">B.com</option>
                                        <option value="B.comTax">B.com Tax</option>
                                        <option value="B.sc">B.sc</option>
                                        <option value="Int.msc">Int.Msc</option>
                                        <option value="B.scVm">B.sc Visual Media</option>
                </select></td>
        </tr>
        <tr><td><input type="submit" name="update" value="Update"></td>
         
<%
}

} catch (Exception e) {
e.printStackTrace();
}
%>
<%
if(request.getParameter("update")!=null){
    String fname=request.getParameter("fname");
    String email=request.getParameter("email");
    String reg=request.getParameter("reg");
    String sem=request.getParameter("sem");
    String course=request.getParameter("course");
    
    String q1="UPDATE `members` SET `first_name`='"+fname+"',`email`='"+email+"',`semester`='"+sem+"',`course`='"+course+"' WHERE uname='"+reg+"'";
int i=statement.executeUpdate(q1);
if(i==1){
    %>
       <td>Profile Updated...</td>
        </tr>
    </table>
</form>
    <img src="photos/tick.png" alt="Image Not Loaded" width="100" height="50" class="img1"/>
<%    
}
else{
    out.print("fail");
}
}
%>
</table>
</body>
</html>