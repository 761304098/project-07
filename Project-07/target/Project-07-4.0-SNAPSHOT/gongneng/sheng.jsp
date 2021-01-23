<%--
  Created by IntelliJ IDEA.
  User: Sun
  Date: 2021/1/23
  Time: 19:42
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
                $("#shengList").attr("src","${pageContext.request.contextPath}/getShengName1")
            })
            $("#a2").click(function (){
                $("#shengList").attr("src","${pageContext.request.contextPath}/getShengName2")
            })
            $("#a3").click(function (){
                $("#shengList").attr("src","${pageContext.request.contextPath}/getShengName3")
            })
            $("#a4").click(function (){
                $("#shengList").attr("src","${pageContext.request.contextPath}/getShengName4")
            })
            $("#a5").click(function (){
                $("#shengList").attr("src","${pageContext.request.contextPath}/getShengName5")
            })
            $("#a6").click(function (){
                $("#shengList").attr("src","${pageContext.request.contextPath}/getShengName6")
            })
            $("#a7").click(function (){
                $("#shengList").attr("src","${pageContext.request.contextPath}/getShengName7")
            })
            $("#a8").click(function (){
                $("#shengList").attr("src","${pageContext.request.contextPath}/getShengName8")
            })
            $("#a9").click(function (){
                $("#shengList").attr("src","${pageContext.request.contextPath}/getShengPrice1")
            })
            $("#a10").click(function (){
                $("#shengList").attr("src","${pageContext.request.contextPath}/getShengPrice2")
            })
            $("#a11").click(function (){
                $("#shengList").attr("src","${pageContext.request.contextPath}/getShengPrice3")
            })
            $("#a12").click(function (){
                $("#shengList").attr("src","${pageContext.request.contextPath}/getShengPrice4")
            })
            $("#a13").click(function (){
                $("#shengList").attr("src","${pageContext.request.contextPath}/getShengOne1")
            })
            $("#a14").click(function (){
                $("#shengList").attr("src","${pageContext.request.contextPath}/getShengOne2")
            })
            $("#a15").click(function (){
                $("#shengList").attr("src","${pageContext.request.contextPath}/getShengTwo1")
            })
            $("#a16").click(function (){
                $("#shengList").attr("src","${pageContext.request.contextPath}/getShengTwo2")
            })
         

        })
    </script>
</head>
<body>
<div class="container-fluid">
    <div class="row">
        <div class="panel panel-default">
            <div class="panel-heading"><strong>请选择<span style="color: deeppink">声卡</span></strong></div>
            <ul class="list-unstyled list-group" style="margin-left:2% " id="liebiao">
                <li class="list-group-item" >
                    <span style="color:#5e5e5e;">推荐品牌：</span>
                    <a href="javascript:;" id="a1" >创新</a>
                    <a href="javascript:;" id="a2" >森然</a>
                    <a href="javascript:;" id="a3" >华硕</a>
                    <a href="javascript:;" id="a4" >客所思</a>
                    <a href="javascript:;" id="a5" >德国坦克</a>
                    <a href="javascript:;" id="a6" >AZ</a>
                    <a href="javascript:;" id="a7" >乐之邦</a>
                    <a href="javascript:;" id="a8" >声擎</a>
                </li>
                <li class="list-group-item">
                    <span style="color:#5e5e5e;">价格区间：</span>
                    <a href="javascript:;" id="a9">300元以下</a>
                    <a href="javascript:;" id="a10">300-500元</a>
                    <a href="javascript:;" id="a11">500-1000元</a>
                    <a href="javascript:;" id="a12">1000元以上</a>
                </li>
                <li class="list-group-item">
                    <span style="color:#5e5e5e;">适用类型：</span>
                    <a href="javascript:;" id="a13">家用</a>
                    <a href="javascript:;" id="a14">专业</a>
                </li>


                <li class="list-group-item">
                    <span style="color:#5e5e5e;">总线接口：</span>
                    <a href="javascript:;" id="a15">PCI/PCI-E</a>
                    <a href="javascript:;" id="a16">USB</a>
                </li>

            </ul>
        </div>
    </div>
    <div class="row">
        <iframe  src="${pageContext.request.contextPath}/getShengAll" width="100%" id="shengList" name="shengList" frameborder="0" scrolling="no" onload="this.height=shengList.document.body.scrollHeight">

        </iframe>
    </div>
</div>
</body>
</html>

