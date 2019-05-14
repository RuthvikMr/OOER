package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class membersDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

String url="jdbc:mysql://localhost:3306/openelective";

String user="root";
String driver="com.mysql.jdbc.Driver";
String pass="";
try{
    Class.forName(driver);
}catch(Exception e){
    e.printStackTrace();
}
Connection con=null;
Statement stmt=null;
ResultSet rs=null;

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Student Registration Details</title>   \n");
      out.write("        <link rel=\"stylesheet\" href=\"css/stylenav1.css\" type=\"text/css\" charset=\"utf-8\"/>\n");
      out.write("        <style>\n");
      out.write("            .table1{\n");
      out.write("                top: 100px;\n");
      out.write("                position: absolute;\n");
      out.write("                right: 200px;\n");
      out.write("            }\n");
      out.write("            h3{\n");
      out.write("                top: 50px;\n");
      out.write("                position: absolute;\n");
      out.write("                left: 500px;\n");
      out.write("            color: green;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <h3>STUDENT REGISTRATION DETAILS</h3>\n");
      out.write("         \n");
      out.write("            <div class=\"topnav\">\n");
      out.write("                <img src=\"photos/online.png\" alt=\"not loaded\" height=\"50\" width=\"170\">\n");
      out.write("                  <a class=\"active\" href=\"admin.jsp\">Home</a>\n");
      out.write("  <a href=\"addCourse.jsp\">Add Course</a>\n");
      out.write("  <a href=\"acontact.jsp\">Contact</a>\n");
      out.write("  <a href=\"logout.jsp\">Logout</a>\n");
      out.write("</div>\n");
      out.write("    \n");
      out.write("    <table border=\"1\" class=\"table1\">\n");
      out.write("        <th>Name</th>\n");
      out.write("        <th>email</th>\n");
      out.write("        <th>Student ID</th>\n");
      out.write("        <th>Department</th>\n");
      out.write("        <th>Course</th>\n");
      out.write("        <th>Semester</th>\n");
      out.write("      \n");
      out.write("        ");


        try{
            Class.forName(driver);
             con=DriverManager.getConnection(url,user,pass);
             stmt=con.createStatement();
             rs=stmt.executeQuery("select * from members");
             
             while(rs.next()){
                 
                 
      out.write("\n");
      out.write("        <tr>\n");
      out.write("            <td>");
      out.print(rs.getString("first_name"));
      out.write("</td>\n");
      out.write("            <td>");
      out.print(rs.getString("email"));
      out.write("</td>\n");
      out.write("            <td>");
      out.print(rs.getString("uname"));
      out.write("</td>\n");
      out.write("            <td>");
      out.print(rs.getString("Department"));
      out.write("</td>\n");
      out.write("            <td>");
      out.print(rs.getString("course"));
      out.write("</td>\n");
      out.write("            <td>");
      out.print(rs.getString("semester"));
      out.write("</td>\n");
      out.write("             </tr>\n");
      out.write("        ");
  }
        
       
              
             
    con.close();
}  
 catch(Exception e){
            e.printStackTrace();
        }
                 
                 
      out.write("\n");
      out.write("    </table>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
