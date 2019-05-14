package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Example</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/stylenav.css\" type=\"text/css\" charset=\"utf-8\"/>\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("         \n");
      out.write("            #layout{\n");
      out.write("                top: 160px;\n");
      out.write("                left: 220px;\n");
      out.write("                position: absolute;\n");
      out.write("                z-index: 1;\n");
      out.write("                height: 100px;\n");
      out.write("                width: 100px;\n");
      out.write("            }\n");
      out.write("            .style1 {font-family: \"Times New Roman\", Times, serif; font-weight: bold; color:blue; }\n");
      out.write("            .style2{font-family: \"Times New Roman\",Times,serif;font-weight: bold;}\n");
      out.write("            body{ border: 75px solid darkseagreen; } /*#5F4B8BFF  Purple color*/\n");
      out.write("            footer{\n");
      out.write("                position: fixed;\n");
      out.write("                left: 0;\n");
      out.write("                bottom: 0;\n");
      out.write("                width: 100%;\n");
      out.write("                background-color:darkseagreen;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            p{font-family: \"Times New Roman\",Times,serif;font-weight: bolder;color: black;font-size: 25px;\n");
      out.write("            \n");
      out.write("            }\n");
      out.write("            img{border-radius: 5%;}\n");
      out.write("            .img1{position: absolute;left: 850px; top: 10px;}\n");
      out.write("            .button {\n");
      out.write("  background-color: #4CAF50; /* Green */\n");
      out.write("  border: none;\n");
      out.write("  color: white;\n");
      out.write("  padding: 2px 8px;\n");
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
      out.write("\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div class=\"topnav\">\n");
      out.write("  <a class=\"active\" href=\"index.jsp\">Home</a>\n");
      out.write(" \n");
      out.write("  <a href=\"reg.jsp\">Registration</a>\n");
      out.write("  <a href=\"scontact.jsp\">Contact</a>\n");
      out.write("  <a href=\"about.jsp\">About</a>\n");
      out.write("  <img src=\"photos/online.png\" alt=\"not loaded\" height=\"50\" width=\"210\">\n");
      out.write("</div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <form method=\"post\" action=\"login.jsp\">\n");
      out.write("            <div id=\"layout\">\n");
      out.write("                <table border=\"0\" width=\"1000\" height=\"300\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td width=\"350\" align=\"center\">\n");
      out.write("                            <img src=\"photos/design.png\" alt=\"not loaded\" width=\"150\" height=\"70\">\n");
      out.write("                            <p align=\"center\">\n");
      out.write("                                Online Open Elective <p align=\"center\">Registration</p>\n");
      out.write("                            </p>\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                        </td>\n");
      out.write("\n");
      out.write("                        <td width=\"350\">\n");
      out.write("                            <img src=\"photos/amma.jpeg\" width=\"350\" height=\"240\" alt=\"image not loaded\">\n");
      out.write("                        </td>\n");
      out.write("                        <td width=\"350\">\n");
      out.write("                          \n");
      out.write("                            <table border=\"0\" width=\"150\" align=\"right\">\n");
      out.write("                <thead>\n");
      out.write("                     <img src=\"photos/user2.png\" alt=\"not loaded\" width=\"75\" height=\"70\" class=\"img1\">\n");
      out.write("                   \n");
      out.write("                    <tr>\n");
      out.write("                        <th colspan=\"2\">&nbsp; Login Here</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                \n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"style1\">User ID</td>\n");
      out.write("                        <td><input type=\"text\" name=\"uname\" value=\"\" placeholder=\"User ID\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                \n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"style1\">Password</td>\n");
      out.write("                        <td><input type=\"password\" name=\"pass\" value=\"\" placeholder=\"Password\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            &nbsp;\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"submit\" value=\"Login\" class=\" button button1\"  />\n");
      out.write("                            &nbsp;\n");
      out.write("                            &nbsp;\n");
      out.write("                            &nbsp;\n");
      out.write("                            <input type=\"reset\" value=\"Reset\" class=\"button button2\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td colspan=\"2\" class=\"style2\">Not Register !! <a href=\"reg.jsp\"> Click Here to Register</a></td>\n");
      out.write("                    </tr>\n");
      out.write("               \n");
      out.write("            </table>\n");
      out.write("                            \n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("        <footer>\n");
      out.write("            <p> </p>\n");
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
