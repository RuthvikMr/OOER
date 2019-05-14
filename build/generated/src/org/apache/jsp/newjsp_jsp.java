package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import com.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Choose the Course</title>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("     <link rel=\"stylesheet\" href=\"css/stylenav1.css\" type=\"text/css\" charset=\"utf-8\"/>\n");
      out.write("    <style>\n");
      out.write("        .styleUserid{color: red;}\n");
      out.write("        #layout{\n");
      out.write("             position: absolute;\n");
      out.write("                top: 160px;\n");
      out.write("                align-content: center;\n");
      out.write("                z-index: 1;\n");
      out.write("                left: 400px;\n");
      out.write("        }\n");
      out.write("                \n");
      out.write("        </style>\n");
      out.write("    <body>\n");
      out.write("               <div class=\"topnav\">\n");
      out.write("                <img src=\"photos/online.png\" alt=\"not loaded\" height=\"50\" width=\"170\">\n");
      out.write("                  <a class=\"active\" href=\"logout.jsp\">Logout</a>\n");
      out.write("                   <a href=\"scontact.jsp\">Contact us</a>\n");
      out.write("</div>\n");
      out.write("     \n");
      out.write("        <form method=\"post\" action=\"CS_Action.jsp\">\n");
      out.write("            <div id=\"layout\">\n");
      out.write("            <table border=\"1\" width=\"150\" height=\"200\">\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                  \n");
      out.write("                    <th>Sl NO</th>\n");
      out.write("        <th>Course Code </th>\n");
      out.write("        <th width=\"55\">Course Title</th>\n");
      out.write("        <th> Course Provided By</th>\n");
      out.write("        <th> Course Description</th>\n");
      out.write("        <th> Course Lecture</th>\n");
      out.write("         <th> Click Button To add </th>\n");
      out.write("        \n");
      out.write("                </tr>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");

 
            String dep="";
            String sem="";
            String course="";
            
            dep=session.getAttribute("dep").toString();
            sem=session.getAttribute("sem").toString();
            course=session.getAttribute("course").toString();
        Connection con=SqlCon.getCon();
        Statement st=con.createStatement();
        ResultSet rs=null;
        String query1="SELECT * FROM `course_list` WHERE degree='"+course+"'AND providedby!='"+dep+"'AND sem='"+sem+"'";
rs=st.executeQuery(query1);
while(rs.next()){
    


      out.write("\n");
      out.write("        <tr>\n");
      out.write("            \n");
      out.write("            <td>");
      out.print(rs.getString("id"));
      out.write("</td>\n");
      out.write("            <td>");
      out.print(rs.getString("course_id"));
      out.write("</td>\n");
      out.write("            <td>");
      out.print(rs.getString("course_name"));
      out.write("</td>\n");
      out.write("            <td>");
      out.print(rs.getString("providedby"));
      out.write("</td>\n");
      out.write("            <td>");
      out.print(rs.getString("des"));
      out.write("</td>\n");
      out.write("            <td>");
      out.print(rs.getString("lec"));
      out.write("</td>\n");
      out.write("            <td><input type=\"submit\" name=\"course\" value=\"");
      out.print(rs.getString("course_name"));
      out.write("\"></td>\n");
      out.write("        </tr>\n");
      out.write("        ");

        }

        
      out.write("\n");
      out.write("       \n");
      out.write("            </table>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
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
