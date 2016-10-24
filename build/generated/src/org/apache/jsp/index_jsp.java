package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;
import javax.naming.InitialContext;
import java.sql.*;

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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>TrollTours homepage</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Welcome to TrollTours homepage blabla</h1>\n");
      out.write("        ");
ResultSet resultset = null;
      out.write("\n");
      out.write("        ");

            try {
    //Class.forName("com.mysql.jdbc.Driver").newInstance();
               //Connection c = DriverManager.getConnection("jdbc:sqlserver://158.38.101.112:1433;databaseName=Hobbyhuset","Henke","troll123");
                Connection c = DriverManager.getConnection("jdbc:sqlserver://158.38.101.112:1433;databaseName=Hobbyhuset","Henke   ","troll123");
               
                Statement st = c.createStatement();
                Statement st2 = c.createStatement();
                ResultSet rs = st.executeQuery(
                        "select AnsNr from Ansatt");
               ResultSet rs2 = st2.executeQuery("select Fornavn from Ansatt");
                
        
      out.write("\n");
      out.write("\n");
      out.write("    <center>\n");
      out.write("        <h1> Drop down box or select element</h1>\n");
      out.write("        <select>\n");
      out.write("            ");
  while (rs.next()) {
      out.write("\n");
      out.write("            <option>");
      out.print( rs.getString(1));
      out.write("</option>\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("        </select>\n");
      out.write("    </center>\n");
      out.write("           \n");
      out.write("    <left>\n");
      out.write("        <h1> Drop down box or select element</h1>\n");
      out.write("        <select>\n");
      out.write("            ");
  while (rs2.next()) {
      out.write("\n");
      out.write("            <option>");
      out.print( rs2.getString(1));
      out.write("</option>\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("        </select>\n");
      out.write("    </left>\n");
      out.write("            \n");
      out.write("    ");

    //**Should I input the codes here?**
        } catch (Exception e) {
            out.println("wrong entry: " + e);
        }
    
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
