<html>
<head>
<title>走访关怀记录</title>
 <#include "/WEB-INF/views/ftl/head.ftl">
 <link rel="stylesheet" type="text/css" href="/css/sui-append.min.css">
</head>
<body>
    <div style='text-align:center;'>
    <form class="sui-form form-horizontal">
        <table class="sui-table table-sideheader" style='margin:0px auto;'>
      <tbody>
      <#if editOne??> 
    <#list editOne as one>
        <tr>
          <th>老人信息：</th>
          <td><input type="hidden" value="${one['id'] }" id="visitid"/>
            姓名：${one["name"] }
          </td>
          <td>电话：${one["phone"] }</td>
          <td>地址：${one["address"] }</td>
        </tr>
        <tr>
          <th>发起情况：</th>
          <td>发起人：${one["nickname"] }</td>
          <td>提议时间：${one["create_time"]?string("yyyy-MM-dd") }</td>
          <td>执行与否：              
          <input name="status" type="radio" value="${one['status'] }" <#if one["status"] == true>checked</#if> />已走访&nbsp;&nbsp;</li>
          <input name="status" type="radio" value="${one['status'] }" <#if one["status"] == false>checked</#if> />尚未走访</li>
        </td>
        </tr>
        <tr>
          <th>走访时间：</th>
          <td colspan="2">计划走访时间：${one["plan_time"]?string("yyyy-MM-dd") }</td>
          <td >实际走访时间：<div data-toggle="datepicker" class="control-group input-daterange">
          <div id="time1" class="controls">
          <input type="text" id="execTime"></div></div>
          </td>
          
        </tr>
        <tr>
          <th>走访结果：</th>
          <td colspan="3"><textarea id="content" style="width: 400px; height: 200px;"></textarea></td>
         
        </tr>
        <tr >
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
//实际走访时间的选择器
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
			url:"/visitrecord/editpage",
			data:{
				"id":$("#visitid").val(),
				"status":statusval,
				"execTime":$("#execTime").val(),
				"content":$("#content").val()				
			},
			success:function(msg){
				//alert("更新成功"+msg);
				$("#cancelBtn").click();
			},
			error:function(){
				alert("更新失败");
			}
		})
	})

</script>
</html>