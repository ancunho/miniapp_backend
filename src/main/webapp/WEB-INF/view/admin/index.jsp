<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<c:set var="ctx" value="/" />
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>后台首页</title>
<link href="${ctx}/static/css/bootstrap.min.css" rel="stylesheet">
<link href="${ctx}/static/css/bootstrap-theme.min.css" rel="stylesheet">
<link href="${ctx}/static/css/layout.css" rel="stylesheet">
<%--<script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>--%>
<%--<script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>--%>
</head>
<body>
<!-- header start -->
<div id="header">
    <%@include file="../admin_include/adminHeader.jsp"%>
</div>
<!-- //header end -->

<!-- container start -->
<div id="container">
    
</div>
<!-- //container end -->

<!-- footer start -->
<div id="footer">
    <%@include file="../admin_include/adminFooter.jsp"%>
</div>
<!-- //footer end -->

<script src="${ctx}/static/js/jquery.1.12.4.js"></script>
<script src="${ctx}/static/js/bootstrap.min.js"></script>
</body>
</html>