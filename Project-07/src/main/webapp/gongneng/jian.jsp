<%--
  Created by IntelliJ IDEA.
  User: Sun
  Date: 2021/1/23
  Time: 14:08
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
                $("#jianList").attr("src","${pageContext.request.contextPath}/getJianName1")
            })
            $("#a2").click(function (){
                $("#jianList").attr("src","${pageContext.request.contextPath}/getJianName2")
            })
            $("#a3").click(function (){
                $("#jianList").attr("src","${pageContext.request.contextPath}/getJianName3")
            })
            $("#a4").click(function (){
                $("#jianList").attr("src","${pageContext.request.contextPath}/getJianName4")
            })
            $("#a5").click(function (){
                $("#jianList").attr("src","${pageContext.request.contextPath}/getJianName5")
            })
            $("#a6").click(function (){
                $("#jianList").attr("src","${pageContext.request.contextPath}/getJianName6")
            })
            $("#a7").click(function (){
                $("#jianList").attr("src","${pageContext.request.contextPath}/getJianName7")
            })
            $("#a8").click(function (){
                $("#jianList").attr("src","${pageContext.request.contextPath}/getJianName8")
            })
            $("#a9").click(function (){
                $("#jianList").attr("src","${pageContext.request.contextPath}/getJianPrice1")
            })
            $("#a10").click(function (){
                $("#jianList").attr("src","${pageContext.request.contextPath}/getJianPrice2")
            })
            $("#a11").click(function (){
                $("#jianList").attr("src","${pageContext.request.contextPath}/getJianPrice3")
            })
            $("#a12").click(function (){
                $("#jianList").attr("src","${pageContext.request.contextPath}/getJianPrice4")
            })
            $("#a13").click(function (){
                $("#jianList").attr("src","${pageContext.request.contextPath}/getJianOne1")
            })
            $("#a14").click(function (){
                $("#jianList").attr("src","${pageContext.request.contextPath}/getJianOne2")
            })
            $("#a15").click(function (){
                $("#jianList").attr("src","${pageContext.request.contextPath}/getJianOne3")
            })
            $("#a16").click(function (){
                $("#jianList").attr("src","${pageContext.request.contextPath}/getJianOne4")
            })
            $("#a17").click(function (){
                $("#jianList").attr("src","${pageContext.request.contextPath}/getJianOne5")
            })
            $("#a18").click(function (){
                $("#jianList").attr("src","${pageContext.request.contextPath}/getJianTwo1")
            })
            $("#a19").click(function (){
                $("#jianList").attr("src","${pageContext.request.contextPath}/getJianTwo2")
            })
            $("#a20").click(function (){
                $("#jianList").attr("src","${pageContext.request.contextPath}/getJianTwo3")
            })
            $("#a21").click(function (){
                $("#jianList").attr("src","${pageContext.request.contextPath}/getJianThree1")
            })
            $("#a22").click(function (){
                $("#jianList").attr("src","${pageContext.request.contextPath}/getJianThree2")
            })
            $("#a23").click(function (){
                $("#jianList").attr("src","${pageContext.request.contextPath}/getJianFour1")
            })
            $("#a24").click(function (){
                $("#jianList").attr("src","${pageContext.request.contextPath}/getJianFour2")
            })
            $("#a25").click(function (){
                $("#jianList").attr("src","${pageContext.request.contextPath}/getJianFour3")
            })


        })
    </script>
</head>
<body>
<div class="container-fluid">
    <div class="row">
        <div class="panel panel-default">
            <div class="panel-heading"><strong>请选择<span style="color: deeppink">键盘</span></strong></div>
            <ul class="list-unstyled list-group" style="margin-left:2% " id="liebiao">
                <li class="list-group-item" >
                    <span style="color:#5e5e5e;">推荐品牌：</span>
                    <a href="javascript:;" id="a1" >双飞燕</a>
                    <a href="javascript:;" id="a2" >雷柏</a>
                    <a href="javascript:;" id="a3" >海盗船</a>
                    <a href="javascript:;" id="a4" >罗技</a>
                    <a href="javascript:;" id="a5" >富勒</a>
                    <a href="javascript:;" id="a6" >达尔优</a>
                    <a href="javascript:;" id="a7" >血手幽灵</a>
                    <a href="javascript:;" id="a8" >戴尔</a>
                </li>
                <li class="list-group-item">
                    <span style="color:#5e5e5e;">价格区间：</span>
                    <a href="javascript:;" id="a9">50元以下</a>
                    <a href="javascript:;" id="a10">50-99元</a>
                    <a href="javascript:;" id="a11">100-399元</a>
                    <a href="javascript:;" id="a12">400元以上</a>
                </li>
                <li class="list-group-item">
                    <span style="color:#5e5e5e;">产品定位：</span>
                    <a href="javascript:;" id="a13">机械键盘</a>
                    <a href="javascript:;" id="a14">游戏键盘</a>
                    <a href="javascript:;" id="a15">超薄键盘</a>
                    <a href="javascript:;" id="a16">平板键盘</a>
                    <a href="javascript:;" id="a17">数字键盘</a>
                </li>


                <li class="list-group-item">
                    <span style="color:#5e5e5e;">连接方式：</span>
                    <a href="javascript:;" id="a18">有线</a>
                    <a href="javascript:;" id="a19">无线</a>
                    <a href="javascript:;" id="a20">蓝牙</a>
                </li>
                <li class="list-group-item">
                    <span style="color:#5e5e5e;">键盘接口：</span>
                    <a href="javascript:;" id="a21">USB接口</a>
                    <a href="javascript:;" id="a22">PS/2接口</a>
                </li>
                <li class="list-group-item">
                    <span style="color:#5e5e5e;">按键技术：</span>
                    <a href="javascript:;" id="a23">机械轴</a>
                    <a href="javascript:;" id="a24">X架构</a>
                    <a href="javascript:;" id="a25">火山口架构</a>
                </li>




            </ul>
        </div>
    </div>
    <div class="row">
        <iframe  src="${pageContext.request.contextPath}/getJianAll" width="100%" id="jianList" name="jianList" frameborder="0" scrolling="no" onload="this.height=jianList.document.body.scrollHeight">

        </iframe>
    </div>
</div>
</body>
</html>
