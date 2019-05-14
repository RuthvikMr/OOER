package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class stucontact_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Contact Us</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/stylenav1.css\" type=\"text/css\" charset=\"utf-8\"/>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        .h31{\n");
      out.write("            top: 200px;\n");
      out.write("            position: absolute;\n");
      out.write("            left: 100px;\n");
      out.write("            color: blue;\n");
      out.write("        }\n");
      out.write("        .h32{\n");
      out.write("            top:350px;\n");
      out.write("            position: absolute;\n");
      out.write("            left: 100px;\n");
      out.write("            color: blue;\n");
      out.write("        }\n");
      out.write("        .h33{\n");
      out.write("            top: 200px;\n");
      out.write("            position: absolute;\n");
      out.write("            left: 350px;\n");
      out.write("            color: blue;\n");
      out.write("        }\n");
      out.write("        .h41{\n");
      out.write("            top: 250px;\n");
      out.write("            position: absolute;\n");
      out.write("            left: 100px;\n");
      out.write("            color: black;\n");
      out.write("        }\n");
      out.write("        .h42{\n");
      out.write("            top: 250px;\n");
      out.write("            position: absolute;\n");
      out.write("            left: 350px;\n");
      out.write("            color: black;\n");
      out.write("        }\n");
      out.write("        .img1{\n");
      out.write("            top: 410px;\n");
      out.write("            position: absolute;\n");
      out.write("            left: 150px;\n");
      out.write("        }\n");
      out.write("          .img2{\n");
      out.write("            top: 410px;\n");
      out.write("            position: absolute;\n");
      out.write("            left: 250px;\n");
      out.write("            border-radius: 40%;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("              <div class=\"topnav\">\n");
      out.write("                <img src=\"photos/online.png\" alt=\"not loaded\" height=\"50\" width=\"170\">\n");
      out.write("                  <a class=\"active\" href=\"studentPage.jsp\">Home</a>\n");
      out.write("  \n");
      out.write("  <a href=\"CourseList_cs.jsp\">Select Course</a>\n");
      out.write("  <a href=\"stucontact.jsp\">Contact</a>\n");
      out.write("  <a href=\"logout.jsp\">Logout</a>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("        <h3 class=\"h31\">Project Developed By:</h3>\n");
      out.write("        <h3 class=\"h33\">Under the Guidence of :</h3>\n");
      out.write("        <h4 class=\"h41\">1.Mr.Ruthvik M.R<br/>2.Mr.Ganesh B.A</h4>\n");
      out.write("        <h3 class=\"h32\">Follow as on:</h3>\n");
      out.write("        <h4 class=\"h42\">Mr.Vinayak Hegde</h4>\n");
      out.write("        <a href=\"https://www.instagram.com/ruthvikmr417/\">\n");
      out.write("            <img src=\"photos/insta.jpg\" alt=\"Not Loaded\" width=\"70\" height=\"50\" class=\"img1\"/>\n");
      out.write("        </a>\n");
      out.write("        <a href=\"https://www.facebook.com/ganesh.ba.94\">\n");
      out.write("            <img src=\"photos/fb.png\" alt=\"Image not Loaded\" class=\"img2\" width=\"70\" height=\"50\"/>\n");
      out.write("    </a>\n");
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
