<html>
<head>
<title>走访关怀记录</title> 
<#include "/WEB-INF/views/ftl/head.ftl">
<link rel="stylesheet" type="text/css" href="/css/sui-append.min.css">
</head>
<body>
	<table class="sui-table table-sideheader">
		<tbody>
			<#if theOne??> <#list theOne as one>
			<tr>
				<th>老人信息：</th>
				<td>姓名：${one["name"] }</td>
				<td>电话：${one["phone"] }</td>
				<td colspan="2">地址：${one["address"] }</td>
			</tr>
			<tr>
				<th>发起情况：</th>
				<td>发起人：${one["nickname"] }</td>
				<td>提议时间：${one["create_time"]?string("yyyy-MM-dd") }</td>
				<td colspan="2">执行与否：${(one["stauts"]==true)?string("已走访","尚未走访") }</td>
			</tr>
			<tr>
				<th>走访时间：</th>
				<td colspan="2">计划走访时间：${one["plan_time"]?string("yyyy-MM-dd") }</td>
				<td colspan="2">实际走访时间：<#if one["exec_time"]??>
				${one["exec_time"]?string("yyyy-MM-dd") }</#if>				
				</td>

			</tr>
			<tr>
				<th>走访结果：</th>
				<td colspan="4"><textarea id="simple"
						style="width: 524px; height: 200px;" readonly="readonly">${one["content"] }</textarea></td>

			</tr>			
			<tr>
			    <td colspan="3"></td>
				<td align="right">
					<button type="button" id="saveBtn"
						class="sui-btn btn-large btn-primary">确定</button>
				</td>				
			</tr>
			</#list> </#if>
		</tbody>
	</table>


</body>
<script>
//取消按钮
$("#saveBtn").on('click',function(){
    var index = parent.layer.getFrameIndex(window.name);    
    parent.layer.close(index);
    });
</script>
</html>