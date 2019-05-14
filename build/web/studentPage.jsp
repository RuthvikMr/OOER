<%-- 
    Document   : studentPage
    Created on : 12 Apr, 2019, 10:46:17 PM
    Author     : Ruthvik m r
--%>
<%@page import= "java.util.*" %>
<%
String fname="";

 if ((session.getAttribute("name")!=null) && (session.getAttribute("name") != " ")) {
        fname=session.getAttribute("name").toString();
       
    }
    
    else{
     response.sendRedirect("index.jsp");
    }
     


%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/stylenav2Two.css" type="text/css"/>
        <style>
         .style1{ top: 300px;
         left: 250px;
         position: absolute;
         }
         .style2{top:300px;
         left: 450px;
         position: absolute;
         }
         .style3{top:300px;
         left: 650px;
         position: absolute;
         }
         .style4{
             top: 300px;
             left: 850px;
             position: absolute;
         }
         .style5{
             top: 300px;
             left: 1050px;
             position: absolute;
         }
           h4{
             color: blue;font-family: "Times New Roman", Times, serif; top: 150px; position: absolute; left: 50px;
         }
         footer{
              position: fixed;
                left: 0;
                bottom: 0;
                width: 100%;
                background-color:graytext;
         }
         
         body{ border: 75px solid graytext;}
         .pfooter{font-family: "Times New Roman",Times,serif;font-weight: bolder;color: black;font-size: 35px; }
        img{border-radius: 50%;}
        .h41{
            top: 390px;
            left: 260px;
            position: absolute;
        }
        .h42{
            top: 390px;
            left: 460px;
            position: absolute;
            
        }
        .h43{
            top: 390px;
            left: 670px;
            position: absolute;
        }
        .h44{
            top: 390px;
            left: 860px;
            position: absolute;
        }
        .h45{
            top: 390px;
            left: 1070px;
            position: absolute;
        }
        </style>
    </head>
    <body>
        
         <div class="topnav">
  <a href="retriveProfile.jsp">Profile</a>
  <a href="CourseList_cs.jsp">Course List</a>
  <a href="elective.jsp">Elective</a>
  <a href="stucontact.jsp">Contact</a>
   <a href="logout.jsp">Logout</a>
</div>
        <h4>Welcome  <%out.print(fname);%></h4>
        <a href="retriveProfile.jsp">
           <img src="photos/user4.png" alt="Image not Loaded" height="100" width="100" class="style1"/></a>
           <a href="CourseList_cs.jsp">
               <img src="photos/cl.png" alt="Image not Loaded" height="100" width="100" class="style2"/>
           </a>
        <a href="elective.jsp">
            <img src="photos/oe.jpeg" alt="Image Not loaded" height="100" width="100" class="style3"/>
        </a>
        
        <a href="stucontact.jsp">
            <img src="photos/contact.jpeg" alt="Inage Not loaded" height="100" width="100" class="style4"/>
        </a>
        <a href="logout.jsp">
            <img src="photos/logout.jpeg" alt="Image Not Loaded" height="100" width="100" class="style5"/>
        </a>
        <h4 class="h41"> Edit Profile </h4>
        <h4 class="h42">Course List</h4>
        <h4 class="h43">Elective</h4>
       
        <h4 class="h45">Logout</h4>
            <footer>
                <p class="pfooter">
                   
                </p>
            </footer>
    </body>
</html>
