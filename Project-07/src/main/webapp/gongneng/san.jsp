<%--
  Created by IntelliJ IDEA.
  User: Sun
  Date: 2021/1/19
  Time: 8:55
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
                $("#sanList").attr("src","${pageContext.request.contextPath}/getSanName1")
            })
            $("#a2").click(function (){
                $("#sanList").attr("src","${pageContext.request.contextPath}/getSanName2")
            })
            $("#a3").click(function (){
                $("#sanList").attr("src","${pageContext.request.contextPath}/getSanName3")
            })
            $("#a4").click(function (){
                $("#sanList").attr("src","${pageContext.request.contextPath}/getSanName4")
            })
            $("#a5").click(function (){
                $("#sanList").attr("src","${pageContext.request.contextPath}/getSanName5")
            })
            $("#a6").click(function (){
                $("#sanList").attr("src","${pageContext.request.contextPath}/getSanName6")
            })
            $("#a7").click(function (){
                $("#sanList").attr("src","${pageContext.request.contextPath}/getSanName7")
            })
            $("#a8").click(function (){
                $("#sanList").attr("src","${pageContext.request.contextPath}/getSanName8")
            })
            $("#a9").click(function (){
                $("#sanList").attr("src","${pageContext.request.contextPath}/getSanPrice1")
            })
            $("#a10").click(function (){
                $("#sanList").attr("src","${pageContext.request.contextPath}/getSanPrice2")
            })
            $("#a11").click(function (){
                $("#sanList").attr("src","${pageContext.request.contextPath}/getSanPrice3")
            })
            $("#a12").click(function (){
                $("#sanList").attr("src","${pageContext.request.contextPath}/getSanPrice4")
            })
            $("#a13").click(function (){
                $("#sanList").attr("src","${pageContext.request.contextPath}/getSanOne1")
            })
            $("#a14").click(function (){
                $("#sanList").attr("src","${pageContext.request.contextPath}/getSanOne2")
            })
            $("#a15").click(function (){
                $("#sanList").attr("src","${pageContext.request.contextPath}/getSanOne3")
            })

            $("#a16").click(function (){
                $("#sanList").attr("src","${pageContext.request.contextPath}/getSanOne4")
            })
            $("#a17").click(function (){
                $("#sanList").attr("src","${pageContext.request.contextPath}/getSanOne5")
            })
            $("#a18").click(function (){
                $("#sanList").attr("src","${pageContext.request.contextPath}/getSanTwo1")
            })
            $("#a19").click(function (){
                $("#sanList").attr("src","${pageContext.request.contextPath}/getSanTwo2")
            })
            $("#a20").click(function (){
                $("#sanList").attr("src","${pageContext.request.contextPath}/getSanTwo3")
            })
            $("#a21").click(function (){
                $("#sanList").attr("src","${pageContext.request.contextPath}/getSanTwo4")
            })

        })
    </script>
</head>
<body>
<div class="container-fluid">
    <div class="row">
        <div class="panel panel-default">
            <div class="panel-heading"><strong>请选择<span style="color: deeppink">散热器</span></strong></div>
            <ul class="list-unstyled list-group" style="margin-left:2% " id="liebiao">
                <li class="list-group-item" >
                    <span style="color:#5e5e5e;">推荐品牌：</span>
                    <a href="javascript:;" id="a1" >超频三</a>
                    <a href="javascript:;" id="a2" >九州风神</a>
                    <a href="javascript:;" id="a3" >Tt</a>
                    <a href="javascript:;" id="a4" >NZXT</a>
                    <a href="javascript:;" id="a5" >安钛克</a>
                    <a href="javascript:;" id="a6" >酷冷至尊</a>
                    <a href="javascript:;" id="a7" >雷神</a>
                    <a href="javascript:;" id="a8" >华硕</a>
                </li>
                <li class="list-group-item">
                    <span style="color:#5e5e5e;">价格区间：</span>
                    <a href="javascript:;" id="a9">30元以下</a>
                    <a href="javascript:;" id="a10">30-100元</a>
                    <a href="javascript:;" id="a11">100-400元</a>
                    <a href="javascript:;" id="a12">400元以上</a>
                </li>
                <li class="list-group-item">
                    <span style="color:#5e5e5e;">散热器类型：</span>
                    <a href="javascript:;" id="a13">CPU散热器</a>
                    <a href="javascript:;" id="a14">笔记本散热器</a>
                    <a href="javascript:;" id="a15">显卡散热器</a>
                    <a href="javascript:;" id="a16">水冷散热器</a>
                    <a href="javascript:;" id="a17">风扇</a>
                </li>


                <li class="list-group-item">
                    <span style="color:#5e5e5e;">散热方式：</span>
                    <a href="javascript:;" id="a18">水冷</a>
                    <a href="javascript:;" id="a19">风冷</a>
                    <a href="javascript:;" id="a20">热管</a>
                    <a href="javascript:;" id="a21">散热片</a>
                </li>



            </ul>
        </div>
    </div>
    <div class="row">
        <iframe  src="${pageContext.request.contextPath}/getSanAll" width="100%" id="sanList" name="sanList" frameborder="0" scrolling="no" onload="this.height=sanList.document.body.scrollHeight">

        </iframe>
    </div>
</div>
</body>
</html>


