<html>
<head>
<title>走访关怀记录</title>
 <#include "/WEB-INF/views/ftl/head.ftl">
 
</head>
<body>
<#include "/oldhead.html">
    <div class="side_cen">
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
		      <#list vstcarePage as vc>
		      <tr>
		      <td><input type="checkbox" name="${vc.id }" id="${vc.id }" /></td>
		      <td>老人姓名</td>
                <td>电话</td>
                <td>地址</td>
                <td>${(vc.status==true)?string("已处理","未处理") }</td>
                <td><a>编辑</a>&nbsp;&nbsp;<a>查看</a></td>
                <td>创建人</td>
                <td>${vc.createTime?string("yyyy-MM-dd") }</td>
                <td>${vc.planTime?string("yyyy-MM-dd") }</td>
                <td>${vc.execTime?string("yyyy-MM-dd") }</td>
                <td>
                <#if vc.content??>
                    <a>查看</a>
                </#if>
                </td>
                </tr>
		      </#list>
		  </#if>
			
		</tbody>
	</table>
    </div>
    <#include "/oldfoot.html">
</body>

</html>