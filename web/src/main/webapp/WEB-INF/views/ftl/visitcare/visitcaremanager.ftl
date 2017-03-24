<html>
<head>
<title>走访关怀记录</title> <#include "/WEB-INF/views/ftl/head.ftl">
<script></script>
<script type="text/javascript" src="/uicomponent/laypage/laypage.js"></script>
<link rel="stylesheet" type="text/css" href="/css/sui-append.min.css">
</head>
<body>
	<#include "/newhead.html">

	<div class="main">

		<div id="app">
			<form class="sui-form form-horizontal" id="search"
				action="/visitrecord/query" method="get">
				<table class="sui-table">
					<tr>
						<td>老人姓名：</td>
						<td><select name="elderName" id="elderName"
							onclick="lookfor()"> <#if name ??>
								<option value="${name}" selected>${name}</option></#if>
								<option value="">全部</option>
								<option v-for="item in result" v-bind:value="item.name">{{item.name}}</option>
						</select></td>
						<td>处理状态</td>
						<td><input type="radio" name="status" value="0"<#if
							status == 0>checked</#if>/>未处理&nbsp; 
							<input type="radio" name="status" value="1"
							<#if status == 1>checked</#if>/>已处理&nbsp;
							<input type="radio" name="status" value=""/>全部&nbsp;
							</td>
					</tr>
					<tr>
						<td>实际走访时间：</td>
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
						<td><button type="button" class="sui-btn btn-xlarge btn-success" onclick="add()">增加走访计划</button></td>
					</tr>

				</table>
			</form>
		</div>

		<table class="sui-table table-zebra" >
			<thead>
				<tr align="right">
					<th>老人姓名</th>
					<th>电话</th>
					<th>地址</th>
					<th>状态</th>
					<th>操作</th>
					<th>创建人</th>
					<th>创建时间</th>
					<th>计划走访时间</th>
					<th>实际走访时间</th>
					<th>走访结果</th>
				</tr>
			</thead>
			<tbody>
				<#if vstcarePage??> <#list vstcarePage.list as map>
				<tr>

					<td>${map["name"] }</td>
					<td>${map['phone'] }</td>
					<td>${map["address"] }</td>
					<td>${(map["status"]==true)?string("已处理","未处理") }</td>
					<td><button onclick=editEven('${map["id"]}') class="sui-btn btn-bordered btn-small btn-warning"><i class="sui-icon icon-pencil"></i>编辑</button>&nbsp;&nbsp;
						<button onclick=showlook('${map["id"]}') class="sui-btn btn-bordered btn-small btn-info";>查看</button>&nbsp;&nbsp;
						<button onclick=deleEven('${map["id"]}') class="sui-btn btn-bordered btn-small btn-danger";>删除</button></td>
					<td>${map["nickname"] }</td>
					<td>${map["create_time"]?string("yyyy-MM-dd") }</td>
					<td>${map["plan_time"]?string("yyyy-MM-dd") }</td>
					<td><#if map["exec_time"]??
						>${map["exec_time"]?string("yyyy-MM-dd") }</#if></td>
					<td><#if (map["content"]?? && map["content"]?length gt 0 )> <a
						href="#" onclick=showlook('${map["id"]}')>${map["content"][0..1] }...</a>
						</#if>
					</td>
				</tr>
				</#list> </#if>


			</tbody>
		</table>
		<div id="pagination">
			<input type="hidden" id="totalPages" value="${vstcarePage.pages }">
		</div>

	</div>
	<#include "/newfoot.html">
</body>
<script>

 var app = new Vue({
    el : '#app',
    data : {
        result : []
    }
});

 
/* var getrecordList = function(curr){ 
	//获取处理状态单选框的选中的值；
    var radiochecked=document.getElementsByName("status");
    var statusval = null;
    for(var i=0;i<radiochecked.length;i++){
        if(radiochecked[i].checked==true){
            statusval=radiochecked[i].value;
        }
    };
    //获得老人姓名下拉框的值；
    var options=$("#elderName option:selected");
    var op = null;
    op = options.val();         
    $.ajax({
                type : "GET",                
                url : "/visitrecord/query",
                data : {
                    pageNum:curr || 1,
                    pageSize:4,
                    elderName:op,
                    status:statusval,
                    startTime:$("#startTime").val(),
                    endTime:$("#endTime").val()                    
                //向服务端传的参数，此处只是演示
                },
                success : function(msg) {
                    alert("成功返回"+msg);
                    
                },
                error:function(ms){
                    alert("你好 错误！"+ms);
                }
            });
}; */
        //getrecordList();
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
                    $("#pageSize").val(4);
                    findrec(obj.curr);
                }
            }
        });
        
      //查询用户事件
      function findrec(curr){
    	$("#search").submit();
      };
       
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
};
    //查看选中的走访记录的详细内容
	var showlook = function(id) {
	 	layer.open({
			type : 2,
			title:"走访记录详情页",
			fix : false,
			maxmin:true,
			area : [ '900px', '540px' ],
			shadeClose : false, //点击遮罩关闭
			content : '/visitrecord/getone?id='+id,
			end:function(){
                findrec();
            }
		}); 		
	};
	//编辑用户事件
    function editEven(id) {
        layer.open({
            type : 2,
            title : '更新走访记录',
            fix : false,
            maxmin : true,
            shadeClose : true,
            area : [ '900px', '540px' ],
            content : '/visitrecord/preupdate?id='+id,
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
            content : '/visitrecord/preadd',
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
    					url:'/visitrecord/delete',
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