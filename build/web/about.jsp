<%-- 
    Document   : about
    Created on : 15 Apr, 2019, 1:38:11 PM
    Author     : Ruthvik m r
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/stylenavThree.css" type="text/css" charset="utf-8"/>
        <style>
           
p{
    top: 100px;
    left: 450px;
    height: 100px;
    position: absolute;
}
h3{position: absolute;top: 450px; left: 600px; color: blue;}
p1{position: absolute;top:530px; left: 450px; font-weight: bold;}
p2{position: absolute;top: 700px;left: 250px;font-weight: bold; color: blue; font-size: 25px;}
.img1{border-radius: 30%;}
.img2{position: absolute;
top: 750px;
left: 300px;
border-radius: 30%;
}
.img3{
    position: absolute;
top: 750px;
left: 380px;
border-radius: 30%;
}
.img4{
    position: absolute;
top: 750px;
left: 510px;
border-radius: 30%;
}
</style>
    </head>
    <body>
        <div class="topnav">
            <a href="index.jsp">Home</a>
 
  <a href="reg.jsp">Registration</a>
  <a href="scontact.jsp">Contact</a>
  <a href="about.jsp">About</a>
  <img src="photos/online.png" alt="not loaded" height="40" width="170">
        </div>
        <div class="div">
            <p>
                <img src="photos/amma2.jpg" height="300" width="450" alt="not loaded" class="img1"/>
            </p>
            <h3>
                Why Open Elective ?
            </h3>
            <p1>
               An open elective gives you the opportunity to study a unit<br/> from any discipline in the University, providing you meet the <br/> pre-requisites and/or co-requisites of that unit.<br/> An open elective unit is worth 3 credit points and can be either <br/>level 1, 2, 3 or 4; however, please be aware that for most <br/>undergraduate degrees you can only attain a maximum of 30 credit points at level 1
            </p1>
            <p2>
                Follow us on:
            </p2>
            <a href="https://www.youtube.com/user/AmritaUniversity">
            <img src="photos/utube.png" alt="Image Not Loaded" height="50" width="70" class="img2" />
            </a>
            <a href="https://twitter.com/AMRITAedu">
            <img src="photos/twitter.png" alt="Image Not Loaded" height="50" width="130" class="img3" />
            </a>
            <a href="https://www.facebook.com/AmritaUniversity">
            <img src="photos/fb.png" alt="Image Not Loaded" height="50" width="70" class="img4" />
            </a>
        </div>
    </body>
</html>
