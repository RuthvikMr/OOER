package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class about_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/stylenavThree.css\" type=\"text/css\" charset=\"utf-8\"/>\n");
      out.write("        <style>\n");
      out.write("           \n");
      out.write("p{\n");
      out.write("    top: 100px;\n");
      out.write("    left: 450px;\n");
      out.write("    height: 100px;\n");
      out.write("    position: absolute;\n");
      out.write("}\n");
      out.write("h3{position: absolute;top: 450px; left: 600px; color: blue;}\n");
      out.write("p1{position: absolute;top:530px; left: 450px; font-weight: bold;}\n");
      out.write("p2{position: absolute;top: 700px;left: 250px;font-weight: bold; color: blue; font-size: 25px;}\n");
      out.write(".img1{border-radius: 30%;}\n");
      out.write(".img2{position: absolute;\n");
      out.write("top: 750px;\n");
      out.write("left: 300px;\n");
      out.write("border-radius: 30%;\n");
      out.write("}\n");
      out.write(".img3{\n");
      out.write("    position: absolute;\n");
      out.write("top: 750px;\n");
      out.write("left: 380px;\n");
      out.write("border-radius: 30%;\n");
      out.write("}\n");
      out.write(".img4{\n");
      out.write("    position: absolute;\n");
      out.write("top: 750px;\n");
      out.write("left: 510px;\n");
      out.write("border-radius: 30%;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"topnav\">\n");
      out.write("            <a href=\"index.jsp\">Home</a>\n");
      out.write("  <a href=\"#news\">News</a>\n");
      out.write("  <a href=\"reg.jsp\">Registration</a>\n");
      out.write("  <a href=\"#contact\">Contact</a>\n");
      out.write("  <a href=\"about.jsp\">About</a>\n");
      out.write("  <img src=\"photos/online.png\" alt=\"not loaded\" height=\"40\" width=\"170\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"div\">\n");
      out.write("            <p>\n");
      out.write("                <img src=\"photos/amma2.jpg\" height=\"300\" width=\"450\" alt=\"not loaded\" class=\"img1\"/>\n");
      out.write("            </p>\n");
      out.write("            <h3>\n");
      out.write("                Why Open Elective ?\n");
      out.write("            </h3>\n");
      out.write("            <p1>\n");
      out.write("               An open elective gives you the opportunity to study a unit<br/> from any discipline in the University, providing you meet the <br/> pre-requisites and/or co-requisites of that unit.<br/> An open elective unit is worth 3 credit points and can be either <br/>level 1, 2, 3 or 4; however, please be aware that for most <br/>undergraduate degrees you can only attain a maximum of 30 credit points at level 1\n");
      out.write("            </p1>\n");
      out.write("            <p2>\n");
      out.write("                Follow us on:\n");
      out.write("            </p2>\n");
      out.write("            <a href=\"https://www.youtube.com/user/AmritaUniversity\">\n");
      out.write("            <img src=\"photos/utube.png\" alt=\"Image Not Loaded\" height=\"50\" width=\"70\" class=\"img2\" />\n");
      out.write("            </a>\n");
      out.write("            <a href=\"https://twitter.com/AMRITAedu\">\n");
      out.write("            <img src=\"photos/twitter.png\" alt=\"Image Not Loaded\" height=\"50\" width=\"100\" class=\"img3\" />\n");
      out.write("            </a>\n");
      out.write("            <a href=\"https://www.facebook.com/AmritaUniversity\">\n");
      out.write("            <img src=\"photos/fb.png\" alt=\"Image Not Loaded\" height=\"50\" width=\"70\" class=\"img4\" />\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
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
