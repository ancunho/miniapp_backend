<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <title>后台首页 - </title>
    <%@include file="../admin_include/adminHtml.jsp"%>
</head>
<body>
<!-- header start -->
<div id="header">
    <%@include file="../admin_include/adminHeader.jsp"%>
</div>
<!-- //header end -->

<!-- container start -->
<div id="container">
    <form class="form-signin">
        <h2 class="form-signin-heading">Please sign in</h2>
        <label for="USERNAME" class="sr-only">USERNAME</label>
        <input type="email" id="USERNAME" class="form-control" placeholder="USERNAME" required="" autofocus="">
        <label for="PASSWORD" class="sr-only">Password</label>
        <input type="password" id="PASSWORD" class="form-control" placeholder="Password" required="">
        <div class="checkbox">
            <label>
                <input type="checkbox" value="remember-me"> Remember me
            </label>
        </div>
        <a class="btn btn-lg btn-primary btn-block" id="btnLogin">Sign in</a>
    </form>
</div>
<!-- //container end -->

<!-- footer start -->
<div id="footer">
    <%@include file="../admin_include/adminFooter.jsp"%>
</div>
<!-- //footer end -->
<script type="text/javascript">
    $(document).ready(function(){
        $("#btnLogin").unbind('click').click(function(){
            var param = {
                username : $("#USERNAME").val()
                ,password : $("#PASSWORD").val()
            };

            if (param.username == '') {
                alert("用户名不能为空");
                return;
            }
            if (param.password == '') {
                alert("密码不能为空");
                return;
            }

            $.ajax({
                type : 'POST'
                ,url : contextRootPath + '/user/login.do'
                ,data : param
                ,dataType : 'json'
                ,success : function(response){
                    console.log(response);
                    if (response.status == 1) {
                        alert(response.msg);
                    } else if (response.status == 0) {
                        var $frmCommon = $("#frmSPCICommon");
                        if ($frmCommon.length < 1) {
                            $frmCommon = $("<form/>").attr({id:"frmCunhoCommon", method:'POST'});
                            $(document.body).append($frmCommon);
                        }
                        $frmCommon.empty();
                        $frmCommon.attr('target', '_self');
                        $frmCommon.attr('action', contextRootPath + '/manage/category/list.do');

                        $frmCommon.submit();
                    }
                }
                ,error : function(){

                }
            });


        });

    });
</script>
</body>
</html>