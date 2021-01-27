<%--
  Created by IntelliJ IDEA.
  User: Sun
  Date: 2021/1/18
  Time: 18:00
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
                $("#dianList").attr("src","${pageContext.request.contextPath}/getDianName1")
            })
            $("#a2").click(function (){
                $("#dianList").attr("src","${pageContext.request.contextPath}/getDianName2")
            })
            $("#a3").click(function (){
                $("#dianList").attr("src","${pageContext.request.contextPath}/getDianName3")
            })
            $("#a4").click(function (){
                $("#dianList").attr("src","${pageContext.request.contextPath}/getDianName4")
            })
            $("#a5").click(function (){
                $("#dianList").attr("src","${pageContext.request.contextPath}/getDianName5")
            })
            $("#a6").click(function (){
                $("#dianList").attr("src","${pageContext.request.contextPath}/getDianName6")
            })
            $("#a7").click(function (){
                $("#dianList").attr("src","${pageContext.request.contextPath}/getDianName7")
            })
            $("#a8").click(function (){
                $("#dianList").attr("src","${pageContext.request.contextPath}/getDianName8")
            })
            $("#a9").click(function (){
                $("#dianList").attr("src","${pageContext.request.contextPath}/getDianPrice1")
            })
            $("#a10").click(function (){
                $("#dianList").attr("src","${pageContext.request.contextPath}/getDianPrice2")
            })
            $("#a11").click(function (){
                $("#dianList").attr("src","${pageContext.request.contextPath}/getDianPrice3")
            })
            $("#a12").click(function (){
                $("#dianList").attr("src","${pageContext.request.contextPath}/getDianPrice4")
            })
            $("#a13").click(function (){
                $("#dianList").attr("src","${pageContext.request.contextPath}/getDianPrice5")
            })
            $("#a14").click(function (){
                $("#dianList").attr("src","${pageContext.request.contextPath}/getDianPrice6")
            })
            $("#a15").click(function (){
                $("#dianList").attr("src","${pageContext.request.contextPath}/getDianGong1")
            })
            $("#a16").click(function (){
                $("#dianList").attr("src","${pageContext.request.contextPath}/getDianGong2")
            })
            $("#a17").click(function (){
                $("#dianList").attr("src","${pageContext.request.contextPath}/getDianGong3")
            })
            $("#a18").click(function (){
                $("#dianList").attr("src","${pageContext.request.contextPath}/getDianGong4")
            })
            $("#a19").click(function (){
                $("#dianList").attr("src","${pageContext.request.contextPath}/getDianGong5")
            })
            $("#a20").click(function (){
                $("#dianList").attr("src","${pageContext.request.contextPath}/getDianGong6")
            })
            $("#a21").click(function (){
                $("#dianList").attr("src","${pageContext.request.contextPath}/getDianThree1")
            })
            $("#a22").click(function (){
                $("#dianList").attr("src","${pageContext.request.contextPath}/getDianThree2")
            })
            $("#a23").click(function (){
                $("#dianList").attr("src","${pageContext.request.contextPath}/getDianThree3")
            })
            $("#a24").click(function (){
                $("#dianList").attr("src","${pageContext.request.contextPath}/getDianThree4")
            })

        })
    </script>
</head>
<body>
<div class="container-fluid">
    <div class="row">
        <div class="panel panel-default">
            <div class="panel-heading"><strong>请选择<span style="color: deeppink">电源</span></strong></div>
            <ul class="list-unstyled list-group" style="margin-left:2% " id="liebiao">
                <li class="list-group-item" >
                    <span style="color:#5e5e5e;">推荐品牌：</span>
                    <a href="javascript:;" id="a1" >航嘉</a>
                    <a href="javascript:;" id="a2" >鑫谷</a>
                    <a href="javascript:;" id="a3" >金河田</a>
                    <a href="javascript:;" id="a4" >先马</a>
                    <a href="javascript:;" id="a5" >长城机电</a>
                    <a href="javascript:;" id="a6" >至睿</a>
                    <a href="javascript:;" id="a7" >华硕</a>
                    <a href="javascript:;" id="a8" >酷冷至尊</a>
                </li>
                <li class="list-group-item">
                    <span style="color:#5e5e5e;">价格区间：</span>
                    <a href="javascript:;" id="a9">150元以下</a>
                    <a href="javascript:;" id="a10">150-200元</a>
                    <a href="javascript:;" id="a11">200-300元</a>
                    <a href="javascript:;" id="a12">300-600元</a>
                    <a href="javascript:;" id="a13">600-1000元</a>
                    <a href="javascript:;" id="a14">1000元以上</a>

                </li>
                <li class="list-group-item">
                    <span style="color:#5e5e5e;">额定功率：</span>
                    <a href="javascript:;" id="a15">300W及以下</a>
                    <a href="javascript:;" id="a16">301W-400W</a>
                    <a href="javascript:;" id="a17">401W-500W</a>
                    <a href="javascript:;" id="a18">501W-600W</a>
                    <a href="javascript:;" id="a19">601W-800W</a>
                    <a href="javascript:;" id="a20">801W及以上</a>
                </li>

                <li class="list-group-item">
                    <span style="color:#5e5e5e;">电源类型：</span>
                    <a href="javascript:;" id="a21">台式机电源</a>
                    <a href="javascript:;" id="a22">游戏电源</a>
                    <a href="javascript:;" id="a23">小机箱电源</a>
                    <a href="javascript:;" id="a24">服务器电源</a>
                </li>
            </ul>
        </div>
    </div>
    <div class="row">
        <iframe  src="${pageContext.request.contextPath}/getDianAll" width="100%" id="dianList" name="dianList" frameborder="0" scrolling="no" onload="this.height=dianList.document.body.scrollHeight">

        </iframe>
    </div>
</div>
</body>
</html>

