<%--
  Created by IntelliJ IDEA.
  User: Sun
  Date: 2021/1/5
  Time: 14:42
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
                  $("#cpuList").attr("src","${pageContext.request.contextPath}/getCpuBrandForIntel")
              })
              $("#a2").click(function (){
                  $("#cpuList").attr("src","${pageContext.request.contextPath}/getCpuBrandForAmd")
              })
              $("#a3").click(function (){
                  $("#cpuList").attr("src","${pageContext.request.contextPath}/getCpuPrice1")
              })
              $("#a4").click(function (){
                  $("#cpuList").attr("src","${pageContext.request.contextPath}/getCpuPrice2")
              })
              $("#a5").click(function (){
                  $("#cpuList").attr("src","${pageContext.request.contextPath}/getCpuPrice3")
              })
              $("#a6").click(function (){
                  $("#cpuList").attr("src","${pageContext.request.contextPath}/getCpuBrandForIntel")
              })
              $("#a7").click(function (){
                  $("#cpuList").attr("src","${pageContext.request.contextPath}/getCpuSeriesFori9")
              })
              $("#a8").click(function (){
                  $("#cpuList").attr("src","${pageContext.request.contextPath}/getCpuSeriesFori5")
              })
              $("#a9").click(function (){
                  $("#cpuList").attr("src","${pageContext.request.contextPath}/getCpuSeriesFori3")
              })
              $("#a10").click(function (){
                  $("#cpuList").attr("src","${pageContext.request.contextPath}/getCpuSeriesForBen")
              })
              $("#a11").click(function (){
                  $("#cpuList").attr("src","${pageContext.request.contextPath}/getCpuSeriesForSai")
              })
              $("#a12").click(function (){
                  $("#cpuList").attr("src","${pageContext.request.contextPath}/getCpuSeriesForXE")
              })
              $("#a13").click(function (){
                  $("#cpuList").attr("src","${pageContext.request.contextPath}/getCpuBrandForAmd")
              })
              $("#a14").click(function (){
                  $("#cpuList").attr("src","${pageContext.request.contextPath}/getCpuSeriesForRT")
              })
              $("#a15").click(function (){
                  $("#cpuList").attr("src","${pageContext.request.contextPath}/getCpuSeriesForR9")
              })
              $("#a16").click(function (){
                  $("#cpuList").attr("src","${pageContext.request.contextPath}/getCpuSeriesForR7")
              })
              $("#a17").click(function (){
                  $("#cpuList").attr("src","${pageContext.request.contextPath}/getCpuSeriesForR5")
              })
              $("#a18").click(function (){
                  $("#cpuList").attr("src","${pageContext.request.contextPath}/getCpuSeriesForR3")
              })
              $("#a19").click(function (){
                  $("#cpuList").attr("src","${pageContext.request.contextPath}/getCpuSeriesForAPU")
              })
              $("#a20").click(function (){
                  $("#cpuList").attr("src","${pageContext.request.contextPath}/getCpuBrandForIntel")
              })
              $("#a21").click(function (){
                  $("#cpuList").attr("src","${pageContext.request.contextPath}/getCpuSlotForL1200")
              })
              $("#a22").click(function (){
                  $("#cpuList").attr("src","${pageContext.request.contextPath}/getCpuSlotForL2066")
              })
              $("#a23").click(function (){
                  $("#cpuList").attr("src","${pageContext.request.contextPath}/getCpuSlotForL1151")
              })
              $("#a24").click(function (){
                  $("#cpuList").attr("src","${pageContext.request.contextPath}/getCpuSlotForL1150")
              })
              $("#a25").click(function (){
                  $("#cpuList").attr("src","${pageContext.request.contextPath}/getCpuBrandForAmd")
              })
              $("#a26").click(function (){
                  $("#cpuList").attr("src","${pageContext.request.contextPath}/getCpuSlotForST4")
              })
              $("#a27").click(function (){
                  $("#cpuList").attr("src","${pageContext.request.contextPath}/getCpuSlotForSTX4")
              })
              $("#a28").click(function (){
                  $("#cpuList").attr("src","${pageContext.request.contextPath}/getCpuSlotForA4")
              })
              $("#a29").click(function (){
                  $("#cpuList").attr("src","${pageContext.request.contextPath}/getCpuSlotForF2")
              })
              $("#a30").click(function (){
                  $("#cpuList").attr("src","${pageContext.request.contextPath}/getCpuSlotForC16")
              })
              $("#a31").click(function (){
                  $("#cpuList").attr("src","${pageContext.request.contextPath}/getCpuSlotForC12")
              })
              $("#a32").click(function (){
                  $("#cpuList").attr("src","${pageContext.request.contextPath}/getCpuSlotForC10")
              })
              $("#a33").click(function (){
                  $("#cpuList").attr("src","${pageContext.request.contextPath}/getCpuSlotForC8")
              })
              $("#a34").click(function (){
                  $("#cpuList").attr("src","${pageContext.request.contextPath}/getCpuSlotForC6")
              })
              $("#a35").click(function (){
                  $("#cpuList").attr("src","${pageContext.request.contextPath}/getCpuSlotForC4")
              })
              $("#a36").click(function (){
                  $("#cpuList").attr("src","${pageContext.request.contextPath}/getCpuSlotForC2")
              })
          })
    </script>
