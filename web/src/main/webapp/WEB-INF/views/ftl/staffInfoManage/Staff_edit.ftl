<html>
<head>
<title>编辑座席人员信息</title>
 <#include "/WEB-INF/views/ftl/head.ftl">
 <style>
		input.error{
			border: 1px solid #E6594E;
		}
	</style>
</head>
<body>
<div style='text-align:center;'>
<form class="sui-form form-horizontal">
<table class="sui-table table-sideheader" style='margin:0px auto;'>
     <#if theone??> 
    <#list theone as one>
       <tr>
	 <th>座席昵称：</th>  
	
	    <td><input type="text" class="form-control" id="nickname" name="nickname"  value="${one.nickname}" ></td> &nbsp;&nbsp;&nbsp;&nbsp;
		<th> 座席生日：</th><td> <input type="text" data-toggle="datepicker" id="birthday" value="${one.birthday}"> </td>
		</tr>
		<tr>
	    <th> 座席性别：</th>  
	    <td> <input type="radio" name="gender" value="0" id="gender" <#if one["gender"] == false>checked</#if>/>男&nbsp; 
							<input type="radio" name="gender" value="1"  id="gender"  <#if one["gender"] == true>checked</#if>/>女&nbsp;</td>
		<th> 座席地址：</th>
		 <td><input type="text" class="form-control" id="address" name="address" value="${one.address}"> </td>
		 </tr>
		 <tr>
	     <th> 座席手机：</th>
		 <td><input type="text" class="form-control" id="phone" name="phone" value="${one.phone}" ></td>
		 <th>Email：</th>
		 <td><input type="text" class="form-control" id="email" name="email" value="${one.email}" ></td> </tr> 
		  <tr>
	     <th>在职状态：</th>
		   <td> <input type="radio" name="status" value="0"<#if one["status"] == true>checked</#if> />在职&nbsp; 
							<input type="radio" name="status" value="1"<#if one["status"] == false>checked</#if> />离职 </td>
		 <th>头像：</th>
		 <td><input type="text" class="form-control" id="photo" name="email" value="${one.photo}" ></td> </tr> 
		 <input type="hidden" id="id" value=" ${one.id}"/> 
        </#list></#if> 
		 </table>
		   <button type="button" id="saveBtn"  class="sui-btn btn-xlarge btn-primary">提交</button>&nbsp;&nbsp;&nbsp;&nbsp;
		  <button type="button" id="cancelBtn" class="sui-btn btn-xlarge btn-success">取消</button>
		</form></div>
</body>
<script>
 
	
	 $("#saveBtn").on('click',function(){
	//获取处理状态和性别单选框的选中的值；
    var statuschecked=document.getElementsByName("status");
    var statusval = null;
    for(var i=0;i<statuschecked.length;i++){
        if(statuschecked[i].checked==true){
            statusval=statuschecked[i].value;
        }
    };  
    
    var radiochecked=document.getElementsByName("gender");
    var genderval = null;
    for(var i=0;i<radiochecked.length;i++){
        if(radiochecked[i].checked==true){
        	genderval=radiochecked[i].value;
        }
    };  
    
	//提交修改按钮
	$.ajax({
		   type: "get",
		   url: "/staff/edit",
		   parameterType:"json",
		   data: {
				"id":$("#id").val(),
				"nickname": $("#nickname").val(),
				"address":$("#address").val(),
				"gender":genderval,
				"birthday":$("#birthday").val(),
				"phone":$("#phone").val(),
				"email": $("#email").val(),
				"photo":$("#photo").val(),
				"status":statusval
		   },
		    success: function(msg){ 	
			   if(msg!=0){
				 $("#cancelBtn").click();  
			   }else{
				   alter("更新失败"+mag);
			   }
		   },
		   error:function(){
			   alert("错误：更新失败");
		   }
	}) 
    });
	//取消按钮
	  //取消按钮
        $("#cancelBtn").on('click',function(){
            var index = parent.layer.getFrameIndex(window.name);
            parent.layer.close(index);
            })




	</script>

</html>