/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.86
 * Generated at: 2024-03-07 00:27:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ex14_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("	#myform{\r\n");
      out.write("		width: 400px;\r\n");
      out.write("		margin:30px auto;\r\n");
      out.write("		border: 1px solid black;\r\n");
      out.write("		border-radius: 10px;\r\n");
      out.write("		padding: 20px;\r\n");
      out.write("	}\r\n");
      out.write("	#myform fieldset{\r\n");
      out.write("		border: 1px solid #ccc;\r\n");
      out.write("		margin-bottom: 30px;\r\n");
      out.write("	}\r\n");
      out.write("	#myform legend{\r\n");
      out.write("		font-size: 16px;\r\n");
      out.write("		font-weight: bold;\r\n");
      out.write("		padding-left: 5px;\r\n");
      out.write("		padding-bottom: 10px;\r\n");
      out.write("	}\r\n");
      out.write("	#myform ul li{\r\n");
      out.write("		line-height: 30px;	\r\n");
      out.write("		list-style-type: none;\r\n");
      out.write("		padding: 5px 10px;\r\n");
      out.write("		margin-bottom: 2px;\r\n");
      out.write("	}\r\n");
      out.write("	#myform input {padding: 5px}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<form action=\"/01_servlet/Ex14\" method=\"post\" id=\"myform\">\r\n");
      out.write("		<fieldset>\r\n");
      out.write("			<legend> 성적 입력 </legend>\r\n");
      out.write("			<ul>\r\n");
      out.write("				<li><label for=\"name\">이름 :</label> <input type=\"text\" id=\"name\" name=\"name\" required></li>\r\n");
      out.write("				<li><label for=\"kor\">국어 :</label> <input type=\"number\" id=\"kor\" name=\"kor\" required></li>\r\n");
      out.write("				<li><label for=\"eng\">영어 :</label> <input type=\"number\" id=\"eng\" name=\"eng\" required></li>\r\n");
      out.write("				<li><label for=\"math\">수학 :</label> <input type=\"number\" id=\"math\" name=\"math\" required></li>\r\n");
      out.write("			</ul>\r\n");
      out.write("			<input type=\"hidden\" name=\"cmd\" value=\"1\">\r\n");
      out.write("			<input type=\"submit\" value=\"결과보기\">\r\n");
      out.write("			<input type=\"reset\" value=\"취소\">\r\n");
      out.write("		</fieldset>\r\n");
      out.write("	</form>\r\n");
      out.write("	<hr>\r\n");
      out.write("	\r\n");
      out.write("	<form action=\"/01_servlet/Ex14\" method=\"post\">\r\n");
      out.write("	    <p>취미 : \r\n");
      out.write("	        <input type=\"checkbox\" name=\"hobby\" value=\"운동\">운동\r\n");
      out.write("	        <input type=\"checkbox\" name=\"hobby\" value=\"게임\">게임\r\n");
      out.write("	        <input type=\"checkbox\" name=\"hobby\" value=\"영화\">영화\r\n");
      out.write("	        <input type=\"checkbox\" name=\"hobby\" value=\"독서\">독성\r\n");
      out.write("	    </p>\r\n");
      out.write("	    <input type=\"hidden\" name=\"cmd\" value=\"2\">\r\n");
      out.write("	    <input type=\"submit\" value=\"결과보기\">\r\n");
      out.write("	</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
