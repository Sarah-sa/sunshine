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
     所属社区：
 <#if theone??>  <#list theone as one>
       <tr>
	 <th>座席昵称：</th>  
	    <td><input type="text" class="form-control" id="nickname" name="nickname" value="${one.nickname}" ></td> &nbsp;&nbsp;&nbsp;&nbsp;
		<th> 座席生日：</th><td> <input type="text" data-toggle="datepicker" value="${one.birthday}"> </td>
		</tr>
		<tr>
	    <th> 座席性别：</th>  
	    <td><input type="text"  name="gender" value="${(one.gender==true)?string('男','女')}"></td>
		<th> 座席地址：</th>
		 <td><input type="text" class="form-control" id="address" name="address" value="${one.address}"> </td>
		 </tr>
		 <tr>
	     <th> 座席手机：</th>
		 <td><input type="text" class="form-control" id="photo" name="phone" value="${one.phone}" ></td>
		 <th>Email：</th>
		 <td><input type="text" class="form-control" id="email" name="email" value="${one.email}" ></td> </tr> 
		  <tr>
	     <th>在职状态：</th>
		 <td><input type="text"  name="status" value="${(one.status==true)?string('在职','已离职')}"></td>
		 <th>头像：</th>
		 <td><input type="text" class="form-control" id="" name="email" value="${one.photo}" ></td> </tr> 
         </#list>
           </#if> 
		 </table>
		   <button type="button" id="saveBtn"   class="sui-btn btn-xlarge btn-primary">提交</button>&nbsp;&nbsp;&nbsp;&nbsp;
		  <button type="button" id="cancelBtn" class="sui-btn btn-xlarge btn-success">取消</button>
		</form></div>
</body>
<script>
var editStaffInfoForm = function(){
	if(!check().form()){ 
		return;  
	}
	$.ajax({
		   type: "GET",
		   dataType: "json",
		   url: "/staff/edit",
		   data: {
				"id": ${data.id},
				"name": $("#nickname").val(),
				"address":$("#address").val()
		   },
		   success: function(msg){
			 			
		   }
	});
}

 
 
});


//校验字段是否正确 
function check(){ 
    /*返回一个validate对象，这个对象有一个form方法，返回的是是否通过验证*/ 
    return $("#editStaffInfoForm").validate({ 
                rules:{ 
                	nickname:{ 
                        required:true
                    },
                    address:{ 
                        required:true                                   
                    },
                    photo:{
                    	required:true 
                    }
                    
                }, 
                messages:{ 
                	nickname:{ 
                        required:""
                    },
                    address:{ 
                        required:""                                
                    },
                    photo:{ 
                        required:""                                
                    } 
                    
                }     
            }); 
} 

	</script>

</html>