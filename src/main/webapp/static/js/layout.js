$(document).ready(function(){

//form submit common
// var attrArray = [['test1','test111111'],['test2','test22222']];
    // console.log(frmCommon('asdfasdf.do', attrArray));
function frmCommon(path, attrArray) {
    var $frmCommon = $("#frmSPCICommon");
    if ($frmCommon.length < 1) {
        $frmCommon = $("<form/>").attr({id:"frmCunhoCommon", method:'POST'});
        $(document.body).append($frmCommon);
    }
    $frmCommon.empty();
    $frmCommon.attr('target', '_blank');
    $frmCommon.attr('action', contextRootPath + path);

    if (attrArray.length > 0) {
        for (var i = 0; i < attrArray.length; i++) {
            $("<input>").attr({type:"hidden", name:attrArray[i][0], value: attrArray[i][1]}).appendTo($frmCommon);
        }
    }

    $frmCommon.submit();
}









});