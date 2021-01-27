<%--
  Created by IntelliJ IDEA.
  User: Sun
  Date: 2020/11/5
  Time: 19:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>

    <title>散件攒机系统</title>
    <link href="${pageContext.request.contextPath}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet"/>
    <script src="${pageContext.request.contextPath}/static/jq/jquery-3.4.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
    <style>

    </style>
    <script type="text/javascript">
          $(function (){
               $("#li-three li").click(function (){
                   $(this).addClass("active");
                   $(this).siblings().removeClass("active");
               })
          })
    </script>
</head>
<body>
<div class="container">
    <div class="row">
        <nav class="navbar navbar-default">
            <div class="container-fluid">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="${pageContext.request.contextPath}"> 散件攒机系统</a>
                </div>

                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav" id="li-three">
                        <li class="active"><a target="shouye" href="gongneng/cuanji.jsp">首页 <span class="sr-only">(current)</span></a></li>
                        <li><a href="https://pcdiy.jd.com/" target="_blank">配件</a></li>
                        <li><a target="shouye" href="gongneng/cuanji3.jsp">模拟攒机</a></li>
                        <li><a target="shouye" href="config/peiPage.jsp">配置排行榜</a></li>
                    </ul>

                    <ul class="nav navbar-nav navbar-right">
                            <c:if test="${empty sessionScope.userLoginInfo}">
                                <li>
                                    <a href="loginPage">登录</a>
                                </li>
                            </c:if>

                 <%--       <li class="divider-vertical">
                        </li>--%>
                        <c:if test="${not empty sessionScope.userLoginInfo}">
                            <li class="dropdown">
                                <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                                    <span class="glyphicon glyphicon-user"></span>
                                    <span id="user" style="color: red; font-weight: bolder">${sessionScope.userLoginInfo}</span>
                                    <strong class="caret"></strong>
                                </a>
                                <ul class="dropdown-menu">
                                    <li>
                                        <a href="changePasswordPage">修改密码</a>
                                    </li>
                                  <%--  <li>
                                        <a href="#">下拉导航2</a>
                                    </li>
                                    <li>
                                        <a href="#">其他</a>
                                    </li>--%>
                                    <li class="divider">
                                    </li>
                                    <li>
                                        <a href="logout">注销</a>
                                    </li>
                                </ul>
                            </li>
                        </c:if>


                </div>
            </div>
        </nav>

    </div>
        <iframe  src="gongneng/cuanji.jsp" width="100%" id="shouye" name="shouye" frameborder="0" scrolling="no" onload="this.height=shouye.document.body.scrollHeight">

        </iframe>

     <jsp:include page="common/base.jsp"/>


</div>
</body>
</html>
