<%--
  Created by IntelliJ IDEA.
  User: Sun
  Date: 2021/1/5
  Time: 12:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="${pageContext.request.contextPath}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet"/>
    <script src="${pageContext.request.contextPath}/static/jq/jquery-3.4.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
    <script type="text/javascript">
        $(function (){
            $("#listGroup li").click(function (){
                $(this).addClass("active");
                $(this).siblings().removeClass("active");
            })
          $("#listGroup li:eq(0)").click(function (){
                $("#cuanji").attr("src",'cpu.jsp')

          })
            $("#listGroup li:eq(1)").click(function (){
                $("#cuanji").attr("src",'zhuban.jsp')
            })
            $("#listGroup li:eq(2)").click(function (){
                $("#cuanji").attr("src",'nei.jsp')
            })
            $("#listGroup li:eq(3)").click(function (){
                $("#cuanji").attr("src",'ying.jsp')
            })
            $("#listGroup li:eq(4)").click(function (){
                $("#cuanji").attr("src",'gutai.jsp')
            })
            $("#listGroup li:eq(5)").click(function (){
                $("#cuanji").attr("src",'xian.jsp')
            })
            $("#listGroup li:eq(6)").click(function (){
                $("#cuanji").attr("src",'xianShi.jsp')
            })
            $("#listGroup li:eq(7)").click(function (){
                $("#cuanji").attr("src",'ji.jsp')
            })
            $("#listGroup li:eq(8)").click(function (){
                $("#cuanji").attr("src",'dian.jsp')
            })
            $("#listGroup li:eq(9)").click(function (){
                $("#cuanji").attr("src",'san.jsp')
            })
            $("#listGroup li:eq(10)").click(function (){
                $("#cuanji").attr("src",'shu.jsp')
            })
            $("#listGroup li:eq(11)").click(function (){
                $("#cuanji").attr("src",'jian.jsp')
            })
            $("#listGroup li:eq(12)").click(function (){
                $("#cuanji").attr("src",'yin.jsp')
            })
            $("#listGroup li:eq(13)").click(function (){
                $("#cuanji").attr("src",'guang.jsp')
            })
            $("#listGroup li:eq(14)").click(function (){
                $("#cuanji").attr("src",'sheng.jsp')
            })
            $("#listGroup li:eq(15)").click(function (){
                $("#cuanji").attr("src",'wang.jsp')
            })






            $("#listGroup li").click(function (){
             let span_now=$(this).children("div").children("div:last").children().text();
              //记录第几次点击
              let li_span =$(this).children("span").text();
              let li_span_copy=parseInt(li_span);
              let li_last =li_span_copy+=1;
              $(this).children("span").text(li_last);
              //------------------------------------------------
              if(li_last<=1){            //第一次点击时
                  let span2=$("#span2").text();
                  $("#num").text(span2);
              }
              if(li_last>1){                 //第二次及以上点击时
                  let span2=$("#span2").text();
                  let span_now_copy=span_now
                   if(span_now_copy=='添加'){
                       $("#num").text(span2)
                   }else{
                    let span_now_copy_num=  parseInt( span_now_copy.substring(1,span_now_copy.length)) ;
                       $("#num").text(span2-span_now_copy_num)

                   }
              }

          })
        })
    </script>
    <style>
       a{
           color: #444444;
       }
    </style>
</head>
<body>
  <span id="num" class="hidden">0</span>
