/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.28
 * Generated at: 2016-09-07 13:20:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_005fsuccess_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("jar:file:/E:/Juyan/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/ordering_system/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153356282000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1461759242601L));
    _jspx_dependants.put("/topbar.jsp", Long.valueOf(1473090587416L));
    _jspx_dependants.put("/footer.jsp", Long.valueOf(1473078264757L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_packages.add("javax.servlet.http");
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
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
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
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <!--\r\n");
      out.write("        ===\r\n");
      out.write("        This comment should NOT be removed.\r\n");
      out.write("\r\n");
      out.write("        Charisma v2.0.0\r\n");
      out.write("\r\n");
      out.write("        Copyright 2012-2014 Muhammad Usman\r\n");
      out.write("        Licensed under the Apache License v2.0\r\n");
      out.write("        http://www.apache.org/licenses/LICENSE-2.0\r\n");
      out.write("\r\n");
      out.write("        http://usman.it\r\n");
      out.write("        http://twitter.com/halalit_usman\r\n");
      out.write("        ===\r\n");
      out.write("    -->\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("    <title>用户注册</title>\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <meta name=\"description\" content=\"Charisma, a fully featured, responsive, HTML5, Bootstrap admin template.\">\r\n");
      out.write("    <meta name=\"author\" content=\"Muhammad Usman\">\r\n");
      out.write("\r\n");
      out.write("    <!-- The styles -->\r\n");
      out.write("    <link id=\"bs-css\" href=\"css/bootstrap-cerulean.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <link href=\"css/charisma-app.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href='bower_components/fullcalendar/dist/fullcalendar.css' rel='stylesheet'>\r\n");
      out.write("    <link href='bower_components/fullcalendar/dist/fullcalendar.print.css' rel='stylesheet' media='print'>\r\n");
      out.write("    <link href='bower_components/chosen/chosen.min.css' rel='stylesheet'>\r\n");
      out.write("    <link href='bower_components/colorbox/example3/colorbox.css' rel='stylesheet'>\r\n");
      out.write("    <link href='bower_components/responsive-tables/responsive-tables.css' rel='stylesheet'>\r\n");
      out.write("    <link href='bower_components/bootstrap-tour/build/css/bootstrap-tour.min.css' rel='stylesheet'>\r\n");
      out.write("    <link href='css/jquery.noty.css' rel='stylesheet'>\r\n");
      out.write("    <link href='css/noty_theme_default.css' rel='stylesheet'>\r\n");
      out.write("    <link href='css/elfinder.min.css' rel='stylesheet'>\r\n");
      out.write("    <link href='css/elfinder.theme.css' rel='stylesheet'>\r\n");
      out.write("    <link href='css/jquery.iphone.toggle.css' rel='stylesheet'>\r\n");
      out.write("    <link href='css/uploadify.css' rel='stylesheet'>\r\n");
      out.write("    <link href='css/animate.min.css' rel='stylesheet'>\r\n");
      out.write("\r\n");
      out.write("    <!-- jQuery -->\r\n");
      out.write("    <script src=\"bower_components/jquery/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- The HTML5 shim, for IE6-8 support of HTML5 elements -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("    <script src=\"http://html5shim.googlecode.com/svn/trunk/html5.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("\r\n");
      out.write("    <!-- The fav icon -->\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"img/favicon.ico\">\r\n");
      out.write("\r\n");
      out.write("\t<!-- my custom css -->\r\n");
      out.write("\t<link href='css/custom.css' rel='stylesheet'>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<!-- topbar -->\r\n");
      out.write("\r\n");
      out.write("\t<!-- topbar starts -->\r\n");
      out.write("    <div class=\"navbar navbar-default\" role=\"navigation\">\r\n");
      out.write("\r\n");
      out.write("        <div class=\"navbar-inner\">\r\n");
      out.write("            <button type=\"button\" class=\"navbar-toggle pull-left animated flip\">\r\n");
      out.write("                <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("            </button>\r\n");
      out.write("            <a class=\"navbar-brand\" href=\"index.html\"> <img alt=\"Charisma Logo\" src=\"img/logo20.png\" class=\"hidden-xs\" \r\n");
      out.write("            \tstyle=\"width:72px;height:38px\"/></a>\r\n");
      out.write("\r\n");
      out.write("            <!-- user dropdown starts -->\r\n");
      out.write("            <div class=\"btn-group pull-right\">\r\n");
      out.write("                <button class=\"btn btn-default dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("                    <i class=\"glyphicon glyphicon-user\"></i><span class=\"hidden-sm hidden-xs\"> \r\n");
      out.write("                    \t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user.account}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("                    </span>\r\n");
      out.write("                    <span class=\"caret\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("                <ul class=\"dropdown-menu\">\r\n");
      out.write("                    <li><a href=\"#\">账户设置</a></li>\r\n");
      out.write("                    <li class=\"divider\"></li>\r\n");
      out.write("                    <li><a href=\"login.html\">退出</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- user dropdown ends -->\r\n");
      out.write("\r\n");
      out.write("            <ul class=\"collapse navbar-collapse nav navbar-nav top-menu\">\r\n");
      out.write("                <li class=\"dropdown\">\r\n");
      out.write("                    <a href=\"#\" data-toggle=\"dropdown\"><i class=\"glyphicon glyphicon-info-sign\"></i> 关于聚妍 <span\r\n");
      out.write("                            class=\"caret\"></span></a>\r\n");
      out.write("                    <ul class=\"dropdown-menu\" role=\"menu\">\r\n");
      out.write("                        <li><a href=\"#\">公司介绍</a></li>\r\n");
      out.write("                        <li class=\"divider\"></li>\r\n");
      out.write("                        <li><a href=\"#\">OPI</a></li>\r\n");
      out.write("                        <li><a href=\"#\">贝瑞可</a></li>\r\n");
      out.write("                        <li><a href=\"#\">CND</a></li>\r\n");
      out.write("                        <li><a href=\"#\">YOUKA</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li><a href=\"#\"><i class=\"glyphicon glyphicon-globe\"></i> 最近消息及活动</a></li>\r\n");
      out.write("                <li><a href=\"#\"><i class=\"glyphicon glyphicon-star\"></i> 联系方式</a></li>               \r\n");
      out.write("            </ul>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- topbar ends -->");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("<div class=\"ch-container\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("    \r\n");
      out.write("\t    <div class=\"row\">\r\n");
      out.write("\t        <div class=\"col-md-12 center login-header\">\r\n");
      out.write("\t            <img alt=\"Charisma Logo\" src=\"img/step3.png\" class=\"hidden-xs\" />\r\n");
      out.write("\t        </div>\r\n");
      out.write("\t        <!--/span-->\r\n");
      out.write("\t    </div><!--/row-->\r\n");
      out.write("    \r\n");
      out.write("        <div id=\"content\" class=\"col-md-5 center \">\r\n");
      out.write("            <!-- content starts -->\r\n");
      out.write("            \r\n");
      out.write("            <h1>注册成功！ </h1>\r\n");
      out.write("            <br>\r\n");
      out.write("            <a href=\"\" class=\"btn btn-primary btn-lg\">\r\n");
      out.write("            \t<i class=\"glyphicon glyphicon-chevron-left glyphicon-white\"></i> 返回首页</a>\r\n");
      out.write("\t\t\t\r\n");
      out.write("    \t\t<!-- content ends -->\r\n");
      out.write("    \t</div><!--/#content.col-md-0-->\r\n");
      out.write("\t</div><!--/fluid-row-->\r\n");
      out.write("\r\n");
      out.write("\t<!-- footer -->\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\t<hr>\r\n");
      out.write("    <footer class=\"row\">\r\n");
      out.write("        <p class=\"col-md-9 col-sm-9 col-xs-12 copyright\">&copy; Juyan 2016 - 2017</p>\r\n");
      out.write("\r\n");
      out.write("        <p class=\"col-md-3 col-sm-3 col-xs-12 powered-by\"><a href=\"\">联系客服</a></p>\r\n");
      out.write("    </footer>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div><!--/.fluid-container-->\r\n");
      out.write("\r\n");
      out.write("<!-- external javascript -->\r\n");
      out.write("\r\n");
      out.write("<script src=\"bower_components/bootstrap/dist/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- library for cookie management -->\r\n");
      out.write("<script src=\"js/jquery.cookie.js\"></script>\r\n");
      out.write("<!-- calender plugin -->\r\n");
      out.write("<script src='bower_components/moment/min/moment.min.js'></script>\r\n");
      out.write("<script src='bower_components/fullcalendar/dist/fullcalendar.min.js'></script>\r\n");
      out.write("<!-- data table plugin -->\r\n");
      out.write("<script src='js/jquery.dataTables.min.js'></script>\r\n");
      out.write("\r\n");
      out.write("<!-- select or dropdown enhancer -->\r\n");
      out.write("<script src=\"bower_components/chosen/chosen.jquery.min.js\"></script>\r\n");
      out.write("<!-- plugin for gallery image view -->\r\n");
      out.write("<script src=\"bower_components/colorbox/jquery.colorbox-min.js\"></script>\r\n");
      out.write("<!-- notification plugin -->\r\n");
      out.write("<script src=\"js/jquery.noty.js\"></script>\r\n");
      out.write("<!-- library for making tables responsive -->\r\n");
      out.write("<script src=\"bower_components/responsive-tables/responsive-tables.js\"></script>\r\n");
      out.write("<!-- tour plugin -->\r\n");
      out.write("<script src=\"bower_components/bootstrap-tour/build/js/bootstrap-tour.min.js\"></script>\r\n");
      out.write("<!-- star rating plugin -->\r\n");
      out.write("<script src=\"js/jquery.raty.min.js\"></script>\r\n");
      out.write("<!-- for iOS style toggle switch -->\r\n");
      out.write("<script src=\"js/jquery.iphone.toggle.js\"></script>\r\n");
      out.write("<!-- autogrowing textarea plugin -->\r\n");
      out.write("<script src=\"js/jquery.autogrow-textarea.js\"></script>\r\n");
      out.write("<!-- multiple file upload plugin -->\r\n");
      out.write("<script src=\"js/jquery.uploadify-3.1.min.js\"></script>\r\n");
      out.write("<!-- history.js for cross-browser state change on ajax -->\r\n");
      out.write("<script src=\"js/jquery.history.js\"></script>\r\n");
      out.write("<!-- application script for Charisma demo -->\r\n");
      out.write("<script src=\"js/charisma.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- validate -->\r\n");
      out.write("<script src=\"js/jquery.validate.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function getPin_disabled(op){\r\n");
      out.write("\tif(op == true) {\r\n");
      out.write("\t\t$(\"#getPin\").attr(\"disabled\",\"true\");\r\n");
      out.write("\t} else {\r\n");
      out.write("\t\t$(\"#getPin\").removeAttr(\"disabled\");\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function next_disabled(op){\r\n");
      out.write("\tif(op == true) {\r\n");
      out.write("\t\t$(\"#next\").attr(\"disabled\",\"true\");\r\n");
      out.write("\t} else {\r\n");
      out.write("\t\t$(\"#next\").removeAttr(\"disabled\");\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function check_phone(){\r\n");
      out.write("\tvar phone = $(\"#phone\").val();\r\n");
      out.write("\t//验证手机格式！！！\r\n");
      out.write("\tif(phone != null || phone != \"\"){\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t   \ttype: \"POST\",\r\n");
      out.write("\t\t   \turl: \"ifPhoneExist\",\r\n");
      out.write("\t\t   \tdata: {\r\n");
      out.write("\t\t   \t\tphone : phone,\r\n");
      out.write("\t\t   \t\troleNo : 4\r\n");
      out.write("\t\t   \t},\r\n");
      out.write("\t\t   \tdataType:\"text\",\r\n");
      out.write("\t\t   \tsuccess: function(data){\r\n");
      out.write("\t\t   \t\tif(data == \"existent\") {\r\n");
      out.write("\t\t   \t\t\t$(\"#phn_warn\").html(\"<div style='color:red;'>该手机号已被注册，请使用手机号登录</div>\");\r\n");
      out.write("\t\t   \t\t\tgetPin_disabled(true);\r\n");
      out.write("\t\t   \t\t\tnext_disabled(true);\r\n");
      out.write("\t\t   \t\t} else {\r\n");
      out.write("\t\t   \t\t\t$(\"#phn_warn\").html(\"<div class='glyphicon glyphicon-ok-sign green'></div>\");\r\n");
      out.write("\t\t   \t\t\tgetPin_disabled(false);\r\n");
      out.write("\t\t   \t\t\tnext_disabled(false);\r\n");
      out.write("\t\t   \t\t}\r\n");
      out.write("\t\t   \t},\r\n");
      out.write("\t\t   \terror: function(){\r\n");
      out.write("\t\t    \talert(\"验证手机号失败\");\r\n");
      out.write("\t\t   \t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t} else {\r\n");
      out.write("\t\t$(\"#phn_warn\").html(\"<div style='color:red;'>手机号不能为空</div>\");\r\n");
      out.write("\t\tgetPin_disabled(true);\r\n");
      out.write("\t\tnext_disabled(true);\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function check_pin(){\r\n");
      out.write("\tvar pin1 = $(\"#pin\").val();\r\n");
      out.write("\tvar pin2 = $.cookie(\"pin\");\r\n");
      out.write("\t\r\n");
      out.write("\tif ( pin1 != pin2){\r\n");
      out.write("\t\t$(\"#pin_warn\").html(\"<div class='glyphicon glyphicon-remove-sign red'></div>\");\r\n");
      out.write("\t\tnext_disabled(true);\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("    } else {\r\n");
      out.write("    \t$(\"#pin_warn\").html(\"<div class='glyphicon glyphicon-ok-sign green'></div>\");\r\n");
      out.write("    \tnext_disabled(false);\r\n");
      out.write("    \treturn true;\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("$(function(){\r\n");
      out.write("\t$(\"#phone\").change(check_phone);\r\n");
      out.write("\t\r\n");
      out.write("\t$(\"#pin\").change(check_pin);\r\n");
      out.write("\t\r\n");
      out.write("\t$(\"#getPin\").click(function(){\r\n");
      out.write("\t\tvar phone = $(\"#phone\").val();\r\n");
      out.write("\t\tif(phone != null){\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t   \ttype: \"POST\",\r\n");
      out.write("\t\t\t   \turl: \"sendPin\",\r\n");
      out.write("\t\t\t   \tdata: {\r\n");
      out.write("\t\t\t   \t\tphone : phone\r\n");
      out.write("\t\t\t   \t},\r\n");
      out.write("\t\t\t   \tdataType:\"text\",\r\n");
      out.write("\t\t\t   \tsuccess: function(data){\r\n");
      out.write("\t\t\t   \t\t//$(\"#pin\").val(data);\r\n");
      out.write("\t\t\t   \t\talert(\"验证码已发送到您的手机，15分钟内输入有效\");\r\n");
      out.write("\t\t\t    \treturn false;\r\n");
      out.write("\t\t\t   \t},\r\n");
      out.write("\t\t\t   \terror: function(){\r\n");
      out.write("\t\t\t    \talert(\"验证码发送失败\");\r\n");
      out.write("\t\t\t    \treturn false;\r\n");
      out.write("\t\t\t   \t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
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
