<%--
  Created by IntelliJ IDEA.
  User: Sun
  Date: 2021/1/15
  Time: 16:33
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
                $("#guList").attr("src","${pageContext.request.contextPath}/getGuName1")
            })
            $("#a2").click(function (){
                $("#guList").attr("src","${pageContext.request.contextPath}/getGuName2")
            })
            $("#a3").click(function (){
                $("#guList").attr("src","${pageContext.request.contextPath}/getGuName3")
            })
            $("#a4").click(function (){
                $("#guList").attr("src","${pageContext.request.contextPath}/getGuName4")
            })
            $("#a5").click(function (){
                $("#guList").attr("src","${pageContext.request.contextPath}/getGuName5")
            })
            $("#a6").click(function (){
                $("#guList").attr("src","${pageContext.request.contextPath}/getGuName6")
            })
            $("#a7").click(function (){
                $("#guList").attr("src","${pageContext.request.contextPath}/getGuName7")
            })
            $("#a8").click(function (){
                $("#guList").attr("src","${pageContext.request.contextPath}/getGuName8")
            })
            $("#a9").click(function (){
                $("#guList").attr("src","${pageContext.request.contextPath}/getGuPrice1")
            })
            $("#a10").click(function (){
                $("#guList").attr("src","${pageContext.request.contextPath}/getGuPrice2")
            })
            $("#a11").click(function (){
                $("#guList").attr("src","${pageContext.request.contextPath}/getGuPrice3")
            })
            $("#a12").click(function (){
                $("#guList").attr("src","${pageContext.request.contextPath}/getGuPrice4")
            })
            $("#a13").click(function (){
                $("#guList").attr("src","${pageContext.request.contextPath}/getGuPrice5")
            })
            $("#a14").click(function (){
                $("#guList").attr("src","${pageContext.request.contextPath}/getGuPrice6")
            })
            $("#a15").click(function (){
                $("#guList").attr("src","${pageContext.request.contextPath}/getGuRong1")
            })
            $("#a16").click(function (){
                $("#guList").attr("src","${pageContext.request.contextPath}/getGuRong2")
            })
            $("#a17").click(function (){
                $("#guList").attr("src","${pageContext.request.contextPath}/getGuRong3")
            })
            $("#a18").click(function (){
                $("#guList").attr("src","${pageContext.request.contextPath}/getGuRong4")
            })
            $("#a19").click(function (){
                $("#guList").attr("src","${pageContext.request.contextPath}/getGuRong5")
            })
            $("#a20").click(function (){
                $("#guList").attr("src","${pageContext.request.contextPath}/getGuRong6")
            })
            $("#a21").click(function (){
                $("#guList").attr("src","${pageContext.request.contextPath}/getGuLei1")
            })
            $("#a22").click(function (){
                $("#guList").attr("src","${pageContext.request.contextPath}/getGuLei2")
            })
            $("#a23").click(function (){
                $("#guList").attr("src","${pageContext.request.contextPath}/getGuLei3")
            })
            $("#a24").click(function (){
                $("#guList").attr("src","${pageContext.request.contextPath}/getGuLei4")
            })
            $("#a25").click(function (){
                $("#guList").attr("src","${pageContext.request.contextPath}/getGuLei5")
            })
            $("#a26").click(function (){
                $("#guList").attr("src","${pageContext.request.contextPath}/getGuLei6")
            })
            $("#a27").click(function (){
                $("#guList").attr("src","${pageContext.request.contextPath}/getGuLei7")
            })
            $("#a28").click(function (){
                $("#guList").attr("src","${pageContext.request.contextPath}/getGuLei8")
            })
            $("#a29").click(function (){
                $("#guList").attr("src","${pageContext.request.contextPath}/getGuLei9")
            })
            $("#a30").click(function (){
                $("#guList").attr("src","${pageContext.request.contextPath}/getGuLei10")
            })
            $("#a31").click(function (){
                $("#guList").attr("src","${pageContext.request.contextPath}/getGuLei11")
            })
            $("#a32").click(function (){
                $("#guList").attr("src","${pageContext.request.contextPath}/getGuLei12")
            })






        })
    </script>
</head>
<body>
<div class="container-fluid">
    <div class="row">
        <div class="panel panel-default">
            <div class="panel-heading"><strong>请选择<span style="color: deeppink">固态硬盘</span></strong></div>
            <ul class="list-unstyled list-group" style="margin-left:2% " id="liebiao">
                <li class="list-group-item" >
                    <span style="color:#5e5e5e;">推荐品牌：</span>
                    <a href="javascript:;" id="a1" >三星</a>
                    <a href="javascript:;" id="a2" >英睿达</a>
                    <a href="javascript:;" id="a3" >影驰</a>
                    <a href="javascript:;" id="a4" >东芝</a>
                    <a href="javascript:;" id="a5" >闪迪</a>
                    <a href="javascript:;" id="a6" >爱国者</a>
                    <a href="javascript:;" id="a7" >铭瑄</a>
                    <a href="javascript:;" id="a8" >金士顿</a>
                </li>
                <li class="list-group-item">
                    <span style="color:#5e5e5e;">价格区间：</span>
                    <a href="javascript:;" id="a9">300元以下</a>
                    <a href="javascript:;" id="a10">300-500元</a>
                    <a href="javascript:;" id="a11">500-1000元</a>
                    <a href="javascript:;" id="a12">1000-2000元</a>
                    <a href="javascript:;" id="a13">2000-5000元</a>
                    <a href="javascript:;" id="a14">5000元以上</a>

                </li>
                <li class="list-group-item">
                    <span style="color:#5e5e5e;">存储容量：</span>
                    <a href="javascript:; " id="a15">2TB以上</a>
                    <a href="javascript:;" id="a16">960GB-1TB</a>
                    <a href="javascript:;" id="a17">480GB-512GB</a>
                    <a href="javascript:;" id="a18">240GB-256GB</a>
                    <a href="javascript:;" id="a19">120GB-128GB</a>
                    <a href="javascript:;" id="a20">100GB以下</a>
                </li>

                <li class="list-group-item">
                    <span style="color:#5e5e5e;">接口类型：</span>
                    <a href="javascript:;" id="a21">SATA3接口</a>
                    <a href="javascript:;" id="a22">M.2.SATA接口</a>
                    <a href="javascript:;" id="a23">M.2 PCIe接口</a>
                    <a href="javascript:;" id="a24">Type-C接口</a>
                    <a href="javascript:;" id="a25">MSATA接口</a>
                    <a href="javascript:;" id="a26">PCI-E接口</a>
                    <a href="javascript:;" id="a27">U.2接口</a>
                    <a href="javascript:;" id="a28">SATA2接口</a>
                    <a href="javascript:;" id="a29">USB3.1接口</a>
                    <a href="javascript:;" id="a30">USB3.0接口</a>
                    <a href="javascript:;" id="a31">SAS接口</a>
                    <a href="javascript:;" id="a32">PATA接口</a>
                </li>
            </ul>
        </div>
    </div>
    <div class="row">
        <iframe  src="${pageContext.request.contextPath}/getGuAll" width="100%" id="guList" name="guList" frameborder="0" scrolling="no" onload="this.height=guList.document.body.scrollHeight">

        </iframe>
    </div>
</div>
</body>
</html>

