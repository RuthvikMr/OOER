package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class CS_005fAction_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Your Course has Been Saved</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/stylenav1.css\" type=\"text/css\" charset=\"utf-8\"/>\n");
      out.write("        <style>\n");
      out.write("            h1{\n");
      out.write("                top: 250px;\n");
      out.write("                position: absolute;\n");
      out.write("                left: 450px;\n");
      out.write("                color: green;\n");
      out.write("            }\n");
      out.write("           \n");
      out.write("            .img1{\n");
      out.write("                top: 150px;\n");
      out.write("                position: absolute;\n");
      out.write("                left: 680px;\n");
      out.write("            }\n");
      out.write("            .a1{\n");
      out.write("                top: 400px;\n");
      out.write("                position: absolute;\n");
      out.write("                left: 650px;\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("   </head>\n");
      out.write("   <body>\n");
      out.write("       <div class=\"topnav\">\n");
      out.write("                <img src=\"photos/online.png\" alt=\"not loaded\" height=\"50\" width=\"170\">\n");
      out.write("                  <a class=\"active\" href=\"logout.jsp\">LOGOUT</a>\n");
      out.write("                  <img src=\"photos/tick.png\" alt=\"Image Not Loaded\" width=\"100\" height=\"100\" class=\"img1\"/>\n");
      out.write("       \n");
      out.write("</div>\n");
      out.write("       <a href=\"logout.jsp\" class=\"a1\"> Click to Logout</a>\n");
      out.write("   </body>\n");
      out.write("</html>\n");

    String user_id="";
    user_id=session.getAttribute("userid").toString();
    String userid=request.getParameter("userid");
String CScourse="";
String course[]=request.getParameterValues("course");
for(int i=0;i<course.length;i++)
    CScourse=course[i]+" ";
try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/openelective","root","");
    Statement stmt=con.createStatement();
    int i=stmt.executeUpdate("insert into course(courseSelected,userid) values('"+CScourse+"','"+user_id+"')");
   // out.print("Your Selected Course has been Saved...! Thank You... ");
   
      out.write("\n");
      out.write("   <h1>\n");
      out.write("       Your Selected Course has been Saved...! <br/><center>Thank You...</center>\n");
      out.write("   </h1>\n");

   }
catch(Exception e){
    System.out.println(e);
}

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
