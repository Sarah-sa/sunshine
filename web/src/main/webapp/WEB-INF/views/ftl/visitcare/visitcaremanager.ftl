<html>
<head>
<title>走访关怀记录</title>
 <#include "/WEB-INF/views/ftl/head.ftl">
</head>
<body>
	<#include "/oldhead.html">
	<div class="side_cen">
	<div>
	
	
	</div>

		<table class="sui-table table-zebra">
			<thead>
				<tr>
					<th><input type="checkbox" name="sumall" id="sumall" /></th>
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
			<#if vstcarePage??> 
				<#list vstcarePage as map>				
				<tr>
					<td><input type="checkbox" name="" id="" /></td>
					<td>${map["name"] }</td>
					<td>${map['phone'] }</td>
					<td>${map["address"] }</td>
					<td>${(map["status"]==true)?string("已处理","未处理") }</td>
					<td>
					<a>编辑</a>&nbsp;&nbsp;
					<button onclick=showlook('${map["id"]}');>查看</button>
					<a>删除</a>
					
						</td>
					<td>${map["nickname"] }</td>
					<td>${map["create_time"]?string("yyyy-MM-dd") }</td>
					<td>${map["plan_time"]?string("yyyy-MM-dd") }</td>
					<td><#if map["exec_time"]?? >${map["exec_time"]?string("yyyy-MM-dd") }</#if></td>
					<td>
					<#if (map["content"]?? && map["content"]?length gt 0 )> <a href="#" onclick=showlook('${map["id"]}')>${map["content"][0..1] }...</a> </#if>
					</td>
				</tr>
				</#list> 
				</#if>

			</tbody>
		</table>
		<div class="sui-pagination">
			<ul>
				<li class="prev disabled"><a href="#">«上一页</a></li>
				<li><a href="#">1</a></li>
				<li><a href="#">2</a></li>
				<li><a href="#">3</a></li>
				<li><a href="#">4</a></li>
				<li><a href="#">5</a></li>
				<li class="dotted"><span>...</span></li>
				<li class="next"><a href="#">下一页»</a></li>
			</ul>
			<div>
				<span>共10页&nbsp;</span><span> 到 <input class="page-num"	type="text">
				<button class="page-confirm" onclick="alert(1)">确定</button> 页
				</span>
			</div>
		</div>
	</div>
	<#include "/oldfoot.html">
</body>
<script>
    
	function showlook(id) {
	 	layer.open({
			type : 2,
			title:"走访记录详情页",
			fix : false,
			maxmin:true,
			area : [ '900px', '540px' ],
			shadeClose : false, //点击遮罩关闭
			content : '/visitrecord/getone?id='+id,
			end:function(){
                location.href="/visitrecord/query";
            }
		}); 
		
	};
	
</script>
</html>