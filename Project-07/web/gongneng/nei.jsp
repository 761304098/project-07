<%--
  Created by IntelliJ IDEA.
  User: Sun
  Date: 2021/1/14
  Time: 11:12
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
                $("#neiList").attr("src","${pageContext.request.contextPath}/getName1")
            })
            $("#a2").click(function (){
                $("#neiList").attr("src","${pageContext.request.contextPath}/getName2")
            })
            $("#a3").click(function (){
                $("#neiList").attr("src","${pageContext.request.contextPath}/getName3")
            })
            $("#a4").click(function (){
                $("#neiList").attr("src","${pageContext.request.contextPath}/getName4")
            })
            $("#a5").click(function (){
                $("#neiList").attr("src","${pageContext.request.contextPath}/getName5")
            })
            $("#a6").click(function (){
                $("#neiList").attr("src","${pageContext.request.contextPath}/getName6")
            })
            $("#a7").click(function (){
                $("#neiList").attr("src","${pageContext.request.contextPath}/getName7")
            })
            $("#a8").click(function (){
                $("#neiList").attr("src","${pageContext.request.contextPath}/getName8")
            })
            $("#a9").click(function (){
                $("#neiList").attr("src","${pageContext.request.contextPath}/getPrice1")
            })
            $("#a10").click(function (){
                $("#neiList").attr("src","${pageContext.request.contextPath}/getPrice2")
            })
            $("#a11").click(function (){
                $("#neiList").attr("src","${pageContext.request.contextPath}/getPrice3")
            })
            $("#a12").click(function (){
                $("#neiList").attr("src","${pageContext.request.contextPath}/getPrice4")
            })
            $("#a13").click(function (){
                $("#neiList").attr("src","${pageContext.request.contextPath}/getLei1")
            })
            $("#a14").click(function (){
                $("#neiList").attr("src","${pageContext.request.contextPath}/getLei2")
            })
            $("#a15").click(function (){
                $("#neiList").attr("src","${pageContext.request.contextPath}/getLei3")
            })

            $("#a17").click(function (){
                $("#neiList").attr("src","${pageContext.request.contextPath}/getTao1")
            })
            $("#a18").click(function (){
                $("#neiList").attr("src","${pageContext.request.contextPath}/getTao2")
            })
            $("#a19").click(function (){
                $("#neiList").attr("src","${pageContext.request.contextPath}/getTao3")
            })
            $("#a20").click(function (){
                $("#neiList").attr("src","${pageContext.request.contextPath}/getTao4")
            })
            $("#a21").click(function (){
                $("#neiList").attr("src","${pageContext.request.contextPath}/getTao5")
            })
            $("#a22").click(function (){
                $("#neiList").attr("src","${pageContext.request.contextPath}/getTao6")
            })
            $("#a23").click(function (){
                $("#neiList").attr("src","${pageContext.request.contextPath}/getTao7")
            })
            $("#a24").click(function (){
                $("#neiList").attr("src","${pageContext.request.contextPath}/getTao8")
            })
            $("#a25").click(function (){
                $("#neiList").attr("src","${pageContext.request.contextPath}/getTao9")
            })
            $("#a26").click(function (){
                $("#neiList").attr("src","${pageContext.request.contextPath}/getTao10")
            })
            $("#a27").click(function (){
                $("#neiList").attr("src","${pageContext.request.contextPath}/getTao11")
            })
            $("#a28").click(function (){
                $("#neiList").attr("src","${pageContext.request.contextPath}/getTao12")
            })
            $("#a29").click(function (){
                $("#neiList").attr("src","${pageContext.request.contextPath}/getTao13")
            })
            $("#a30").click(function (){
                $("#neiList").attr("src","${pageContext.request.contextPath}/getZhu1")
            })
            $("#a31").click(function (){
                $("#neiList").attr("src","${pageContext.request.contextPath}/getZhu2")
            })
            $("#a32").click(function (){
                $("#neiList").attr("src","${pageContext.request.contextPath}/getZhu3")
            })
            $("#a33").click(function (){
                $("#neiList").attr("src","${pageContext.request.contextPath}/getZhu4")
            })
            $("#a34").click(function (){
                $("#neiList").attr("src","${pageContext.request.contextPath}/getZhu5")
            })
            $("#a35").click(function (){
                $("#neiList").attr("src","${pageContext.request.contextPath}/getZhu6")
            })
            $("#a36").click(function (){
                $("#neiList").attr("src","${pageContext.request.contextPath}/getZhu7")
            })
            $("#a37").click(function (){
                $("#neiList").attr("src","${pageContext.request.contextPath}/getZhu8")
            })
            $("#a38").click(function (){
                $("#neiList").attr("src","${pageContext.request.contextPath}/getName9")
            })
            $("#a39").click(function (){
                $("#neiList").attr("src","${pageContext.request.contextPath}/getName10")
            })







        })
    </script>
