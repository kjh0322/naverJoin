/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.82
 * Generated at: 2022-10-04 05:42:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class naverMemberShip_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
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
      out.write("<html lang=\"ko\">\r\n");
      out.write("<head>\r\n");
      out.write("	<meta charset=\"UTF-8\">\r\n");
      out.write("	<title>네이버 회원가입</title>\r\n");
      out.write("	<link rel=\"stylesheet\" type=\"text/css\" href=\"css/naverStyle.css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("	<header>\r\n");
      out.write("		<h1><a href=\"http://www.naver.com\"><img src=\"img/logo.png\" alt=\"네이버메인 페이지로 이동\" class=\"logo\"></a></h1>\r\n");
      out.write("	</header>\r\n");
      out.write("	\r\n");
      out.write("	<section>\r\n");
      out.write("		<h2 class=\"hidden\">네이버 회원가입절차</h2>\r\n");
      out.write("		<form action=\"\" method=\"get\">\r\n");
      out.write("			<ul>\r\n");
      out.write("				<!-- id -->\r\n");
      out.write("				<li>\r\n");
      out.write("					<h3><label for=\"id\">아이디</label></h3>\r\n");
      out.write("					<div class=\"box\">\r\n");
      out.write("						<input type=\"text\" id=\"id\" name=\"userid\" maxlength=\"20\" class=\"inL\" required>\r\n");
      out.write("						<span class=\"step_urlinR\">@naver.com</span>\r\n");
      out.write("					</div>\r\n");
      out.write("					<span class=\"error_next_box\"></span>\r\n");
      out.write("				</li>\r\n");
      out.write("				\r\n");
      out.write("				<!-- pw1 -->\r\n");
      out.write("				<li>\r\n");
      out.write("					<h3><label for=\"pw1\">비밀번호</label></h3>\r\n");
      out.write("					<div class=\"box int_pass\">\r\n");
      out.write("						<input type=\"password\" id=\"pw1\" name=\"userpw1\" maxlength=\"20\" class=\"inL\" required>\r\n");
      out.write("						<span id=\"alertTxt\">사용불가</span>\r\n");
      out.write("						<img src=\"img/icon_pass.png\" alt=\"\" class=\"inR pwImg\" id=\"pwImg1\">\r\n");
      out.write("					</div>\r\n");
      out.write("					<span class=\"error_next_box\"></span>\r\n");
      out.write("				</li>\r\n");
      out.write("				\r\n");
      out.write("				<!-- pw2 -->\r\n");
      out.write("				<li>\r\n");
      out.write("					<h3><label for=\"pw2\">비밀번호 재확인</label></h3>\r\n");
      out.write("					<div class=\"box\">\r\n");
      out.write("						<input type=\"password\" id=\"pw2\" name=\"userpw2\" maxlength=\"20\" class=\"inL\" required>\r\n");
      out.write("						<img src=\"img/icon_check_disable.png\" alt=\"\" class=\"inR pwImg\" id=\"pwImg2\">\r\n");
      out.write("					</div>\r\n");
      out.write("					<span class=\"error_next_box\"></span>\r\n");
      out.write("				</li>\r\n");
      out.write("				\r\n");
      out.write("				<!-- name -->\r\n");
      out.write("				<li>\r\n");
      out.write("					<h3><label for=\"name\">이름</label></h3>\r\n");
      out.write("					<div class=\"box\">\r\n");
      out.write("						<input type=\"text\" id=\"name\" name=\"name\" maxlength=\"20\" class=\"inL\" required>\r\n");
      out.write("					</div>\r\n");
      out.write("					<span class=\"error_next_box\"></span>\r\n");
      out.write("				</li>\r\n");
      out.write("				\r\n");
      out.write("				<!-- birth -->\r\n");
      out.write("				<li>\r\n");
      out.write("					<h3><label for=\"yy\">생년월일</label></h3>\r\n");
      out.write("					<div class=\"birthWrap\">\r\n");
      out.write("						<!-- birth yy -->\r\n");
      out.write("						<span class=\"box\">\r\n");
      out.write("							<input type=\"text\" id=\"yy\" name=\"yy\" maxlength=\"4\" placeholder=\"년(4자)\">\r\n");
      out.write("						</span>\r\n");
      out.write("						\r\n");
      out.write("						<!-- birth mm -->\r\n");
      out.write("						<span class=\"box\">\r\n");
      out.write("							<select name=\"mm\" id=\"mm\">\r\n");
      out.write("								<option>월</option>\r\n");
      out.write("								<option value=\"01\">1</option>\r\n");
      out.write("								<option value=\"02\">2</option>\r\n");
      out.write("								<option value=\"03\">3</option>\r\n");
      out.write("								<option value=\"04\">4</option>\r\n");
      out.write("								<option value=\"05\">5</option>\r\n");
      out.write("								<option value=\"06\">6</option>\r\n");
      out.write("								<option value=\"07\">7</option>\r\n");
      out.write("								<option value=\"08\">8</option>\r\n");
      out.write("								<option value=\"09\">9</option>\r\n");
      out.write("								<option value=\"10\">10</option>\r\n");
      out.write("								<option value=\"11\">11</option>\r\n");
      out.write("								<option value=\"12\">12</option>\r\n");
      out.write("							</select>	\r\n");
      out.write("						</span>\r\n");
      out.write("						\r\n");
      out.write("						<!-- birth dd -->\r\n");
      out.write("						<span class=\"box\">\r\n");
      out.write("							<input type=\"text\" id=\"dd\" name=\"dd\" maxlength=\"2\" placeholder=\"일\">\r\n");
      out.write("						</span>\r\n");
      out.write("					</div>\r\n");
      out.write("					\r\n");
      out.write("					<span class=\"error_next_box\"></span>\r\n");
      out.write("				</li>\r\n");
      out.write("				\r\n");
      out.write("				<!-- gender -->\r\n");
      out.write("				<li>\r\n");
      out.write("					<h3><label for=\"gender\">성별</label></h3>\r\n");
      out.write("					<div class=\"box\">	\r\n");
      out.write("						<select id=\"gender\" class=\"inL\">\r\n");
      out.write("							<option>성별</option>\r\n");
      out.write("							<option value=\"M\">남자</option>\r\n");
      out.write("							<option value=\"F\">여자</option>\r\n");
      out.write("						</select>\r\n");
      out.write("					</div>	\r\n");
      out.write("					<span class=\"error_next_box\">필수 정보입니다.</span>\r\n");
      out.write("				</li>\r\n");
      out.write("				\r\n");
      out.write("				<!-- email -->\r\n");
      out.write("				<li>\r\n");
      out.write("					<h3><label for=\"email\">본인확인 이메일(선택)</label></h3>\r\n");
      out.write("					<div class=\"box\">	\r\n");
      out.write("						<input type=\"email\" id=\"email\" maxlength=\"50\" class=\"inL\" placeholder=\"선택입력\">\r\n");
      out.write("					</div>	\r\n");
      out.write("					<span class=\"error_next_box\">이메일 주소를 다시 확인해주세요.</span>\r\n");
      out.write("				</li>		\r\n");
      out.write("				\r\n");
      out.write("				<!-- mobile -->\r\n");
      out.write("				<li>\r\n");
      out.write("					<h3><label for=\"mobile\">휴대전화</label></h3>\r\n");
      out.write("					<div class=\"box\">	\r\n");
      out.write("						<input type=\"tel\" id=\"mobile\" maxlength=\"16\" placeholder=\"전화번호 입력\" class=\"inL\">\r\n");
      out.write("					</div>	\r\n");
      out.write("					<span class=\"error_next_box\"></span>\r\n");
      out.write("				</li>\r\n");
      out.write("				\r\n");
      out.write("				<!-- join btn -->\r\n");
      out.write("				<li>\r\n");
      out.write("					<input type=\"submit\" value=\"가입하기\" class=\"joinBtn\">\r\n");
      out.write("				</li>\r\n");
      out.write("			</ul>\r\n");
      out.write("		</form>\r\n");
      out.write("	</section>\r\n");
      out.write("	<script src=\"js/script.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
