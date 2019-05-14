package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class elective_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("         <link rel=\"stylesheet\" href=\"css/stylenav1.css\" type=\"text/css\" charset=\"utf-8\"/>\n");
      out.write("        <style>\n");
      out.write("              table{\n");
      out.write("                border-collapse: collapse;\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("            td,th{\n");
      out.write("                border: 1px solid #dddddd;\n");
      out.write("                text-align: left;\n");
      out.write("                padding: 8px;\n");
      out.write("            }\n");
      out.write("            tr:nth-child(even){\n");
      out.write("                background-color:#dddddd; \n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("     <body>\n");
      out.write("             <div class=\"topnav\">\n");
      out.write("                <img src=\"photos/online.png\" alt=\"not loaded\" height=\"50\" width=\"170\">\n");
      out.write("                  <a class=\"active\" href=\"studentPage.jsp\">Home</a>\n");
      out.write(" \n");
      out.write("  <a href=\"addCourse.jsp\">Add Course</a>\n");
      out.write("  <a href=\"scontact\">Contact</a>\n");
      out.write("  <a href=\"logout.jsp\">Logout</a>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("         <form method=\"post\" action=\"elective.jsp\">\n");
      out.write("             <table border=\"1\" width=\"350\" height=\"200\" style=\"margin:0px auto;\">\n");
      out.write("                 <caption> <b>List of choices for Open Elective</b> </caption>\n");
      out.write("                <thead> <tr> <th align=\"left\"> Course Code </th>\n");
      out.write("                        <th align=\"left\"> Course Title</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tr> <td> 15OE231 </td>\n");
      out.write("                    <td> Advertising</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr> <td> 15OE232 </td>\n");
      out.write("                    <td> Basic Statistics</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr> <td> 15OE233 </td>\n");
      out.write("                    <td> Citizen Journalism</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr> <td> 15OE234 </td>\n");
      out.write("                    <td> Creative Writing for Beginners</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr> <td> 15OE235 </td>\n");
      out.write("                    <td> Desktop Support and Services</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr> <td> 15OE236 </td>\n");
      out.write("                    <td> Development Journalism</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr> <td> 15OE237 </td>\n");
      out.write("                    <td> Digital Photography</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr> <td> 15OE238 </td>\n");
      out.write("                    <td> Emotional Intelligence</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr> <td> 15OE239 </td>\n");
      out.write("                    <td> Essence of Spiritual Literature</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr> <td> 15OE240 </td>\n");
      out.write("                    <td> Film Theory</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr> <td> 15OE241 </td>\n");
      out.write("                    <td> Fundamentals of Network Administration</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr> <td> 15OE242 </td>\n");
      out.write("                    <td> Gender Studies</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr> <td> 15OE243 </td>\n");
      out.write("                    <td> Glimpses of Indian Economy and Polity</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr> <td> 15OE244 </td>\n");
      out.write("                    <td> Green Marketing</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr> <td> 15OE245 </td>\n");
      out.write("                    <td> Graphics and Web Designing</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr> <td> 15OE246 </td>\n");
      out.write("                    <td> Health Care and Technology</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr> <td> 15OE247 </td>\n");
      out.write("                    <td> History of English Literature</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr> <td> 15OE248 </td>\n");
      out.write("                    <td> Indian Writing in English</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr> <td> 15OE249 </td>\n");
      out.write("                    <td> Industrial Relations and Labour Wellfare</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr> <td> 15OE250 </td>\n");
      out.write("                    <td> Introduction to Ancient Indian Yogic and Vedic Wisdom</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr> <td> 15OE251 </td>\n");
      out.write("                    <td> Introduction to Computer Hardware</td>\n");
      out.write("                </tr>\n");
      out.write("            \n");
      out.write("            </table>\n");
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
