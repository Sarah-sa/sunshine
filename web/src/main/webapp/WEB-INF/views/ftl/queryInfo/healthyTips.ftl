<html>
<head>
<title>信息查询</title>

  <link rel="stylesheet" href="/uicomponent/layui/css/layui.css">
<#include "/WEB-INF/views/ftl/head.ftl">
</head>
<body>
<#include "/oldhead.html">

  <div class="side_cen">
  <div id="app" class="container">
  
  <from action="" method="post">
   &nbsp;&nbsp;&nbsp;&nbsp; <button class="layui-btn  layui-btn-warm">搜索</button> &nbsp;&nbsp;&nbsp;&nbsp;
    <input type="text" name="name" style="height:30px" value="请输入内容" size="8px"/>
    </from>
    
    
  </div>   
 <br/>
    <ul class="sui-nav nav-tabs nav-large tab-vertical">
     <li>栏目导航 </li>
   		<tr class="active" v-for="(item,index) in result">
  <li class="active"><a href="" @click="showEvent(item.id)">{{item.name}}</a></li>  
        </tr> 
    </ul>
    	 
</div> 





		</tbody>
			 
		<div id="pagenav"></div>
		 
	 





 
<script >

var app = new Vue({
	el : '#app',
	data : {
		result : []
	}
});


//查询用户数据
var getUserPageList = function(curr) {
	$.ajax({
		type : "GET",
		dataType : "json",
		url : "/tips/gettips",
		data : {
			pageNum:curr || 1,
			pageSize:5,
			name:$("#tipsCatgyId").val()
		//向服务端传的参数，此处只是演示
		},
		success : function(msg) {
			app.result = msg.result;
			laypage({
				cont : 'pagenav', //容器。值支持id名、原生dom对象，jquery对象,
				pages : msg.totalPage, //总页数
				first : true,
				last : true,
				curr : curr || 1, //当前页
				jump : function(obj, first) { //触发分页后的回调
					if (!first) { //点击跳页触发函数自身，并传递当前页：obj.curr
						getUserPageList(obj.curr);
					}
				}
			});
		}
	});
}

getUserPageList();

</script>



 
    </div>
    <#include "/oldfoot.html">
</body>

</html>