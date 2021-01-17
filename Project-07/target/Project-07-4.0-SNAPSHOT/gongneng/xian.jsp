<%--
  Created by IntelliJ IDEA.
  User: Sun
  Date: 2021/1/16
  Time: 15:01
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
                $("#xianList").attr("src","${pageContext.request.contextPath}/getXianName1")
            })
            $("#a2").click(function (){
                $("#xianList").attr("src","${pageContext.request.contextPath}/getXianName2")
            })
            $("#a3").click(function (){
                $("#xianList").attr("src","${pageContext.request.contextPath}/getXianName3")
            })
            $("#a4").click(function (){
                $("#xianList").attr("src","${pageContext.request.contextPath}/getXianName4")
            })
            $("#a5").click(function (){
                $("#xianList").attr("src","${pageContext.request.contextPath}/getXianName5")
            })
            $("#a6").click(function (){
                $("#xianList").attr("src","${pageContext.request.contextPath}/getXianName6")
            })
            $("#a7").click(function (){
                $("#xianList").attr("src","${pageContext.request.contextPath}/getXianName7")
            })
            $("#a8").click(function (){
                $("#xianList").attr("src","${pageContext.request.contextPath}/getXianName8")
            })
            $("#a9").click(function (){
                $("#xianList").attr("src","${pageContext.request.contextPath}/getXianName9")
            })
            $("#a10").click(function (){
                $("#xianList").attr("src","${pageContext.request.contextPath}/getXianName10")
            })
            $("#a11").click(function (){
                $("#xianList").attr("src","${pageContext.request.contextPath}/getXianName11")
            })
            $("#a12").click(function (){
                $("#xianList").attr("src","${pageContext.request.contextPath}/getXianName12")
            })
            $("#a13").click(function (){
                $("#xianList").attr("src","${pageContext.request.contextPath}/getXianName13")
            })
            $("#a14").click(function (){
                $("#xianList").attr("src","${pageContext.request.contextPath}/getXianName14")
            })
            $("#a15").click(function (){
                $("#xianList").attr("src","${pageContext.request.contextPath}/getXianName15")
            })
            $("#a16").click(function (){
                $("#xianList").attr("src","${pageContext.request.contextPath}/getXianName16")
            })
            $("#a17").click(function (){
                $("#xianList").attr("src","${pageContext.request.contextPath}/getXianPrice1")
            })
            $("#a18").click(function (){
                $("#xianList").attr("src","${pageContext.request.contextPath}/getXianPrice2")
            })
            $("#a19").click(function (){
                $("#xianList").attr("src","${pageContext.request.contextPath}/getXianPrice3")
            })
            $("#a20").click(function (){
                $("#xianList").attr("src","${pageContext.request.contextPath}/getXianPrice4")
            })
            $("#a21").click(function (){
                $("#xianList").attr("src","${pageContext.request.contextPath}/getXianPrice5")
            })
            $("#a22").click(function (){
                $("#xianList").attr("src","${pageContext.request.contextPath}/getXianPrice6")
            })
            $("#a23").click(function (){
                $("#xianList").attr("src","${pageContext.request.contextPath}/getXianPrice7")
            })
            $("#a24").click(function (){
                $("#xianList").attr("src","${pageContext.request.contextPath}/getXianPrice8")
            })
            $("#a25").click(function (){
                $("#xianList").attr("src","${pageContext.request.contextPath}/getXianRong1")
            })
            $("#a26").click(function (){
                $("#xianList").attr("src","${pageContext.request.contextPath}/getXianRong2")
            })
            $("#a27").click(function (){
                $("#xianList").attr("src","${pageContext.request.contextPath}/getXianRong3")
            })
            $("#a28").click(function (){
                $("#xianList").attr("src","${pageContext.request.contextPath}/getXianRong4")
            })
            $("#a29").click(function (){
                $("#xianList").attr("src","${pageContext.request.contextPath}/getXianRong5")
            })
            $("#a30").click(function (){
                $("#xianList").attr("src","${pageContext.request.contextPath}/getXianRong6")
            })
            $("#a31").click(function (){
                $("#xianList").attr("src","${pageContext.request.contextPath}/getXianRong7")
            })
            $("#a32").click(function (){
                $("#xianList").attr("src","${pageContext.request.contextPath}/getXianRong8")
            })
            $("#a33").click(function (){
                $("#xianList").attr("src","${pageContext.request.contextPath}/getXianRong9")
            })
            $("#a34").click(function (){
                $("#xianList").attr("src","${pageContext.request.contextPath}/getXianRong10")
            })
            $("#a35").click(function (){
                $("#xianList").attr("src","${pageContext.request.contextPath}/getXianRong11")
            })
            $("#a36").click(function (){
                $("#xianList").attr("src","${pageContext.request.contextPath}/getXianRong12")
            })
            $("#a37").click(function (){
                $("#xianList").attr("src","${pageContext.request.contextPath}/getXianRong13")
            })
            $("#a38").click(function (){
                $("#xianList").attr("src","${pageContext.request.contextPath}/getXianRong14")
            })
            $("#a39").click(function (){
                $("#xianList").attr("src","${pageContext.request.contextPath}/getXianRong15")
            })
            $("#a40").click(function (){
                $("#xianList").attr("src","${pageContext.request.contextPath}/getXianRong16")
            })
            $("#a41").click(function (){
                $("#xianList").attr("src","${pageContext.request.contextPath}/getXianRong17")
            })
            $("#a42").click(function (){
                $("#xianList").attr("src","${pageContext.request.contextPath}/getXianRong18")
            })
            $("#a43").click(function (){
                $("#xianList").attr("src","${pageContext.request.contextPath}/getXianjie1")
            })
            $("#a44").click(function (){
                $("#xianList").attr("src","${pageContext.request.contextPath}/getXianjie2")
            })
            $("#a45").click(function (){
                $("#xianList").attr("src","${pageContext.request.contextPath}/getXianjie3")
            })
            $("#a46").click(function (){
                $("#xianList").attr("src","${pageContext.request.contextPath}/getXianjie4")
            })
            $("#a47").click(function (){
                $("#xianList").attr("src","${pageContext.request.contextPath}/getXianjie5")
            })
            $("#a48").click(function (){
                $("#xianList").attr("src","${pageContext.request.contextPath}/getXianjie6")
            })









        })
    </script>
