<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/stylenav2Two.css" type="text/css"/>
        <title>Admin Page</title>
        <style>
            footer{
              position: fixed;
                left: 0;
                bottom: 0;
                width: 100%;
                background-color:graytext;
         }
             body{ border: 75px solid graytext;}
             h3{color:blue;font-weight: bold;font-family:"Times New Roman",Times,serif; position: absolute; top: 150px; }
            .pfooter{font-family: "Times New Roman",Times,serif;font-weight: bolder;color: black;font-size: 35px; }
        .style1{ top: 300px;
         left: 250px;
         position: absolute;
         border-radius: 50%;
         }
         .style2{top:300px;
         left: 450px;
         position: absolute;
         border-radius: 50%;
         }
         .style3{top:300px;
         left: 650px;
         position: absolute;
         border-radius: 50%;
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
          .h41{
            top: 390px;
            left: 260px;
            position: absolute;
            color: blue;
        }
        .h42{
            top: 390px;
            left: 460px;
            position: absolute;
            color: blue;
            
        }
        .h43{
            top: 390px;
            left: 670px;
            position: absolute;
            color: blue;
        }
        .h44{
            top: 390px;
            left: 860px;
            position: absolute;
            color: blue;
        }
        .h45{
            top: 390px;
            left: 1070px;
            position: absolute;
            color: blue;
        }
        </style>
    </head>
    <body>
        <h3>Welcome Administrator</h3>
         <div class="topnav">
  <a href="membersDetails.jsp">Profile</a>
  <a href="addCourse.jsp">Add Course </a>
  <a href="aelective.jsp">Elective</a>
  <a href="acontact.jsp">Contact</a>
   <a href="logout.jsp">Logout</a>
         </div>
   
    <a href="membersDetails.jsp">
           <img src="photos/user4.png" alt="Image not Loaded" height="100" width="100" class="style1"/></a>
           <a href="addCourse.jsp">
               <img src="photos/cl.png" alt="Image not Loaded" height="100" width="100" class="style2"/>
           </a>
        <a href="aelective.jsp">
            <img src="photos/oe.jpeg" alt="Image Not loaded" height="100" width="100" class="style3"/>
        </a>
        
        <a href="acontact.jsp">
            <img src="photos/contact.jpeg" alt="Inage Not loaded" height="100" width="100" class="style4"/>
        </a>
        <a href="logout.jsp">
            <img src="photos/logout.jpeg" alt="Image Not Loaded" height="100" width="100" class="style5"/>
        </a>
         <h4 class="h41"> Student Details </h4>
        <h4 class="h42">Add Course</h4>
        <h4 class="h43">Elective</h4>
       
        <h4 class="h45">Logout</h4>
        
        <footer>
            <p class="pfooter"></p>
        </footer>
    </body>
</html>
