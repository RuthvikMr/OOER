<%@ page import ="java.sql.*" %>
<%
    String userid = request.getParameter("uname");    
    String pwd = request.getParameter("pass");
     String course="";
    String sem="";
  String fname="";
  String dep="";
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/openelective",
            "root", "");
    Statement st = con.createStatement();
    ResultSet rs;
    rs = st.executeQuery("select * from members where uname='" + userid + "' and pass='" + pwd + "'");
   while(rs.next()) {
        fname=rs.getString("first_name");
        course=rs.getString("course");
        sem=rs.getString("semester");
        dep=rs.getString("Department");
        //out.println("welcome " + userid);
        //out.println("<a href='logout.jsp'>Log out</a>"); 
   
   
      
    session.setAttribute("userid", userid);
        session.setAttribute("name",fname);
        session.setAttribute("course",course);
        session.setAttribute("sem",sem);
          session.setAttribute("dep",dep);
   }
   if(userid.indexOf("admin")!=1 && pwd.indexOf("asasadmin")!=-1)
       response.sendRedirect("admin.jsp");
   
    if(userid.indexOf("MY.SC")!=-1)
            
        response.sendRedirect("studentPage.jsp");
    if(userid.indexOf("my.sc")!=-1)
            
              response.sendRedirect("studentPage.jsp");
             
             
             if(userid.indexOf("MY.MC")!=-1)
            
              response.sendRedirect("studentPage.jsp");
             if(userid.indexOf("my.mc")!=-1)
            
             response.sendRedirect("studentPage.jsp");
             
              if(userid.indexOf("MY.BU")!=-1)
            
            response.sendRedirect("studentPage.jsp");
             if(userid.indexOf("my.bu")!=-1)
            
              response.sendRedirect("studentPage.jsp");
             
              if(userid.indexOf("MY.AR")!=-1)
            
           response.sendRedirect("studentPage.jsp");
             if(userid.indexOf("my.ar")!=-1)
            
           response.sendRedirect("studentPage.jsp");
             
              if(userid.indexOf("MY.AR")!=-1)
            
         response.sendRedirect("studentPage.jsp");
             if(userid.indexOf("my.ar")!=-1)
            
           response.sendRedirect("studentPage.jsp");
             
              if(userid.indexOf("MY.HS")!=-1)
            
            response.sendRedirect("studentPage.jsp");
             if(userid.indexOf("my.hs")!=-1)
            
           response.sendRedirect("studentPage.jsp");
             
              if(userid.indexOf("MY.ED")!=-1)
            
              response.sendRedirect("studentPage.jsp");
             if(userid.indexOf("my.ed")!=-1)
            
              response.sendRedirect("studentPage.jsp");
    else {
        out.println("Invalid password <a href='index.jsp'>try again</a>");
    }
%>