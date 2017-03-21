<html>
<head>
<meta charset="UTF-8">
<title>尿酸查询</title> 
<#include "/WEB-INF/views/ftl/head.ftl">
<script src="/eui/echarts.min.js"></script>
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<link rel="stylesheet" href="/eui/layui/css/layui.css" media="all">

</head>
<body>
	<div style="background-color:#A6FFFF;height:1000px">		
		<div align="center">
		<div class="layui-inline" style="margin-top: 5rem">
		<form action="/health/getUricAcaid" method="get">
		<table>
		<tr>
			<td>开始时间： </td><td><input class="layui-input" name="sdate" placeholder="请选择日期" onclick="layui.laydate({elem: this, istime: true, format: 'YYYY-MM-DD hh:mm:ss'})"/></td>
			<td>结束时间： </td><td><input class="layui-input" name="edate" placeholder="请选择日期" onclick="layui.laydate({elem: this, istime: true, format: 'YYYY-MM-DD hh:mm:ss'})"/></td>
			<td></td><td><button style="width: 60px; height: 30px">查询</button></td>
		</tr></table>
		</form>
				<script src="/eui/layui/layui.js" charset="utf-8"></script>
			<script>
layui.use('laydate', function(){
  var laydate = layui.laydate;
  
  var start = {
    min: laydate.now()
    ,max: '2050-06-16 23:59:59'
    ,istoday: false
    ,choose: function(datas){
      end.min = datas; //开始日选好后，重置结束日的最小日期
      end.start = datas //将结束日的初始值设定为开始日
    }
  };
  
  var end = {
    min: laydate.now()
    ,max: '2050-06-16 23:59:59'
    ,istoday: false
    ,choose: function(datas){
      start.max = datas; //结束日选好后，重置开始日的最大日期
    }
  };
  
  document.getElementById('LAY_demorange_s').onclick = function(){
    start.elem = this;
    laydate(start);
  }
  document.getElementById('LAY_demorange_e').onclick = function(){
    end.elem = this
    laydate(end);
  }
  
});
</script>

</div>




<br> <br> <br>
		<div align="center" style="margin-left: -14rem; margin-top: -1rem; width: 650px; height: 350px" id="container">
			<div id="main" style="width: 650px; height: 350px;" align="center"></div>

			<script type="text/javascript">
        // 基于准备好的dom，初始化echarts实例
        var myChart = echarts.init(document.getElementById('main'));

        var option = {
        	    title: {
        	        text: '尿酸变化图'
        	    },
        	    tooltip: {
        	        trigger: 'axis'
        	    },
        	    legend: {
        	        data:['尿酸']
        	    },
        	    grid: {
        	        left: '3%',
        	        right: '4%',
        	        bottom: '3%',
        	        containLabel: true
        	    },
        	    toolbox: {
        	        feature: {
        	            saveAsImage: {}
        	        }
        	    },
        	    xAxis: {
        	        type: 'category',
        	        boundaryGap: false,
        	        data: ['0','1','2','3','4','5','6','7','8','9','10','11','12','13','14','15']
        	    },
        	    yAxis: {
        	        type: 'value'
        	    },
        	    series: [
        	        {
        	            name:'尿酸',
        	            type:'line',
        	            stack: '总量',
        	            data:[<#list UricAcaid as item>${item.priceuric!},</#list>]
        	        },
        	            
        	                  
        	      
        	        
        	        
        	        
        	    ]
        	};
        myChart.setOption(option);
    </script>
		</div>



		<br> <br> <br>

		<div align="center">
			<table border="1">

				<tr>
					<td style="width: 200px; height: 30px">测量时间：</td>
					<td>尿酸(mmoI/L)：</td>
					
					<td>状态：</td>
				</tr>

				<#list UricAcaid as item>
				<tr>
					<td style="width: 200px; height: 30px">${item.exam_time?string('yyyy-MM-dd HH:mm:ss')}</td>

					<td>${item.priceuric}</td>
					<td>${item.status}</td>
				</tr>
				</#list>
			</table>
		</div>

	</div>

</body>

</html>