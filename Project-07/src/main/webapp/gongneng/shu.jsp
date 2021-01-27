<%--
  Created by IntelliJ IDEA.
  User: Sun
  Date: 2021/1/19
  Time: 11:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="${pageContext.request.contextPath}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet"/>
    <script src="${pageContext.request.contextPath}/static/jq/jquery-3.4.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
    <style>
        #liebiao li a{
            margin-left: 2%;
            text-decoration: none;
        }
    </style>
    <script type="text/javascript">
        $(function (){
            $("#a1").click(function (){
                $("#shuList").attr("src","${pageContext.request.contextPath}/getShuName1")
            })
            $("#a2").click(function (){
                $("#shuList").attr("src","${pageContext.request.contextPath}/getShuName2")
            })
            $("#a3").click(function (){
                $("#shuList").attr("src","${pageContext.request.contextPath}/getShuName3")
            })
            $("#a4").click(function (){
                $("#shuList").attr("src","${pageContext.request.contextPath}/getShuName4")
            })
            $("#a5").click(function (){
                $("#shuList").attr("src","${pageContext.request.contextPath}/getShuName5")
            })
            $("#a6").click(function (){
                $("#shuList").attr("src","${pageContext.request.contextPath}/getShuName6")
            })
            $("#a7").click(function (){
                $("#shuList").attr("src","${pageContext.request.contextPath}/getShuName7")
            })
            $("#a8").click(function (){
                $("#shuList").attr("src","${pageContext.request.contextPath}/getShuName8")
            })
            $("#a9").click(function (){
                $("#shuList").attr("src","${pageContext.request.contextPath}/getShuPrice1")
            })
            $("#a10").click(function (){
                $("#shuList").attr("src","${pageContext.request.contextPath}/getShuPrice2")
            })
            $("#a11").click(function (){
                $("#shuList").attr("src","${pageContext.request.contextPath}/getShuPrice3")
            })
            $("#a12").click(function (){
                $("#shuList").attr("src","${pageContext.request.contextPath}/getShuPrice4")
            })
            $("#a13").click(function (){
                $("#shuList").attr("src","${pageContext.request.contextPath}/getShuOne1")
            })
            $("#a14").click(function (){
                $("#shuList").attr("src","${pageContext.request.contextPath}/getShuOne2")
            })
            $("#a15").click(function (){
                $("#shuList").attr("src","${pageContext.request.contextPath}/getShuOne3")
            })

            $("#a16").click(function (){
                $("#shuList").attr("src","${pageContext.request.contextPath}/getShuOne4")
            })
            $("#a17").click(function (){
                $("#shuList").attr("src","${pageContext.request.contextPath}/getShuOne5")
            })
            $("#a18").click(function (){
                $("#shuList").attr("src","${pageContext.request.contextPath}/getShuOne6")
            })
            $("#a19").click(function (){
                $("#shuList").attr("src","${pageContext.request.contextPath}/getShuOne7")
            })
            $("#a20").click(function (){
                $("#shuList").attr("src","${pageContext.request.contextPath}/getShuTwo1")
            })
            $("#a21").click(function (){
                $("#shuList").attr("src","${pageContext.request.contextPath}/getShuTwo2")
            })

        })
    </script>
</head>
<body>
<div class="container-fluid">
    <div class="row">
        <div class="panel panel-default">
            <div class="panel-heading"><strong>请选择<span style="color: deeppink">鼠标</span></strong></div>
            <ul class="list-unstyled list-group" style="margin-left:2% " id="liebiao">
                <li class="list-group-item" >
                    <span style="color:#5e5e5e;">推荐品牌：</span>
                    <a href="javascript:;" id="a1" >双飞燕</a>
                    <a href="javascript:;" id="a2" >雷柏</a>
                    <a href="javascript:;" id="a3" >海盗船</a>
                    <a href="javascript:;" id="a4" >达尔优</a>
                    <a href="javascript:;" id="a5" >富勒</a>
                    <a href="javascript:;" id="a6" >红火牛</a>
                    <a href="javascript:;" id="a7" >血手幽灵</a>
                    <a href="javascript:;" id="a8" >戴尔</a>
                </li>
                <li class="list-group-item">
                    <span style="color:#5e5e5e;">价格区间：</span>
                    <a href="javascript:;" id="a9">39元以下</a>
                    <a href="javascript:;" id="a10">40-99元</a>
                    <a href="javascript:;" id="a11">100-399元</a>
                    <a href="javascript:;" id="a12">400元以上</a>
                </li>
                <li class="list-group-item">
                    <span style="color:#5e5e5e;">适用类型：</span>
                    <a href="javascript:;" id="a13">竞技游戏</a>
                    <a href="javascript:;" id="a14">商务舒适</a>
                    <a href="javascript:;" id="a15">经济实用</a>
                    <a href="javascript:;" id="a16">移动便携</a>
                    <a href="javascript:;" id="a17">时尚个性</a>
                </li>


                <li class="list-group-item">
                    <span style="color:#5e5e5e;">连接方式：</span>
                    <a href="javascript:;" id="a18">有线</a>
                    <a href="javascript:;" id="a19">无线</a>
                </li>
                <li class="list-group-item">
                    <span style="color:#5e5e5e;">鼠标接口：</span>
                    <a href="javascript:;" id="a20">USB接口</a>
                    <a href="javascript:;" id="a21">PS/2接口</a>
                </li>



            </ul>
        </div>
    </div>
    <div class="row">
        <iframe  src="${pageContext.request.contextPath}/getShuAll" width="100%" id="shuList" name="shuList" frameborder="0" scrolling="no" onload="this.height=shuList.document.body.scrollHeight">

        </iframe>
    </div>
</div>
</body>
</html>
