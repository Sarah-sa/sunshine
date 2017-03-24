<html>
<head>

<title>座席人员信息管理</title>
<#include "/WEB-INF/views/ftl/head.ftl">
<script type="text/javascript" src="/uicomponent/laypage/laypage.js"></script>
</head> 
 
<body>
  
  <div class="main">	
<div id="app"> 
			<form class="sui-form form-horizontal" id="search"
				action="/staff/getlike" method="get" >
				<table class="sui-table">
					<tr><td>
					 座席姓名：<input type="text" placeholder="请输入座席姓名" class="input-fat" name="username"/> 
					 &nbsp;&nbsp;&nbsp;&nbsp;
					 性别：
					 <input type="radio" name="gender" value="0" <#if
							gender == 0>checked</#if>  />男&nbsp; 
							<input type="radio" name="gender" value="1"  <#if
							gender == 1>checked</#if> />女&nbsp;
							<input type="radio" name="gender" value=""/ >全部&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;			 
					 在职状态： 
				 <input type="radio" name="status" value="0" <#if
							status == 0>checked</#if> />在职&nbsp; 
							<input type="radio" name="status" value="1" 
							<#if status == 1>checked</#if>  />离职&nbsp;
							<input type="radio" name="status" value=""/ checked="checked">全部&nbsp; 
					 </td></tr>
					<tr><input type="hidden" id="pageNum" name="pageNum" /> <input
							type="hidden" id="pageSize" name="pageSize" />  
							<input
							type="button" class="sui-btn btn-xlarge btn-primary" value="查询" onclick="findStaffInfo()" /> 
						 <button type="button" class="sui-btn btn-xlarge btn-success" onclick="add()">增加座席人员信息</button></td>
					</tr>
					<tr> 社区名： 		
					 <select name="communityName" id="communityName"
							    onclick="lookfor()">   <#if name ??>
								<option value="${name}" selected>${name}</option></#if>
								<option value="">全部</option>
								<option v-for="item in result" v-bind:value="item.name">{{item.name}}</option> 
						</select> 
					</tr>
				</table>	 
			</form>
			</div>
	<table class="sui-table table-zebra">
		<thead>
			<tr align="right">
				<th>照片</th>
				<th>姓名</th>
				<th>昵称</th>
				<th>地址</th>
				<th>手机</th> 
				<th>Email</th> 
				<th>生日 </th>
				<th>操作 </th>
			</tr>
		</thead>
		<tbody>		
	 <#if pageResult??> <#list pageResult.list as map>
		      <tr>
		        <td>${map.photo}</td>
		        <td>${map.username}</td>
                <td>${map.nickname}</td>
                <td>${map.address}</td>
                <td>${map.phone}</td>
                <td>${map.email}</td>
                <td>${map.birthday?string("yyyy-MM-dd")}</td>   
                <td><button onclick=editEven('${map["id"]}') class="sui-btn btn-bordered btn-small btn-warning">编辑</button>&nbsp;&nbsp;
						<button onclick=showlook('${map["id"]}') class="sui-btn btn-bordered btn-small btn-info";>查看</button>&nbsp;&nbsp;
						<button onclick=delEven('${map["id"]}') class="sui-btn btn-bordered btn-small btn-danger";>删除</button></td>
              </tr></#list></#if>      
		</tbody>
		 
	</table>
	  
    <div id="pagenav">
    <input type="hidden" id="totalPages" value="${pageResult.pages}">
     
		</div> </div>	
		
  <!--<#include "/newfoot.html"> -->
</body>
<script> //采用vue事件处理器

    var app = new Vue({
    el : '#app',
    data : {
        result : []
    }
});   
 
 

 //分页 
 laypage({
  cont: 'pagenav', //容器。值支持id名、原生dom对象，jquery对象,
  pages: 4, //总页数
  first:true,
  last:true,
  skin: '#AF0000',
  skip:true,
  curr:function(){ //通过url获取当前页，也可以同上（pages）方式获取
	    var page = location.search.match(/page=(\d+)/);
	    return page ? page[1] : 1;
	  }(),   
	  jump: function(obj,first){ //触发分页后的回调
		    if(!first){ //一定要加此判断，否则初始时会无限刷新		     
		//    	$("#pageNum").val(obj.curr);
                $("#pageSize").val(3);
                $("#pageNum").val(obj.curr);
                findStaffInfo(obj.curr)
		    }
	  }
	  });                         

//查询座席人员信息提交事件
function findStaffInfo(curr){
	$("#search").submit();
};

//获取下拉框中所有的社区名的集合
function lookfor(){
    $.ajax({
        type : "get",
        url : "/staff/forcommunityname",
        dataType:"json",
        success : function(msg){
        	app.result = msg ;
        },
        error:function(){
        	console.log("出错了");
        }
    })
};
 

//编辑用户事件
function editEven(id) {

	 layer.open({
	        type : 2,
	        title : '编辑用户',
	        fix : false,
	        move : true,
	        fixed :false,
	        maxmin : true,
	        anim:2,
	        shadeClose : false,
	        area : [ '600px', '350px' ],
	        content : '/staff/preupdate?id='+id,
	        end : function() {
	        	findStaffInfo();
	        }
	 }); 
	};
   

//查看单个座席人员详细信息
function showlook(id) {
    layer.open({
        type : 2,
        title : '查看用户详细信息',
        fix : false,
        maxmin : true,
        shadeClose : true,
        area : [ '900px', '540px' ],
        content : '/staff/preupdate?id='+id,
        end : function() {
        	findStaffInfo();
        }
    });
};

//删除事件
function delEven(id){
	//询问框
	layer.confirm("确定删除该座席信息？",{
			btn:[ '是', '否' ]},//按钮
			function(){//‘是’
				$.ajax({
				    type:'get',
					url:'/staff/del',
					data:{
						"id":id
					},
					success:function(){
						findStaffInfo();
						layer.msg('已成功删除记录',{icon:5});
						
					}
				});
				  
	},function(){
       //否 
    });
}


 </script>










</html>