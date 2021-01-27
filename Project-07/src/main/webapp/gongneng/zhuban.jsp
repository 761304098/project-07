<%--
  Created by IntelliJ IDEA.
  User: Sun
  Date: 2021/1/5
  Time: 14:44
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
                $("#zhuList").attr("src","${pageContext.request.contextPath}/getzhuName1")
            })
            $("#a2").click(function (){
                $("#zhuList").attr("src","${pageContext.request.contextPath}/getzhuName2")
            })
            $("#a3").click(function (){
                $("#zhuList").attr("src","${pageContext.request.contextPath}/getzhuName3")
            })
            $("#a4").click(function (){
                $("#zhuList").attr("src","${pageContext.request.contextPath}/getzhuName4")
            })
            $("#a5").click(function (){
                $("#zhuList").attr("src","${pageContext.request.contextPath}/getzhuName5")
            })
            $("#a6").click(function (){
                $("#zhuList").attr("src","${pageContext.request.contextPath}/getzhuName6")
            })
            $("#a7").click(function (){
                $("#zhuList").attr("src","${pageContext.request.contextPath}/getzhuName7")
            })
            $("#a8").click(function (){
                $("#zhuList").attr("src","${pageContext.request.contextPath}/getzhuName8")
            })
            $("#a9").click(function (){
                $("#zhuList").attr("src","${pageContext.request.contextPath}/getzhuPrice1")
            })
            $("#a10").click(function (){
                $("#zhuList").attr("src","${pageContext.request.contextPath}/getzhuPrice2")
            })
            $("#a11").click(function (){
                $("#zhuList").attr("src","${pageContext.request.contextPath}/getzhuPrice3")
            })
            $("#a12").click(function (){
                $("#zhuList").attr("src","${pageContext.request.contextPath}/getzhuGroup1")
            })
            $("#a13").click(function (){
                $("#zhuList").attr("src","${pageContext.request.contextPath}/getzhuSlot1")
            })
            $("#a14").click(function (){
                $("#zhuList").attr("src","${pageContext.request.contextPath}/getzhuSlot2")
            })
            $("#a15").click(function (){
                $("#zhuList").attr("src","${pageContext.request.contextPath}/getzhuSlot3")
            })
            $("#a16").click(function (){
                $("#zhuList").attr("src","${pageContext.request.contextPath}/getzhuSlot4")
            })
            $("#a17").click(function (){
                $("#zhuList").attr("src","${pageContext.request.contextPath}/getzhuSlot5")
            })
            $("#a18").click(function (){
                $("#zhuList").attr("src","${pageContext.request.contextPath}/getzhuGroup2")
            })
            $("#a19").click(function (){
                $("#zhuList").attr("src","${pageContext.request.contextPath}/getzhuSlot6")
            })
            $("#a20").click(function (){
                $("#zhuList").attr("src","${pageContext.request.contextPath}/getzhuSlot7")
            })
            $("#a21").click(function (){
                $("#zhuList").attr("src","${pageContext.request.contextPath}/getzhuSlot8")
            })
            $("#a22").click(function (){
                $("#zhuList").attr("src","${pageContext.request.contextPath}/getzhuSlot9")
            })
            $("#a23").click(function (){
                $("#zhuList").attr("src","${pageContext.request.contextPath}/getzhuType1")
            })
            $("#a24").click(function (){
                $("#zhuList").attr("src","${pageContext.request.contextPath}/getzhuType2")
            })
            $("#a25").click(function (){
                $("#zhuList").attr("src","${pageContext.request.contextPath}/getzhuType3")
            })
            $("#a26").click(function (){
                $("#zhuList").attr("src","${pageContext.request.contextPath}/getzhuType4")
            })
            $("#a27").click(function (){
                $("#zhuList").attr("src","${pageContext.request.contextPath}/getzhuChip1")
            })
            $("#a28").click(function (){
                $("#zhuList").attr("src","${pageContext.request.contextPath}/getzhuChip2")
            })
        })
    </script>
</head>
<body>
<div class="container-fluid">
    <div class="row">
        <div class="panel panel-default">
            <div class="panel-heading"><strong>请选择<span style="color: deeppink">主板</span></strong></div>
            <ul class="list-unstyled list-group" style="margin-left:2% " id="liebiao">
                <li class="list-group-item" >
                    <span style="color:#5e5e5e;">推荐品牌：</span>
                    <a href="javascript:;" id="a1" >华硕</a>
                    <a href="javascript:;" id="a2" >技嘉</a>
                    <a href="javascript:;" id="a3" >msi微星</a>
                    <a href="javascript:;" id="a4" >七彩虹</a>
                    <a href="javascript:;" id="a5" >映泰</a>
                    <a href="javascript:;" id="a6" >铭瑄</a>
                    <a href="javascript:;" id="a7" >梅捷</a>
                    <a href="javascript:;" id="a8" >昂达</a>
                </li>
                <li class="list-group-item">
                    <span style="color:#5e5e5e;">价格区间：</span>
                    <a href="javascript:;" id="a9">400元以下</a>
                    <a href="javascript:;" id="a10">400-800元</a>
                    <a href="javascript:;" id="a11">800元以上</a>
                </li>
                <li class="list-group-item">
                    <span style="color:#5e5e5e;">CPU插槽：</span>
                    <a href="javascript:; " id="a12">Intel</a>
                    (<a href="javascript:;" style="margin-left: 0%" id="a13">LGA1200</a>
                    <a href="javascript:;" id="a14">LGA2066</a>
                    <a href="javascript:;" id="a15">LGA1155</a>
                    <a href="javascript:;" id="a16">LGA1151</a>
                    <a href="javascript:;" id="a17">LGA1150</a>)
                    <a href="javascript:;" id="a18">AMD</a>
                    (<a href="javascript:;" style="margin-left: 0%" id="a19">SocketTR4</a>
                    <a href="javascript:;" id="a20">SocketsTRX4</a>
                    <a href="javascript:;" id="a21">SocketAM4</a>
                    <a href="javascript:;" id="a22">SocketFM2+</a>)
                </li>

                <li class="list-group-item">
                    <span style="color:#5e5e5e;">主板类型：</span>
                    <a href="javascript:;" id="a23">ATX(标准型)</a>
                    <a href="javascript:;" id="a24">M-ATX(紧凑型)</a>
                    <a href="javascript:;" id="a25">Mini-ITX(迷你型)</a>
                    <a href="javascript:;" id="a26">E-ATX(加强型)</a>
                </li>
                <li class="list-group-item">
                    <span style="color:#5e5e5e;">集成芯片：</span>
                    <a href="javascript:;" id="a27">显卡/声卡/网卡</a>
                    <a href="javascript:;" id="a28">声卡/网卡</a>
                </li>


            </ul>
        </div>
    </div>
    <div class="row">
        <iframe  src="${pageContext.request.contextPath}/getzhuAll" width="100%" id="zhuList" name="zhuList" frameborder="0" scrolling="no" onload="this.height=zhuList.document.body.scrollHeight">

        </iframe>
    </div>
</div>
</body>
</html>
