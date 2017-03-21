<html>
<head>
<title>投诉管理</title> <#include "/WEB-INF/views/ftl/head.ftl">
<script></script>
<script type="text/javascript" src="/uicomponent/laypage/laypage.js"></script>
<link rel="stylesheet" type="text/css" href="/css/sui-append.min.css">
</head>
<body>
	<#include "/oldhead.html">

	<div class="side_cen">

		<div id="app">
			<form class="sui-form form-horizontal" id="search"
				action="/complain/query" method="get">
				<table class="sui-table">				  
					<tr>
						<td>投诉人：</td>
						<td>
						  <input type="text" name="userName" id="username" value="${username}"/>						 
						</td>
						<td>处理状态</td>
						<td><input type="radio" name="status" value="0"<#if
							status == 0>checked</#if>/>未处理&nbsp; 
							<input type="radio" name="status" value="1"
							<#if status == 1>checked</#if>/>已处理&nbsp;
							<input type="radio" name="status" value="" <#if status != 1 && status != 0>checked</#if>/>全部&nbsp;
							</td>
					</tr>
					<tr>
						<td>投诉时间：</td>
						<td>
							<div data-toggle="datepicker"
								class="control-group input-daterange">
								<div class="controls">
									<input class="input-medium input-date" type="text"
										name="startTime" id="startTime" value=${startTime }><span>-</span>
									<input class="input-medium input-date" type="text"
										name="endTime" id="endTime" value=${endTime }>
								</div>
							</div>
						</td>
						<td><input type="hidden" id="pageNum" name="pageNum" /> <input
							type="hidden" id="pageSize" name="pageSize" /> <input
							type="button" class="sui-btn btn-xlarge btn-primary" value="查询" onclick="findrec()" /></td>						
					</tr>

				</table>
			</form>
		</div>

		<table class="sui-table table-zebra" >
			<thead>
				<tr align="right">				     
                        <th>投诉的定单号</th>
                        <th>投诉人</th>
                        <th>投诉时间</th>
                        <th>投诉内容</th>   
                        <th>联系电话</th>
                        <th>处理人</th>                        
                        <th>处理状态</th>
                        <th>处理时间</th>                                           
                        <th>处理结果</th>                                           
                        <th>操作</th>
				</tr>
			</thead>
			<tbody>
				<#if compPage??> <#list compPage.list as map>
				<tr>
					<td>${map["orderId"][0..9] }...</td>
					<td>${map["username"] }</td>
					<td>${map['createTime'] }</td>
					<td>${map["content"] }</td>
					<td>${map["phone"] }</td>
					<td>
					   <#if map["staffId"]?? && map["staffId"]?length gt 2>
					${map["staffId"][0..2] }...</#if>
					</td>
					<td>${(map["status"]==true)?string("已处理","未处理") }</td>
					<td><#if map["visitTime"]??
						>${map["visitTime"]?string("yyyy-MM-dd") }</#if></td>
					<td><#if (map["visitResult"]?? && map["visitResult"]?length gt 0 )> <a
						href="#" onclick=showlook('${map["id"]}')>${map["visitResult"][0..1] }...</a>
						</#if>
					</td>
					<td>
					<#if map["status"]==false>
					    <button onclick=editEven('${map["id"]}') class="sui-btn btn-bordered btn-small btn-warning"><i class="sui-icon icon-pencil"></i>处理</button>&nbsp;&nbsp;
                    </#if>
                         <button onclick=showlook('${map["id"]}') class="sui-btn btn-bordered btn-small btn-info";>查看</button>&nbsp;&nbsp;
                    <#if map["status"]==true>
                        <button onclick=deleEven('${map["id"]}') class="sui-btn btn-bordered btn-small btn-danger";>删除</button></td>
				    </#if>
				</tr>
				</#list> </#if>


			</tbody>
		</table>
		<div id="pagination">
			<input type="hidden" id="totalPages" value="${compPage.pages }">
		</div>

	</div>
	<#include "/oldfoot.html">
</body>
<script>

 /*
 var app = new Vue({
    el : '#app',
    data : {
        result : []
    }
});*/
        //分页
        //获得总页数
    var pageall = $("#totalPages").val() == '' ? 1 : $("#totalPages").val();
        laypage({
            cont : 'pagination', //容器。值支持id名、原生dom对象，jquery对象,
            pages : pageall, //总页数
            first : true,
            last : true,
            skip:true,
            curr :  function(){ //通过url获取当前页，也可以同上（pages）方式获取
                var page = location.search.match(/pageNum=(\d+)/);
                return page ? page[1] : 1;
              }(), //当前页
            jump : function(obj, first) { //触发分页后的回调
                if (!first) { //点击跳页触发函数自身，并传递当前页：obj.curr
                	$("#pageNum").val(obj.curr);
                    $("#pageSize").val(3);
                    findrec(obj.curr);
                }
            }
        });
        
      //查询用户事件
      function findrec(curr){
    	$("#search").submit();
      };
       
/*
//获取下拉框中老人名字的集合
function lookfor() {
    $.ajax({
        type : "get",
        url : "/visitrecord/forname",
        success : function(msg) {
        	app.result = msg ;
        	
        },
        error:function(){
        	console.log("出错了");
        }
    
    })
}; */
    //查看选中投诉的详细内容
	var showlook = function(id) {
	 	layer.open({
			type : 2,
			title:"投诉详情页",
			fix : false,
			maxmin:true,
			area : [ '900px', '540px' ],
			shadeClose : false, //点击遮罩关闭
			content : '/complain/getone?opr=show&id='+id,
			end:function(){
                //findrec();
            }
		}); 		
	};
	//编辑用户事件
    function editEven(id) {
        layer.open({
            type : 2,
            title : '投诉处理更新',
            fix : false,
            maxmin : true,
            shadeClose : false,
            area : [ '900px', '540px' ],
            content : '/complain/getone?opr=edit&id='+id,
            end : function() {
            	findrec();
            }
        });
    };
    //添加走访计划
	function add() {
        layer.open({
            type : 2,
            title:"添加走访计划",
            fix : false,
            maxmin:true,
            area : [ '900px', '540px' ],
            shadeClose : false, //点击遮罩关闭
            content : '/complain/getone?opr=add',
            end:function(){
                findrec();;
            }
        });         
    };
    //删除事件
    function deleEven(id){
    	//询问框
    	layer.confirm("确定删除该走访记录？",{
    			btn:[ '是', '否' ]},//按钮
    			function(){//‘是’
    				$.ajax({
    					type:'get',
    					url:'/complain/delete',
    					data:{
    						"id":id
    					},
    					success:function(){
    						findrec();
    						layer.msg('已成功删除记录',{icon:5});
    					}
    				});
    				  
    	},function(){
           //否 
        });
    }
    
   
	
</script>
</html>