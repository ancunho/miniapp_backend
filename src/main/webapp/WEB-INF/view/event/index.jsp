<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <title>Event</title>
    <%@include file="../portal_include/portalHtml.jsp"%>
</head>
<body>
<!-- header start -->
<div id="header">
    <%@include file="../portal_include/portalHeader.jsp"%>
</div>
<!-- //header end -->

<!-- container start -->
<div id="container">
    <input type="text" value="" class="TITLE" />
    <input type="text" value="" class="DESCRIPTION" />
    <input type="text" value="" class="ADDRESS" />

    <a class="btnSubmit">提交</a>

</div>
<!-- //container end -->

<!-- footer start -->
<div id="footer">
    <%@include file="../portal_include/portalFooter.jsp"%>
</div>
<!-- //footer end -->

<script type="text/javascript">
    document.ready(function () {
        alert("asdfasdf");
    });
</script>

</body>
</html>