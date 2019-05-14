<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Example</title>
        <link rel="stylesheet" href="css/stylenav.css" type="text/css" charset="utf-8"/>
        
        <style>
         
            #layout{
                top: 160px;
                left: 220px;
                position: absolute;
                z-index: 1;
                height: 100px;
                width: 100px;
            }
            .style1 {font-family: "Times New Roman", Times, serif; font-weight: bold; color:blue; }
            .style2{font-family: "Times New Roman",Times,serif;font-weight: bold;}
            body{ border: 75px solid darkseagreen; } /*#5F4B8BFF  Purple color*/
            footer{
                position: fixed;
                left: 0;
                bottom: 0;
                width: 100%;
                background-color:darkseagreen;
                
            }
            p{font-family: "Times New Roman",Times,serif;font-weight: bolder;color: black;font-size: 25px;
            
            }
            img{border-radius: 5%;}
            .img1{position: absolute;left: 850px; top: 10px;}
            .button {
  background-color: #4CAF50; /* Green */
  border: none;
  color: white;
  padding: 2px 8px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
  -webkit-transition-duration: 0.4s; /* Safari */
  transition-duration: 0.4s;
  border-radius: 15%;
            }
            .button1:hover {
  box-shadow: 0 12px 16px 0 rgba(0,0,0,0.50),0 17px 50px 0 rgba(0,0,0,0.19);
}
.button2:hover{
    box-shadow: 0 12px 16px 0 rgba(0,0,0,0.50),0 17px 50px 0 rgba(0,0,0,0.19);
}

            
        </style>
    </head>
    <body>
        
        <div class="topnav">
  <a class="active" href="index.jsp">Home</a>
 
  <a href="reg.jsp">Registration</a>
  <a href="scontact.jsp">Contact</a>
  <a href="about.jsp">About</a>
  <img src="photos/online.png" alt="not loaded" height="50" width="210">
</div>
        
        
        <form method="post" action="login.jsp">
            <div id="layout">
                <table border="0" width="1000" height="300">
                    <tr>
                        <td width="350" align="center">
                            <img src="photos/design.png" alt="not loaded" width="150" height="70">
                            <p align="center">
                                Online Open Elective <p align="center">Registration</p>
                            </p>
                            
                            
                        </td>

                        <td width="350">
                            <img src="photos/amma.jpeg" width="350" height="240" alt="image not loaded">
                        </td>
                        <td width="350">
                          
                            <table border="0" width="150" align="right">
                <thead>
                     <img src="photos/user2.png" alt="not loaded" width="75" height="70" class="img1">
                   
                    <tr>
                        <th colspan="2">&nbsp; Login Here</th>
                    </tr>
                </thead>
                
                    <tr>
                        <td class="style1">User ID</td>
                        <td><input type="text" name="uname" value="" placeholder="User ID"/></td>
                    </tr>
                
                    <tr>
                        <td class="style1">Password</td>
                        <td><input type="password" name="pass" value="" placeholder="Password" /></td>
                    </tr>
                    
                    <tr>
                        <td>
                            &nbsp;
                        </td>
                        <td>
                            <input type="submit" value="Login" class=" button button1"  />
                            &nbsp;
                            &nbsp;
                            &nbsp;
                            <input type="reset" value="Reset" class="button button2"/></td>
                    </tr>
                    <tr>
                        <td colspan="2" class="style2">Not Register !! <a href="reg.jsp"> Click Here to Register</a></td>
                    </tr>
               
            </table>
                            
                        </td>
                    </tr>
                    
                    
                    
                </table>
            </div>
            
        </form>
        <footer>
            <p> </p>
        </footer>
    </body>
</html>