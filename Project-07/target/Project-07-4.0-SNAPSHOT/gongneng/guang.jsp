<%--
  Created by IntelliJ IDEA.
  User: Sun
  Date: 2021/1/23
  Time: 18:48
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
                $("#guangList").attr("src","${pageContext.request.contextPath}/getGuangName1")
            })
            $("#a2").click(function (){
                $("#guangList").attr("src","${pageContext.request.contextPath}/getGuangName2")
            })
            $("#a3").click(function (){
                $("#guangList").attr("src","${pageContext.request.contextPath}/getGuangName3")
            })
            $("#a4").click(function (){
                $("#guangList").attr("src","${pageContext.request.contextPath}/getGuangName4")
            })
            $("#a5").click(function (){
                $("#guangList").attr("src","${pageContext.request.contextPath}/getGuangName5")
            })
            $("#a6").click(function (){
                $("#guangList").attr("src","${pageContext.request.contextPath}/getGuangName6")
            })
            $("#a7").click(function (){
                $("#guangList").attr("src","${pageContext.request.contextPath}/getGuangName7")
            })
            $("#a8").click(function (){
                $("#guangList").attr("src","${pageContext.request.contextPath}/getGuangName8")
            })
            $("#a9").click(function (){
                $("#guangList").attr("src","${pageContext.request.contextPath}/getGuangPrice1")
            })
            $("#a10").click(function (){
                $("#guangList").attr("src","${pageContext.request.contextPath}/getGuangPrice2")
            })
            $("#a11").click(function (){
                $("#guangList").attr("src","${pageContext.request.contextPath}/getGuangPrice3")
            })
            $("#a12").click(function (){
                $("#guangList").attr("src","${pageContext.request.contextPath}/getGuangPrice4")
            })
            $("#a13").click(function (){
                $("#guangList").attr("src","${pageContext.request.contextPath}/getGuangOne1")
            })
            $("#a14").click(function (){
                $("#guangList").attr("src","${pageContext.request.contextPath}/getGuangOne2")
            })
            $("#a15").click(function (){
                $("#guangList").attr("src","${pageContext.request.contextPath}/getGuangOne3")
            })
            $("#a16").click(function (){
                $("#guangList").attr("src","${pageContext.request.contextPath}/getGuangOne4")
            })
            $("#a17").click(function (){
                $("#guangList").attr("src","${pageContext.request.contextPath}/getGuangFour1")
            })
            $("#a18").click(function (){
                $("#guangList").attr("src","${pageContext.request.contextPath}/getGuangFour2")
            })
            $("#a19").click(function (){
                $("#guangList").attr("src","${pageContext.request.contextPath}/getGuangThree1")
            })
            $("#a20").click(function (){
                $("#guangList").attr("src","${pageContext.request.contextPath}/getGuangThree2")
            })
       
        })
    </script>
</head>
<body>
<div class="container-fluid">
    <div class="row">
        <div class="panel panel-default">
            <div class="panel-heading"><strong>请选择<span style="color: deeppink">光驱</span></strong></div>
            <ul class="list-unstyled list-group" style="margin-left:2% " id="liebiao">
                <li class="list-group-item" >
                    <span style="color:#5e5e5e;">推荐品牌：</span>
                    <a href="javascript:;" id="a1" >华硕</a>
                    <a href="javascript:;" id="a2" >先锋</a>
                    <a href="javascript:;" id="a3" >LG</a>
                    <a href="javascript:;" id="a4" >三星</a>
                    <a href="javascript:;" id="a5" >索尼</a>
                    <a href="javascript:;" id="a6" >建兴</a>
                    <a href="javascript:;" id="a7" >松下</a>
                    <a href="javascript:;" id="a8" >联想</a>
                </li>
                <li class="list-group-item">
                    <span style="color:#5e5e5e;">价格区间：</span>
                    <a href="javascript:;" id="a9">150元以下</a>
                    <a href="javascript:;" id="a10">150-300元</a>
                    <a href="javascript:;" id="a11">300-400元</a>
                    <a href="javascript:;" id="a12">400元以上</a>
                </li>
                <li class="list-group-item">
                    <span style="color:#5e5e5e;">光驱类型：</span>
                    <a href="javascript:;" id="a13">DVD刻录机</a>
                    <a href="javascript:;" id="a14">蓝光刻录机</a>
                    <a href="javascript:;" id="a15">DVD光驱</a>
                    <a href="javascript:;" id="a16">蓝光COMBO</a>
                </li>


                <li class="list-group-item">
                    <span style="color:#5e5e5e;">接口类型：</span>
                    <a href="javascript:;" id="a17">USB接口</a>
                    <a href="javascript:;" id="a18">SATA接口</a>
                </li>
                <li class="list-group-item">
                    <span style="color:#5e5e5e;">安装方式：</span>
                    <a href="javascript:;" id="a19">外置</a>
                    <a href="javascript:;" id="a20">内置</a>
                </li>




            </ul>
        </div>
    </div>
    <div class="row">
        <iframe  src="${pageContext.request.contextPath}/getGuangAll" width="100%" id="guangList" name="guangList" frameborder="0" scrolling="no" onload="this.height=guangList.document.body.scrollHeight">

        </iframe>
    </div>
</div>
</body>
</html>
