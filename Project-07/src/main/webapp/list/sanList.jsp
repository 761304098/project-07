<%--
  Created by IntelliJ IDEA.
  User: Sun
  Date: 2021/1/19
  Time: 9:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<html>
<head>
    <link href="${pageContext.request.contextPath}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet"/>
    <script src="${pageContext.request.contextPath}/static/jq/jquery-3.4.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
    <style>

    </style>
    <script type="text/javascript">
        $(function () {
            $(".btn").click(function (){


                let name= $(this).parent().parent().parent().children("div :first").children("strong").children("span").text();
                let price =$(this).parent().parent().children("strong:first").children("span").text();
                let pricecopy  =parseInt(price);
                let namecopy=window.parent.parent.$("#name10").text(); //更改名称前 保存原名称
                let span1  = window.parent.parent.$("#span1").text();
                let span11  =parseInt(span1);
                if( namecopy =='请选择商品'){ // 初次数值
                    span11+=1;
                    window.parent.parent.$("#span1").text(span11);
                }

                window.parent.parent.$("#name10").text(name);
                window.parent.parent.$("#price10").css("color","red");
                window.parent.parent.$("#price10").text("￥"+price);



                let span2=window.parent.parent.$("#num").text();
                let span22  =parseInt(span2);  //父组件的总价格转换数字
                window.parent.parent.$("#span2").text(span22+pricecopy);

            })
        })

    </script>
</head>

<body>
<div class="container-fluid">
    <div class="row">
        <ul class="list-unstylfed list-group">
            <c:forEach items="${pageInfo.list}" var="p">

                <li class="list-group-item" >
                    <div class="row" >
                        <div class="col-xs-6 text-left" style="color: dodgerblue" >
                            <strong><span id="name">${p.name}</span></strong>

                            <div style="color: #8c8c8c; padding-left: 10%;margin-top: 2%">
                               <span style="color: black;">${p.one}</span>
                            </div>
                            <div style="color: #8c8c8c; padding-left: 10%;margin-top: 1%">
                                 <span style="color: black;">${p.three}</span>
                            </div>
                            <div style="color: #8c8c8c; padding-left: 10%;margin-top: 1%;margin-bottom: 2.5%">
                                <span style="color: black;">${p.five}</span>
                            </div>
                        </div>
                        <div class="col-xs-6 text-right"  style="color: red">
                            <strong>￥<span>${p.price}</span></strong>
                            <div style="color: #8c8c8c;margin-top: 2%" class="text-left">
                                <span style="color: black;">${p.two}</span>
                            </div>
                            <div style="color: #8c8c8c; margin-top: 1%" class="text-left">
                                <span style="color: black;">${p.four}</span>
                            </div>
                            <div style="color: #8c8c8c; " class="text-right">
                                <button class="btn btn-primary" id="bt1" name="bt1"><span class="glyphicon glyphicon-plus"></span>加入配置单</button>
                            </div>

                        </div>
                    </div>

                </li>
            </c:forEach>
        </ul>
    </div>
    <div class="row">
        <div class="col-xs-5 text-left" >
            当前${pageInfo.pageNum}页，总${pageInfo.pages}页，共${pageInfo.total}条记录。
        </div>
        <div class="col-xs-7 text-right">
            <nav aria-label="Page navigation">
                <ul class="pagination">
                    <c:if test="${pageInfo.hasPreviousPage}">
                        <li><a href="${pageContext.request.contextPath}/${url}?pn=1">首页</a></li>
                        <li>
                            <a href="${pageContext.request.contextPath}/${url}?pn=${pageInfo.pageNum-1}" aria-label="Previous">
                                <span aria-hidden="true">&laquo;</span>
                            </a>
                        </li>
                    </c:if>
                    <c:if test="${!pageInfo.hasPreviousPage}">
                        <li class="hidden"><a href="${pageContext.request.contextPath}/${url}?pn=1">首页</a></li>
                        <li  class="hidden">
                            <a href="${pageContext.request.contextPath}/${url}?pn=${pageInfo.pageNum-1}" aria-label="Previous">
                                <span aria-hidden="true">&laquo;</span>
                            </a>
                        </li>
                    </c:if>

                    <c:forEach items="${pageInfo.navigatepageNums}" var="pageNum">
                        <c:if test="${pageNum==pageInfo.pageNum}">
                            <li class="active"><a href="#">${pageNum}</a></li>
                        </c:if>
                        <c:if test="${pageNum!=pageInfo.pageNum}">
                            <li><a href="${pageContext.request.contextPath}/${url}?pn=${pageNum}">${pageNum}</a></li>
                        </c:if>

                    </c:forEach>

                    <c:if test="${pageInfo.hasNextPage}">
                        <li>
                            <a href="${pageContext.request.contextPath}/${url}?pn=${pageInfo.pageNum+1}" aria-label="Next">
                                <span aria-hidden="true">&raquo;</span>
                            </a>
                        </li>
                        <li><a href="${pageContext.request.contextPath}/${url}?pn=${pageInfo.pages}">末页</a></li>
                    </c:if>
                    <c:if test="${!pageInfo.hasNextPage}">
                        <li class="hidden">
                            <a href="#" aria-label="Next">
                                <span aria-hidden="true">&raquo;</span>
                            </a>
                        </li>
                        <li class="hidden"><a href="#">末页</a></li>
                    </c:if>

                </ul>
            </nav>
        </div>

    </div>
</div>
</body>
</html>