<div class="container-fluid">
    <div class="row">
         <div class="col-sm-4" >
             <div class="row">
                 <div class="panel panel-info text-center">
                     <!-- Default panel contents -->
                     <div class="panel-heading"><strong>装机配置单</strong></div>
                  <%--   <div class="panel-body">
                         <p style="color: #8c8c8c">科普那些你不一定知道的硬件知识,不知道自己的文采怎么样,不过不管怎么样,总得试试才知道。用不专业的眼光看待硬件,带你跟我一起入坑</p>
                     </div>--%>

                     <!-- List group -->
                     <ul class="list-group" id="listGroup">

                         <li class="list-group-item active" >
                             <span  class="hidden">1</span>
                             <div class="row">
                                   <div class="col-sm-2 "><strong>CPU</strong></div>
                                   <div class="col-sm-6  col-sm-offset-1 "><span style="color: #9d9d9d" id="name1">请选择商品</span></div>
                                   <div class="col-sm-2 "><a href="cpu.jsp" target="cuanji" style="text-decoration: none" id="price1">添加</a></div>
                             </div>

                         </li>
                         <li class="list-group-item">
                             <span  class="hidden">0</span>
                             <div class="row">
                                 <div class="col-sm-2"><strong>主板</strong></div>
                                 <div class="col-sm-6 col-sm-offset-1 "><span style="color: #9d9d9d" id="name2">请选择商品</span></div>
                                 <div class="col-sm-2"><a href="zhuban.jsp" target="cuanji" style="text-decoration: none" id="price2">添加</a></div>
                             </div>

                         </li>
                         <li class="list-group-item">
                             <span  class="hidden">0</span>
                             <div class="row">
                                 <div class="col-sm-2"><strong>内存</strong></div>
                                 <div class="col-sm-6 col-sm-offset-1 "><span style="color: #9d9d9d" id="name3">请选择商品</span></div>
                                 <div class="col-sm-2  text-info"><a href="nei.jsp"  target="cuanji" style="text-decoration: none" id="price3">添加</a></div>
                             </div>

                         </li>
                         <li class="list-group-item">
                             <span  class="hidden">0</span>
                             <div class="row">
                                 <div class="col-sm-2"><strong>硬盘</strong></div>
                                 <div class="col-sm-6 col-sm-offset-1 "><span style="color: #9d9d9d" id="name4">请选择商品</span></div>
                                 <div class="col-sm-2   text-info"><a href="ying.jsp" target="cuanji" style="text-decoration: none" id="price4">添加</a></div>
                             </div>

                         </li>
                         <li class="list-group-item">
                             <span  class="hidden">0</span>
                             <div class="row">
                                 <div class="col-sm-2"><strong>固态硬盘</strong></div>
                                 <div class="col-sm-6 col-sm-offset-1 "><span style="color: #9d9d9d" id="name5">请选择商品</span></div>
                                 <div class="col-sm-2   text-info"><a href="gutai.jsp" target="cuanji" style="text-decoration: none" id="price5">添加</a></div>
                             </div>

                         </li>
                         <li class="list-group-item">
                             <span  class="hidden">0</span>
                             <div class="row">
                                 <div class="col-sm-2"><strong>显卡</strong></div>
                                 <div class="col-sm-6 col-sm-offset-1 "><span style="color: #9d9d9d" id="name6">请选择商品</span></div>
                                 <div class="col-sm-2  text-info"><a href="xian.jsp"  target="cuanji" style="text-decoration: none" id="price6">添加</a></div>
                             </div>

                         </li>
                         <li class="list-group-item">
                             <span  class="hidden">0</span>
                             <div class="row">
                                 <div class="col-sm-2"><strong>显示器</strong></div>
                                 <div class="col-sm-6 col-sm-offset-1 "><span style="color: #9d9d9d" id="name7">请选择商品</span></div>
                                 <div class="col-sm-2   text-info"><a href="xianShi.jsp" target="cuanji" style="text-decoration: none" id="price7">添加</a></div>
                             </div>

                         </li>
                         <li class="list-group-item">
                             <span  class="hidden">0</span>
                             <div class="row">
                                 <div class="col-sm-2"><strong>机箱</strong></div>
                                 <div class="col-sm-6 col-sm-offset-1 "><span style="color: #9d9d9d" id="name8">请选择商品</span></div>
                                 <div class="col-sm-2 text-info"><a href="ji.jsp" target="cuanji" style="text-decoration: none" id="price8">添加</a></div>
                             </div>

                         </li>
                         <li class="list-group-item">
                             <span  class="hidden">0</span>
                             <div class="row">
                                 <div class="col-sm-2"><strong>电源</strong></div>
                                 <div class="col-sm-6 col-sm-offset-1 "><span style="color: #9d9d9d" id="name9">请选择商品</span></div>
                                 <div class="col-sm-2  text-info"><a href="dian.jsp" target="cuanji" style="text-decoration: none" id="price9">添加</a></div>
                             </div>

                         </li>
                         <li class="list-group-item">
                             <span  class="hidden">0</span>
                             <div class="row">
                                 <div class="col-sm-2"><strong>散热器</strong></div>
                                 <div class="col-sm-6 col-sm-offset-1 "><span style="color: #9d9d9d" id="name10">请选择商品</span></div>
                                 <div class="col-sm-2   text-info"><a href="san.jsp" target="cuanji" style="text-decoration: none" id="price10">添加</a></div>
                             </div>

                         </li>
                         <li class="list-group-item">
                             <span  class="hidden">0</span>
                             <div class="row">
                                 <div class="col-sm-2"><strong>鼠标</strong></div>
                                 <div class="col-sm-6 col-sm-offset-1 "><span style="color: #9d9d9d" id="name11">请选择商品</span></div>
                                 <div class="col-sm-2  text-info"><a href="shu.jsp" target="cuanji" style="text-decoration: none" id="price11">添加</a></div>
                             </div>

                         </li>
                         <li class="list-group-item">
                             <span  class="hidden">0</span>
                             <div class="row">
                                 <div class="col-sm-2"><strong>键盘</strong></div>
                                 <div class="col-sm-6 col-sm-offset-1 "><span style="color: #9d9d9d" id="name12">请选择商品</span></div>
                                 <div class="col-sm-2 text-info"><a href="jian.jsp" target="cuanji" style="text-decoration: none" id="price12">添加</a></div>
                             </div>

                         </li>
                         <li class="list-group-item">
                             <span  class="hidden">0</span>
                             <div class="row">
                                 <div class="col-sm-2"><strong>音箱</strong></div>
                                 <div class="col-sm-6 col-sm-offset-1 "><span style="color: #9d9d9d" id="name13">请选择商品</span></div>
                                 <div class="col-sm-2   text-info"><a href="yin.jsp" target="cuanji" style="text-decoration: none" id="price13">添加</a></div>
                             </div>

                         </li>
                         <li class="list-group-item">
                             <span  class="hidden">0</span>
                             <div class="row">
                                 <div class="col-sm-2"><strong>光驱</strong></div>
                                 <div class="col-sm-6 col-sm-offset-1 "><span style="color: #9d9d9d" id="name14">请选择商品</span></div>
                                 <div class="col-sm-2   text-info"><a href="guang.jsp" target="cuanji" style="text-decoration: none" id="price14">添加</a></div>
                             </div>

                         </li>
                         <li class="list-group-item">
                             <span  class="hidden">0</span>
                             <div class="row">
                                 <div class="col-sm-2"><strong>声卡</strong></div>
                                 <div class="col-sm-6 col-sm-offset-1 "><span style="color: #9d9d9d" id="name15">请选择商品</span></div>
                                 <div class="col-sm-2  text-info"><a href="sheng.jsp" target="cuanji" style="text-decoration: none" id="price15">添加</a></div>
                             </div>

                         </li>

                         <li class="list-group-item">
                             <span  class="hidden">0</span>
                             <div class="row">
                                 <div class="col-sm-2"><strong>网卡</strong></div>
                                 <div class="col-sm-6 col-sm-offset-1 "><span style="color: #9d9d9d" id="name16">请选择商品</span></div>
                                 <div class="col-sm-2  text-info"><a href="wang.jsp" target="cuanji" style="text-decoration: none" id="price16">添加</a></div>
                             </div>

                         </li>
                     <%--    <li class="list-group-item">
                             <div class="row">
                                   <div class="text-left col-sm-6">
                                         共计<span id="span1">0</span>项
                                   </div>
                                   <div class="text-right col-sm-6" >
                                       合计：￥<span id="span2">0</span>
                                   </div>
                             </div>
                         </li>--%>
                     </ul>

                     <div class="panel-footer">
                         <div class="row">
                             <div class="text-left col-sm-6">
                                 共计 <span id="span1">0</span> 项
                             </div>
                             <div class="text-right col-sm-6" style="color: red">
                                  <span style="color: black"> 合计：</span>   ￥<span id="span2" >0</span>
                             </div>
                         </div>
                     </div>
                 </div>


             </div>
         </div>
         <div class="col-sm-8 " >
             <iframe  src="cpu.jsp" width="100%" id="cuanji" name="cuanji" frameborder="0" scrolling="no" onload="this.height=cuanji.document.body.scrollHeight">

             </iframe>
         </div>
    </div>
</div>
</body>
</html>
