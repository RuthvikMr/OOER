package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class addCourse_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Add Courses</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"addcourseAction.jsp\">\n");
      out.write("        <table border=\"1\">\n");
      out.write("            <tr>\n");
      out.write("             \n");
      out.write("                     <td>Semester</td>\n");
      out.write("                                <td><select name=\"sem\">\n");
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
      out.write("                             <tr>\n");
      out.write("                        <td>Class</td>\n");
      out.write("                                <td><select name=\"degree\">\n");
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
      out.write("                                  <tr>\n");
      out.write("                        <td>Department</td>\n");
      out.write("                                <td><select name=\"providedby\">\n");
      out.write("                                        <option value=\"select\">Select option</option>\n");
      out.write("                                        <option value=\"Computer Science\">Computer Science</option>\n");
      out.write("                                        <option value=\"Management and Commerce\">Management and Commerce</option>\n");
      out.write("                                        <option value=\"Visual Communication\">Visual Communication</option>\n");
      out.write("                                        <option value=\"Language Department\">Language Department</option>\n");
      out.write("                                        \n");
      out.write("                                        \n");
      out.write("                            </select></td>\n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Course ID</td>\n");
      out.write("                <td><select name=\"course_id\">\n");
      out.write("                        <option value=\"select\">Select Course ID</option>\n");
      out.write("                        <option value=\"Green Marketing\">15OEL245</option>\n");
      out.write("                        <option value=\"Bhagavadgita\">15OEL273</option>\n");
      out.write("                        <option value=\"grahics\">15OEL244</option>\n");
      out.write("                        <option value=\"Data Mining\">15OEL249</option>\n");
      out.write("                        <option value=\"AI\">AI </option>\n");
      out.write("                    </select></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Course Name</td>\n");
      out.write("                <td><select name=\"course_name\">\n");
      out.write("                        <option value=\"select\">select course Name</option>\n");
      out.write("                        <option value=\"Green Marketing\">Green Marketing </option>\n");
      out.write("                        <option value=\"Bhagavadgita\">Bhagavadgita  </option>\n");
      out.write("                        <option value=\"Data\">Data Mining  </option>\n");
      out.write("                        <option value=\"Graphics\">Graphics  </option>\n");
      out.write("                        <option value=\"AI\">AI</option>\n");
      out.write("                    </select></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Description </td>\n");
      out.write("                <td><input type=\"text\" name=\"des\"/></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Lecture</td>\n");
      out.write("                <td><input type=\"text\" name=\"lec\"/></td>\n");
      out.write("            </tr>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><input type=\"submit\" value=\"submit\"/></td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
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
