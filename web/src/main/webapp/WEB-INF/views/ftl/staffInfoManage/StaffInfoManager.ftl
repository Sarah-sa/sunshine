<html>
<head>
<title>座席人员信息管理</title>
<#include "/WEB-INF/views/ftl/head.ftl">
</head>
<body>
<#include "/oldhead.html">
    <div class="side_cen">
	<table class="sui-table table-zebra">
		<thead>
			<tr>
				<th>照片</th>
				<th>性别</th>
				<th>昵称</th>
				<th>地址</th>
				<th>在职状态 </th>
				<th>生日 </th>
				<th>操作 </th>
			</tr>
		</thead>
		<tbody>		
		 <#if StaffInfoPage??>
		 <#list StaffInfoPage as sip>
		      <tr>
		        <td>${sip.photo}</td>
                <td>${(sip.gender==true)?string("男","女")}</td>
                <td>${sip.nickName}</td>
                <td>${sip.address}</td>
                <td>${(sip.status==true)?string("在职","离职")}</td>
                <td>${sip.birthday?string("yyyy-MM-dd")}</td>
                <td><a>修改</a>  &nbsp;&nbsp;<a>查看</a>&nbsp;&nbsp;<a>删除</a></td>
                </tr>
		  </#list>
		  </#if>
		</tbody>
	</table>
    </div>
    <#include "/oldfoot.html">
</body>

</html>