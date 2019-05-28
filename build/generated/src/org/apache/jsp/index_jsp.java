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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Encuesta</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Responder encuesta</h1>\n");
      out.write("        <h3>Seleccione un valor del 1 a 5 según su grado de acuerdo</h3>\n");
      out.write("        <form id=\"frm\" name=\"frm\" method=\"POST\" action=\"request.jsp\">\n");
      out.write("            <table class=\"table table-bordered table-striped\">\n");
      out.write("                <thead></thead>\n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>1</td>\n");
      out.write("                        <td>Las instalaciones cumplen son confortables</td>\n");
      out.write("                        <td><input required type=\"radio\" name=\"p1\" value=\"1\"/></td>\n");
      out.write("                        <td><input required type=\"radio\" name=\"p1\" value=\"2\"/></td>\n");
      out.write("                        <td><input required type=\"radio\" name=\"p1\" value=\"3\"/></td>\n");
      out.write("                        <td><input required type=\"radio\" name=\"p1\" value=\"4\"/></td>\n");
      out.write("                        <td><input required type=\"radio\" name=\"p1\" value=\"5\"/></td>\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>2</td>\n");
      out.write("                        <td>Los horarios nos permiten desarrollar nuestras tareas</td>\n");
      out.write("                        <td><input required type=\"radio\" name=\"p2\" value=\"1\"/></td>\n");
      out.write("                        <td><input required type=\"radio\" name=\"p2\" value=\"2\"/></td>\n");
      out.write("                        <td><input required type=\"radio\" name=\"p2\" value=\"3\"/></td>\n");
      out.write("                        <td><input required type=\"radio\" name=\"p2\" value=\"4\"/></td>\n");
      out.write("                        <td><input required type=\"radio\" name=\"p2\" value=\"5\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>3</td>\n");
      out.write("                        <td>Disponemos de laboratorios para horarios fuera de la clase</td>\n");
      out.write("                        <td><input required type=\"radio\" name=\"p3\" value=\"1\"/></td>\n");
      out.write("                        <td><input required type=\"radio\" name=\"p3\" value=\"2\"/></td>\n");
      out.write("                        <td><input required type=\"radio\" name=\"p3\" value=\"3\"/></td>\n");
      out.write("                        <td><input required type=\"radio\" name=\"p3\" value=\"4\"/></td>\n");
      out.write("                        <td><input required type=\"radio\" name=\"p3\" value=\"5\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>4</td>\n");
      out.write("                        <td>Los docentes son puntuales con la entrada</td>\n");
      out.write("                        <td><input required type=\"radio\" name=\"p4\" value=\"1\"/></td>                \n");
      out.write("                        <td><input required type=\"radio\" name=\"p4\" value=\"2\"/></td>\n");
      out.write("                        <td><input required type=\"radio\" name=\"p4\" value=\"3\"/></td>\n");
      out.write("                        <td><input required type=\"radio\" name=\"p4\" value=\"4\"/></td>\n");
      out.write("                        <td><input required type=\"radio\" name=\"p4\" value=\"5\"/></td>\n");
      out.write("                    <tr/>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>5</td>\n");
      out.write("                        <td>El material compartido cumple los objetivos</td>\n");
      out.write("                        <td><input required type=\"radio\" name=\"p5\" value=\"1\"/></td>\n");
      out.write("                        <td><input required type=\"radio\" name=\"p5\" value=\"2\"/></td>\n");
      out.write("                        <td><input required type=\"radio\" name=\"p5\" value=\"3\"/></td>\n");
      out.write("                        <td><input required type=\"radio\" name=\"p5\" value=\"4\"/></td>\n");
      out.write("                        <td><input required type=\"radio\" name=\"p5\" value=\"5\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>6</td>\n");
      out.write("                        <td>Los ejemplos nos aclaran las dudas</td>\n");
      out.write("                        <td><input required type=\"radio\" name=\"p6\" value=\"1\"/></td>\n");
      out.write("                        <td><input required type=\"radio\" name=\"p6\" value=\"2\"/></td>\n");
      out.write("                        <td><input required type=\"radio\" name=\"p6\" value=\"3\"/></td>\n");
      out.write("                        <td><input required type=\"radio\" name=\"p6\" value=\"4\"/></td>\n");
      out.write("                        <td><input required type=\"radio\" name=\"p6\" value=\"5\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>7</td>\n");
      out.write("                        <td>Los PC nos permiten desarrollar bien nuestras actividades de programación</td>\n");
      out.write("                        <td><input required type=\"radio\" name=\"p7\" value=\"1\"/></td>\n");
      out.write("                        <td><input required type=\"radio\" name=\"p7\" value=\"2\"/></td>\n");
      out.write("                        <td><input required type=\"radio\" name=\"p7\" value=\"3\"/></td>\n");
      out.write("                        <td><input required type=\"radio\" name=\"p7\" value=\"4\"/></td>\n");
      out.write("                        <td><input required type=\"radio\" name=\"p7\" value=\"5\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>8</td>\n");
      out.write("                        <td>El internet está disponible 100%</td>\n");
      out.write("                        <td><input required type=\"radio\" name=\"p8\" value=\"1\"/></td>\n");
      out.write("                        <td><input required type=\"radio\" name=\"p8\" value=\"2\"/></td>\n");
      out.write("                        <td><input required type=\"radio\" name=\"p8\" value=\"3\"/></td>\n");
      out.write("                        <td><input required type=\"radio\" name=\"p8\" value=\"4\"/></td>\n");
      out.write("                        <td><input required type=\"radio\" name=\"p8\" value=\"5s\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("               \n");
      out.write("                <tr>\n");
      out.write("                    <td>Observación: </td>\n");
      out.write("                    <td colspan=\"6\">\n");
      out.write("                        <textarea class=\"form-control\"name=\"obs\"></textarea>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <td colspan=\"7\">\n");
      out.write("                <input class =\"btn-success\" type=\"submit\" value=\"Enviar\"/>\n");
      out.write("                </td>\n");
      out.write("                 </tbody>\n");
      out.write("            </table>\n");
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
