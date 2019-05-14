package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"css/stylenav2Two.css\" type=\"text/css\"/>\n");
      out.write("        <title>Admin Page</title>\n");
      out.write("        <style>\n");
      out.write("            footer{\n");
      out.write("              position: fixed;\n");
      out.write("                left: 0;\n");
      out.write("                bottom: 0;\n");
      out.write("                width: 100%;\n");
      out.write("                background-color:graytext;\n");
      out.write("         }\n");
      out.write("             body{ border: 75px solid graytext;}\n");
      out.write("             h3{color:blue;font-weight: bold;font-family:\"Times New Roman\",Times,serif; position: absolute; top: 150px; }\n");
      out.write("            .pfooter{font-family: \"Times New Roman\",Times,serif;font-weight: bolder;color: black;font-size: 35px; }\n");
      out.write("        .style1{ top: 300px;\n");
      out.write("         left: 250px;\n");
      out.write("         position: absolute;\n");
      out.write("         border-radius: 50%;\n");
      out.write("         }\n");
      out.write("         .style2{top:300px;\n");
      out.write("         left: 450px;\n");
      out.write("         position: absolute;\n");
      out.write("         border-radius: 50%;\n");
      out.write("         }\n");
      out.write("         .style3{top:300px;\n");
      out.write("         left: 650px;\n");
      out.write("         position: absolute;\n");
      out.write("         border-radius: 50%;\n");
      out.write("         }\n");
      out.write("         .style4{\n");
      out.write("             top: 300px;\n");
      out.write("             left: 850px;\n");
      out.write("             position: absolute;\n");
      out.write("         }\n");
      out.write("         .style5{\n");
      out.write("             top: 300px;\n");
      out.write("             left: 1050px;\n");
      out.write("             position: absolute;\n");
      out.write("         }\n");
      out.write("          .h41{\n");
      out.write("            top: 390px;\n");
      out.write("            left: 260px;\n");
      out.write("            position: absolute;\n");
      out.write("            color: blue;\n");
      out.write("        }\n");
      out.write("        .h42{\n");
      out.write("            top: 390px;\n");
      out.write("            left: 460px;\n");
      out.write("            position: absolute;\n");
      out.write("            color: blue;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        .h43{\n");
      out.write("            top: 390px;\n");
      out.write("            left: 670px;\n");
      out.write("            position: absolute;\n");
      out.write("            color: blue;\n");
      out.write("        }\n");
      out.write("        .h44{\n");
      out.write("            top: 390px;\n");
      out.write("            left: 860px;\n");
      out.write("            position: absolute;\n");
      out.write("            color: blue;\n");
      out.write("        }\n");
      out.write("        .h45{\n");
      out.write("            top: 390px;\n");
      out.write("            left: 1070px;\n");
      out.write("            position: absolute;\n");
      out.write("            color: blue;\n");
      out.write("        }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h3>Welcome Administrator</h3>\n");
      out.write("         <div class=\"topnav\">\n");
      out.write("  <a href=\"membersDetails.jsp\">Profile</a>\n");
      out.write("  <a href=\"addCourse.jsp\">Add Course </a>\n");
      out.write("  <a href=\"aelective.jsp\">Elective</a>\n");
      out.write("  <a href=\"acontact.jsp\">Contact</a>\n");
      out.write("   <a href=\"logout.jsp\">Logout</a>\n");
      out.write("         </div>\n");
      out.write("   \n");
      out.write("    <a href=\"membersDetails.jsp\">\n");
      out.write("           <img src=\"photos/user4.png\" alt=\"Image not Loaded\" height=\"100\" width=\"100\" class=\"style1\"/></a>\n");
      out.write("           <a href=\"addCourse.jsp\">\n");
      out.write("               <img src=\"photos/cl.png\" alt=\"Image not Loaded\" height=\"100\" width=\"100\" class=\"style2\"/>\n");
      out.write("           </a>\n");
      out.write("        <a href=\"aelective.jsp\">\n");
      out.write("            <img src=\"photos/oe.jpeg\" alt=\"Image Not loaded\" height=\"100\" width=\"100\" class=\"style3\"/>\n");
      out.write("        </a>\n");
      out.write("        \n");
      out.write("        <a href=\"acontact.jsp\">\n");
      out.write("            <img src=\"photos/contact.jpeg\" alt=\"Inage Not loaded\" height=\"100\" width=\"100\" class=\"style4\"/>\n");
      out.write("        </a>\n");
      out.write("        <a href=\"logout.jsp\">\n");
      out.write("            <img src=\"photos/logout.jpeg\" alt=\"Image Not Loaded\" height=\"100\" width=\"100\" class=\"style5\"/>\n");
      out.write("        </a>\n");
      out.write("         <h4 class=\"h41\"> Student Details </h4>\n");
      out.write("        <h4 class=\"h42\">Add Course</h4>\n");
      out.write("        <h4 class=\"h43\">Elective</h4>\n");
      out.write("       \n");
      out.write("        <h4 class=\"h45\">Logout</h4>\n");
      out.write("        \n");
      out.write("        <footer>\n");
      out.write("            <p class=\"pfooter\"></p>\n");
      out.write("        </footer>\n");
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
