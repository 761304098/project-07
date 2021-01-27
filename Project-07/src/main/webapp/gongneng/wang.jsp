<%--
  Created by IntelliJ IDEA.
  User: Sun
  Date: 2021/1/23
  Time: 20:56
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
                $("#wangList").attr("src","${pageContext.request.contextPath}/getWangName1")
            })
            $("#a2").click(function (){
                $("#wangList").attr("src","${pageContext.request.contextPath}/getWangName2")
            })
            $("#a3").click(function (){
                $("#wangList").attr("src","${pageContext.request.contextPath}/getWangName3")
            })
            $("#a4").click(function (){
                $("#wangList").attr("src","${pageContext.request.contextPath}/getWangName4")
            })
            $("#a5").click(function (){
                $("#wangList").attr("src","${pageContext.request.contextPath}/getWangName5")
            })
            $("#a6").click(function (){
                $("#wangList").attr("src","${pageContext.request.contextPath}/getWangName6")
            })
            $("#a7").click(function (){
                $("#wangList").attr("src","${pageContext.request.contextPath}/getWangName7")
            })
            $("#a8").click(function (){
                $("#wangList").attr("src","${pageContext.request.contextPath}/getWangName8")
            })
            $("#a9").click(function (){
                $("#wangList").attr("src","${pageContext.request.contextPath}/getWangPrice1")
            })
            $("#a10").click(function (){
                $("#wangList").attr("src","${pageContext.request.contextPath}/getWangPrice2")
            })
            $("#a11").click(function (){
                $("#wangList").attr("src","${pageContext.request.contextPath}/getWangPrice3")
            })
            $("#a12").click(function (){
                $("#wangList").attr("src","${pageContext.request.contextPath}/getWangPrice4")
            })
            $("#a13").click(function (){
                $("#wangList").attr("src","${pageContext.request.contextPath}/getWangOne1")
            })
            $("#a14").click(function (){
                $("#wangList").attr("src","${pageContext.request.contextPath}/getWangOne2")
            })
            $("#a15").click(function (){
                $("#wangList").attr("src","${pageContext.request.contextPath}/getWangOne3")
            })
            $("#a16").click(function (){
                $("#wangList").attr("src","${pageContext.request.contextPath}/getWangOne4")
            })
            $("#a17").click(function (){
                $("#wangList").attr("src","${pageContext.request.contextPath}/getWangTwo1")
            })
            $("#a18").click(function (){
                $("#wangList").attr("src","${pageContext.request.contextPath}/getWangTwo2")
            })
            $("#a19").click(function (){
                $("#wangList").attr("src","${pageContext.request.contextPath}/getWangThree1")
            })
            $("#a20").click(function (){
                $("#wangList").attr("src","${pageContext.request.contextPath}/getWangThree2")
            })
            $("#a21").click(function (){
                $("#wangList").attr("src","${pageContext.request.contextPath}/getWangThree3")
            })
            $("#a22").click(function (){
                $("#wangList").attr("src","${pageContext.request.contextPath}/getWangFour1")
            })
            $("#a23").click(function (){
                $("#wangList").attr("src","${pageContext.request.contextPath}/getWangFour2")
            })
            $("#a24").click(function (){
                $("#wangList").attr("src","${pageContext.request.contextPath}/getWangFour3")
            })
            $("#a25").click(function (){
                $("#wangList").attr("src","${pageContext.request.contextPath}/getWangFour4")
            })


        })
    </script>
</head>
<body>
<div class="container-fluid">
    <div class="row">
        <div class="panel panel-default">
            <div class="panel-heading"><strong>请选择<span style="color: deeppink">网卡</span></strong></div>
            <ul class="list-unstyled list-group" style="margin-left:2% " id="liebiao">
                <li class="list-group-item" >
                    <span style="color:#5e5e5e;">推荐品牌：</span>
                    <a href="javascript:;" id="a1" >Winyao</a>
                    <a href="javascript:;" id="a2" >Mellanox</a>
                    <a href="javascript:;" id="a3" >Intel</a>
                    <a href="javascript:;" id="a4" >光润通</a>
                    <a href="javascript:;" id="a5" >TP-LINK</a>
                    <a href="javascript:;" id="a6" >磊科</a>
                    <a href="javascript:;" id="a7" >腾达</a>
                    <a href="javascript:;" id="a8" >联想</a>
                </li>
                <li class="list-group-item">
                    <span style="color:#5e5e5e;">价格区间：</span>
                    <a href="javascript:;" id="a9">50元以下</a>
                    <a href="javascript:;" id="a10">50-100元</a>
                    <a href="javascript:;" id="a11">100-400元</a>
                    <a href="javascript:;" id="a12">400元以上</a>
                </li>
                <li class="list-group-item">
                    <span style="color:#5e5e5e;">适用网络类型：</span>
                    <a href="javascript:;" id="a13">以太网</a>
                    <a href="javascript:;" id="a14">快速以太网</a>
                    <a href="javascript:;" id="a15">千兆以太网</a>
                    <a href="javascript:;" id="a16">万兆以太网</a>
                </li>


                <li class="list-group-item">
                    <span style="color:#5e5e5e;">网络接口类型：</span>
                    <a href="javascript:;" id="a17">RJ45接口</a>
                    <a href="javascript:;" id="a18">光纤接口</a>
                </li>
                <li class="list-group-item">
                    <span style="color:#5e5e5e;">总线类型：</span>
                    <a href="javascript:;" id="a19">PCI-E</a>
                    <a href="javascript:;" id="a20">PCI-X</a>
                    <a href="javascript:;" id="a21">USB</a>
                </li>
                <li class="list-group-item">
                    <span style="color:#5e5e5e;">传输速率：</span>
                    <a href="javascript:;" id="a22">10/100Mbps</a>
                    <a href="javascript:;" id="a23">10/100/1000Mbps</a>
                    <a href="javascript:;" id="a24">1000Mbps</a>
                    <a href="javascript:;" id="a25">10000Mbps</a>
                </li>




            </ul>
        </div>
    </div>
    <div class="row">
        <iframe  src="${pageContext.request.contextPath}/getWangAll" width="100%" id="wangList" name="wangList" frameborder="0" scrolling="no" onload="this.height=wangList.document.body.scrollHeight">

        </iframe>
    </div>
</div>
</body>
</html>
