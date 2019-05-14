package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class retriveProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
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

String id = (String)session.getAttribute("userid");
String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "openelective";
String userid = "root";
String password = "";
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<h3>Edit Profile </h3>\n");
      out.write("\n");

try{
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();
String sql ="select * from members where uname='"+id+"'";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){

      out.write("\n");
      out.write("<form method=\"post\" >\n");
      out.write("    <table border=\"1\">\n");
      out.write("        <tr>\n");
      out.write("            <td>Name:</td>\n");
      out.write("            <td><input type=\"text\" value=\"");
      out.print(resultSet.getString("first_name") );
      out.write("\" name=\"fname\"></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>    \n");
      out.write("            <td>Email:</td>\n");
      out.write("            <td><input type=\"text\" value=\"");
      out.print(resultSet.getString("email") );
      out.write("\" name=\"email\"></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>Reg Number</td>\n");
      out.write("            <td><input type=\"text\"value=\"");
      out.print(resultSet.getString("uname") );
      out.write("\" name=\"reg\" readonly></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>Semester:</td>\n");
      out.write("            <td><input type=\"text\" value=\"");
      out.print(resultSet.getString("semester"));
      out.write("\" name=\"sem\"></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>Course</td>\n");
      out.write("            <td><select name=\"course\" value=\"");
      out.print(resultSet.getString("course"));
      out.write("\">\n");
      out.write("                    <option value=\"select\">Select option</option>\n");
      out.write("                                        <option value=\"BCA\">BCA</option>\n");
      out.write("                                        <option value=\"Int.MCA\">Int.MCA</option>\n");
      out.write("                                        <option value=\"B.com\">B.com</option>\n");
      out.write("                                        <option value=\"B.comTax\">B.com Tax</option>\n");
      out.write("                                        <option value=\"B.sc\">B.sc</option>\n");
      out.write("                                        <option value=\"Int.msc\">Int.Msc</option>\n");
      out.write("                                        <option value=\"B.scVm\">B.sc Visual Media</option>\n");
      out.write("                </select></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr><td><input type=\"submit\" name=\"update\" value=\"Update\"></td>\n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
      out.write("</form>\n");

}

} catch (Exception e) {
e.printStackTrace();
}

      out.write('\n');

if(request.getParameter("update")!=null){
    String fname=request.getParameter("fname");
    String email=request.getParameter("email");
    String reg=request.getParameter("reg");
    String sem=request.getParameter("sem");
    String course=request.getParameter("course");
    
    String q1="UPDATE `members` SET `first_name`='"+fname+"',`email`='"+email+"',`semester`='"+sem+"',`course`='"+course+"' WHERE uname='"+reg+"'";
int i=statement.executeUpdate(q1);
if(i==1){
    out.print("success");
    
}
else{
    out.print("fail");
}
}

      out.write("\n");
      out.write("</table>\n");
      out.write("</body>\n");
      out.write("</html>");
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
