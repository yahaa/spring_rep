<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<!--[if IE 7]>
<html lang="en" class="ie7"> <![endif]-->
<!--[if IE 8]>
<html lang="en" class="ie8"> <![endif]-->
<!--[if IE 9]>
<html lang="en" class="ie9"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en"> <!--<![endif]-->
<head>
    <title>login</title>

    <!-- Meta -->
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <meta name="description" content=""/>
    <meta name="author" content=""/>

    <!-- CSS Global Compulsory-->
    <link rel="stylesheet" href="../statics/plugins/bootstrap/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="../statics/css/style.css"/>
    <link rel="stylesheet" href="../statics/css/headers/header1.css"/>
    <link rel="stylesheet" href="../statics/plugins/bootstrap/css/bootstrap-responsive.min.css"/>
    <link rel="stylesheet" href="../statics/css/style_responsive.css"/>
    <link rel="shortcut icon" href="favicon.ico"/>
    <!-- CSS Implementing Plugins -->
    <link rel="stylesheet" href="../statics/plugins/font-awesome/css/font-awesome.css"/>
    <!-- CSS Theme -->
    <link rel="stylesheet" href="../statics/css/themes/default.css" id="style_color"/>
    <link rel="stylesheet" href="../statics/css/themes/headers/default.css" id="style_color-header-1"/>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
</head>

<body>
<!--=== Style Switcher ===-->
<i class="style-switcher-btn icon-cogs"></i>
<div class="style-switcher">
    <div class="theme-close"><i class="icon-remove"></i></div>
    <div class="theme-heading">Theme Colors</div>
    <ul class="unstyled">
        <li class="theme-default theme-active" data-style="default" data-header="light"></li>
        <li class="theme-blue" data-style="blue" data-header="light"></li>
        <li class="theme-orange" data-style="orange" data-header="light"></li>
        <li class="theme-red" data-style="red" data-header="light"></li>
        <li class="theme-light" data-style="light" data-header="light"></li>
    </ul>
</div><!--/style-switcher-->
<!--=== End Style Switcher ===-->

<!--=== 顶部 ===-->
<div class="top">
    <div class="container">
        <ul class="loginbar pull-right">

            <li class="devider">&nbsp;</li>
            <li><a href="page_faq.html" class="login-btn">帮助？</a></li>
            <li class="devider">&nbsp;</li>

        </ul>
    </div>
</div>
<!--=== End Top ===-->

<!--=== Header ===-->
<div class="header">
    <div class="container">
        <!-- logo -->
        <div class="logo">
            <a href="index.html"><img id="logo-header" src="../statics/img/logo1-default.png" alt="Logo"/></a>
        </div>

        <!-- Menu -->
        <div class="navbar">
            <div class="navbar-inner">
                <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </a>
                <div class="nav-collapse collapse">
                    <ul class="nav top-2">
                        <li>
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">主页
                                <b class="caret"></b>
                            </a>

                            <b class="caret-out"></b>
                        </li>

                        <li>
                            <a href="" class="dropdown-toggle" data-toggle="dropdown">动态
                                <b class="caret"></b>
                            </a>
                            <b class="caret-out"></b>
                        </li>
                        <li>
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">联系我们
                                <b class="caret"></b>
                            </a>
                            <b class="caret-out"></b>
                        </li>
                        <li><a class="search"><i class="icon-search search-btn"></i></a></li>
                    </ul>
                    <div class="search-open">
                        <div class="input-append">
                            <form/>
                            <input type="text" class="span3" placeholder="Search"/>
                            <button type="submit" class="btn-u">Go</button>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>


<div class="container">
    <div class="row-fluid margin-bottom-10">
        <form:form class="reg-page" action="user/adduser" modelAttribute="new_user">
        <h3>注册用户</h3>
        <div class="controls">
            <label>用户名<span class="color-red">*</span></label>
            <input type="text" class="span12" name="userName"/>

            <label>密码<span class="color-red">*</span></label>
            <input type="password" class="span12" name="password"/>

            <label>手机号码</label>
            <input type="text" class="span12" name="phone"/>

            <label>Email</label>
            <input type="text" class="span12" name="email"/>
        </div>

        <div class="controls form-inline">
            <label class="checkbox"><input type="checkbox"/>&nbsp; 已阅读 <a href=""></a></label>
            <button class="btn-u pull-right" type="submit">注册</button>
        </div>
        <hr/>
        <p>已经注册? <a href="login.jsp" class="color-green">登陆</a></p>
        </form:form>
    </div><!--/row-fluid-->
</div><!--/container-->
</div><!--/body-->
<!--=== End Content Part ===-->


<script type="text/javascript" src="../statics/js/jquery-1.8.2.min.js"></script>
<script type="text/javascript" src="../statics/js/modernizr.custom.js"></script>
<script type="text/javascript" src="../statics/plugins/bootstrap/js/bootstrap.min.js"></script>
<!-- JS Implementing Plugins -->
<script type="text/javascript" src="../statics/plugins/back-to-top.js"></script>
<!-- JS Page Level -->
<script type="text/javascript" src="../statics/js/app.js"></script>
<script type="text/javascript">
    jQuery(document).ready(function () {
        App.init();
    });
</script>
<script src="../statics/js/respond.js"></script>

</body>
</html>