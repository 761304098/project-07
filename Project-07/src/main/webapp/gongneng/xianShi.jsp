<%--
  Created by IntelliJ IDEA.
  User: Sun
  Date: 2021/1/17
  Time: 11:29
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
                $("#xianShiList").attr("src","${pageContext.request.contextPath}/getXianShiName1")
            })
            $("#a2").click(function (){
                $("#xianShiList").attr("src","${pageContext.request.contextPath}/getXianShiName2")
            })
            $("#a3").click(function (){
                $("#xianShiList").attr("src","${pageContext.request.contextPath}/getXianShiName3")
            })
            $("#a4").click(function (){
                $("#xianShiList").attr("src","${pageContext.request.contextPath}/getXianShiName4")
            })
            $("#a5").click(function (){
                $("#xianShiList").attr("src","${pageContext.request.contextPath}/getXianShiName5")
            })
            $("#a6").click(function (){
                $("#xianShiList").attr("src","${pageContext.request.contextPath}/getXianShiName6")
            })
            $("#a7").click(function (){
                $("#xianShiList").attr("src","${pageContext.request.contextPath}/getXianShiName7")
            })
            $("#a8").click(function (){
                $("#xianShiList").attr("src","${pageContext.request.contextPath}/getXianShiName8")
            })
            $("#a9").click(function (){
                $("#xianShiList").attr("src","${pageContext.request.contextPath}/getXianShiPrice1")
            })
            $("#a10").click(function (){
                $("#xianShiList").attr("src","${pageContext.request.contextPath}/getXianShiPrice2")
            })
            $("#a11").click(function (){
                $("#xianShiList").attr("src","${pageContext.request.contextPath}/getXianShiPrice3")
            })
            $("#a12").click(function (){
                $("#xianShiList").attr("src","${pageContext.request.contextPath}/getXianShiPrice4")
            })
            $("#a13").click(function (){
                $("#xianShiList").attr("src","${pageContext.request.contextPath}/getXianShiChi1")
            })
            $("#a14").click(function (){
                $("#xianShiList").attr("src","${pageContext.request.contextPath}/getXianShiChi2")
            })
            $("#a15").click(function (){
                $("#xianShiList").attr("src","${pageContext.request.contextPath}/getXianShiChi3")
            })
            $("#a16").click(function (){
                $("#xianShiList").attr("src","${pageContext.request.contextPath}/getXianShiChi4")
            })
            $("#a17").click(function (){
                $("#xianShiList").attr("src","${pageContext.request.contextPath}/getXianShiChi5")
            })
            $("#a18").click(function (){
                $("#xianShiList").attr("src","${pageContext.request.contextPath}/getXianShiLei1")
            })
            $("#a19").click(function (){
                $("#xianShiList").attr("src","${pageContext.request.contextPath}/getXianShiLei2")
            })
            $("#a20").click(function (){
                $("#xianShiList").attr("src","${pageContext.request.contextPath}/getXianShiLei3")
            })
            $("#a21").click(function (){
                $("#xianShiList").attr("src","${pageContext.request.contextPath}/getXianShiLei4")
            })
            $("#a22").click(function (){
                $("#xianShiList").attr("src","${pageContext.request.contextPath}/getXianShiLei5")
            })
            $("#a23").click(function (){
                $("#xianShiList").attr("src","${pageContext.request.contextPath}/getXianShiLei6")
            })
            $("#a24").click(function (){
                $("#xianShiList").attr("src","${pageContext.request.contextPath}/getXianShiMian1")
            })
            $("#a25").click(function (){
                $("#xianShiList").attr("src","${pageContext.request.contextPath}/getXianShiMian2")
            })
            $("#a26").click(function (){
                $("#xianShiList").attr("src","${pageContext.request.contextPath}/getXianShiMian3")
            })
            $("#a27").click(function (){
                $("#xianShiList").attr("src","${pageContext.request.contextPath}/getXianShiMian4")
            })
            $("#a28").click(function (){
                $("#xianShiList").attr("src","${pageContext.request.contextPath}/getXianShiMian5")
            })
        })
    </script>
</head>
<body>
<div class="container-fluid">
    <div class="row">
        <div class="panel panel-default">
            <div class="panel-heading"><strong>请选择<span style="color: deeppink">液晶显示器</span></strong></div>
            <ul class="list-unstyled list-group" style="margin-left:2% " id="liebiao">
                <li class="list-group-item" >
                    <span style="color:#5e5e5e;">推荐品牌：</span>
                    <a href="javascript:;" id="a1" >三星</a>
                    <a href="javascript:;" id="a2" >HKC</a>
                    <a href="javascript:;" id="a3" >AOC</a>
                    <a href="javascript:;" id="a4" >优派</a>
                    <a href="javascript:;" id="a5" >明基</a>
                    <a href="javascript:;" id="a6" >飞利浦</a>
                    <a href="javascript:;" id="a7" >蚂蚁电竞</a>
                    <a href="javascript:;" id="a8" >创维</a>

                </li>
                <li class="list-group-item">
                    <span style="color:#5e5e5e;">价格区间：</span>
                    <a href="javascript:;" id="a9">499元以下</a>
                    <a href="javascript:;" id="a10">500-799元</a>
                    <a href="javascript:;" id="a11">800-999元</a>
                    <a href="javascript:;" id="a12">1000元以上</a>
                </li>
                <li class="list-group-item">
                    <span style="color:#5e5e5e;">屏幕尺寸：</span>
                    <a href="javascript:; " id="a13">30英寸以上</a>
                    <a href="javascript:;" id="a14">27-30英寸</a>
                    <a href="javascript:;" id="a15">23-26英寸</a>
                    <a href="javascript:;" id="a16">20-22英寸</a>
                    <a href="javascript:;" id="a17">20英寸以下</a>
                </li>

                <li class="list-group-item">
                    <span style="color:#5e5e5e;">产品类型：</span>
                    <a href="javascript:;" id="a18">曲面显示器</a>
                    <a href="javascript:;" id="a19">5K显示器</a>
                    <a href="javascript:;" id="a20">4K显示器</a>
                    <a href="javascript:;" id="a21">2K显示器</a>
                    <a href="javascript:;" id="a22">LED显示器</a>
                    <a href="javascript:;" id="a23">广视角显示器</a>
                </li>
                <li class="list-group-item">
                    <span style="color:#5e5e5e;">面板类型：</span>
                    <a href="javascript:;" id="a24">IPS面板</a>
                    <a href="javascript:;" id="a25">VA面板</a>
                    <a href="javascript:;" id="a26">PLS面板</a>
                    <a href="javascript:;" id="a27">ADS面板</a>
                    <a href="javascript:;" id="a28">TN面板</a>
                </li>
            </ul>
        </div>
    </div>
    <div class="row">
        <iframe  src="${pageContext.request.contextPath}/getXianShiAll" width="100%" id="xianShiList" name="xianShiList" frameborder="0" scrolling="no" onload="this.height=xianShiList.document.body.scrollHeight">

        </iframe>
    </div>
</div>
</body>
</html>
