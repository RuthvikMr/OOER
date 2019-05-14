<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
        <link rel="stylesheet" href="css/stylenav1.css" type="text/css" charset="utf-8"/>
        <style>
            #layout{
                position: absolute;
                top: 160px;
                align-content: center;
                z-index: 1;
                left: 500px;
                
            }
            footer{background-color: #333;
            position: fixed;
            left: 0px;
            bottom: 0px;
            width: 100%;
            }
            .styleUserID{color: red; font-weight: bold; }
            .styleLabel{font-weight: bold;}
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
            h3{
                top: 80px;
                position: absolute;
                color: green;
                left: 580px;
            }
                        .button {
  background-color: #4CAF50; /* Green */
  border: none;
  color: white;
  padding: 0px 8px;
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
                <img src="photos/online.png" alt="not loaded" height="50" width="170">
                  <a class="active" href="index.jsp">Login</a>
 
  <a href="reg.jsp">Registration</a>
  <a href="scontact.jsp">Contact</a>
  <a href="about.jsp">About</a>

</div>
        
        
        <form method="post" action="registration.jsp">
            <h3>Welcome User !! </h3>
            <div id="layout">
                
            <center>
            <table border="1" width="30%" cellpadding="5">
                <thead>
                    <tr>
                        <th colspan="2">Enter Information Here</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td class="styleLabel">Full Name</td>
                        <td><input type="text" name="fname" value="" /></td>
                    </tr>
                    
                    <tr>
                        <td class="styleLabel">Email</td>
                        <td><input type="text" name="email" value="" /></td>
                    </tr>
                    <tr class="styleUserID">
                        <td class="style">User ID</td>
                        <td><input type="text" name="uname" value="" /></td>
                    </tr>
                    <tr class="styleLabel">
                        <td>Semester</td>
                                <td><select name="semester">
                                        <option value="select">Select option</option>
                                        <option value="4th semester">4th Semester</option>
                                        <option value="5th Semester">5th Semester</option>
                                        <option value="6th semester">6th Semester</option>
                                        <option value="7th Semester">7th Semester</option>
                                        <option value="8th semester">8th Semester</option>
                                        <option value="9th Semester">9th Semester</option>
                                        <option value="10th semester">10th Semester</option>
                                        
                            </select></td>
                             <tr class="styleLabel">
                        <td>Course</td>
                                <td><select name="course">
                                        <option value="select">Select option</option>
                                        <option value="BCA">BCA</option>
                                        <option value="Int.MCA">Int.MCA</option>
                                        <option value="B.com">B.com</option>
                                        <option value="B.comTax">B.com Tax</option>
                                        <option value="B.sc">B.sc</option>
                                        <option value="Int.msc">Int.Msc</option>
                                        <option value="B.scVm">B.sc Visual Media</option>
                                        
                            </select></td>
                                  <tr class="styleLabel">
                        <td>Department</td>
                                <td><select name="dep">
                                        <option value="select">Select option</option>
                                        <option value="Computer Science">Computer Science</option>
                                        <option value="Management and Commerce">Management and Commerce</option>
                                        <option value="Visual Communication">Visual Communication</option>
                                        <option value="Language Department">Language Department</option>
                                        
                                        
                            </select></td>
                    <tr>
                        <td class="styleLabel">Password</td>
                        <td><input type="password" name="pass" value="" /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Submit" name="submit" class="button button1"/></td>
                        <td><input type="reset" value="Reset" class="button button2"/></td>
                    </tr>
                    <tr>
                        <td colspan="2" class="styleLabel">Already Have an Account!! <a href="index.jsp">Login Here</a></td>
                    </tr>
                </tbody>
            </table>
            </center>
            </div>
        </form>
        <footer>
            <p align="right" >@AmritaRegisterElective.com</p>
        </footer>
    </body>
</html>