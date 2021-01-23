<%--
  Created by IntelliJ IDEA.
  User: Sun
  Date: 2021/1/23
  Time: 17:35
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
                $("#yinList").attr("src","${pageContext.request.contextPath}/getYinName1")
            })
            $("#a2").click(function (){
                $("#yinList").attr("src","${pageContext.request.contextPath}/getYinName2")
            })
            $("#a3").click(function (){
                $("#yinList").attr("src","${pageContext.request.contextPath}/getYinName3")
            })
            $("#a4").click(function (){
                $("#yinList").attr("src","${pageContext.request.contextPath}/getYinName4")
            })
            $("#a5").click(function (){
                $("#yinList").attr("src","${pageContext.request.contextPath}/getYinName5")
            })
            $("#a6").click(function (){
                $("#yinList").attr("src","${pageContext.request.contextPath}/getYinName6")
            })
            $("#a7").click(function (){
                $("#yinList").attr("src","${pageContext.request.contextPath}/getYinName7")
            })
            $("#a8").click(function (){
                $("#yinList").attr("src","${pageContext.request.contextPath}/getYinName8")
            })
            $("#a9").click(function (){
                $("#yinList").attr("src","${pageContext.request.contextPath}/getYinPrice1")
            })
            $("#a10").click(function (){
                $("#yinList").attr("src","${pageContext.request.contextPath}/getYinPrice2")
            })
            $("#a11").click(function (){
                $("#yinList").attr("src","${pageContext.request.contextPath}/getYinPrice3")
            })
            $("#a12").click(function (){
                $("#yinList").attr("src","${pageContext.request.contextPath}/getYinPrice4")
            })
            $("#a13").click(function (){
                $("#yinList").attr("src","${pageContext.request.contextPath}/getYinOne1")
            })
            $("#a14").click(function (){
                $("#yinList").attr("src","${pageContext.request.contextPath}/getYinOne2")
            })
            $("#a15").click(function (){
                $("#yinList").attr("src","${pageContext.request.contextPath}/getYinOne3")
            })
            $("#a16").click(function (){
                $("#yinList").attr("src","${pageContext.request.contextPath}/getYinOne4")
            })
            $("#a17").click(function (){
                $("#yinList").attr("src","${pageContext.request.contextPath}/getYinOne5")
            })
            $("#a18").click(function (){
                $("#yinList").attr("src","${pageContext.request.contextPath}/getYinOne6")
            })
            $("#a19").click(function (){
                $("#yinList").attr("src","${pageContext.request.contextPath}/getYinOne7")
            })
            $("#a20").click(function (){
                $("#yinList").attr("src","${pageContext.request.contextPath}/getYinOne8")
            })

        })
    </script>
</head>
<body>
<div class="container-fluid">
    <div class="row">
        <div class="panel panel-default">
            <div class="panel-heading"><strong>请选择<span style="color: deeppink">音箱</span></strong></div>
            <ul class="list-unstyled list-group" style="margin-left:2% " id="liebiao">
                <li class="list-group-item" >
                    <span style="color:#5e5e5e;">推荐品牌：</span>
                    <a href="javascript:;" id="a1" >惠威</a>
                    <a href="javascript:;" id="a2" >BOSE</a>
                    <a href="javascript:;" id="a3" >SONOS</a>
                    <a href="javascript:;" id="a4" >漫步者</a>
                    <a href="javascript:;" id="a5" >声擎</a>
                    <a href="javascript:;" id="a6" >JBL</a>
                    <a href="javascript:;" id="a7" >麦博</a>
                    <a href="javascript:;" id="a8" >爱国者</a>
                </li>
                <li class="list-group-item">
                    <span style="color:#5e5e5e;">价格区间：</span>
                    <a href="javascript:;" id="a9">100元以下</a>
                    <a href="javascript:;" id="a10">100-500元</a>
                    <a href="javascript:;" id="a11">500-1200元</a>
                    <a href="javascript:;" id="a12">1200元以上</a>
                </li>
                <li class="list-group-item">
                    <span style="color:#5e5e5e;">音箱类型：</span>
                    <a href="javascript:;" id="a13">电脑音箱</a>
                    <a href="javascript:;" id="a14">HiFi音箱</a>
                    <a href="javascript:;" id="a15">笔记本音箱</a>
                    <a href="javascript:;" id="a16">苹果音箱</a>
                    <a href="javascript:;" id="a17">电视音箱</a>
                </li>
                <li class="list-group-item">
                    <span style="color:#5e5e5e;">音箱材质：</span>
                    <a href="javascript:;" id="a18">木质</a>
                    <a href="javascript:;" id="a19">金属</a>
                    <a href="javascript:;" id="a20">塑料</a>
                </li>



            </ul>
        </div>
    </div>
    <div class="row">
        <iframe  src="${pageContext.request.contextPath}/getYinAll" width="100%" id="yinList" name="yinList" frameborder="0" scrolling="no" onload="this.height=yinList.document.body.scrollHeight">

        </iframe>
    </div>
</div>
</body>
</html>
