<html>
<head>
<title>信息查询</title>
<#include "/WEB-INF/views/ftl/head.ftl">
</head>
<body>
<#include "/oldhead.html">
    <div class="side_cen">
	<table class="sui-table table-zebra">
    <ul class="sui-nav nav-list">
     <#if StaffInfoPage??>
		 <#list StaffInfoPage as sip>
      <li class="nav-header">服装</li>
      <li class="active"> <a>阿迪达斯</a></li>
      <li><a> </a></li>
  </#list>
</#if>
    </ul>
	</table>
		       
		       
		       
		        
  
    </div>
    <#include "/oldfoot.html">
</body>

</html>