<html>
<head>
<title>走访关怀记录</title> <#include "/WEB-INF/views/ftl/head.ftl">
</head>
<body>

	<div class="grid-demo" align="center">
		
		<#if theOne??> 
		<#list theOne as one>
		<div class="sui-row">
			<div class="span1">
				<b>老人信息：</b>
			</div>
			<div class="span2">姓名：${one["name"] }</div>
			<div class="span2">电话：${one["phone"] }</div>
			<div class="span2">地址：${one["address"] }</div>
		</div>
		<div class="sui-row">
			<div class="span1">
				<b>发起情况：</b>
			</div>
			<div class="span2">发起人：${one["nickname"] }</div>
			<div class="span2">提议时间：${one["create_time"]?string("yyyy-MM-dd") }</div>
			<div class="span2">执行与否：${(one["stauts"]==true)?string("已走访","尚未走访") }</div>
		</div>
		<div class="sui-row">
			<div class="span1">
				<b>走访时间：</b>
			</div>
			<div class="span3">计划走访时间：${one["plan_time"]?string("yyyy-MM-dd") }</div>
			<div class="span3">实际走访时间：${one["exec_time"]?string("yyyy-MM-dd") }</div>
		</div>
		<div class="sui-row">
			<div class="span1">
				<b>走访结果：</b>
			</div>
			<div class="span4">
				<textarea id="simple" style="width: 424px; height: 200px;" readonly="readonly">${one["content"] }</textarea>
			</div>
		</div>
		</#list> 
		</#if>
	</div>

</body>
<script>
var $editor1 = $('#simple').editor({toolbars:[['FullScreen', 'Source', 'Undo', 'Redo','Bold','test']]});
</script>
</html>