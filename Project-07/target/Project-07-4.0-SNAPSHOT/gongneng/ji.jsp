<%--
  Created by IntelliJ IDEA.
  User: Sun
  Date: 2021/1/18
  Time: 15:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
                $("#jiList").attr("src","${pageContext.request.contextPath}/getJiName1")
            })
            $("#a2").click(function (){
                $("#jiList").attr("src","${pageContext.request.contextPath}/getJiName2")
            })
            $("#a3").click(function (){
                $("#jiList").attr("src","${pageContext.request.contextPath}/getJiName3")
            })
            $("#a4").click(function (){
                $("#jiList").attr("src","${pageContext.request.contextPath}/getJiName4")
            })
            $("#a5").click(function (){
                $("#jiList").attr("src","${pageContext.request.contextPath}/getJiName5")
            })
            $("#a6").click(function (){
                $("#jiList").attr("src","${pageContext.request.contextPath}/getJiName6")
            })
            $("#a7").click(function (){
                $("#jiList").attr("src","${pageContext.request.contextPath}/getJiName7")
            })
            $("#a8").click(function (){
                $("#jiList").attr("src","${pageContext.request.contextPath}/getJiName8")
            })
            $("#a9").click(function (){
                $("#jiList").attr("src","${pageContext.request.contextPath}/getJiPrice1")
            })
            $("#a10").click(function (){
                $("#jiList").attr("src","${pageContext.request.contextPath}/getJiPrice2")
            })
            $("#a11").click(function (){
                $("#jiList").attr("src","${pageContext.request.contextPath}/getJiPrice3")
            })
            $("#a12").click(function (){
                $("#jiList").attr("src","${pageContext.request.contextPath}/getJiPrice4")
            })
            $("#a13").click(function (){
                $("#jiList").attr("src","${pageContext.request.contextPath}/getJiLei1")
            })
            $("#a14").click(function (){
                $("#jiList").attr("src","${pageContext.request.contextPath}/getJiLei2")
            })
            $("#a15").click(function (){
                $("#jiList").attr("src","${pageContext.request.contextPath}/getJiLei3")
            })

          
        })
    </script>
</head>
<body>
<div class="container-fluid">
    <div class="row">
        <div class="panel panel-default">
            <div class="panel-heading"><strong>请选择<span style="color: deeppink">机箱</span></strong></div>
            <ul class="list-unstyled list-group" style="margin-left:2% " id="liebiao">
                <li class="list-group-item" >
                    <span style="color:#5e5e5e;">推荐品牌：</span>
                    <a href="javascript:;" id="a1" >航嘉</a>
                    <a href="javascript:;" id="a2" >鑫谷</a>
                    <a href="javascript:;" id="a3" >aigo</a>
                    <a href="javascript:;" id="a4" >金河田</a>
                    <a href="javascript:;" id="a5" >先马</a>
                    <a href="javascript:;" id="a6" >Tt</a>
                    <a href="javascript:;" id="a7" >影驰</a>
                    <a href="javascript:;" id="a8" >九州风神</a>
                </li>
                <li class="list-group-item">
                    <span style="color:#5e5e5e;">价格区间：</span>
                    <a href="javascript:;" id="a9">150元以下</a>
                    <a href="javascript:;" id="a10">150-200元</a>
                    <a href="javascript:;" id="a11">200-300元</a>
                    <a href="javascript:;" id="a12">300元以上</a>
                </li>
                <li class="list-group-item">
                    <span style="color:#5e5e5e;">机箱类型：</span>
                    <a href="javascript:;" id="a13">台式机</a>
                    <a href="javascript:;" id="a14">游戏机箱</a>
                    <a href="javascript:;" id="a15">服务器机箱</a>
                </li>


            </ul>
        </div>
    </div>
    <div class="row">
        <iframe  src="${pageContext.request.contextPath}/getJiAll" width="100%" id="jiList" name="jiList" frameborder="0" scrolling="no" onload="this.height=jiList.document.body.scrollHeight">

        </iframe>
    </div>
</div>
</body>
</html>
