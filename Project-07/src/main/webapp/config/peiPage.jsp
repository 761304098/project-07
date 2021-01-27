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
</head>
<body>
       <div class="container-fluid">
             <div class="row">
                      <h3 class="text-left text-info" style="margin-bottom: 2%">热门配置排行榜</h3>
             </div>
             <div class="row">
                   <div class="col-xs-4">
                       <div class="panel panel-info ">
                           <div class="panel-heading text-left"><strong><span style="color: red">最受关注</span> 网友配置排行</strong></div>

                           <div class="list-group">
                               <button type="button" class="list-group-item">Cras justo odio</button>
                               <button type="button" class="list-group-item">Dapibus ac facilisis in</button>
                               <button type="button" class="list-group-item">Morbi leo risus</button>
                               <button type="button" class="list-group-item">Porta ac consectetur ac</button>
                               <button type="button" class="list-group-item">Vestibulum at eros</button>
                           </div>
                       </div>
                   </div>
             </div>
       </div>
</body>
</html>
