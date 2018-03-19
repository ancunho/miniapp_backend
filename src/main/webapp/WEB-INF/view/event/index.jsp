<%@ page contentType="text/html;charset=UTF-8"%>

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
    $(document).ready(function(){

        $(".btnSubmit").unbind('click').click(function(){
            var param = {
                TITLE : $(".TITLE").val()
                ,DESCRIPTION : $(".DESCRIPTION").val()
                ,ADDRESS : $(".ADDRESS").val()
            };
            console.log(param);
            $.ajax({
                type : 'POST'
                ,url : contextRootPath + '/wechat/api/event/save.do'
                ,dataType : 'json'
                ,data : param
                ,success : function(response){
                    console.log(response);
                }
                ,error : function(e){
                    console.log(e);
                }
            });
        });
    })
</script>

</body>
</html>