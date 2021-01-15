<%--
  Created by IntelliJ IDEA.
  User: Sun
  Date: 2021/1/14
  Time: 20:05
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
                $("#yingList").attr("src","${pageContext.request.contextPath}/getYingName1")
            })
            $("#a2").click(function (){
                $("#yingList").attr("src","${pageContext.request.contextPath}/getYingName2")
            })
            $("#a3").click(function (){
                $("#yingList").attr("src","${pageContext.request.contextPath}/getYingName3")
            })
            $("#a4").click(function (){
                $("#yingList").attr("src","${pageContext.request.contextPath}/getYingName4")
            })
            $("#a5").click(function (){
                $("#yingList").attr("src","${pageContext.request.contextPath}/getYingPrice1")
            })
            $("#a6").click(function (){
                $("#yingList").attr("src","${pageContext.request.contextPath}/getYingPrice2")
            })
            $("#a7").click(function (){
                $("#yingList").attr("src","${pageContext.request.contextPath}/getYingPrice3")
            })
            $("#a8").click(function (){
                $("#yingList").attr("src","${pageContext.request.contextPath}/getYingPrice4")
            })
            $("#a9").click(function (){
                $("#yingList").attr("src","${pageContext.request.contextPath}/getYingRong1")
            })
            $("#a10").click(function (){
                $("#yingList").attr("src","${pageContext.request.contextPath}/getYingRong2")
            })
            $("#a11").click(function (){
                $("#yingList").attr("src","${pageContext.request.contextPath}/getYingRong3")
            })
            $("#a12").click(function (){
                $("#yingList").attr("src","${pageContext.request.contextPath}/getYingRong4")
            })
            $("#a13").click(function (){
                $("#yingList").attr("src","${pageContext.request.contextPath}/getYingRong5")
            })
            $("#a14").click(function (){
                $("#yingList").attr("src","${pageContext.request.contextPath}/getYingRong6")
            })
            $("#a15").click(function (){
                $("#yingList").attr("src","${pageContext.request.contextPath}/getYingRong7")
            })
            $("#a16").click(function (){
                $("#yingList").attr("src","${pageContext.request.contextPath}/getYingHuan1")
            })
            $("#a17").click(function (){
                $("#yingList").attr("src","${pageContext.request.contextPath}/getYingHuan2")
            })
            $("#a18").click(function (){
                $("#yingList").attr("src","${pageContext.request.contextPath}/getYingHuan3")
            })
            $("#a19").click(function (){
                $("#yingList").attr("src","${pageContext.request.contextPath}/getYingHuan4")
            })
            $("#a20").click(function (){
                $("#yingList").attr("src","${pageContext.request.contextPath}/getYingHuan5")
            })
            $("#a21").click(function (){
                $("#yingList").attr("src","${pageContext.request.contextPath}/getYingHuan6")
            })
            $("#a22").click(function (){
                $("#yingList").attr("src","${pageContext.request.contextPath}/getYingZhuan1")
            })
            $("#a23").click(function (){
                $("#yingList").attr("src","${pageContext.request.contextPath}/getYingZhuan2")
            })
            $("#a24").click(function (){
                $("#yingList").attr("src","${pageContext.request.contextPath}/getYingZhuan3")
            })
            $("#a25").click(function (){
                $("#yingList").attr("src","${pageContext.request.contextPath}/getYingZhuan4")
            })
            $("#a26").click(function (){
                $("#yingList").attr("src","${pageContext.request.contextPath}/getYingJie1")
            })
            $("#a27").click(function (){
                $("#yingList").attr("src","${pageContext.request.contextPath}/getYingJie2")
            })
            $("#a28").click(function (){
                $("#yingList").attr("src","${pageContext.request.contextPath}/getYingJie3")
            })
        })
    </script>
</head>
<body>
<div class="container-fluid">
    <div class="row">
        <div class="panel panel-default">
            <div class="panel-heading"><strong>请选择<span style="color: deeppink">硬盘</span></strong></div>
            <ul class="list-unstyled list-group" style="margin-left:2% " id="liebiao">
                <li class="list-group-item" >
                    <span style="color:#5e5e5e;">推荐品牌：</span>
                    <a href="javascript:;" id="a1" >西部数据</a>
                    <a href="javascript:;" id="a2" >希捷</a>
                    <a href="javascript:;" id="a3" >东芝</a>
                    <a href="javascript:;" id="a4" >HGST</a>
                </li>
                <li class="list-group-item">
                    <span style="color:#5e5e5e;">价格区间：</span>
                    <a href="javascript:;" id="a5">400元以下</a>
                    <a href="javascript:;" id="a6">400-600元</a>
                    <a href="javascript:;" id="a7">600-1000元</a>
                    <a href="javascript:;" id="a8">1000元以上</a>
                </li>
                <li class="list-group-item">
                    <span style="color:#5e5e5e;">硬盘容量：</span>
                    <a href="javascript:; " id="a9">10TB及以上</a>
                    <a href="javascript:;" id="a10">8TB</a>
                    <a href="javascript:;" id="a11">6TB</a>
                    <a href="javascript:;" id="a12">4TB</a>
                    <a href="javascript:;" id="a13">3TB</a>
                    <a href="javascript:;" id="a14">2TB</a>
                    <a href="javascript:;" id="a15">1TB及以下</a>
                </li>

                <li class="list-group-item">
                    <span style="color:#5e5e5e;">缓存：</span>
                    <a href="javascript:;" id="a16">256MB</a>
                    <a href="javascript:;" id="a17">128MB</a>
                    <a href="javascript:;" id="a18">64MB</a>
                    <a href="javascript:;" id="a19">32MB</a>
                    <a href="javascript:;" id="a20">16MB</a>
                    <a href="javascript:;" id="a21">8MB</a>
                </li>
                <li class="list-group-item">
                    <span style="color:#5e5e5e;">转速：</span>
                    <a href="javascript:;" id="a22">10000转</a>
                    <a href="javascript:;" id="a23">7200转</a>
                    <a href="javascript:;" id="a24">5900转</a>
                    <a href="javascript:;" id="a25">5400转</a>
                </li>
                <li class="list-group-item">
                    <span style="color:#5e5e5e;">接口类型：</span>
                    <a href="javascript:;" id="a26">SATA3.0</a>
                    <a href="javascript:;" id="a27">SATA2.0</a>
                    <a href="javascript:;" id="a28">SAS</a>
                </li>


            </ul>
        </div>
    </div>
    <div class="row">
        <iframe  src="${pageContext.request.contextPath}/getYingAll" width="100%" id="yingList" name="yingList" frameborder="0" scrolling="no" onload="this.height=yingList.document.body.scrollHeight">

        </iframe>
    </div>
</div>
</body>
</html>