</head>
<body>
<div class="container-fluid">
    <div class="row">
        <div class="panel panel-default">
            <div class="panel-heading"><strong>请选择<span style="color: deeppink">内存</span></strong></div>
            <ul class="list-unstyled list-group" style="margin-left:2% " id="liebiao">
                <li class="list-group-item" >
                    <span style="color:#5e5e5e;">推荐品牌：</span>
                    <a href="javascript:;" id="a1" >英睿达</a>
                    <a href="javascript:;" id="a2" >影驰</a>
                    <a href="javascript:;" id="a3" >三星</a>
                    <a href="javascript:;" id="a4" >科赋</a>
                    <a href="javascript:;" id="a5" >海盗船</a>
                    <a href="javascript:;" id="a6" >瑞势</a>
                    <a href="javascript:;" id="a7" >芝奇</a>
                    <a href="javascript:;" id="a8" >威刚</a>
                </li>
                <li class="list-group-item">
                    <span style="color:#5e5e5e;">价格区间：</span>
                    <a href="javascript:;" id="a9">150元以下</a>
                    <a href="javascript:;" id="a10">150-300元</a>
                    <a href="javascript:;" id="a11">300-500元</a>
                    <a href="javascript:;" id="a12">500元以上</a>
                </li>
                <li class="list-group-item">
                    <span style="color:#5e5e5e;">内存类型：</span>
                    <a href="javascript:;" id="a13">DDR4</a>
                    <a href="javascript:;" id="a14">DDR3</a>
                    <a href="javascript:;" id="a15">DDR2</a>
                </li>

                <li class="list-group-item">
                    <span style="color:#5e5e5e;">容量描述：</span>
                    <a href="javascript:; " id="a17">单条</a>
                    (<a href="javascript:;" style="margin-left: 0%" id="a18">16GB</a>
                    <a href="javascript:;" id="a19">8GB</a>
                    <a href="javascript:;" id="a20">4GB</a>
                    <a href="javascript:;" id="a21">2GB</a>)
                    <a href="javascript:;" id="a22">套装</a>
                    (<a href="javascript:;" style="margin-left: 0%" id="a23">16GBx4</a>
                    <a href="javascript:;" id="a24">16GBx2</a>
                    <a href="javascript:;" id="a25">8GBx4</a>
                    <a href="javascript:;" id="a26">8GBx2</a>
                    <a href="javascript:;" id="a27">4GBx4</a>
                    <a href="javascript:;" id="a28">4GBx2</a>
                    <a href="javascript:;" id="a29">2GBx2</a>
                    )
                </li>
                <li class="list-group-item">
                    <span style="color:#5e5e5e;">内存主频：</span>
                    <a href="javascript:;" id="a30">4000MHz及以上</a>
                    <a href="javascript:;" id="a31">3600MHz</a>
                    <a href="javascript:;" id="a32">3400MHz</a>
                    <a href="javascript:;" id="a33">3200MHz</a>
                    <a href="javascript:;" id="a34">3000MHz</a>
                    <a href="javascript:;" id="a35">2800MHz</a>
                    <a href="javascript:;" id="a36">2660MHz</a>
                    <a href="javascript:;" id="a37">2400MHz及以下</a>
                </li>
                <li class="list-group-item">
                    <span style="color:#5e5e5e;">适用类型：</span>
                    <a href="javascript:;" id="a38">台式机</a>
                    <a href="javascript:;" id="a39">笔记本</a>
                </li>


            </ul>
        </div>
    </div>
    <div class="row">
        <iframe  src="${pageContext.request.contextPath}/getneiAll" width="100%" id="neiList" name="neiList" frameborder="0" scrolling="no" onload="this.height=neiList.document.body.scrollHeight">

        </iframe>
    </div>
</div>
</body>
</html>

