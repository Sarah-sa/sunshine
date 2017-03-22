<html>
<head>
<title>投诉详情页</title> 
<#include "/WEB-INF/views/ftl/head.ftl">
<link rel="stylesheet" type="text/css" href="/css/sui-append.min.css">
</head>
<body>
	<table class="sui-table table-sideheader">
		<tbody>
			<#if theOne??> <#list theOne as one>
			<tr>
				<th>被投诉的订单号：</th>
				<td>${one["orderId"] }</td>
				<th>被投诉的商家：</th>
				<td>${one["shopname"] }</td>
				<th>处理人：</th>
                <td>${one["staffId"] }</td>						
			</tr>
			<tr>
				<th>投诉人：</th>
				<td>${one["username"] }</td>
				<th>投诉时间：</th>
				<td>${one["createTime"]?string("yyyy-MM-dd") }</td>
				<th>投诉内容：</th>
				<td>${one["content"] }</td>
				
			</tr>
			<tr>
			    <th>处理状态</th>
			    <td>${(one["status"]==true)?string("已走访","尚未走访") }			    
			    </td>			    
				<th>处理时间：</th>				
				<td colspan="3"><#if one["visitTime"]??>
				${one["visitTime"]?string("yyyy-MM-dd") }</#if>				
				</td>
			</tr>
			<tr>
				<th>处理结果：</th>
				<td colspan="5"><textarea id="simple"
						style="width: 524px; height: 200px;" readonly="readonly">${one["visitResult"] }</textarea></td>

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
//确定按钮
$("#saveBtn").on('click',function(){
    var index = parent.layer.getFrameIndex(window.name);    
    parent.layer.close(index);
    });
</script>
</html>