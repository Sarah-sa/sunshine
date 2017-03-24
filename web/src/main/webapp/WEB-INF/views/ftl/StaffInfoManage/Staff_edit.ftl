<html>
<head>
<title>编辑座席人员信息</title>
 <#include "/WEB-INF/views/ftl/head.ftl">
</head>
<body>

<form id="editStaffInfoForm">
<table class="sui-table table-bordered">  
		  <br/>
		  
		  <div class="form-group">
			<label for="userage">座席昵称：</label>
		  <input type="text" class="form-control" id="username" name="username" value="${data.name}" placeholder="输入名称"> 
		  </div>
		   <div class="form-group">
			<label for="userage">座席工号：</label>
		  <input type="text" class="form-control" id="username" name="username" value="${data.name}" placeholder="输入名称"> 
		  </div>
		   <div class="form-group">
			  座席生日： 
			 <form id="demo1" class="sui-form">  <input type="text"> </form>
		      $('#demo1 input').datepicker({size:"small"});
		  </div>
		  <div class="form-group">
			<label for="userage">座席性别：</label>
		  
		  </div>
		   <div class="form-group">
			<label for="userage">座席地址：</label>
		  <input type="text" class="form-control" id="username" name="username" value="${data.name}" placeholder="输入名称"> 
		  </div>
		  <div class="form-group">
			<label for="userage">座席头像：</label>
		  <input type="text" class="form-control" id="username" name="username" value="${data.name}" placeholder="输入名称"> 
		  </div>
		  <div class="form-group">
		  <button type="button" id="saveBtn" class="btn btn-success">提交</button>
		  <button type="button" id="cancelBtn" class="btn btn-default">取消</button>
		  </div>
		</form>

  <center>
  <tr><td>座席信息</td></tr>
  <table class="sui-table table-bordered">   
    <tr>
      <td><select name="elderName" id="elderName"
							onclick="lookfor()"> <#if name ??>
								<option value="${name}" selected>${name}</option></#if>
								<option value="">全部</option>
								<option v-for="item in result" v-bind:value="item.name">{{item.name}}</option>
						</select></td> <td>*座席头像</td> <td>  </td> </tr>
    <tr>
      <td>*座席工号</td>
      <td> </td>
      <td>座席昵称</td>
      <td> </td>
      <td>地址</td>
      <td> </td>
    </tr>
        <tr>
      <td>*性别</td>
      <td> </td>
      <td>生日</td>
      <td> </td>
      <td>是否在职</td>
      <td> </td>
    </tr>
 </table>
  </center>

</body>
 
<script>

		//编辑座席人员信息事件
		var editEvent = function(id) {
			layer.open({
				type : 2,
				title:"编辑座席信息页",
				fix : false,
				maxmin:true,
				area : [ '900px', '540px' ],
				shadeClose : false, //点击遮罩关闭
				content : ' 自定义内容 ',
				end:function(){
	                
	            }
			}); 		 
				 
		}
		
		//查看座席人员信息事件
		var showlook= function() {
			layer.open({
				type : 2,
				title:"查看座席信息页",
				fix : false,
				maxmin:true,
				area : [ '900px', '540px' ],
				shadeClose : false, //点击遮罩关闭
				content : ' 自定义内容 ',
				end:function(){
	                
	            }
			}); 		 
				 
		}
		
	 
	</script>




</html>