<html>
<head>
<title>投诉处理</title>
 <#include "/WEB-INF/views/ftl/head.ftl">
 <link rel="stylesheet" type="text/css" href="/css/sui-append.min.css">
</head>
<body>
    <div style='text-align:center;'>
    <form class="sui-form form-horizontal">
        <table class="sui-table table-sideheader" style='margin:0px auto;'>
      <tbody>
      <#if theOne??> 
    <#list theOne as one>
        <tr>
          <th>被投诉的订单号：</th>
                <td>${one["orderId"] }</td>
                <th>被投诉的商家：</th>
                <td>${one["shopname"] }</td>
                <th>处理人：</th>
                <td><input type="text" id="staffId" value=${one["staffId"] } />
                    <input type="hidden" id="compid" value=${one["id"] }>
                </td>
        </tr>
        <tr>
        <th>投诉人：</th>
                <td>${one["username"] }</td>
                <th>投诉时间：</th>
                <td>${one["createTime"]?string("yyyy-MM-dd") }</td>
                <th>投诉内容：</th>
                <td>${one["content"] }</td>
        </tr>
        <tr>
            <th>处理状态</th>
             <td>              
          <input name="status" type="radio" value="1" <#if one["status"] == true>checked</#if> />已处理&nbsp;&nbsp;</li>
          <input name="status" type="radio" value="0" <#if one["status"] == false>checked</#if> />尚未处理</li>
        </td>
        
          <th>回访时间：</th>
          <td colspan="4">
          <#if one["visitTime"]??> 
          ${one["visitTime"]?string("yyyy-MM-dd") }
          <#else>          
          <div id="time1" class="controls">
          <input type="text" id="visitTime" name="visitTime"></div>
          </#if>
          </td>
          
        </tr>
        <tr>
          <th>回访结果：</th>
          <td colspan="5"><textarea id="visitResult" style="width: 400px; height: 200px;"></textarea></td>
         
        </tr>
        <tr >
            <td></td>
            <td></td>
            <td></td>
            <td></td>
          <td><button type="button" id="saveBtn" class="sui-btn btn-large btn-primary">提交</button></td>
          <td><input type="button" id="cancelBtn" class="sui-btn btn-large btn-info" value="取消"/></td>
        </tr>
        </#list> 
    </#if>
      </tbody>
    </table>
  </form>
  </div>
</body>
<script>
//处理时间的选择器
$('#time1 input').datepicker({
    size : "small"
});

        //取消按钮
        $("#cancelBtn").on('click',function(){
            var index = parent.layer.getFrameIndex(window.name);
            //parent.findrec();
            parent.layer.close(index);
            });
    //保存更改按钮
    $("#saveBtn").on('click',function(){
        //获取处理状态单选框的选中的值；
        var radiochecked=document.getElementsByName("status");
        var statusval = null;
        for(var i=0;i<radiochecked.length;i++){
            if(radiochecked[i].checked==true){
                statusval=radiochecked[i].value;
            }
        };  
        $.ajax({
            type:"get",
            url:"/complain/update",
            data:{
                "id":$("#compid").val(),
                "status":statusval,
                "staffId":$("#staffId").val(),
                "visitTime":$("#visitTime").val(),
                "visitResult":$("#visitResult").val()               
            },
            success:function(msg){                
                if(msg != 0){
                $("#cancelBtn").click();
                }else{
                  alert("更新失败"+msg);
                }
            },
            error:function(){
                alert("错误：更新失败");
            }
        })
    })

</script>
</html>