/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-06-24 13:27:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/common.jsp", Long.valueOf(1511927868397L));
    _jspx_dependants.put("/WEB-INF/privilege.tld", Long.valueOf(1511499698000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("<title>菜单主页</title>\r\n");
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
      out.write("\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t<div class=\"wrapper wrapper-content  animated fadeInRight\">\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-sm-12\">\r\n");
      out.write("\t\t\t\t<div class=\"ibox \">\r\n");
      out.write("\t\t\t\t\t<div class=\"ibox-content\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"jqGrid_wrapper\">\r\n");
      out.write("\t\t\t\t\t\t\t<table id=\"table_menu\"></table>\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"pager_menu\"></div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"ui-jqdialog modal-content\" id=\"alertmod_table_menu_mod\"\r\n");
      out.write("\t\tdir=\"ltr\" tabindex=\"-1\" role=\"dialog\"\r\n");
      out.write("\t\taria-labelledby=\"alerthd_table_menu\" aria-hidden=\"true\"\r\n");
      out.write("\t\tstyle=\"width: 200px; height: auto; z-index: 950; overflow: hidden; top: 274px; left: 534px; display: none;\">\r\n");
      out.write("\t\t<div class=\"ui-jqdialog-titlebar modal-header\" id=\"alerthd_table_menu\"\r\n");
      out.write("\t\t\tstyle=\"cursor: move;\">\r\n");
      out.write("\t\t\t<span class=\"ui-jqdialog-title\" style=\"float: left;\">注意</span> <a id =\"alertmod_table_menu_mod_a\"\r\n");
      out.write("\t\t\t\tclass=\"ui-jqdialog-titlebar-close\" style=\"right: 0.3em;\"> <span\r\n");
      out.write("\t\t\t\tclass=\"glyphicon glyphicon-remove-circle\"></span></a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"ui-jqdialog-content modal-body\" id=\"alertcnt_table_menu\">\r\n");
      out.write("\t\t\t<div>请选择记录</div>\r\n");
      out.write("\t\t\t<span tabindex=\"0\"> <span tabindex=\"-1\" id=\"jqg_alrt\"></span></span>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div\r\n");
      out.write("\t\t\tclass=\"jqResize ui-resizable-handle ui-resizable-se glyphicon glyphicon-import\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<!-- Peity -->\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/js/plugins/peity/jquery.peity.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<!-- jqGrid -->\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/js/plugins/jqgrid/i18n/grid.locale-cn.js?0820\"></script>\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/js/plugins/jqgrid/jquery.jqGrid.min.js?0820\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<!-- layer javascript -->\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/js/plugins/layer/layer.min.js\"></script>\r\n");
      out.write("\t<!-- 自定义js -->\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/js/content.js?v=1.0.0\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t$(function() {\r\n");
      out.write("\t\t\tinit();\r\n");
      out.write("\t\t});\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar init = function(){\r\n");
      out.write("\t\t\tvar o_table = new TableInit();\r\n");
      out.write("\t\t    o_table.Init();\r\n");
      out.write("\t\t    var o_btn = new ButtonInit();\r\n");
      out.write("\t\t    o_btn.Init();\r\n");
      out.write("\t\t};\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar TableInit = function () {\r\n");
      out.write("\t\t\tvar oTable = new Object();\r\n");
      out.write("\t\t\toTable.Init = function () {\r\n");
      out.write("\t\t\t\t$.jgrid.defaults.styleUI = 'Bootstrap';\r\n");
      out.write("\t\t\t\t$(\"#table_menu\").jqGrid({\r\n");
      out.write("\t\t\t\t\turl : 'treeGridMenu.htm',\r\n");
      out.write("\t\t\t\t\tpostData : {\r\n");
      out.write("\t\t\t\t\t\t'parentId' : \"-1\"\r\n");
      out.write("\t\t\t\t\t}, //发送数据  \r\n");
      out.write("\t\t\t\t\tdatatype : \"json\",\r\n");
      out.write("\t\t\t\t\ttreeGrid : true,//ture则为树形表格\r\n");
      out.write("\t\t\t\t\ttreeGridModel : \"adjacency\",\r\n");
      out.write("\t\t\t\t\tExpandColumn : \"menuname\",//展开的列\r\n");
      out.write("\t\t\t\t\tExpandColClick : true,//树形表格是否展开\r\n");
      out.write("\t\t\t\t\theight : \"400\",\r\n");
      out.write("\t\t\t\t\tautowidth : true,\r\n");
      out.write("\t\t\t\t\tcolNames : [ '菜单编号', '父节点', '状态', '菜单名称', '图标',\r\n");
      out.write("\t\t\t\t\t\t\t'样式','包含按钮', '路径', '顺序', '备注' ],\r\n");
      out.write("\t\t\t\t\tcolModel : [ {\r\n");
      out.write("\t\t\t\t\t\tname : \"menuid\",\r\n");
      out.write("\t\t\t\t\t\tindex : \"menuid\",\r\n");
      out.write("\t\t\t\t\t\thidden : true,\r\n");
      out.write("\t\t\t\t\t\teditable : true,\r\n");
      out.write("\t\t\t\t\t\tkey : true\r\n");
      out.write("\t\t\t\t\t}, {\r\n");
      out.write("\t\t\t\t\t\tname : \"parentid\",\r\n");
      out.write("\t\t\t\t\t\tindex : \"parentid\",\r\n");
      out.write("\t\t\t\t\t\thidden : true,\r\n");
      out.write("\t\t\t\t\t\teditable : true,\r\n");
      out.write("\t\t\t\t\t\teditrules : {\r\n");
      out.write("\t\t\t\t\t\t\trequired : true\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}, {\r\n");
      out.write("\t\t\t\t\t\tname : \"state\",\r\n");
      out.write("\t\t\t\t\t\tindex : \"state\",\r\n");
      out.write("\t\t\t\t\t\thidden : true\r\n");
      out.write("\t\t\t\t\t}, {\r\n");
      out.write("\t\t\t\t\t\tname : \"menuname\",\r\n");
      out.write("\t\t\t\t\t\tindex : \"menuname\",\r\n");
      out.write("\t\t\t\t\t\thidden : false,\r\n");
      out.write("\t\t\t\t\t\teditable : true,\r\n");
      out.write("\t\t\t\t\t\teditrules : {\r\n");
      out.write("\t\t\t\t\t\t\trequired : true\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}, {\r\n");
      out.write("\t\t\t\t\t\tname : \"\",\r\n");
      out.write("\t\t\t\t\t\teditable : false,\r\n");
      out.write("\t\t\t\t\t\tformatter : function(cellvalue, options, rowObject){\r\n");
      out.write("\t\t\t\t\t\t\treturn '<span class=\"'+rowObject.iconcls+'\" aria-hidden=\"true\"></span>';\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}, {\r\n");
      out.write("\t\t\t\t\t\tname : \"iconcls\",\r\n");
      out.write("\t\t\t\t\t\tindex : \"iconcls\",\r\n");
      out.write("\t\t\t\t\t\teditable : true\r\n");
      out.write("\t\t\t\t\t},{\r\n");
      out.write("\t\t\t\t\t\tname : \"operationnames\",\r\n");
      out.write("\t\t\t\t\t\tindex : \"operationnames\",\r\n");
      out.write("\t\t\t\t\t\thidden : false,\r\n");
      out.write("\t\t\t\t\t\teditable : false\r\n");
      out.write("\t\t\t\t\t}, {\r\n");
      out.write("\t\t\t\t\t\tname : \"menuurl\",\r\n");
      out.write("\t\t\t\t\t\tindex : \"menuurl\",\r\n");
      out.write("\t\t\t\t\t\thidden : false,\r\n");
      out.write("\t\t\t\t\t\teditable : true\r\n");
      out.write("\t\t\t\t\t}, {\r\n");
      out.write("\t\t\t\t\t\tname : \"seq\",\r\n");
      out.write("\t\t\t\t\t\tindex : \"seq\",\r\n");
      out.write("\t\t\t\t\t\thidden : false,\r\n");
      out.write("\t\t\t\t\t\teditable : true,\r\n");
      out.write("\t\t\t\t\t\teditrules : {\r\n");
      out.write("\t\t\t\t\t\t\trequired : true,\r\n");
      out.write("\t\t\t\t\t\t\tnumber : true\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t}, {\r\n");
      out.write("\t\t\t\t\t\tname : \"menudescription\",\r\n");
      out.write("\t\t\t\t\t\tindex : \"menudescription\",\r\n");
      out.write("\t\t\t\t\t\thidden : false,\r\n");
      out.write("\t\t\t\t\t\teditable : true\r\n");
      out.write("\t\t\t\t\t} ],\r\n");
      out.write("\t\t\t\t\tpager : \"#pager_menu\",\r\n");
      out.write("\t\t\t\t\tviewrecords : true,\r\n");
      out.write("\t\t\t\t\tjsonReader : {\r\n");
      out.write("\t\t\t\t\t\troot : \"dataRows\",\r\n");
      out.write("\t\t\t\t\t\trepeatitems : false\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\ttreeReader : {\r\n");
      out.write("\t\t\t\t\t\tlevel_field : \"level\",\r\n");
      out.write("\t\t\t\t\t\tparent_id_field : \"parent\",\r\n");
      out.write("\t\t\t\t\t\tleaf_field : \"isLeaf\",\r\n");
      out.write("\t\t\t\t\t\texpanded_field : \"expanded\"\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tsortorder : \"asc\",\r\n");
      out.write("\t\t\t\t\tediturl : 'reserveMenu.htm'\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t//---------------------------------\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t};\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\treturn oTable;\r\n");
      out.write("\t\t};\r\n");
      out.write("\r\n");
      out.write("\t\tvar ButtonInit = function () {\r\n");
      out.write("\t\t    var btnInit = new Object();\r\n");
      out.write("\t\t    btnInit.Init = function(){\r\n");
      out.write("\t\t\t\t// Setup buttons\r\n");
      out.write("\t\t\t\tvar jqnav = $(\"#table_menu\").jqGrid(\r\n");
      out.write("\t\t\t\t\t'navGrid',\r\n");
      out.write("\t\t\t\t\t'#pager_menu',\r\n");
      out.write("\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\tadd : ($(\"#add\").val() && $(\"#add\").val() == \"true\"),\r\n");
      out.write("\t\t\t\t\t\tedit : ($(\"#edit\").val() && $(\"#edit\").val() == \"true\"),\r\n");
      out.write("\t\t\t\t\t\tdel : ($(\"#del\").val() && $(\"#del\").val() == \"true\"),\r\n");
      out.write("\t\t\t\t\t\tsearch : false,\r\n");
      out.write("\t\t\t\t\t\trefresh : false,\r\n");
      out.write("\t\t\t\t\t\taddtext : \"添加\",\r\n");
      out.write("\t\t\t\t\t\tedittext : \"编辑\",\r\n");
      out.write("\t\t\t\t\t\tdeltext : \"删除\"\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t{//edit\r\n");
      out.write("\t\t\t\t\t\theight : 400,\r\n");
      out.write("\t\t\t\t\t\treloadAfterSubmit : true,\r\n");
      out.write("\t\t\t\t\t\tcloseAfterEdit : true\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t{//add\r\n");
      out.write("\t\t\t\t\t\theight : 400,\r\n");
      out.write("\t\t\t\t\t\treloadAfterSubmit : true,\r\n");
      out.write("\t\t\t\t\t    beforeShowForm : function(frm) {\r\n");
      out.write("\t\t\t\t\t    \tvar ids = $(\"#table_menu\").jqGrid('getGridParam', 'selrow');\r\n");
      out.write("\t\t\t\t\t    \tfrm.find('#parentid').val(parentid.value == '' ? ids : parentid.value);\r\n");
      out.write("\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\tcloseAfterAdd : true\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t{//del\r\n");
      out.write("\t\t\t\t\t\turl : \"deleteMenu.htm\",\r\n");
      out.write("\t\t\t\t\t\tafterSubmit: function(xhr, postdata) {\r\n");
      out.write("\t\t\t\t\t\t\tvar obj = eval('(' + xhr.responseText + ')');\r\n");
      out.write("\t                \t\tif(obj.errorMsg){\r\n");
      out.write("\t                \t\t\tlayer.alert(obj.errorMsg, {icon: 2});\r\n");
      out.write("\t                \t\t\t$(\"#delmodtable_menu\").hide();\r\n");
      out.write("\t                \t\t\treturn false;\r\n");
      out.write("\t                \t\t}else{\r\n");
      out.write("\t                \t\t\t $(\"#table_menu\").trigger(\"reloadGrid\");\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#delmodtable_menu\").hide();\r\n");
      out.write("\t\t\t                \treturn true;\r\n");
      out.write("\t                \t\t}\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t{}\r\n");
      out.write("\t\t\t\t);\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tif($(\"#btnCtrl\").val() && $(\"#btnCtrl\").val() == \"true\"){\r\n");
      out.write("\t\t\t\t\t//Add btn to navGrid\r\n");
      out.write("\t\t\t\t\tjqnav.navButtonAdd('#pager_menu', {\r\n");
      out.write("\t\t\t\t\t\tcaption: \"按钮管理\",\r\n");
      out.write("\t\t\t\t\t\ttitle:\"按钮管理\",\r\n");
      out.write("\t\t\t\t\t\tbuttonicon: \"ace-icon fa fa-hand-rock-o\",\r\n");
      out.write("\t\t\t\t\t\tonClickButton: function () {  \r\n");
      out.write("\t\t                  \tvar id = $(\"#table_menu\").jqGrid('getGridParam', 'selrow');\r\n");
      out.write("\t\t\t\t\t\t\tif (!id || id == null) {\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#alertmod_table_menu_mod\").show();\r\n");
      out.write("\t\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\t\tvar rowData =$(\"#table_menu\").jqGrid('getRowData',id);\r\n");
      out.write("\t\t\t\t\t\t\t\tif(rowData.state==\"isParent\" || rowData.state==\"close\"){\r\n");
      out.write("\t\t\t\t\t\t\t\t\tlayer.alert(\"该菜单不提供按钮,请选择其他菜单,谢谢！\",{icon: 5});\r\n");
      out.write("\t\t\t\t\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\tparent.layer.open({\r\n");
      out.write("\t\t\t\t\t\t\t\t    type: 2,\r\n");
      out.write("\t\t\t\t\t\t\t\t    title:'按钮管理',\r\n");
      out.write("\t\t\t\t\t\t\t\t    skin: 'layui-layer-rim', //加上边框\r\n");
      out.write("\t\t\t\t\t\t\t\t    area: ['1000px', '600px'], //宽高\r\n");
      out.write("\t\t\t\t\t\t\t\t    maxmin: true, //开启最大化最小化按钮\r\n");
      out.write("\t\t\t\t\t\t\t\t    content: 'operation/operationIndex.htm?menuid='+id\r\n");
      out.write("\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t               \t},\r\n");
      out.write("\t\t\t\t\t\tposition: \"last\"\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t$(\"#add_table_menu\").click(\r\n");
      out.write("\t\t\t\t\tfunction() {\r\n");
      out.write("\t\t\t\t\t\tvar ids = $(\"#table_menu\").jqGrid('getGridParam', 'selrow');\r\n");
      out.write("\t\t\t\t\t\tif (!ids || ids == null) {\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#cData\").click();\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#alertmod_table_menu_mod\").show();\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t);\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t$(\"#alertmod_table_menu_mod_a\").click(function() {\r\n");
      out.write("\t\t\t\t\t$(\"#alertmod_table_menu_mod\").hide();\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t};\r\n");
      out.write("\t\t\treturn btnInit;\r\n");
      out.write("\t\t};\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t$(\"#table_menu\").on(\"click\", 'tr[role=\"row\"]', function() {\r\n");
      out.write("\t\t\t$(\"#alertmod_table_menu_mod\").hide();\r\n");
      out.write("\t\t})\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/view/menu.jsp(18,1) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/view/menu.jsp(18,1) '${operationInfo }'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${operationInfo }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/view/menu.jsp(18,1) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("oper");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t<input type=\"hidden\" id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${oper.key }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${oper.value }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\"/>\r\n");
          out.write("\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}