</head>
<body>
        <div class="container-fluid">
                 <div class="row">
                     <div class="panel panel-default">
                         <div class="panel-heading"><strong>请选择<span style="color: deeppink">CPU</span></strong></div>
                          <ul class="list-unstyled list-group" style="margin-left:2% " id="liebiao">
                               <li class="list-group-item" >
                                   <span style="color:#5e5e5e;">推荐品牌：</span>
                                   <a href="javascript:;" id="a1" >Intel</a>
                                   <a href="javascript:;" id="a2" >AMD</a>
                               </li>
                              <li class="list-group-item">
                                  <span style="color:#5e5e5e;">价格区间：</span>
                                  <a href="javascript:;" id="a3">500元以下</a>
                                  <a href="javascript:;" id="a4">500-1499元</a>
                                  <a href="javascript:;" id="a5">1500元以上</a>
                              </li>
                              <li class="list-group-item">
                                  <span style="color:#5e5e5e;">CPU系列：</span>
                                  <a href="javascript:;" id="a6">Intel</a>
                                  (<a href="javascript:;" id="a7" style="margin-left: 0%">酷睿i9</a>
                                  <a href="javascript:;" id="a8">酷睿i5</a>
                                  <a href="javascript:;" id="a9">酷睿i3</a>
                                  <a href="javascript:;" id="a10">奔腾</a>
                                  <a href="javascript:;" id="a11">赛扬</a>
                                  <a href="javascript:;" id="a12">XeonE</a>)
                                  <a href="javascript:;" id="a13">AMD</a>
                                  (<a href="javascript:;" id="a14" style="margin-left: 0%">RyzenThreadripper</a>
                                  <a href="javascript:;" id="a15">Ryzen9</a>
                                  <a href="javascript:;" id="a16">Ryzen7</a>
                                  <a href="javascript:;" id="a17">Ryzen5</a>
                                  <a href="javascript:;" id="a18">Ryzen3</a>
                                  <a href="javascript:;" id="a19">APU</a>)

                              </li>
                              <li class="list-group-item">
                                  <span style="color:#5e5e5e;">插槽类型：</span>
                                  <a href="javascript:; " id="a20">Intel</a>
                                  (<a href="javascript:;" style="margin-left: 0%" id="a21">LGA1200</a>
                                  <a href="javascript:;" id="a22">LGA2066</a>
                                  <a href="javascript:;" id="a23">LGA1151</a>
                                  <a href="javascript:;" id="a24">LGA1150</a>
                                  <a href="javascript:;" id="a25">AMD</a>
                                  (<a href="javascript:;" style="margin-left: 0%" id="a26">SocketTR4</a>
                                  <a href="javascript:;" id="a27">SocketsTRX4</a>
                                  <a href="javascript:;" id="a28">SocketAM4</a>
                                  <a href="javascript:;" id="a29">SocketFM2+</a>)
                              </li>

                              <li class="list-group-item">
                                  <span style="color:#5e5e5e;">核心数量：</span>
                                  <a href="javascript:;" id="a30">十六核心</a>
                                  <a href="javascript:;" id="a31">十二核心</a>
                                  <a href="javascript:;" id="a32">十核心</a>
                                  <a href="javascript:;" id="a33">八核心</a>
                                  <a href="javascript:;" id="a34">六核心</a>
                                  <a href="javascript:;" id="a35">四核心</a>
                                  <a href="javascript:;" id="a36">双核心</a>
                              </li>


                          </ul>
                     </div>
                 </div>
                 <div class="row">
                     <iframe  src="${pageContext.request.contextPath}/getCpuAll" width="100%" id="cpuList" name="cpuList" frameborder="0" scrolling="no" onload="this.height=cpuList.document.body.scrollHeight">

                     </iframe>
                 </div>
        </div>
</body>
</html>