</head>
<body>
<div class="container-fluid">
    <div class="row">
        <div class="panel panel-default">
            <div class="panel-heading"><strong>请选择<span style="color: deeppink">显卡</span></strong></div>
            <ul class="list-unstyled list-group" style="margin-left:2% " id="liebiao">
                <li class="list-group-item" >
                    <span style="color:#5e5e5e;">推荐品牌：</span>
                    <a href="javascript:;" id="a1" >七彩虹</a>
                    <a href="javascript:;" id="a2" >影驰</a>
                    <a href="javascript:;" id="a3" >索泰</a>
                    <a href="javascript:;" id="a4" >msi微星</a>
                    <a href="javascript:;" id="a5" >耕升</a>
                    <a href="javascript:;" id="a6" >铭瑄</a>
                    <a href="javascript:;" id="a7" >蓝宝石</a>
                    <a href="javascript:;" id="a8" >AMD</a>
                    <a href="javascript:;" id="a9" >昂达</a>
                    <a href="javascript:;" id="a10" >华硕</a>
                    <a href="javascript:;" id="a11" >技嘉</a>
                    <a href="javascript:;" id="a12" >丽台</a>
                    <a href="javascript:;" id="a13" >NVIDIA</a>
                    <a href="javascript:;" id="a14" >映泰</a>
                    <a href="javascript:;" id="a15" >映众</a>
                    <a href="javascript:;" id="a16" >Intel</a>



                </li>
                <li class="list-group-item">
                    <span style="color:#5e5e5e;">价格区间：</span>
                    <a href="javascript:;" id="a17">500元以下</a>
                    <a href="javascript:;" id="a18">500-1000元</a>
                    <a href="javascript:;" id="a19">1000-1500元</a>
                    <a href="javascript:;" id="a20">1500-2000元</a>
                    <a href="javascript:;" id="a21">2000-3000元</a>
                    <a href="javascript:;" id="a22">3000-5000元</a>
                    <a href="javascript:;" id="a23">5000-10000元</a>
                    <a href="javascript:;" id="a24">10000元以上</a>

                </li>

                <li class="list-group-item">
                    <span style="color:#5e5e5e;">显存容量：</span>
                    <a href="javascript:;" id="a25">24GB</a>
                    <a href="javascript:;" id="a26">16GB</a>
                    <a href="javascript:;" id="a27">12GB</a>
                    <a href="javascript:;" id="a28">11GB</a>
                    <a href="javascript:;" id="a29">10GB</a>
                    <a href="javascript:;" id="a30">8GB</a>
                    <a href="javascript:;" id="a31">6GB</a>
                    <a href="javascript:;" id="a32">4GB</a>
                    <a href="javascript:;" id="a33">3GB</a>
                    <a href="javascript:;" id="a34">2GB</a>
                    <a href="javascript:;" id="a35">1GB</a>
                </li>
                <li class="list-group-item">
                    <span style="color:#5e5e5e;">显存类型：</span>
                    <a href="javascript:;" id="a36">GDDR6X</a>
                    <a href="javascript:;" id="a37">GDDR6</a>
                    <a href="javascript:;" id="a38">GDDR5X</a>
                    <a href="javascript:;" id="a39">GDDR5</a>
                    <a href="javascript:;" id="a40">GDDR3</a>
                    <a href="javascript:;" id="a41">HBM2</a>
                    <a href="javascript:;" id="a42">HBM</a>
                </li>
                <li class="list-group-item">
                    <span style="color:#5e5e5e;">I/0接口：</span>
                    <a href="javascript:;" id="a43">HDMI接口</a>
                    <a href="javascript:;" id="a44">Type-C接口</a>
                    <a href="javascript:;" id="a45">DisplayPort接口</a>
                    <a href="javascript:;" id="a46">DVI接口</a>
                    <a href="javascript:;" id="a47">VGA接口</a>
                    <a href="javascript:;" id="a48">Mini-DP接口</a>
                </li>


            </ul>
        </div>
    </div>
    <div class="row">
        <iframe  src="${pageContext.request.contextPath}/getXianAll" width="100%" id="xianList" name="xianList" frameborder="0" scrolling="no" onload="this.height=xianList.document.body.scrollHeight">

        </iframe>
    </div>
</div>
</body>
</html>
