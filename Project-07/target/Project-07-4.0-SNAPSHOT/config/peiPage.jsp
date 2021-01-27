<%--
  Created by IntelliJ IDEA.
  User: Sun
  Date: 2021/1/24
  Time: 16:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="${pageContext.request.contextPath}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet"/>
    <script src="${pageContext.request.contextPath}/static/jq/jquery-3.4.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
    <style>
        #listGroup div,#listGroup1 div,#listGroup2 div{
            padding: 0;
        }

    </style>
    <script type="text/javascript">
         $(function (){
              $("#listGroup a,#listGroup1 a,#listGroup2 a").hover(function (){
                 $(this).css("color","red");
              },function (){
                  $(this).css("color","#666");
              })
         })
    </script>
</head>
<body>
       <div class="container-fluid">
             <div class="row">
                      <h3 class="text-left text-info" style="margin-bottom: 2%">配置类型排行榜</h3>
             </div>
             <div class="row" >
                   <div class="col-xs-4">
                       <div class="panel panel-info ">
                           <div class="panel-heading text-left"><strong><span style="color: red">经济实惠型</span> 网友配置排行</strong></div>
                           <ul class="list-group"   id="listGroup">

                               <li class="list-group-item" >
                                   <div class="row">
                                       <div class="col-xs-1 text-center" style="background-color: #34a6e5;color: white">1</div>
                                       <div class="col-xs-8 text-left"><a href="../message/m1/m1.html" style="color:#666;">自己游戏使用（锐龙3代）</a></div>
                                       <div class="col-xs-3 text-right" style="color:#999">￥5991</div>
                                   </div>
                               </li>

                               <li class="list-group-item" >
                                   <div class="row">
                                       <div class="col-xs-1 text-center" style="background-color: #34a6e5;color: white">2</div>
                                       <div class="col-xs-8 text-left"><a href="../message/m2/m2.html" style="color:#666;">10代酷睿发烧主流主机</a></div>
                                       <div class="col-xs-3 text-right" style="color:#999">￥6790</div>
                                   </div>
                               </li>
                               <li class="list-group-item" >
                                   <div class="row">
                                       <div class="col-xs-1 text-center" style="background-color: #34a6e5;color: white">3</div>
                                       <div class="col-xs-8 text-left"><a href="../message/m3/m3.html" style="color:#666;">5000游戏品质</a></div>
                                       <div class="col-xs-3 text-right" style="color:#999">￥5786</div>
                                   </div>
                               </li>
                               <li class="list-group-item" >
                                   <div class="row">
                                       <div class="col-xs-1 text-center" style="background-color: #e6e6e6;color: #666">4</div>
                                       <div class="col-xs-8 text-left"><a href="../message/m4/m4.html" style="color:#666;">LOL经济实惠型配置</a></div>
                                       <div class="col-xs-3 text-right" style="color:#999">￥4613</div>
                                   </div>
                               </li>
                               <li class="list-group-item" >
                                   <div class="row">
                                       <div class="col-xs-1 text-center" style="background-color: #e6e6e6;color: #666">5</div>
                                       <div class="col-xs-8 text-left"><a href="../message/m5/m5.html" style="color:#666;">办公电脑</a></div>
                                       <div class="col-xs-3 text-right" style="color:#999">￥3390</div>
                                   </div>
                               </li>
                               <li class="list-group-item" >
                                   <div class="row">
                                       <div class="col-xs-1 text-center" style="background-color: #e6e6e6;color: #666">6</div>
                                       <div class="col-xs-8 text-left"><a href="../message/m6/m6.html" style="color:#666;">经典吃鸡配置</a></div>
                                       <div class="col-xs-3 text-right" style="color:#999">￥3472</div>
                                   </div>
                               </li>
                               <li class="list-group-item" >
                                   <div class="row">
                                       <div class="col-xs-1 text-center" style="background-color: #e6e6e6;color: #666">7</div>
                                       <div class="col-xs-8 text-left"><a href="../message/m7/m7.html" style="color:#666;">便宜经济实惠</a></div>
                                       <div class="col-xs-3 text-right" style="color:#999">￥3302</div>
                                   </div>
                               </li>
                               <li class="list-group-item" >
                                   <div class="row">
                                       <div class="col-xs-1 text-center" style="background-color: #e6e6e6;color: #666">8</div>
                                       <div class="col-xs-8 text-left"><a href="../message/m8/m8.html" style="color:#666;">经济办公</a></div>
                                       <div class="col-xs-3 text-right" style="color:#999">￥3122</div>
                                   </div>
                               </li>
                               <li class="list-group-item" >
                                   <div class="row">
                                       <div class="col-xs-1 text-center" style="background-color: #e6e6e6;color: #666">9</div>
                                       <div class="col-xs-8 text-left"><a href="../message/m9/m9.html" style="color:#666;">经济实惠值得拥有</a></div>
                                       <div class="col-xs-3 text-right" style="color:#999">￥2991</div>
                                   </div>
                               </li>
                               <li class="list-group-item" >
                                   <div class="row">
                                       <div class="col-xs-1 text-center" style="background-color: #e6e6e6;color: #666">10</div>
                                       <div class="col-xs-8 text-left"><a href="../message/m10/m10.html" style="color:#666;">2021 入门配置畅玩LOL</a></div>
                                       <div class="col-xs-3 text-right" style="color:#999">￥4567</div>
                                   </div>
                               </li>
                           </ul>

                       </div>
                   </div>
                 <div class="col-xs-4">
                     <div class="panel panel-info ">
                         <div class="panel-heading text-left"><strong><span style="color: red">家用学习型</span> 网友配置排行</strong></div>
                         <ul class="list-group"   id="listGroup1">

                             <li class="list-group-item" >
                                 <div class="row">
                                     <div class="col-xs-1 text-center" style="background-color: #34a6e5;color: white">1</div>
                                     <div class="col-xs-8 text-left"><a href="../message/m11/m11.html" style="color:#666;">家人日常使用（Intel 10代）</a></div>
                                     <div class="col-xs-3 text-right" style="color:#999">￥2559</div>
                                 </div>
                             </li>

                             <li class="list-group-item" >
                                 <div class="row">
                                     <div class="col-xs-1 text-center" style="background-color: #34a6e5;color: white">2</div>
                                     <div class="col-xs-8 text-left"><a href="../message/m12/m12.html" style="color:#666;">家人日常使用（APU）</a></div>
                                     <div class="col-xs-3 text-right" style="color:#999">￥2311</div>
                                 </div>
                             </li>
                             <li class="list-group-item" >
                                 <div class="row">
                                     <div class="col-xs-1 text-center" style="background-color: #34a6e5;color: white">3</div>
                                     <div class="col-xs-8 text-left"><a href="../message/m13/m13.html" style="color:#666;">低端家用电脑</a></div>
                                     <div class="col-xs-3 text-right" style="color:#999">￥3136</div>
                                 </div>
                             </li>
                             <li class="list-group-item" >
                                 <div class="row">
                                     <div class="col-xs-1 text-center" style="background-color: #e6e6e6;color: #666">4</div>
                                     <div class="col-xs-8 text-left"><a href="../message/m14/m14.html" style="color:#666;">普通家庭电脑</a></div>
                                     <div class="col-xs-3 text-right" style="color:#999">￥5380</div>
                                 </div>
                             </li>
                             <li class="list-group-item" >
                                 <div class="row">
                                     <div class="col-xs-1 text-center" style="background-color: #e6e6e6;color: #666">5</div>
                                     <div class="col-xs-8 text-left"><a href="../message/m15/m15.html" style="color:#666;">一万块内基本无敌</a></div>
                                     <div class="col-xs-3 text-right" style="color:#999">￥10312</div>
                                 </div>
                             </li>
                             <li class="list-group-item" >
                                 <div class="row">
                                     <div class="col-xs-1 text-center" style="background-color: #e6e6e6;color: #666">6</div>
                                     <div class="col-xs-8 text-left"><a href="../message/m16/m16.html" style="color:#666;">5000块、看看怎么样？</a></div>
                                     <div class="col-xs-3 text-right" style="color:#999">￥4690</div>
                                 </div>
                             </li>
                             <li class="list-group-item" >
                                 <div class="row">
                                     <div class="col-xs-1 text-center" style="background-color: #e6e6e6;color: #666">7</div>
                                     <div class="col-xs-8 text-left"><a href="../message/m17/m17.html" style="color:#666;">itx小电脑</a></div>
                                     <div class="col-xs-3 text-right" style="color:#999">￥3753</div>
                                 </div>
                             </li>
                             <li class="list-group-item" >
                                 <div class="row">
                                     <div class="col-xs-1 text-center" style="background-color: #e6e6e6;color: #666">8</div>
                                     <div class="col-xs-8 text-left"><a href="../message/m18/m18.html" style="color:#666;">家用游戏入门</a></div>
                                     <div class="col-xs-3 text-right" style="color:#999">￥8968</div>
                                 </div>
                             </li>
                             <li class="list-group-item" >
                                 <div class="row">
                                     <div class="col-xs-1 text-center" style="background-color: #e6e6e6;color: #666">9</div>
                                     <div class="col-xs-8 text-left"><a href="../message/m19/m19.html" style="color:#666;">好玩不贵</a></div>
                                     <div class="col-xs-3 text-right" style="color:#999">￥5617</div>
                                 </div>
                             </li>
                             <li class="list-group-item" >
                                 <div class="row">
                                     <div class="col-xs-1 text-center" style="background-color: #e6e6e6;color: #666">10</div>
                                     <div class="col-xs-8 text-left"><a href="../message/m20/m20.html" style="color:#666;">老王的炒股机</a></div>
                                     <div class="col-xs-3 text-right" style="color:#999">￥20821</div>
                                 </div>
                             </li>
                         </ul>

                     </div>
                 </div>
                 <div class="col-xs-4">
                     <div class="panel panel-info ">
                         <div class="panel-heading text-left"><strong><span style="color: red">网吧游戏型</span> 网友配置排行</strong></div>
                         <ul class="list-group"   id="listGroup2">

                             <li class="list-group-item" >
                                 <div class="row">
                                     <div class="col-xs-1 text-center" style="background-color: #34a6e5;color: white">1</div>
                                     <div class="col-xs-8 text-left"><a href="../message/m21/m21.html" style="color:#666;">经济实惠又有性能</a></div>
                                     <div class="col-xs-3 text-right" style="color:#999">￥7381</div>
                                 </div>
                             </li>

                             <li class="list-group-item" >
                                 <div class="row">
                                     <div class="col-xs-1 text-center" style="background-color: #34a6e5;color: white">2</div>
                                     <div class="col-xs-8 text-left"><a href="../message/m22/m22.html" style="color:#666;">全套8000元内的配置</a></div>
                                     <div class="col-xs-3 text-right" style="color:#999">￥7988</div>
                                 </div>
                             </li>
                             <li class="list-group-item" >
                                 <div class="row">
                                     <div class="col-xs-1 text-center" style="background-color: #34a6e5;color: white">3</div>
                                     <div class="col-xs-8 text-left"><a href="../message/m23/m23.html" style="color:#666;">元旦intel配置</a></div>
                                     <div class="col-xs-3 text-right" style="color:#999">￥3263</div>
                                 </div>
                             </li>
                             <li class="list-group-item" >
                                 <div class="row">
                                     <div class="col-xs-1 text-center" style="background-color: #e6e6e6;color: #666">4</div>
                                     <div class="col-xs-8 text-left"><a href="../message/m24/m24.html" style="color:#666;">直播联盟吃鸡</a></div>
                                     <div class="col-xs-3 text-right" style="color:#999">￥12971</div>
                                 </div>
                             </li>
                             <li class="list-group-item" >
                                 <div class="row">
                                     <div class="col-xs-1 text-center" style="background-color: #e6e6e6;color: #666">5</div>
                                     <div class="col-xs-8 text-left"><a href="../message/m25/m25.html" style="color:#666;">游戏代码两不误10600+2060</a></div>
                                     <div class="col-xs-3 text-right" style="color:#999">￥6691</div>
                                 </div>
                             </li>
                             <li class="list-group-item" >
                                 <div class="row">
                                     <div class="col-xs-1 text-center" style="background-color: #e6e6e6;color: #666">6</div>
                                     <div class="col-xs-8 text-left"><a href="../message/m26/m26.html" style="color:#666;">I3十代独立显卡M.2固态</a></div>
                                     <div class="col-xs-3 text-right" style="color:#999">￥2704</div>
                                 </div>
                             </li>
                             <li class="list-group-item" >
                                 <div class="row">
                                     <div class="col-xs-1 text-center" style="background-color: #e6e6e6;color: #666">7</div>
                                     <div class="col-xs-8 text-left"><a href="../message/m27/m27.html" style="color:#666;">元旦amd配置</a></div>
                                     <div class="col-xs-3 text-right" style="color:#999">￥3054</div>
                                 </div>
                             </li>
                             <li class="list-group-item" >
                                 <div class="row">
                                     <div class="col-xs-1 text-center" style="background-color: #e6e6e6;color: #666">8</div>
                                     <div class="col-xs-8 text-left"><a href="../message/m28/m28.html" style="color:#666;">游戏主机方案</a></div>
                                     <div class="col-xs-3 text-right" style="color:#999">￥8666</div>
                                 </div>
                             </li>
                             <li class="list-group-item" >
                                 <div class="row">
                                     <div class="col-xs-1 text-center" style="background-color: #e6e6e6;color: #666">9</div>
                                     <div class="col-xs-8 text-left"><a href="../message/m29/m29.html" style="color:#666;">自用配置单</a></div>
                                     <div class="col-xs-3 text-right" style="color:#999">￥3040</div>
                                 </div>
                             </li>
                             <li class="list-group-item" >
                                 <div class="row">
                                     <div class="col-xs-1 text-center" style="background-color: #e6e6e6;color: #666">10</div>
                                     <div class="col-xs-8 text-left"><a href="../message/m30/m30.html" style="color:#666;">自己配着玩</a></div>
                                     <div class="col-xs-3 text-right" style="color:#999">￥7114</div>
                                 </div>
                             </li>
                         </ul>

                     </div>
                 </div>
             </div>
       </div>
 </body>
</html>
