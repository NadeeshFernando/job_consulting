package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class navibb_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\r\n");
      out.write("    <title>One Page Bootstrap Template</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap -->\r\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\r\n");
      out.write("\t<link href=\"css/animate.min.css\" rel=\"stylesheet\"> \r\n");
      out.write("\t<link href=\"css/animate.css\" rel=\"stylesheet\" />\r\n");
      out.write("\t<link href=\"css/prettyPhoto.css\" rel=\"stylesheet\"> \r\n");
      out.write("\t<link href=\"css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("\t\r\n");
      out.write("    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("  </head>0\r\n");
      out.write("\t<nav class=\"navbar navbar-default navbar-fixed-top\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-2\">\r\n");
      out.write("\t\t\t\t\t<div class=\"site-logo\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"index.html\" class=\"brand\">OnePage</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\t\t\t\t\t  \r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"col-md-10\">\t \r\n");
      out.write("\t\t\t\t\t<!-- Brand and toggle get grouped for better mobile display -->\r\n");
      out.write("\t\t\t\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#menu\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-bars\"></i>\r\n");
      out.write("\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- Collect the nav links, forms, and other content for toggling -->\r\n");
      out.write("\t\t\t\t\t<div class=\"collapse navbar-collapse\" id=\"menu\">\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("\t\t\t\t\t\t\t  <li><a href=\"#home\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t  <li><a href=\"#about\">About Us</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t  <li><a href=\"#portfolio\">Portfolio</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t  <li><a href=\"#features\">Features</a></li>\t\t\t\t                                                                  \t\t\t\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t\t\t\t  <li><a href=\"#contact\">Contact</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- /.Navbar-collapse -->\t\t \r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\t\t\r\n");
      out.write("\t</nav>\r\n");
      out.write("   \r\n");
      out.write("    <div id=\"home\">\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("\t\t<div class=\"slider\">\r\n");
      out.write("\t\t\t<div id=\"about-slider\">\r\n");
      out.write("\t\t\t\t<div id=\"carousel-slider\" class=\"carousel slide\" data-ride=\"carousel\">\r\n");
      out.write("\t\t\t\t\t<!-- Indicators -->\r\n");
      out.write("\t\t\t\t\t<ol class=\"carousel-indicators visible-xs\">\r\n");
      out.write("\t\t\t\t\t\t<li data-target=\"#carousel-slider\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("\t\t\t\t\t\t<li data-target=\"#carousel-slider\" data-slide-to=\"1\"></li>\r\n");
      out.write("\t\t\t\t\t\t<li data-target=\"#carousel-slider\" data-slide-to=\"2\"></li>\r\n");
      out.write("\t\t\t\t\t</ol>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"carousel-inner\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"item active\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/6.jpg\" class=\"img-responsive\" alt=\"\"> \r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t   <div class=\"item\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/prettyPhoto/slider.jpg\" class=\"img-responsive\" alt=\"\"> \r\n");
      out.write("\t\t\t\t\t   </div> \r\n");
      out.write("\t\t\t\t\t   <div class=\"item\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/5.jpg\" class=\"img-responsive\" alt=\"\"> \r\n");
      out.write("\t\t\t\t\t   </div> \r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<a class=\"left carousel-control hidden-xs\" href=\"#carousel-slider\" data-slide=\"prev\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-angle-left\"></i> \r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<a class=\" right carousel-control hidden-xs\"href=\"#carousel-slider\" data-slide=\"next\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-angle-right\"></i> \r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</div> <!--/#carousel-slider-->\r\n");
      out.write("\t\t\t</div><!--/#about-slider-->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("   \r\n");
      out.write("\t<section id=\"about\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"center\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-6 col-md-offset-3\">\r\n");
      out.write("\t\t\t\t\t<h2>About Us</h2>\r\n");
      out.write("\t\t\t\t\t<hr>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<p class=\"lead\">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-sm-6 wow fadeInRight\">\r\n");
      out.write("\t\t\t\t\t<img src=\"images/1.png\" class=\"img-responsive\" />\r\n");
      out.write("\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Magni autem minus sint, commodi.</p>\r\n");
      out.write("\r\n");
      out.write("                </div><!--/.col-sm-6-->\r\n");
      out.write("\r\n");
      out.write("                <div class=\"col-sm-6 wow fadeInDown\">\r\n");
      out.write("                    <div class=\"accordion\">\r\n");
      out.write("                        <div class=\"panel-group\" id=\"accordion1\">\r\n");
      out.write("                          <div class=\"panel panel-default\">\r\n");
      out.write("                            <div class=\"panel-heading active\">\r\n");
      out.write("                              <h3 class=\"panel-title\">\r\n");
      out.write("                                <a class=\"accordion-toggle\" data-toggle=\"collapse\" data-parent=\"#accordion1\" href=\"#collapseOne1\">\r\n");
      out.write("                                  Web Design\r\n");
      out.write("                                  <i class=\"fa fa-angle-right pull-right\"></i>\r\n");
      out.write("                                </a>\r\n");
      out.write("                              </h3>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div id=\"collapseOne1\" class=\"panel-collapse collapse in\">\r\n");
      out.write("                              <div class=\"panel-body\">\r\n");
      out.write("                                  <div class=\"media accordion-inner\">\r\n");
      out.write("                                        <div class=\"pull-left\">\r\n");
      out.write("                                            <img class=\"img-responsive\" src=\"images/accordion1.png\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"media-body\">\r\n");
      out.write("                                             <h4>Adipisicing elit</h4>\r\n");
      out.write("                                             <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore</p>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                  </div>\r\n");
      out.write("                              </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                          </div>\r\n");
      out.write("\r\n");
      out.write("                          <div class=\"panel panel-default\">\r\n");
      out.write("                            <div class=\"panel-heading\">\r\n");
      out.write("                              <h3 class=\"panel-title\">\r\n");
      out.write("                                <a class=\"accordion-toggle\" data-toggle=\"collapse\" data-parent=\"#accordion1\" href=\"#collapseTwo1\">\r\n");
      out.write("                                  Lorem ipsum dolor sit amet\r\n");
      out.write("                                  <i class=\"fa fa-angle-right pull-right\"></i>\r\n");
      out.write("                                </a>\r\n");
      out.write("                              </h3>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div id=\"collapseTwo1\" class=\"panel-collapse collapse\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"panel-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid.\r\n");
      out.write("\t\t\t\t\t\t\t\t\t3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod.\r\n");
      out.write("\t\t\t\t\t\t\t\t\tBrunch 3 wolf moon tempor.<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\tLorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut\r\n");
      out.write("\t\t\t\t\t\t\t\t\tnon cupidatat skateboard dolor brunch.</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                          </div>\r\n");
      out.write("\r\n");
      out.write("                          <div class=\"panel panel-default\">\r\n");
      out.write("                            <div class=\"panel-heading\">\r\n");
      out.write("                              <h3 class=\"panel-title\">\r\n");
      out.write("                                <a class=\"accordion-toggle\" data-toggle=\"collapse\" data-parent=\"#accordion1\" href=\"#collapseThree1\">\r\n");
      out.write("                                  Lorem ipsum dolor sit amet\r\n");
      out.write("                                  <i class=\"fa fa-angle-right pull-right\"></i>\r\n");
      out.write("                                </a>\r\n");
      out.write("                              </h3>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div id=\"collapseThree1\" class=\"panel-collapse collapse\">\r\n");
      out.write("                              <div class=\"panel-body\">\r\n");
      out.write("                                <p>Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid.\r\n");
      out.write("\t\t\t\t\t\t\t\t3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod.\r\n");
      out.write("\t\t\t\t\t\t\t\tBrunch 3 wolf moon tempor.<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\tLorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut\r\n");
      out.write("\t\t\t\t\t\t\t\tnon cupidatat skateboard dolor brunch.</p>\r\n");
      out.write("                              </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                          </div>\r\n");
      out.write("\r\n");
      out.write("                          <div class=\"panel panel-default\">\r\n");
      out.write("                            <div class=\"panel-heading\">\r\n");
      out.write("                              <h3 class=\"panel-title\">\r\n");
      out.write("                                <a class=\"accordion-toggle\" data-toggle=\"collapse\" data-parent=\"#accordion1\" href=\"#collapseFour1\">\r\n");
      out.write("                                  Lorem ipsum dolor sit amet\r\n");
      out.write("                                  <i class=\"fa fa-angle-right pull-right\"></i>\r\n");
      out.write("                                </a>\r\n");
      out.write("                              </h3>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div id=\"collapseFour1\" class=\"panel-collapse collapse\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"panel-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t   <p>Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid.\r\n");
      out.write("\t\t\t\t\t\t\t\t\t3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod.\r\n");
      out.write("\t\t\t\t\t\t\t\t\tBrunch 3 wolf moon tempor.<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\tLorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut\r\n");
      out.write("\t\t\t\t\t\t\t\t\tnon cupidatat skateboard dolor brunch.</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                          </div>\r\n");
      out.write("                        </div><!--/#accordion1-->\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div><!--/.row-->\r\n");
      out.write("        </div><!--/.container-->\r\n");
      out.write("    </section><!--/#about-->\r\n");
      out.write("   \r\n");
      out.write("\t<section id=\"portfolio\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"center\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-6 col-md-offset-3\">\r\n");
      out.write("\t\t\t\t\t<h2>Portfolio</h2>\r\n");
      out.write("\t\t\t\t\t<hr>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<p class=\"lead\">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"col-lg-12\">\t\t\r\n");
      out.write("\t\t\t\t<ul class=\"portfolio-filter text-center\">\r\n");
      out.write("\t\t\t\t\t<li><a class=\"btn btn-default active\" href=\"#\" data-filter=\"*\">All Works</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a class=\"btn btn-default\" href=\"#\" data-filter=\".bootstrap\">Creative</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a class=\"btn btn-default\" href=\"#\" data-filter=\".html\">Photography</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a class=\"btn btn-default\" href=\"#\" data-filter=\".wordpress\">Web Development</a></li>\r\n");
      out.write("\t\t\t\t</ul><!--/#portfolio-filter-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"portfolio-items\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"portfolio-item apps col-xs-12 col-sm-4 col-md-3\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"recent-work-wrap\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img class=\"img-responsive\" src=\"images/portfolio/recent/item1.png\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"overlay\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"recent-work-inner\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h3><a href=\"#\">Business theme</a></h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>There are many variations of passages of Lorem Ipsum available, but the majority</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a class=\"preview\" href=\"images/portfolio/full/item1.png\" rel=\"prettyPhoto\"><i class=\"fa fa-eye\"></i> View</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div> \r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div><!--/.portfolio-item-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"portfolio-item joomla bootstrap col-xs-12 col-sm-4 col-md-3\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"recent-work-wrap\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img class=\"img-responsive\" src=\"images/portfolio/recent/item2.png\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"overlay\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"recent-work-inner\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h3><a href=\"#\">Business theme</a></h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>There are many variations of passages of Lorem Ipsum available, but the majority</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a class=\"preview\" href=\"images/portfolio/full/item2.png\" rel=\"prettyPhoto\"><i class=\"fa fa-eye\"></i> View</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div> \r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>          \r\n");
      out.write("\t\t\t\t\t\t</div><!--/.portfolio-item-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"portfolio-item bootstrap wordpress col-xs-12 col-sm-4 col-md-3\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"recent-work-wrap\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img class=\"img-responsive\" src=\"images/portfolio/recent/item3.png\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"overlay\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"recent-work-inner\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h3><a href=\"#\">Business theme</a></h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>There are many variations of passages of Lorem Ipsum available, but the majority</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a class=\"preview\" href=\"images/portfolio/full/item3.png\" rel=\"prettyPhoto\"><i class=\"fa fa-eye\"></i> View</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div> \r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>        \r\n");
      out.write("\t\t\t\t\t\t</div><!--/.portfolio-item-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"portfolio-item joomla wordpress apps col-xs-12 col-sm-4 col-md-3\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"recent-work-wrap\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img class=\"img-responsive\" src=\"images/portfolio/recent/item4.png\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"overlay\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"recent-work-inner\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h3><a href=\"#\">Business theme</a></h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>There are many variations of passages of Lorem Ipsum available, but the majority</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a class=\"preview\" href=\"images/portfolio/full/item4.png\" rel=\"prettyPhoto\"><i class=\"fa fa-eye\"></i> View</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div> \r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>           \r\n");
      out.write("\t\t\t\t\t\t</div><!--/.portfolio-item-->\r\n");
      out.write("\t\t\t  \r\n");
      out.write("\t\t\t\t\t\t<div class=\"portfolio-item joomla html bootstrap col-xs-12 col-sm-4 col-md-3\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"recent-work-wrap\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img class=\"img-responsive\" src=\"images/portfolio/recent/item5.png\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"overlay\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"recent-work-inner\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h3><a href=\"#\">Business theme</a></h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>There are many variations of passages of Lorem Ipsum available, but the majority</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a class=\"preview\" href=\"images/portfolio/full/item5.png\" rel=\"prettyPhoto\"><i class=\"fa fa-eye\"></i> View</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div> \r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>      \r\n");
      out.write("\t\t\t\t\t\t</div><!--/.portfolio-item-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"portfolio-item wordpress html apps col-xs-12 col-sm-4 col-md-3\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"recent-work-wrap\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img class=\"img-responsive\" src=\"images/portfolio/recent/item6.png\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"overlay\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"recent-work-inner\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h3><a href=\"#\">Business theme</a></h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>There are many variations of passages of Lorem Ipsum available, but the majority</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a class=\"preview\" href=\"images/portfolio/full/item6.png\" rel=\"prettyPhoto\"><i class=\"fa fa-eye\"></i> View</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div> \r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>         \r\n");
      out.write("\t\t\t\t\t\t</div><!--/.portfolio-item-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"portfolio-item wordpress html col-xs-12 col-sm-4 col-md-3\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"recent-work-wrap\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img class=\"img-responsive\" src=\"images/portfolio/recent/item7.png\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"overlay\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"recent-work-inner\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h3><a href=\"#\">Business theme</a></h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>There are many variations of passages of Lorem Ipsum available, but the majority</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a class=\"preview\" href=\"images/portfolio/full/item7.png\" rel=\"prettyPhoto\"><i class=\"fa fa-eye\"></i> View</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div> \r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>          \r\n");
      out.write("\t\t\t\t\t\t</div><!--/.portfolio-item-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"portfolio-item wordpress html bootstrap col-xs-12 col-sm-4 col-md-3\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"recent-work-wrap\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img class=\"img-responsive\" src=\"images/portfolio/recent/item8.png\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"overlay\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"recent-work-inner\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h3><a href=\"#\">Business theme</a></h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>There are many variations of passages of Lorem Ipsum available, but the majority</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a class=\"preview\" href=\"images/portfolio/full/item8.png\" rel=\"prettyPhoto\"><i class=\"fa fa-eye\"></i> View</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div> \r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>          \r\n");
      out.write("\t\t\t\t\t\t</div><!--/.portfolio-item-->\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("    </section><!--/#portfolio-item-->\r\n");
      out.write("\t\r\n");
      out.write("\t<section id=\"features\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"center\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6 col-md-offset-3\">\r\n");
      out.write("\t\t\t\t\t\t<h2>Features</h2>\r\n");
      out.write("\t\t\t\t\t\t<hr>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<p class=\"lead\">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4 wow fadeInLeft\">\r\n");
      out.write("\t\t\t\t\t<h3>Responsive</h3>\r\n");
      out.write("\t\t\t\t\t<img src=\"images/portfolio/recent/item4.png\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut\r\n");
      out.write("\t\t\t\t\tnon cupidatat skateboard dolor brunch.</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4 wow fadeInUp\">\r\n");
      out.write("\t\t\t\t\t<h3>Web Design</h3>\r\n");
      out.write("\t\t\t\t\t<img src=\"images/portfolio/recent/item5.png\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut\r\n");
      out.write("\t\t\t\t\tnon cupidatat skateboard dolor brunch.</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4 wow fadeInRight\">\r\n");
      out.write("\t\t\t\t\t<h3>Easy Customize</h3>\r\n");
      out.write("\t\t\t\t\t<img src=\"images/portfolio/recent/item6.png\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut\r\n");
      out.write("\t\t\t\t\tnon cupidatat skateboard dolor brunch.</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\t\t\r\n");
      out.write("\t</section>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\t<div class=\"map\">\r\n");
      out.write("\t\t\t<iframe src=\"https://maps.google.com/maps?f=q&amp;source=s_q&amp;hl=en&amp;geocode=&amp;q=Kuningan,+Jakarta+Capital+Region,+Indonesia&amp;aq=3&amp;oq=kuningan+&amp;sll=37.0625,-95.677068&amp;sspn=37.410045,86.572266&amp;ie=UTF8&amp;hq=&amp;hnear=Kuningan&amp;t=m&amp;z=14&amp;ll=-6.238824,106.830177&amp;output=embed\">\r\n");
      out.write("\t\t\t</iframe>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t<section id=\"contact\">\r\n");
      out.write("\t\t<div class=\"contact-page\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"center\">        \r\n");
      out.write("\t\t\t\t\t<h2>Sign up to be notified</h2>\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div> \r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"row contact-wrap\">\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"status alert alert-success\" style=\"display: none\"></div>\r\n");
      out.write("\t\t\t\t\t<form id=\"main-contact-form\" class=\"contact-form\" name=\"contact-form\" method=\"post\" action=\"sendemail.php\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"wow fadeInDown\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-5 col-sm-offset-1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label>Name *</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"name\" class=\"form-control\" required=\"required\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label>Email *</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"email\" name=\"email\" class=\"form-control\" required=\"required\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label>Phone</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"number\" class=\"form-control\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label>Company Name</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>                        \r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"wow fadeInRight\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-5\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label>Subject *</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"subject\" class=\"form-control\" required=\"required\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label>Message *</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<textarea name=\"message\" id=\"message\" required=\"required\" class=\"form-control\" rows=\"8\"></textarea>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>                        \r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<button type=\"submit\" name=\"submit\" class=\"btn btn-primary btn-lg\" required=\"required\">Submit Message</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</form> \r\n");
      out.write("\t\t\t\t</div><!--/.row-->\r\n");
      out.write("\t\t\t</div><!--/.container-->\r\n");
      out.write("\t\t</div><!--/#contact-page-->\t\t\r\n");
      out.write("\t</section>\r\n");
      out.write("\t\r\n");
      out.write("\t<footer id=\"footer\" class=\"midnight-blue\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-6 col-md-offset-3\">\r\n");
      out.write("\t\t\t\t\t<div class=\"text-center\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#home\" class=\"scrollup\"><i class=\"fa fa-angle-up fa-3x\"></i></a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("                    &copy; 2015 <a target=\"_blank\" href=\"http://bootstraptaste.com/\" title=\"Free Twitter Bootstrap WordPress Themes and HTML templates\">bootstraptaste</a>. All Rights Reserved.\r\n");
      out.write("                    <!-- \r\n");
      out.write("                        All links in the footer should remain intact. \r\n");
      out.write("                        Licenseing information is available at: http://bootstraptaste.com/license/\r\n");
      out.write("                        You can buy this theme without footer links online at: http://bootstraptaste.com/buy/?theme=OnePage\r\n");
      out.write("                    -->\r\n");
      out.write("                </div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("                <div class=\"top-bar\">\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-12\">\r\n");
      out.write("\t\t\t\t\t   <div class=\"social\">\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"social-share\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-facebook\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-twitter\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-linkedin\"></i></a></li> \r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-dribbble\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-skype\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t   </div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("    </footer><!--/#footer-->\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\r\n");
      out.write("\t<script src=\"js/jquery.js\"></script>\r\n");
      out.write("\t<!-- Include all compiled plugins (below), or include individual files as needed -->\r\n");
      out.write("\t<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/jquery.prettyPhoto.js\"></script>\r\n");
      out.write("    <script src=\"js/jquery.isotope.min.js\"></script> \r\n");
      out.write("\t<script src=\"js/wow.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/jquery.easing.min.js\"></script>\t\r\n");
      out.write("\t<script src=\"js/main.js\"></script>\r\n");
      out.write("  </body>\r\n");
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
