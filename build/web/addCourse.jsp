<%-- 
    Document   : addCourse
    Created on : 9 May, 2019, 7:28:22 PM
    Author     : Ruthvik m r
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="css/stylenav1.css" type="text/css" charset="utf-8"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Courses</title>
        <style>
            .td1{
                color: red;
            }
            table{
                border-collapse: collapse;
                width: 400px;
                position: absolute;
                top: 150px;
                left: 450px;
            }
            td,th{
                border: 1px solid #dddddd;
                text-align: left;
                padding: 8px;
            }
            tr:nth-child(even){
                background-color:#dddddd; 
            }
            p{
                position: absolute;
                top: 215px;
                right: 330px;
            }
        </style>
    </head>
    <body>
          <div class="topnav">
                <img src="photos/online.png" alt="not loaded" height="50" width="170">
                  <a class="active" href="admin.jsp">Home</a>

  <a href="aelective.jsp">Elective List</a>
  <a href="acontact.jsp">Contact</a>
  <a href="logout.jsp">Logout</a>

</div>
        <form action="addcourseAction.jsp">
        <table border="1">
            <tr>
             
                     <td>Select Semester</td>
                                <td><select name="sem">
                                        <option value="select">Select option</option>
                                        <option value="4th semester">4th Semester</option>
                                        <option value="5th Semester">5th Semester</option>
                                        <option value="6th semester">6th Semester</option>
                                        <option value="7th Semester">7th Semester</option>
                                        <option value="8th semester">8th Semester</option>
                                        <option value="9th Semester">9th Semester</option>
                                        <option value="10th semester">10th Semester</option>
                                        
                            </select></td>
                             <tr>
                        <td>Select Class</td>
                                <td><select name="degree">
                                        <option value="select">Select option</option>
                                        <option value="BCA">BCA</option>
                                        <option value="Int.MCA">Int.MCA</option>
                                        <option value="B.com">B.com</option>
                                        <option value="B.comTax">B.com Tax</option>
                                        <option value="B.sc">B.sc</option>
                                        <option value="Int.msc">Int.Msc</option>
                                        <option value="B.scVm">B.sc Visual Media</option>
                                        
                            </select></td>
                                  <tr>
                        <td>Select other Department </td>
                        <td><select name="providedby">
                                        <option value="select">Select option</option>
                                        <option value="Computer Science">Computer Science</option>
                                        <option value="Management and Commerce">Management and Commerce</option>
                                        <option value="Visual Communication">Visual Communication</option>
                                        <option value="Language Department">Language Department</option>
                                        
                                        
                            </select></td>
                                  <p class="td1">Not Related to class selected</p>
                
            </tr>
            <tr>
                <td>Course ID</td>
                <td><select name="course_id">
                        <option value="select">Select Course ID</option>
                        <option value="Green Marketing">15OEL245</option>
                        <option value="Bhagavadgita">15OEL273</option>
                        <option value="grahics">15OEL244</option>
                        <option value="Data Mining">15OEL249</option>
                        <option value="AI">15OEL257 </option>
                    </select></td>
            </tr>
            <tr>
                <td>Course Name</td>
                <td><select name="course_name">
                        <option value="select">select course Name</option>
                        <option value="Green Marketing">Green Marketing </option>
                        <option value="Bhagavadgita">Bhagavadgita  </option>
                        <option value="Data">Data Mining  </option>
                        <option value="Graphics">Graphics  </option>
                        <option value="AI">AI</option>
                    </select></td>
            </tr>
            <tr>
                <td>Description </td>
                <td><input type="text" name="des"/></td>
            </tr>
            <tr>
                <td>Lecture</td>
                <td><input type="text" name="lec"/></td>
            </tr>
            </tr>
            <tr>
                <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="submit"/></td>
            </tr>
        </table>
        </form>
    </body>
</html>
