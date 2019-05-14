package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reg_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Registration</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/stylenav1.css\" type=\"text/css\" charset=\"utf-8\"/>\n");
      out.write("        <style>\n");
      out.write("            #layout{\n");
      out.write("                position: absolute;\n");
      out.write("                top: 160px;\n");
      out.write("                align-content: center;\n");
      out.write("                z-index: 1;\n");
      out.write("                left: 500px;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            footer{background-color: #333;\n");
      out.write("            position: fixed;\n");
      out.write("            left: 0px;\n");
      out.write("            bottom: 0px;\n");
      out.write("            width: 100%;\n");
      out.write("            }\n");
      out.write("            .styleUserID{color: red; font-weight: bold; }\n");
      out.write("            .styleLabel{font-weight: bold;}\n");
      out.write("            table{\n");
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
      out.write("            h3{\n");
      out.write("                top: 80px;\n");
      out.write("                position: absolute;\n");
      out.write("                color: green;\n");
      out.write("                left: 580px;\n");
      out.write("            }\n");
      out.write("                        .button {\n");
      out.write("  background-color: #4CAF50; /* Green */\n");
      out.write("  border: none;\n");
      out.write("  color: white;\n");
      out.write("  padding: 0px 8px;\n");
      out.write("  text-align: center;\n");
      out.write("  text-decoration: none;\n");
      out.write("  display: inline-block;\n");
      out.write("  font-size: 16px;\n");
      out.write("  margin: 4px 2px;\n");
      out.write("  cursor: pointer;\n");
      out.write("  -webkit-transition-duration: 0.4s; /* Safari */\n");
      out.write("  transition-duration: 0.4s;\n");
      out.write("  border-radius: 15%;\n");
      out.write("            }\n");
      out.write("            .button1:hover {\n");
      out.write("  box-shadow: 0 12px 16px 0 rgba(0,0,0,0.50),0 17px 50px 0 rgba(0,0,0,0.19);\n");
      out.write("}\n");
      out.write(".button2:hover{\n");
      out.write("    box-shadow: 0 12px 16px 0 rgba(0,0,0,0.50),0 17px 50px 0 rgba(0,0,0,0.19);\n");
      out.write("}\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("            <div class=\"topnav\">\n");
      out.write("                <img src=\"photos/online.png\" alt=\"not loaded\" height=\"50\" width=\"170\">\n");
      out.write("                  <a class=\"active\" href=\"index.jsp\">Login</a>\n");
      out.write("  <a href=\"#news\">News</a>\n");
      out.write("  <a href=\"reg.jsp\">Registration</a>\n");
      out.write("  <a href=\"#contact\">Contact</a>\n");
      out.write("  <a href=\"about.jsp\">About</a>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <form method=\"post\" action=\"registration.jsp\">\n");
      out.write("            <h3>Welcome User !! </h3>\n");
      out.write("            <div id=\"layout\">\n");
      out.write("                \n");
      out.write("            <center>\n");
      out.write("            <table border=\"1\" width=\"30%\" cellpadding=\"5\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th colspan=\"2\">Enter Information Here</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"styleLabel\">Full Name</td>\n");
      out.write("                        <td><input type=\"text\" name=\"fname\" value=\"\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"styleLabel\">Email</td>\n");
      out.write("                        <td><input type=\"text\" name=\"email\" value=\"\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr class=\"styleUserID\">\n");
      out.write("                        <td class=\"style\">User ID</td>\n");
      out.write("                        <td><input type=\"text\" name=\"uname\" value=\"\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr class=\"styleLabel\">\n");
      out.write("                        <td>Semester</td>\n");
      out.write("                                <td><select name=\"semester\">\n");
      out.write("                                        <option value=\"select\">Select option</option>\n");
      out.write("                                        <option value=\"4th semester\">4th Semester</option>\n");
      out.write("                                        <option value=\"5th Semester\">5th Semester</option>\n");
      out.write("                                        <option value=\"6th semester\">6th Semester</option>\n");
      out.write("                                        <option value=\"7th Semester\">7th Semester</option>\n");
      out.write("                                        <option value=\"8th semester\">8th Semester</option>\n");
      out.write("                                        <option value=\"9th Semester\">9th Semester</option>\n");
      out.write("                                        <option value=\"10th semester\">10th Semester</option>\n");
      out.write("                                        \n");
      out.write("                            </select></td>\n");
      out.write("                             <tr class=\"styleLabel\">\n");
      out.write("                        <td>Course</td>\n");
      out.write("                                <td><select name=\"course\">\n");
      out.write("                                        <option value=\"select\">Select option</option>\n");
      out.write("                                        <option value=\"BCA\">BCA</option>\n");
      out.write("                                        <option value=\"Int.MCA\">Int.MCA</option>\n");
      out.write("                                        <option value=\"B.com\">B.com</option>\n");
      out.write("                                        <option value=\"B.comTax\">B.com Tax</option>\n");
      out.write("                                        <option value=\"B.sc\">B.sc</option>\n");
      out.write("                                        <option value=\"Int.msc\">Int.Msc</option>\n");
      out.write("                                        <option value=\"B.scVm\">B.sc Visual Media</option>\n");
      out.write("                                        \n");
      out.write("                            </select></td>\n");
      out.write("                                  <tr class=\"styleLabel\">\n");
      out.write("                        <td>Department</td>\n");
      out.write("                                <td><select name=\"dep\">\n");
      out.write("                                        <option value=\"select\">Select option</option>\n");
      out.write("                                        <option value=\"Computer Science\">Computer Science</option>\n");
      out.write("                                        <option value=\"Management and Commerce\">Management and Commerce</option>\n");
      out.write("                                        <option value=\"Visual Communication\">Visual Communication</option>\n");
      out.write("                                        <option value=\"Language Department\">Language Department</option>\n");
      out.write("                                        \n");
      out.write("                                        \n");
      out.write("                            </select></td>\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"styleLabel\">Password</td>\n");
      out.write("                        <td><input type=\"password\" name=\"pass\" value=\"\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type=\"submit\" value=\"Submit\" class=\"button button1\"/></td>\n");
      out.write("                        <td><input type=\"reset\" value=\"Reset\" class=\"button button2\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td colspan=\"2\" class=\"styleLabel\">Already registered!! <a href=\"index.jsp\">Login Here</a></td>\n");
      out.write("                    </tr>\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("            </center>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("        <footer>\n");
      out.write("            <p align=\"right\" >@AmritaRegisterElective.com</p>\n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
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
