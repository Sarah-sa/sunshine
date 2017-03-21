<html>
<head>
<title>关联老人信息管理</title>
 <#include "/WEB-INF/views/ftl/head.ftl">
 
</head>
<body>
<#include "/oldhead.html">
    <div class="side_cen">
	<table class="sui-table table-zebra">
	     <thead>
	         <tr>
	         <th>老人姓名</th>
	         <th>性别</th>
	         <th>年龄</th>
	         <th>关系</th>
	         <th>新增关联</th>
	         </tr>
	     </thead>
	     <tbody>
	        <#if elderuserPage??>
	            <#list elderuserPage as eu>
	            <tr>
	            <td>${eu.name}</td>
	            <td>${(eu.gender==true)?string("男","女")}</td>
	            <td>${eu.(YEAR(NOW())-YEAR(birthday))}</td>
	            <td>${eu.relation}<td>
	            
	     
	     
	     
	           
	            </tr>
	     </tbody>
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	</table>
    </div>
    <#include "/oldfoot.html">
</body>

</html>