/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-06-25 01:03:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class operation_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/common.jsp", Long.valueOf(1511927868397L));
    _jspx_dependants.put("/WEB-INF/privilege.tld", Long.valueOf(1511499698000L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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
      out.write("<title>菜单按钮页面</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	/**-====================================================================
	*                               基本常量的设定
	*=====================================================================**/
	//设定context path
	String path = request.getContextPath();
	if("/".equals(path.trim())) path = "";
	pageContext.setAttribute("path",path);

      out.write("\r\n");
      out.write("<!-- CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/css/bootstrap.min.css?v=3.3.6\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/css/font-awesome.css?v=4.4.0\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/css/animate.css\" />\r\n");
      out.write("<!--[if lt IE 9]>\r\n");
      out.write("    <meta http-equiv=\"refresh\" content=\"0;ie.html\" />\r\n");
      out.write("<![endif]-->\r\n");
      out.write("<!-- JAVASCRIPT -->\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/js/jquery.min.js?v=2.1.4\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/js/bootstrap.min.js?v=3.3.6\"></script>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- jqgrid-->\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/css/plugins/jqgrid/ui.jqgrid.css?0820\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/css/animate.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/css/style.css?v=4.1.0\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"gray-bg\">\r\n");
      out.write("\t<input type=\"hidden\" id=\"hide_menuid\" name = \"menuid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${menuid }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("\t<input type=\"hidden\" id=\"hide_menuname\" name = \"menuname\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${menuname }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("\t<div class=\"wrapper wrapper-content  animated fadeInRight\">\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-sm-12\">\r\n");
      out.write("\t\t\t\t<div class=\"ibox \">\r\n");
      out.write("\t\t\t\t\t<div class=\"ibox-content\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"jqGrid_wrapper\">\r\n");
      out.write("\t\t\t\t\t\t\t<table id=\"table_menu_operation\"></table>\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"pager_menu_operation\"></div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- Peity -->\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/js/plugins/peity/jquery.peity.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<!-- jqGrid -->\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/js/plugins/jqgrid/i18n/grid.locale-cn.js?082\"></script>\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/js/plugins/jqgrid/jquery.jqGrid.min.js?0820\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- layer javascript -->\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/js/plugins/layer/layer.min.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("\t<!-- 自定义js -->\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/js/content.js?v=1.0.0\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\tmo_init();\r\n");
      out.write("\t});\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\tvar mo_init = function(){\r\n");
      out.write("\t\tvar mo_table = new mo_TableInit();\r\n");
      out.write("\t    mo_table.Init();\r\n");
      out.write("\t    var mo_btn = new mo_ButtonInit();\r\n");
      out.write("\t    mo_btn.Init();\r\n");
      out.write("\t};\r\n");
      out.write("\t\r\n");
      out.write("\tvar mo_TableInit = function () {\r\n");
      out.write("\t\tvar mo_oTable = new Object();\r\n");
      out.write("\t\tmo_oTable.Init = function () {\r\n");
      out.write("\t\t\t$.jgrid.defaults.styleUI = 'Bootstrap';\r\n");
      out.write("\t\t\t$(\"#table_menu_operation\").jqGrid({\r\n");
      out.write("\t\t\t\turl : 'operationList.htm',\r\n");
      out.write("\t\t\t\tpostData : {\r\n");
      out.write("\t\t\t\t\t'menuid' : $(\"#hide_menuid\").val()\r\n");
      out.write("\t\t\t\t}, //发送数据  \r\n");
      out.write("\t\t\t\tdatatype : \"json\",\r\n");
      out.write("\t\t\t\theight : \"300\",\r\n");
      out.write("\t\t\t\tautowidth : true,\r\n");
      out.write("\t\t\t\tcolNames : [ '按钮编号', '按钮名称', '按钮ID', '按钮图标', '按钮样式', '菜单ID', '所属菜单' ],\r\n");
      out.write("\t\t\t\tcolModel : [ {\r\n");
      out.write("\t\t\t\t\tname : \"operationid\",\r\n");
      out.write("\t\t\t\t\tindex : \"operationid\",\r\n");
      out.write("\t\t\t\t\thidden : true,\r\n");
      out.write("\t\t\t\t\teditable : true,\r\n");
      out.write("\t\t\t\t\tsortable: false,\r\n");
      out.write("\t\t\t\t\tkey : true\r\n");
      out.write("\t\t\t\t}, {\r\n");
      out.write("\t\t\t\t\tname : \"operationname\",\r\n");
      out.write("\t\t\t\t\tindex : \"operationname\",\r\n");
      out.write("\t\t\t\t\teditable : true,\r\n");
      out.write("\t\t\t\t\teditrules : {\r\n");
      out.write("\t\t\t\t\t\trequired : true\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tsortable: false\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\tname : \"operationcode\",\r\n");
      out.write("\t\t\t\t\tindex : \"operationcode\",\r\n");
      out.write("\t\t\t\t\teditable : true,\r\n");
      out.write("\t\t\t\t\teditrules : {\r\n");
      out.write("\t\t\t\t\t\trequired : true\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tsortable: false\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\tname : \"\",\r\n");
      out.write("\t\t\t\t\teditable : false,\r\n");
      out.write("\t\t\t\t\tformatter : function(cellvalue, options, rowObject){\r\n");
      out.write("\t\t\t\t\t\treturn '<span class=\"'+rowObject.iconcls+'\" aria-hidden=\"true\"></span>';\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\tname : \"iconcls\",\r\n");
      out.write("\t\t\t\t\tindex : \"iconcls\",\r\n");
      out.write("\t\t\t\t\teditable : true,\r\n");
      out.write("\t\t\t\t\tsortable: false\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\tname : \"menuid\",\r\n");
      out.write("\t\t\t\t\tindex : \"menuid\",\r\n");
      out.write("\t\t\t\t\thidden : true,\r\n");
      out.write("\t\t\t\t\teditable : true,\r\n");
      out.write("\t\t\t\t\tsortable: false\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\tname : \"menuname\",\r\n");
      out.write("\t\t\t\t\tindex : \"menuname\",\r\n");
      out.write("\t\t\t\t\teditable : true,\r\n");
      out.write("\t\t\t\t\tsortable: false\r\n");
      out.write("\t\t\t\t} ],\r\n");
      out.write("\t\t\t\tpager : \"#pager_menu_operation\",\r\n");
      out.write("\t\t\t\tviewrecords : true,\r\n");
      out.write("\t\t\t\trowNum : \"5\",\r\n");
      out.write("\t\t\t\trowList : [\"5\", \"10\", \"15\" ],\r\n");
      out.write("\t\t\t\tsortname : \"operationid\",\r\n");
      out.write("\t\t\t\tsortorder : \"asc\",\r\n");
      out.write("\t\t\t\tediturl : 'reserveOperation.htm'\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t};\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\treturn mo_oTable;\r\n");
      out.write("\t};\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\tvar mo_ButtonInit = function () {\r\n");
      out.write("    \tvar mo_btnInit = new Object();\r\n");
      out.write("    \tmo_btnInit.Init = function(){\r\n");
      out.write("\t    \t// Setup buttons\r\n");
      out.write("\t\t\tvar mo_jqnav = $(\"#table_menu_operation\").jqGrid( 'navGrid', '#pager_menu_operation', {\r\n");
      out.write("\t\t\t\tadd : true,\r\n");
      out.write("\t\t\t\tedit : true,\r\n");
      out.write("\t\t\t\tdel : true,\r\n");
      out.write("\t\t\t\tsearch : false,\r\n");
      out.write("\t\t\t\trefresh : false,\r\n");
      out.write("\t\t\t\taddtext : \"添加\",\r\n");
      out.write("\t\t\t\tedittext : \"修改\",\r\n");
      out.write("\t\t\t\tdeltext : \"删除\"\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\t{//edit\r\n");
      out.write("\t\t\t\theight : 300,\r\n");
      out.write("\t\t\t\treloadAfterSubmit : true,\r\n");
      out.write("\t\t\t    beforeShowForm : function(frm) {\r\n");
      out.write("\t\t\t    \tvar id = $(\"#table_menu_operation\").jqGrid('getGridParam', 'selrow');\r\n");
      out.write("\t\t\t    \tfrm.find('#operationid').val(id);\r\n");
      out.write("\t\t\t    \tfrm.find('#menuid').val(menuid.value);\r\n");
      out.write("\t\t\t    \tfrm.find('#operationname').val(operationname.value);\r\n");
      out.write("\t\t\t    \tfrm.find('#menuname').val(menuname.value).attr('readonly',true);\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tafterSubmit: function(xhr, postdata) {\r\n");
      out.write("\t             \t\tvar obj = eval('(' + xhr.responseText + ')');\r\n");
      out.write("\t             \t\tif(obj.errorMsg === undefined){\r\n");
      out.write("\t             \t\t\t/* $(\"#table_menu_operation\").trigger(\"reloadGrid\"); */\r\n");
      out.write("\t             \t\t\t$(\"#tokeInOutList\").jqGrid('resetSelection');\r\n");
      out.write("\t               \t\treturn true;\r\n");
      out.write("\t             \t\t}else{\r\n");
      out.write("\t             \t\t\tlayer.alert(obj.errorMsg, {icon: 2});\r\n");
      out.write("\t             \t\t\treturn false;\r\n");
      out.write("\t             \t\t}\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tcloseAfterEdit : true\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\t{//add\r\n");
      out.write("\t\t\t\theight : 300,\r\n");
      out.write("\t\t\t\treloadAfterSubmit : true,\r\n");
      out.write("\t\t\t    beforeShowForm : function(frm) {\r\n");
      out.write("\t\t\t    \tfrm.find('#menuid').val($(\"#hide_menuid\").val());\r\n");
      out.write("\t\t\t    \tfrm.find('#menuname').val($(\"#hide_menuname\").val()).attr('readonly',true);\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tafterSubmit: function(xhr, postdata) {\r\n");
      out.write("\t             \t\tvar obj = eval('(' + xhr.responseText + ')');\r\n");
      out.write("\t             \t\tif(obj.errorMsg === undefined){\r\n");
      out.write("\t             \t\t\t$(\"#tokeInOutList\").jqGrid('resetSelection');\r\n");
      out.write("\t             \t\t\t/* $(\"#table_menu_operation\").trigger(\"reloadGrid\"); */\r\n");
      out.write("\t               \t\treturn true;\r\n");
      out.write("\t             \t\t}else{\r\n");
      out.write("\t             \t\t\tlayer.alert(obj.errorMsg, {icon: 2});\r\n");
      out.write("\t             \t\t\treturn false;\r\n");
      out.write("\t             \t\t}\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tcloseAfterAdd : true\r\n");
      out.write("\t            },\r\n");
      out.write("\t            {//del\r\n");
      out.write("\t             \turl : 'deleteOperation.htm',\r\n");
      out.write("\t             \tafterSubmit: function(xhr, postdata) {\r\n");
      out.write("\t             \t\tvar obj = eval('(' + xhr.responseText + ')');\r\n");
      out.write("\t             \t\tif(obj.errorMsg){\r\n");
      out.write("\t             \t\t\tlayer.alert(obj.errorMsg, {icon: 2});\r\n");
      out.write("\t             \t\t\t$(\"#delmodtable_menu_operation\").hide();\r\n");
      out.write("\t             \t\t\treturn false;\r\n");
      out.write("\t             \t\t}else{\r\n");
      out.write("\t             \t\t\t/* $(\"#table_menu_operation\").trigger(\"reloadGrid\"); */\r\n");
      out.write("\t             \t\t\t$(\"#tokeInOutList\").jqGrid('resetSelection');\r\n");
      out.write("\t\t\t\t\t\t$(\"#delmodtable_menu_operation\").hide();\r\n");
      out.write("\t               \t\treturn true;\r\n");
      out.write("\t             \t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t             },\r\n");
      out.write("\t             {}\r\n");
      out.write("\t        );\r\n");
      out.write("     \t};\r\n");
      out.write("\t\treturn mo_btnInit;\r\n");
      out.write("\t};\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
