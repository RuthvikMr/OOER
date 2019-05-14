<%-- 
    Document   : elective
    Created on : 9 May, 2019, 8:20:16 PM
    Author     : surya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <link rel="stylesheet" href="css/stylenav1.css" type="text/css" charset="utf-8"/>
        <style>
              table{
                border-collapse: collapse;
                width: 100%;
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
    </head>
     <body>
             <div class="topnav">
                <img src="photos/online.png" alt="not loaded" height="50" width="170">
                  <a class="active" href="studentPage.jsp">Home</a>
 
  <a href="CourseList_cs.jsp">Select Course</a>
  <a href="stucontact.jsp">Contact</a>
  <a href="logout.jsp">Logout</a>

</div>
         <form method="post" action="elective.jsp">
             <table border="1" width="350" height="200" style="margin:0px auto;">
                 <caption> <b>List of choices for Open Elective</b> </caption>
                <thead> <tr> <th align="left"> Course Code </th>
                        <th align="left"> Course Title</th>
                    </tr>
                </thead>
                <tr> <td> 15OE231 </td>
                    <td> Advertising</td>
                </tr>
                <tr> <td> 15OE232 </td>
                    <td> Basic Statistics</td>
                </tr>
                <tr> <td> 15OE233 </td>
                    <td> Citizen Journalism</td>
                </tr>
                <tr> <td> 15OE234 </td>
                    <td> Creative Writing for Beginners</td>
                </tr>
                <tr> <td> 15OE235 </td>
                    <td> Desktop Support and Services</td>
                </tr>
                <tr> <td> 15OE236 </td>
                    <td> Development Journalism</td>
                </tr>
                <tr> <td> 15OE237 </td>
                    <td> Digital Photography</td>
                </tr>
                <tr> <td> 15OE238 </td>
                    <td> Emotional Intelligence</td>
                </tr>
                <tr> <td> 15OE239 </td>
                    <td> Essence of Spiritual Literature</td>
                </tr>
                <tr> <td> 15OE240 </td>
                    <td> Film Theory</td>
                </tr>
                <tr> <td> 15OE241 </td>
                    <td> Fundamentals of Network Administration</td>
                </tr>
                <tr> <td> 15OE242 </td>
                    <td> Gender Studies</td>
                </tr>
                <tr> <td> 15OE243 </td>
                    <td> Glimpses of Indian Economy and Polity</td>
                </tr>
                <tr> <td> 15OE244 </td>
                    <td> Green Marketing</td>
                </tr>
                <tr> <td> 15OE245 </td>
                    <td> Graphics and Web Designing</td>
                </tr>
                <tr> <td> 15OE246 </td>
                    <td> Health Care and Technology</td>
                </tr>
                <tr> <td> 15OE247 </td>
                    <td> History of English Literature</td>
                </tr>
                <tr> <td> 15OE248 </td>
                    <td> Indian Writing in English</td>
                </tr>
                <tr> <td> 15OE249 </td>
                    <td> Industrial Relations and Labour Wellfare</td>
                </tr>
                <tr> <td> 15OE250 </td>
                    <td> Introduction to Ancient Indian Yogic and Vedic Wisdom</td>
                </tr>
                <tr> <td> 15OE251 </td>
                    <td> Introduction to Computer Hardware</td>
                </tr>
            
            </table>
</html>
